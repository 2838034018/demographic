$(function () {
    $.ajax({
        url: "/demographic/dataTable/shen",
        type: "post",
        dataType: "json",
        success: function (data) {
            var option1 = "";
            $.each(data, function (i, p) {
                    option1 += '<option  value="' + p.id + '">' + p.name + '</option>'
            })
            $("#sheng").append(option1);
            $("#nowSheng").append(option1);
            shengChange();
            nowShengChange();
        }
    })
    //获取文化程度信息
    $.ajax({
        url: "/demographic/dataTable/dictionaryTableList",
        type: "POST",
        data: {
            parentId : "1",
        },
        dataType: "json",
        success:function (data) {
            for (var i = 0;i < data.length;i++){
                var num = i + 1;
                if(i < 6){
                    if(i == 0){
                            $("#cultrueRdioOne").append('<div style="width: 100px;float: left" align="left"> <input type="radio"  name="cultrue" id="cultrue'+num+'" value="'+data[i].nid+'">'+data[i].name+' </div>')
                    }else {
                            $("#cultrueRdioOne").append('<div style="width: 100px;float: left;margin-left: 30px" align="left"> <input type="radio"  name="cultrue" id="cultrue'+num+'" value="'+data[i].nid+'">'+data[i].name+' </div>')
                    }
                }else {
                    if(i == 6){
                            $("#cultrueRdioTwo").append('<div style="width: 100px;float: left" align="left"> <input type="radio"  name="cultrue" id="cultrue'+num+'" value="'+data[i].nid+'">'+data[i].name+' </div>')
                    }else {
                            $("#cultrueRdioTwo").append('<div style="width: 100px;float: left;margin-left: 30px" align="left"> <input type="radio"  name="cultrue" id="cultrue'+num+'" value="'+data[i].nid+'">'+data[i].name+' </div>')
                    }
                }
            }
        }
    })
    //获取政治面貌信息
    $.ajax({
        url: "/demographic/dataTable/dictionaryTableList",
        type: "POST",
        data: {
            parentId : "19",
        },
        dataType: "json",
        success:function (data) {
            $.each(data,function (i,p) {
                var num = i + 1;
                if(i == 0){
                        $("#politicsStatusRadio").append('<div style="width: 150px;float: left" align="left"><input type="radio"  name="politicsStatus" id="politicsStatus'+num+'" value="'+p.nid+'">'+p.name+'</div>')
                }else {
                        $("#politicsStatusRadio").append('<div style="width: 150px;float: left;margin-left: 30px" align="left"><input type="radio"  name="politicsStatus" id="politicsStatus'+num+'" value="'+p.nid+'">'+p.name+'</div>')
                }
            })
        }
    })
    //获取宗教信仰信息
    $.ajax({
        url: "/demographic/dataTable/dictionaryTableList",
        type: "POST",
        data: {
            parentId : "2",
        },
        dataType: "json",
        success:function (data) {
            $.each(data,function (i,p) {
                var num = i + 1;
                if(i == 0){
                        $("#faithRadio").append('<div style="width: 80px;float: left" align="left"><input type="radio"  name="faith" id="faith'+num+'" value="'+p.nid+'">'+p.name+'</div>')
                }else {
                        $("#faithRadio").append('<div style="width: 80px;float: left;margin-left: 30px" align="left"><input type="radio"  name="faith" id="faith'+num+'" value="'+p.nid+'">'+p.name+'</div>')
                }
            })
        }
    })
    //获取血型信息
    $.ajax({
        url: "/demographic/dataTable/dictionaryTableList",
        type: "POST",
        data: {
            parentId : "3",
        },
        dataType: "json",
        success:function (data) {
            $.each(data,function (i,p) {
                var num = i + 1;
                if(i == 0){
                        $("#bloodRadio").append('<div style="width: 120px;float: left" align="left"><input type="radio"  name="blood" id="blood1'+num+'" value="'+p.nid+'">'+p.name+'</div>')
                }else {
                        $("#bloodRadio").append('<div style="width: 120px;float: left;margin-left: 30px" align="left"><input type="radio"  name="blood" id="blood1'+num+'" value="'+p.nid+'">'+p.name+'</div>')
                }
            })
        }
    })
    //获取健康情况信息
    $.ajax({
        url: "/demographic/dataTable/dictionaryTableList",
        type: "POST",
        data: {
            parentId : "4",
        },
        dataType: "json",
        success:function (data) {
            $.each(data,function (i,p) {
                var num = i + 1;
                if(i == 0){
                        $("#healthTypeRadio").append('<div style="width: 150px;float: left;margin-top: 10px" align="left"><input type="radio"  name="healthType" id="healthType'+num+'" value="'+p.nid+'">'+p.name+'</div>')
                }else {
                    var disability = "（残疾证号）"
                        if(i == 2){
                            $("#healthTypeRadio").append('<div style="width: 150px;float: left;margin-left: 30px;margin-top: 10px" align="left"><input type="radio"  name="healthType" id="healthType'+num+'" value="'+p.nid+'">'+p.name+disability+'</div>')
                        }else {
                            $("#healthTypeRadio").append('<div style="width: 150px;float: left;margin-left: 30px;margin-top: 10px" align="left"><input type="radio"  name="healthType" id="healthType'+num+'" value="'+p.nid+'">'+p.name+'</div>')
                        }
                }
            })
        }
    })
    //获取从业情况信息
    $.ajax({
        url: "/demographic/dataTable/dictionaryTableList",
        type: "POST",
        data: {
            parentId : "16",
        },
        dataType: "json",
        success:function (data) {
            for (var i = 0;i < data.length;i++){
                var num = i + 1;
                if(i < 6){
                    if(i == 0){
                            $("#backgRoundRadioOne").append('<div style="width: 130px;float: left" align="left"><input type="radio"  name="backgRound" id="backgRound'+num+'" value="'+data[i].nid+'">'+data[i].name+'</div>')
                    }else {
                            $("#backgRoundRadioOne").append('<div style="width: 130px;float: left;margin-left: 20px" align="left"><input type="radio"  name="backgRound" id="backgRound'+num+'" value="'+data[i].nid+'">'+data[i].name+'</div>')
                    }
                }else {
                    if(i == 6){
                            $("#backgRoundRadioTwo").append('<div style="width: 130px;float: left" align="left"><input type="radio"  name="backgRound" id="backgRound'+num+'" value="'+data[i].nid+'">'+data[i].name+'</div>')
                    }else {
                            $("#backgRoundRadioTwo").append('<div style="width: 130px;float: left;margin-left: 20px" align="left"><input type="radio"  name="backgRound" id="backgRound'+num+'" value="'+data[i].nid+'">'+data[i].name+'</div>')
                    }
                }
            }
        }
    })
    //获取婚姻情况信息
    $.ajax({
        url: "/demographic/dataTable/dictionaryTableList",
        type: "POST",
        data: {
            parentId : "5",
        },
        dataType: "json",
        success:function (data) {
            $.each(data,function (i,p) {
                var num = i + 1;
                if(i == 0){
                        $("#maritalStatusRadio").append('<div style="width: 120px;float: left" align="left"><input type="radio"  name="maritalStatus" id="maritalStatus'+num+'" value="'+p.nid+'">'+p.name+'</div>')
                }else {
                        $("#maritalStatusRadio").append('<div style="width: 120px;float: left;margin-left: 30px" align="left"><input type="radio"  name="maritalStatus" id="maritalStatus'+num+'" value="'+p.nid+'">'+p.name+'</div>')
                }
            })
        }
    })
})
function shengChange() {
    var shenId = $("#sheng").val();
    $.ajax({
        url: "/demographic/dataTable/all",
        data: {"superiormumber": shenId},
        type: "post",
        dataType: "json",
        success: function (data) {
            $("#shi").empty();
            var option1 = '<option value="0">请选择</option>';
            $("#shi").append(option1)
            var option = "";
            $.each(data, function (i, p) {
                    option += '<option  value="' + p.id + '">' + p.name + '</option>'
            })
            $("#shi").append(option);
            shiChange();
        }
    })
}
function shiChange() {
    var cityId = $("#shi").val();
    $.ajax({
        url: "/demographic/dataTable/all",
        data: {"superiormumber": cityId},
        type: "post",
        dataType: "json",
        success: function (data) {
            $("#xian").empty();
            var option1 = '<option value="0">请选择</option>';
            $("#xian").append(option1)
            var option = "";
            $.each(data, function (i, p) {
                    option += '<option value="' + p.id + '">' + p.name + '</option>'
            })
            $("#xian").append(option);
            $("#xian").change();
        }
    })
}
function xianChange() {
    var xianId = $("#xian").val();
    $.ajax({
        url: "/demographic/dataTable/all",
        data: {"superiormumber": xianId},
        type: "post",
        dataType: "json",
        success: function (data) {
            $("#xiang").empty();
            var option1 = '<option value="0">请选择</option>';
            $("#xiang").append(option1)
            var option = "";
            $.each(data, function (i, p) {
                    option += '<option value="' + p.id + '">' + p.name + '</option>'

            })
            $("#xiang").append(option);
        }
    })
}
function nowShengChange() {
    var shenId = $("#nowSheng").val();
    $.ajax({
        url: "/demographic/dataTable/all",
        data: {"superiormumber": shenId},
        type: "post",
        dataType: "json",
        success: function (data) {
            $("#nowShi").empty();
            var option1 = '<option value="0">请选择</option>';
            $("#nowShi").append(option1)
            var option = "";
            $.each(data, function (i, p) {
                    option += '<option  value="' + p.id + '">' + p.name + '</option>'
            })
            $("#nowShi").append(option);
            $("#nowShi").change();
        }
    })
}
function nowShiChange() {
    var cityId = $("#nowShi").val();
    $.ajax({
        url: "/demographic/dataTable/all",
        data: {"superiormumber": cityId},
        type: "post",
        dataType: "json",
        success: function (data) {
            $("#nowXian").empty();
            var option1 = '<option value="0">请选择</option>';
            $("#nowXian").append(option1)
            var option = "";
            $.each(data, function (i, p) {
                    option += '<option  value="' + p.id + '">' + p.name + '</option>'
            })
            $("#nowXian").append(option);
            $("#nowXian").change();
        }
    })
}
function nowXianChange() {
    var xianId = $("#nowXian").val();
    $.ajax({
        url: "/demographic/dataTable/all",
        data: {"superiormumber": xianId},
        type: "post",
        dataType: "json",
        success: function (data) {
            $("#nowXiang").empty();
            var option1 = '<option value="0">请选择</option>';
            $("#nowXiang").append(option1)
            var option = "";
            $.each(data, function (i, p) {
                    option += '<option  value="' + p.id + '">' + p.name + '</option>'
            })
            $("#nowXiang").append(option);
        }
    })
}
function upload(obj){
    //获取展示图片的区域
    var img = document.getElementById("showImg");
    //获取文件对象
    let file = obj.files[0];
    //获取文件阅读器
    let reader = new FileReader();
    reader.readAsDataURL(file);
    reader.onload = function(){
        //给img的src设置图片url
        img.setAttribute("src", this.result);
    }
}
