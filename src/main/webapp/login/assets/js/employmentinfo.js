var ok1=false,ok2=false,ok3=false,ok4=false,ok5=false,ok6=false,ok7=false,ok8=false,ok9=false;

function sub(){
    $("input").trigger("blur");
    if(ok1==true&&ok2==true&&ok3==true&&ok4==true&&ok5==true&&ok6==true&&ok7==true&&ok8==true&&ok9==true){
        var radioName = new Array();
        $(":radio").each(function(){
            radioName.push($(this).attr("name"));
        });
        $(":checkbox").each(function(){
            radioName.push($(this).attr("name"));
        });
        radioName.sort();
        $.unique(radioName);
        $.each(radioName,function(i,val){
            if(!checkRadio(val)){
                alert("您还有未选择项，请选择，谢谢~");
                window.location.href="/demographic/login/employmentinfo.jsp";
                return false;
            }else {
                //如果校验没问题，走保存方法
                $.ajax({
                    url: "/demographic/addEmploymentinfo",
                    type: "post",
                    data:$("#subForm").serialize(),//获取表单中所有的数据,
                    dataType: "json",
                    success:function(data){
                        if(data ==true){
                            alert( "保存成功");
                            window.location.href="/demographic/login/employmentinfo.jsp";
                        }else {
                            alert( "保存失败");
                        }
                    }
                })
            }
        });
    }
}


//跳转到计生页面
function nextJs(){
    window.location.href = "/demographic/login/birthcontrolinfo.jsp";
}

function checkRadio(radioName){
    return $("input[name="+radioName+"]:checked").val() == null ? false : true;
}


//校验
$(function () {
    //校验不能为空
    $("#e_entityName").blur(function () {
        var entityName = document.getElementById('e_entityName').value;
        if(entityName == ""){
            $("#error1").html("不能为空").css("color","red");ok1=false;
        }else{
            $("#error1").html("√").css("color","green");ok1=true;
        }
    })

    //校验手机号
    $("#e_contactPhoneNumber").blur(function () {
        var phone = document.getElementById('e_contactPhoneNumber').value;
        if(phone == ""){
            $("#error").html("不能为空").css("color","red");
        }else if(!(/^1[3456789]\d{9}$/.test(phone))){
            $("#error2").html("手机号码有误，请重填").css("color","red");ok2=false;
        }else{
            $("#error2").html("√").css("color","green");ok2=true;
        }
    })

    //校验组织机构代码
    $("#e_organizationCode").blur(function () {
        var e_organizationCode = document.getElementById('e_organizationCode').value;
        if(e_organizationCode == ""){
            $("#error3").html("不能为空").css("color","red");ok3=false;
        }else{
            $("#error3").html("√").css("color","green");ok3=true;
        }
    })

    //校验法人代表
    $("#e_legalPerson").blur(function () {
        var e_legalPerson = document.getElementById('e_legalPerson').value;
        if(e_legalPerson == ""){
            $("#error4").html("不能为空").css("color","red");ok4=false;
        }else{
            $("#error4").html("√").css("color","green");ok4=true;
        }
    })

    //校验单位社保号
    $("#e_socialSecurityNum").blur(function () {
        var e_socialSecurityNum = document.getElementById('e_socialSecurityNum').value;
        if(e_socialSecurityNum == ""){
            $("#error5").html("不能为空").css("color","red");ok5=false;
        }else{
            $("#error5").html("√").css("color","green");ok5=true;
        }
    })

    //校验单位编号
    $("#e_unitNumber").blur(function () {
        var e_unitNumber = document.getElementById('e_unitNumber').value;
        if(e_unitNumber == ""){
            $("#error6").html("不能为空").css("color","red");ok6=false;
        }else{
            $("#error6").html("√").css("color","green");ok6=true;
        }
    })


    //校验用工人数
    $("#e_staffNum").blur(function () {
        var e_staffNum = document.getElementById('e_staffNum').value;
        if(e_staffNum == ""){
            $("#error7").html("不能为空").css("color","red");ok7=false;
        }else{
            $("#error7").html("√").css("color","green");ok7=true;
        }
    })

    //校验职业
    $("#e_profession").blur(function () {
        var e_profession = document.getElementById('e_profession').value;
        if(e_profession == ""){
            $("#error8").html("不能为空").css("color","red");ok8=false;
        }else{
            $("#error8").html("√").css("color","green");ok8=true;
        }
    })

    //校验省市县区不能为空
    $("#shen").blur(function () {
        var shen=$("#shen option:selected");
        if(shen.val() == 0){
            $("#error9").html("请选择所属区域").css("color","red");ok9=false;
        }else{
            $("#error9").html("√").css("color","green");ok9=true;
        }
    })


    //查询行业类别
    xxx();
});

function xxx() {
    $.ajax({
        url: "/demographic/employmentinfo",
        type: "post",
        dataType: "json",
        success: function (data) {
            var input = "";
            for(var a=0;a<data.length;a++){
                input += '<input type="radio" name="nid" value="' + data[a].nid + '" >'+ data[a].name;
            }
            $("#e_sectors").append(input);
        }
    })
}
