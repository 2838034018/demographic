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