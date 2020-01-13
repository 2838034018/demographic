var ok1=false,ok2=false,ok3=false,ok4=false,ok5=false,ok6=false,ok7=false,ok8=false;

function sub(){
    $("input").trigger("blur");
   /* if(ok1==true&&ok2==true&&ok3==true&&ok4==true&&ok5==true&&ok6==true&&ok7==true&&ok8==true){
        alert("校验成功哦");
        //如果校验没问题，走保存方法
        $.ajax({
            url: "/demographic/addEmploymentinfo",
            type: "post",
            data:$("#subForm").serialize(),//获取表单中所有的数据,
            dataType: "json",
            success:function(data){
                alert(data.message);
                if(data.message == "保存成功"){
                    alert(data.message);
                    window.location.href="/demographic/login/employmentinfo.jsp";
                }else {
                    alert(data.message);
                }
            },
        })
    }*/
    $.ajax({
        url: "/demographic/addEmploymentinfo",
        type: "post",
        data:$("#subForm").serialize(),//获取表单中所有的数据,
        dataType: "json",
        success: function(data) {
            console.log(data);
            alert(data);
            if (data == true) {
                alert("没谈就刷新了");
                alert("保存成功")
                window.location.href = "/demographic/login/employmentinfo.jsp";
            } else {
                alert("保存失败");
            }
        }
    })
}

//跳转到计生页面
function nextJs(){
    window.location.href = "/demographic/login/birthcontrolinfo.jsp";
}
//判断单选是否选中
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

    //触发保存按钮判断是否选中
    $("#submit").click(function(){
        var flatType=$('input:radio[name="flatType"]:checked').val();
        var laborContract= $('input:radio[name="laborContract"]:checked').val();
        var rank= $('input:radio[name="rank"]:checked').val();
        var skillLevel= $('input:radio[name="skillLevel"]:checked').val();

        if(flatType==null  ||  laborContract==null  || rank==null ||skillLevel==null  ){
            alert("要选中欧!");
            return false;
        }

    });

    //下一步
    /* $("#subForm").click(function(){
         var formObj=document.getElementById("subForm");
         formObj.action="/demographic/login/birthcontrolinfo.jsp";
     });*/

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
