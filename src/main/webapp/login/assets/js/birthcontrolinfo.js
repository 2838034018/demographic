var ok1=false,ok2=false,ok3=false,ok4=false,ok5=false,ok6=false,ok7=false,ok8=false,ok9=false,ok10=false,ok11=false,ok12=false,ok13=false,ok14=false,ok15=false;
function sub(){
    //保存计生信息
    $("input").trigger("blur");
    if(ok1==true&&ok2==true&&ok3==true&&ok7==true&&ok8==true) {

        var radioName = new Array();
        $(":radio").each(function(){
            radioName.push($(this).attr("name"));
        });

        radioName.sort();
        $.unique(radioName);
        $.each(radioName,function(i,val){
            if(!checkRadio(val)){
                alert("您还有未选择项，请选择，谢谢~");
                window.location.href = "/demographic/login/birthcontrolinfo.jsp";
                return false;
            }else {
                $.ajax({
                    url: "/demographic/birthcontrolinfo",
                    type: "post",
                    data: $("#subForm").serialize(),//获取表单中所有的数据,
                    dataType: "json",
                    success: function (data) {
                        if (data == true) {
                            alert("保存成功");
                            window.location.href = "/demographic/login/birthcontrolinfo.jsp";
                        } else {
                            alert("保存失败");
                        }
                    }
                })
            }
        });
    }
}
function checkRadio(radioName){
    return $("input[name="+radioName+"]:checked").val() == null ? false : true;
}

$(function () {
    //怀孕避孕情况
    $.ajax({
        url: "/demographic/contraceptionPregnancy",
        type: "post",
        dataType: "json",
        success: function (data) {
            var input = "";
            for(var a=0;a<data.length;a++){
                input += '<input type="radio"  name="nid"  value="' + data[a].nid + '" >'+ data[a].name;
            }
            $("#e_contraceptionPregnancy").append(input);
        }
    });


    //婚育证编号
    $("#e_maritalCardNumber").blur(function () {
        var a = document.getElementById('e_maritalCardNumber').value;
        if(a == ""){
            $("#error1").html("不能为空").css("color","red");ok1=false;
        }else{
            $("#error1").html("√").css("color","green");ok1=true;
        }
    });

    //校验措施时间
    $("#e_measureTime").blur(function () {
        var e_measureTime = document.getElementById('e_measureTime').value;
        if(e_measureTime == ""){
            $("#error2").html("不能为空").css("color","red");ok2=false;
        }else{
            $("#error2").html("√").css("color","green");ok2=true;
        }
    });

    //校验出生时间
    $("#e_birthdate").blur(function () {
        var e_birthdate = document.getElementById('e_birthdate').value;
        if(e_birthdate == ""){
            $("#error3").html("不能为空").css("color","red");ok3=false;
        }else{
            $("#error3").html("√").css("color","green");ok3=true;
        }
    });

    //man
    $("#e_man").blur(function () {
        var e_man = document.getElementById('e_man').value;
        if(e_man == ""){
            $("#error7").html("不能为空").css("color","red");ok7=false;
        }else{
            $("#error7").html("√").css("color","green");ok7=true;
        }
    });

    //woman
    $("#e_woman").blur(function () {
        var e_woman = document.getElementById('e_woman').value;
        if(e_woman == ""){
            $("#error8").html("不能为空").css("color","red");ok8=false;
        }else{
            $("#error8").html("√").css("color","green");ok8=true;
        }
    });

});

