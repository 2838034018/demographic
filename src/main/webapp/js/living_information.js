$(function () {
    $.ajax({
        url: "/demographic/dataTable/dictionaryTableList",
        type: "post",
        data: {"parentId": 6},
        dataType: "json",
        success: function (data) {
            var input = "";
            $.each(data, function (i, p) {
                input += '<label class="radio-inline">' + '<input type="radio" name="livingType" value="' + p.nid + '">' + p.name + '</label>'
            })
            $("#livingType").append(input);
        }
    })
    $.ajax({
        url: "/demographic/dataTable/dictionaryTableList",
        type: "post",
        data: {"parentId": 7},
        dataType: "json",
        success: function (data) {
            var input = "";
            $.each(data, function (i, p) {
                input += '<label class="radio-inline">' + '<input type="radio" name="liveFor" value="' + p.nid + '">' + p.name + '</label>'
            })
            $("#liveFor").append(input);
        }
    })
    $.ajax({
        url: "/demographic/dataTable/dictionaryTableList",
        type: "post",
        data: {"parentId": 8},
        dataType: "json",
        success: function (data) {
            var input = "";
            $.each(data, function (i, p) {
                input += '<label class="radio-inline">' + '<input type="radio" name="houseType" value="' + p.nid + '">' + p.name + '</label>'
            })
            $("#houseType").append(input);
        }
    })
    $.ajax({
        url: "/demographic/dataTable/dictionaryTableList",
        type: "post",
        data: {"parentId": 9},
        dataType: "json",
        success: function (data) {
            var input = "";
            $.each(data, function (i, p) {
                input += '<label class="radio-inline">' + '<input type="radio" name="housingTypes" value="' + p.nid + '">' + p.name + '</label>'
            })
            $("#housingTypes").append(input);
        }
    })
    $.ajax({
        url: "/demographic/dataTable/dictionaryTableList",
        type: "post",
        data: {"parentId": 10},
        dataType: "json",
        success: function (data) {
            var input = "";
            $.each(data, function (i, p) {
                input += '<label class="radio-inline">' + '<input type="radio" name="usageHouse" value="' + p.nid + '">' + p.name + '</label>'
            })
            $("#usageHouse").append(input);
        }
    })
})

function areatext() {
    var area = $("#area_text").val();
    $("#area_text").html("");
    if (area == "") {
        $("#area_id").html("(市区县)不能为空").css("color", "red");
    } else {
        $("#area_id").html("√").css("color", "green");
    }
}

function jieBantext() {
    var jieBan = $("#jieBan_text").val();
    $("#jieBan_text").html("");
    if (jieBan == "") {
        $("#jieBan_id").html("街办不能为空").css("color", "red");
    } else {
        $("#jieBan_id").html("√").css("color", "green");
    }
}

function comMitteetext() {
    var comMittee = $("#comMittee_text").val();
    $("#comMittee_text").html("");
    if (comMittee == "") {
        $("#comMittee_id").html("社区、居(村)委会不能为空").css("color", "red");
    } else {
        $("#comMittee_id").html("√").css("color", "green");
    }
}

function streetRoadAlleytext() {
    var streetRoadAlley = $("#streetRoadAlley_text").val();
    $("#streetRoadAlley_text").html("");
    if (streetRoadAlley == "") {
        $("#streetRoadAlley_id").html("(街路巷)不能为空").css("color", "red");
    } else {
        $("#streetRoadAlley_id").html("√").css("color", "green");
    }
}

function houseNumbertext() {
    var houseNumber = $("#houseNumber_text").val();
    $("#houseNumber_text").html("");
    if (houseNumber == "") {
        $("#houseNumber_id").html("门楼牌号不能为空").css("color", "red");
    } else {
        $("#houseNumber_id").html("√").css("color", "green");
    }
}

function houseAddresstext() {
    var houseAddress = $("#houseAddress_text").val();
    $("#houseAddress_text").html("");
    if (houseAddress == "") {
        $("#houseAddress_id").html("门楼详址不能为空").css("color", "red");
    } else {
        $("#houseAddress_id").html("√").css("color", "green");
    }
}

function roomNumbertext() {
    var roomNumber = $("#roomNumber_text").val();
    $("#roomNumber_text").html("");
    if (roomNumber == "") {
        $("#roomNumber_id").html("房间号不能为空").css("color", "red");
    } else {
        $("#roomNumber_id").html("√").css("color", "green");
    }
}

function informationname() {
    var name = $("#name_text").val();
    $("#name_text").html("");
    if (name == "") {
        $("#name_id").html("不能为空").css("color", "red");
    } else {
        $("#name_id").html("√").css("color", "green");
    }
}

function landName() {
    var landName = $("#landLord_text").val();
    $("#landLord_text").html("");
    if (landName == "") {
        $("#landLord_id").html("房东姓名不能为空").css("color", "red");
    } else {
        $("#landLord_id").html("√").css("color", "green");
    }
}

function landPh() {
    var landPhone = $("#lanPhone_text").val();
    $("#lanPhone_text").html("");
    var phone = validatePhoneNumber(landPhone)
    if (landPhone == "") {
        $("#landPhone_id").html("房东联系电话不能为空").css("color", "red");
    } else if (phone == false) {
        $("#landPhone_id").html("请输入有效的手机号").css("color", "red");
    } else {
        $("#landPhone_id").html("√").css("color", "green");
    }
}

function validatePhoneNumber(str) {
    const reg = /^[1][3,4,5,6,7,8,9][0-9]{9}$/
    return reg.test(str)
}

function isSecurity1() {
    var isSecurity = $("#isSecurity1_text").val();
    $("#isSecurity1_text").html("");
    if (isSecurity == "") {
        $("#isSecurity1_id").html("不能为空").css("color", "red");
    } else {
        $("#isSecurity1_id").html("√").css("color", "green");
    }
}

function Card1() {
    var card = $("#landIdCard_text").val();
    $("#landIdCard_text").html("");
    var idcard = validateIdCard(card);

    if (card == "") {
        $("#landIdCard1_id").html("身份证不能为空").css("color", "red");
    } else if (idcard == false) {
        $("#landIdCard1_id").html("身份证输入不合法").css("color", "red");
    } else {
        $("#landIdCard1_id").html("√").css("color", "green");
    }
}

function validateIdCard(str) {
    const reg = /(^\d{15}$)|(^\d{18}$)|(^\d{17}(\d|X|x)$)/
    return reg.test(str)
}

function agName() {
    var name = $("#agentName_text").val();
    $("#agentName_text").html("");
    if (name == "") {
        $("#agentName_id").html("代理人姓名不能为空").css("color", "red");
    } else {
        $("#agentName_id").html("√").css("color", "green");
    }
}

function adPh() {
    var agentPhone = $("#agentPhone_text").val();
    $("#agentPhone_text").html("");
    var phone = validatePhoneNumber(agentPhone)
    if (agentPhone == "") {
        $("#agentPhone_id").html("代理人联系电话不能为空").css("color", "red");
    } else if (phone == false) {
        $("#agentPhone_id").html("请输入有效的手机号").css("color", "red");
    } else {
        $("#agentPhone_id").html("√").css("color", "green");
    }
}

function isSecurity2() {
    var isSecurity = $("#isSecurity2_text").val();
    $("#isSecurity2_text").html("");
    if (isSecurity == "") {
        $("#isSecurity2_id").html("不能为空").css("color", "red");
    } else {
        $("#isSecurity2_id").html("√").css("color", "green");
    }
}

function Card2() {
    var card = $("#agentIdCard_text").val();
    $("#agentIdCard_text").html("");
    var idcard = validateIdCard(card);

    if (card == "") {
        $("#agentIdCard_id").html("身份证不能为空").css("color", "red");
    } else if (idcard == false) {
        $("#agentIdCard_id").html("身份证输入不合法").css("color", "red");
    } else {
        $("#agentIdCard_id").html("√").css("color", "green");
    }
}