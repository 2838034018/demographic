<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="multipart/form-data; charset=utf-8" />
    <title>Bootstrap Login Form Template</title>
    <!-- CSS -->
    <%--<link rel="icon" href="../img/favicon.ico">--%>
    <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Roboto:400,100,300,500">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/login/assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/login/assets/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/login/assets/css/form-elements.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/login/assets/css/style.css">
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/login/assets/ico/favicon.png">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="${pageContext.request.contextPath}/login/assets/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="${pageContext.request.contextPath}/login/assets/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="${pageContext.request.contextPath}/login/assets/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="${pageContext.request.contextPath}/login/assets/ico/apple-touch-icon-57-precomposed.png">
    <script src="${pageContext.request.contextPath}/boot/js/jquery-2.2.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/login/assets/bootstrap/js/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/login/assets/js/jquery.backstretch.min.js"></script>
    <script src="${pageContext.request.contextPath}/login/assets/js/scripts.js"></script>
    <script src="${pageContext.request.contextPath}/boot/js/jquery.validate.min.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/login/assets/css/personal.css">
    <script src="${pageContext.request.contextPath}/login/assets/js/personal.js"></script>
    <script type="text/javascript">
        function personalDo() {
            if($("#personalIdEcho").val() != ""){
                alert("已保存，请前往下一页填写信息！！！");
                return;
            }
            if($("#file").val() == null || $("#file").val() == ""){
                alert("请上传照片");
                $("#file").focus();
                return;
            }
            if($("#name").val() == null || $("#name").val().trim() == ""){
                alert("请输入姓名");
                $("#name").focus();
                return;
            }
            if($("#sex").val() == null || $("#sex").val() == ""){
                alert("请选择性别")
                $("#sex").focus();
                return;
            }
            if($("#comeDate").val() == null || $("#comeDate").val().trim() == ""){
                alert("请填写来本地时间")
                $("#comeDate").focus();
            }
            if($("#idCard").val() == null || $("#idCard").val() == ""){
                alert("请填写身份证号码")
                $("#idCard").focus();
                return;
            }else {
                var idCardPatten = /(^\d{15}$)|(^\d{18}$)|(^\d{17}(\d|X|x)$)/;
                if($("#idCard").val().length != 18 && $("#idCard").val().length != 15 ){
                    alert("请输入正确身份证号")
                    $("#idCard").focus();
                    return;
                }else {
                    if(!idCardPatten.test($("#idCard").val())){
                        alert("请输入正确身份证号")
                        $("#idCard").focus();
                        return;
                    }
                }
            }
            if($("#nation").val() == null || $("#nation").val().trim() == ""){
                alert("请填写民族")
                $("#nation").focus();
                return;
            }
            if($("#sheng") == null || $("#shi").val() == null || $("#xian").val() == null || $("#xiang").val() == null || $("#villager").val() == null
                || $("#sheng") == "" || $("#shi").val() == "" || $("#xian").val() == "" || $("#xiang").val() == "" || $("#villager").val().trim() == ""
                || $("#shi").val() == "0" || $("#xian").val() == "0" || $("#xiang").val() == "0"){
                alert("请填写户籍所在地")
                $("#province").focus();
                return;
            }
            if($("#nowSheng").val() == null || $("#nowShi").val() == null || $("#nowXian").val() == null
                || $("#nowXiang").val() == null || $("#nowAddressVillage").val() == null || $("#nowAddressHouseNumber").val() == null
                || $("#nowSheng").val() == "" || $("#nowShi").val() == "" || $("#nowXian").val() == ""
                || $("#nowXiang").val() == "" || $("#nowAddressVillage").val().trim() == "" || $("#nowAddressHouseNumber").val().trim() == ""
                || $("#nowShi").val() == "0" || $("#nowXian").val() == "0" || $("#nowXiang").val() == "0"){
                alert("请填写现居住地址")
                $("#nowAddressProvince").focus();
                return;
            }
            var phonePatten = /^1([38][0-9]|4[579]|5[0-3,5-9]|6[6]|7[0135678]|9[89])\d{8}$/;
            if(($("#fixedPhone").val() == null && $("#movePhone").val() == null) || ($("#fixedPhone").val() == "" && $("#movePhone").val() == "")){
                alert("请填写本人联系方式")
                $("#movePhone").focus();
                return;
            }else {
                if($("#movePhone").val().length != 11 || !phonePatten.test($("#movePhone").val())){
                    alert("请填写正确的移动电话号");
                    $("#movePhone").focus();
                    return;
                }
            }
            if($("#concats").val() == null || $("#concats").val().trim() == ""){
                alert("请填写紧急联系人姓名")
                $("#concats").focus();
                return;
            }
            if(($("#concatsFixphone").val() == null && $("#concatsMovphone").val() == null) || ($("#concatsFixphone").val() == "" && $("#concatsMovphone").val() == "")){
                alert("请填写紧急联系人联系方式")
                $("#concatsMovphone").focus();
                return;
            }else {
                if($("#concatsMovphone").val().length != 11 || !phonePatten.test($("#concatsMovphone").val())){
                    alert("请填写正确的紧急联系人移动电话号")
                    $("#concatsMovphone").focus();
                    return;
                }
            }
            if($("[name = 'cultrue']:checked").val() == null){
                alert("请选择文化程度")
                return;
            }
            if($("[name = 'politicsStatus']:checked").val() == null){
                alert("请选择政治面貌")
                return;
            }
            if($("[name = 'faith']:checked").val() == null){
                alert("请选择宗教信仰")
                return;
            }
            var patten = /^([0-9]{1,3}[\.][0-9]{1,2})/
            if($("#height").val() == null || $("#height").val() == ""){
                alert("请输入身高")
                $("#height").focus();
                return;
            }else {
                if(!patten.test($("#height").val())){
                    alert("请输入正确身高格式")
                    $("#height").focus();
                    return;
                }
            }
            if($("#weight").val() == null || $("#weight").val() == ""){
                alert("请输入体重")
                $("#weight").focus();
                return;
            }else {
                if(!patten.test($("#weight").val())){
                    alert("请输入正确体重格式")
                    $("#weight").focus();
                    return;
                }
            }
            if($("[name = 'blood']:checked").val() == null){
                alert("请选择血型")
                return;
            }
            if($("[name = 'healthType']:checked").val() == null){
                alert("请选择健康状况")
                return;
            }else {
                if($("[name = 'healthType']:checked").val() == 403){
                    if($("#disability").val() == null || $("#disability").val().trim() == ""){
                        alert("请填写残疾号")
                        $("#disability").focus();
                        return;
                    }
                }
            }
            if($("[name = 'backgRound']:checked").val() == null){
                alert("请选择从业情况")
                return;
            }
            if($("[name = 'maritalStatus']:checked").val() == null){
                alert("请选择婚姻情况")
                return;
            }
            var form = new FormData($("#addForm")[0])
            $.ajax({
                url: "/demographic/personal/personalDo",
                type: "post",
                data: form,
                datatype: "Text",
                processData: false,   // jQuery不要去处理发送的数据
                contentType: false,   // jQuery不要去设置Content-Type请求头
                cache: false,
                success:function (data) {
                    if(data == "ok"){
                        $("#personalIdEcho").val(data);
                        alert("已保存，请前往下一页填写信息！")
                    }else if(data == "no"){
                        alert("保存失败，请重新保存！！！")
                    }else {
                        alert(data);
                    }

                }
            })
        }
    </script>
</head>
<body style="background-image: url('${pageContext.request.contextPath}/login/assets/img/backgrounds/1.jpg')">
    <input type="hidden" id="personalIdEcho" value="${requestScope.personal.id}">
    <form class="form-inline" style="margin-top: 40px" id="addForm"  method="post" enctype="multipart/form-data" accept-charset="utf-8">
        <input type="hidden" name="userId" value="">
        <div style="position: relative;width: 200px;height: 200px;float: right;margin-right: 300px " id="bacg">
            <div style="position: absolute;width: 200px;height: 200px">
                <img src="" width="200" height="200" id="showImg" style="width:100%">
            </div>
            <div style="position: absolute;width: 200px;height: 200px">
                <input style="width: 200px;height: 200px;float: right" type="file" name="file" id="file" value="" onchange="upload(this)" accept='.png,.jpg,.jpeg'/>
            </div>
        </div>
        <div style="width: 800px;height: 50px">
            <div  align="center" class="pesonallabel">
                <label for="name" style="margin-bottom: 0px;margin-top: 10px">姓名：</label>
            </div>
            <div  align="center" class="personaldata" >
                <input style="width: 150px;height: 50px" type="text" class="form-control" value="${requestScope.personal.name}" name="name" id="name" >
            </div>
            <div align="center" class="pesonallabel">
                <label for="oldName" style="margin-bottom: 0px;margin-top: 10px">曾用名:</label>
            </div>
            <div align="center" class="personaldata" >
                <input style="width: 150px;height: 50px" type="text" class="form-control" value="${requestScope.personal.oldName}" name="oldName" id="oldName">
            </div>
        </div>

        <div style="width: 800px;height: 50px;margin-top: 20px">
            <div align="center" class="pesonallabel">
                <label for="sex" style="margin-bottom: 0px;margin-top: 10px">性别：</label>
            </div>
            <div align="center" class="personaldata" >
                <select class="form-control" style="width: 200px;height: 50px" name="sex" id="sex">
                    <c:if test="${requestScope.personal.sex == 0}">
                        <option value="0" selected>男</option>
                    </c:if>
                    <option value="0">男</option>
                    <c:if test="${requestScope.personal.sex == 1}">
                        <option value="1" selected>女</option>
                    </c:if>
                    <option value="1">女</option>
                </select>
            </div>
        </div>
        <div style="width: 800px;height: 50px;margin-top: 20px">
            <div align="center" class="pesonallabel">
                <label for="comeDate" style="margin-bottom: 0px;margin-top: 10px">来本地时间：</label>
            </div>
            <div align="center" class="personaldata" >
                <input style="width: 230px;height: 50px" type="date" class="form-control" value="<fmt:formatDate value='${requestScope.personal.comeDate}' pattern='yyyy-MM-dd'/>" name="comeDate" id="comeDate">
            </div>
        </div>
        <div style="height: 50px;margin-top: 20px">
            <div align="center" class="pesonallabel">
                <label for="idCard" style="margin-bottom: 0px;margin-top: 10px">公民身份证号：</label>
            </div>
            <div align="center" class="personaldata" >
                <input style="width: 800px;height: 50px" type="text" maxlength="18" oninput = "value=value.replace(/[^Xx\d]/g,'')" value="${requestScope.personal.idCard}" name="idCard" id="idCard">
            </div>
        </div>
        <div style="width: 800px;height: 50px;margin-top: 20px">
            <div align="center" class="pesonallabel">
                <label for="nation" style="margin-bottom: 0px;margin-top: 10px">民族：</label>
            </div>
            <div align="center" class="personaldata" >
                <input style="width: 230px;height: 50px" type="text" value="${requestScope.personal.nation}" name="nation" id="nation">
            </div>
        </div>
        <div style="height: 50px;margin-top: 20px">
            <div align="center" class="pesonallabel">
                <label for="" style="margin-bottom: 0px;margin-top: 10px">户籍详细地址：</label>
            </div>
            <div align="center" class="personaldata" >
                <select class="form-control" style="width: 120px;height: 50px" name="province" id="sheng" onchange="shengChange()">

                </select>
                <span>省</span>
                <select class="form-control" style="width: 120px;height: 50px" name="city" id="shi" onchange="shiChange()">

                </select>
                <span>市</span>
                <select class="form-control" style="width: 120px;height: 50px" name="district" id="xian" onchange="xianChange()">

                </select>
                <span>县（区）</span>
                <select class="form-control" style="width: 120px;height: 50px" name="town" id="xiang">

                </select>
                <span>乡（镇、街办）</span>
                <input type="text" style="width: 180px;height: 50px" value="${requestScope.personal.villager}" name="villager" id="villager">
                <span>村（社区）</span>
            </div>
        </div>
        <div style="height: 50px;margin-top: 20px">
            <div align="center" class="pesonallabel">
                <label for="" style="margin-bottom: 0px;margin-top: 10px">现居住地地址：</label>
            </div>
            <div align="center" class="personaldata" >
                <select class="form-control" style="width: 120px;height: 50px" onchange="nowShengChange()" name="nowAddressProvince" id="nowSheng">

                </select>
                <span>省</span>
                <select class="form-control" style="width: 120px;height: 50px" onchange="nowShiChange()" name="nowAddressCity" id="nowShi">

                </select>
                <span>市</span>
                <select class="form-control" style="width: 120px;height: 50px" onchange="nowXianChange()" name="nowAddressDistrict" id="nowXian">

                </select>
                <span>县（区）</span>
                <select class="form-control" style="width: 120px;height: 50px" name="nowAddressTown" id="nowXiang">

                </select>
                <span>乡（镇、街办）</span>
                <input type="text" style="width: 180px;height: 50px" value="${requestScope.nowAddress.nowAddressVillage}" name="nowAddressVillage" id="nowAddressVillage">
                <span>村（社区）</span>
            </div>
        </div>
        <div style="height: 50px;margin-top: 20px">
            <div align="center" class="pesonallabel">
                <label for="" style="margin-bottom: 0px;margin-top: 10px"></label>
            </div>
            <div align="center" class="personaldata" >
                <input type="text" style="width: 500px;height: 50px" value="${requestScope.nowAddress.nowAddressHouseNumber}" name="nowAddressHouseNumber" id="nowAddressHouseNumber">
                <span>门楼详址</span>
            </div>
        </div>
        <div style="height: 50px;margin-top: 20px">
            <div align="center" class="pesonallabel">
                <label for="" style="margin-bottom: 0px;margin-top: 10px">本人联系方式：</label>
            </div>
        </div>
        <div style="height: 50px;margin-top: 20px">
            <div align="center" class="pesonallabel">
                <label for="fixedPhone" style="margin-bottom: 0px;margin-top: 10px">固定电话：</label>
            </div>
            <div align="center" class="personaldata" >
                <input type="text" style="width: 350px;height: 50px" oninput = "value=value.replace(/[^\-\d]/g,'')" value="${requestScope.personal.fixedPhone}" name="fixedPhone" id="fixedPhone">
            </div>
            <div align="center" class="pesonallabel">
                <label for="movePhone" style="margin-bottom: 0px;margin-top: 10px">移动电话：</label>
            </div>
            <div align="center" class="personaldata" >
                <input type="text" style="width: 350px;height: 50px" maxlength="11" oninput = "value=value.replace(/[^\d]/g,'')" value="${requestScope.personal.movePhone}" name="movePhone" id="movePhone">
            </div>
        </div>
        <div style="height: 50px;margin-top: 20px">
            <div align="center" class="pesonallabel">
                <label for="" style="margin-bottom: 0px;margin-top: 10px">紧急联系方式：</label>
            </div>
        </div>
        <div style="height: 50px;margin-top: 20px">
            <div align="center" class="pesonallabel">
                <label for="concats" style="margin-bottom: 0px;margin-top: 10px">联系人：</label>
            </div>
            <div align="center" class="personaldata" >
                <input type="text" style="width: 350px;height: 50px" value="${requestScope.personal.concats}" name="concats" id="concats">
            </div>
        </div>
        <div style="height: 50px;margin-top: 20px">
            <div align="center" class="pesonallabel">
                <label for="concatsFixphone" style="margin-bottom: 0px;margin-top: 10px">固定电话：</label>
            </div>
            <div align="center" class="personaldata" >
                <input type="text" style="width: 350px;height: 50px" oninput = "value=value.replace(/[^\-\d]/g,'')" value="${requestScope.personal.concatsFixphone}" name="concatsFixphone" id="concatsFixphone">
            </div>
            <div align="center" class="pesonallabel">
                <label for="movePhone" style="margin-bottom: 0px;margin-top: 10px">移动电话：</label>
            </div>
            <div align="center" class="personaldata" >
                <input type="text" style="width: 350px;height: 50px" maxlength="11" oninput = "value=value.replace(/[^\d]/g,'')" value="${requestScope.personal.concatsMovphone}" name="concatsMovphone" id="concatsMovphone">
            </div>
        </div>
        <div style="height: 50px;margin-top: 20px">
            <div align="center" class="pesonallabel">
                <label for="" style="margin-bottom: 0px;margin-top: 10px">文化程度：</label>
            </div>
            <div align="center" id="cultrueRadio" class="personaldata" >
                <div id="cultrueRdioOne">

                </div>
                <div id="cultrueRdioTwo">

                </div>
            </div>
        </div>
        <div style="height: 50px;margin-top: 20px">
            <div align="center" class="pesonallabel">
                <label for="" style="margin-bottom: 0px;margin-top: 10px">政治面貌：</label>
            </div>
            <div align="center" class="personaldata" >
                <div style="margin-top: 10px" id="politicsStatusRadio">

                </div>
            </div>
        </div>
        <div style="height: 50px;margin-top: 20px">
            <div align="center" class="pesonallabel">
                <label for="" style="margin-bottom: 0px;margin-top: 10px">宗教信仰：</label>
            </div>
            <div align="center" class="personaldata">
                <div style="margin-top: 10px" id="faithRadio">

                </div>
            </div>
        </div>
        <div style="height: 50px;margin-top: 20px">
            <div align="center" class="pesonallabel">
                <label for="" style="margin-bottom: 0px;margin-top: 10px">身体状况：</label>
            </div>
        </div>
        <div style="width: 800px;height: 50px">
            <div  align="center" class="pesonallabel">
                <label for="height" style="margin-bottom: 0px;margin-top: 10px">身高：</label>
            </div>
            <div  align="center" class="personaldata" >
                <input style="width: 100px;height: 50px" type="text" class="form-control" oninput = "value=value.replace(/[^\d\.]/g,'')" value="${requestScope.personal.height}" name="height" id="height" >
                <span>cm</span>
            </div>
            <div align="center" class="pesonallabel">
                <label for="weight" style="margin-bottom: 0px;margin-top: 10px">体重:</label>
            </div>
            <div align="center" class="personaldata" >
                <input style="width: 100px;height: 50px" type="text" class="form-control" oninput = "value=value.replace(/[^\d\.]/g,'')" value="${requestScope.personal.weight}" name="weight" id="weight">
                <span>公斤</span>
            </div>
        </div>
        <div style="height: 50px;margin-top: 20px">
            <div align="center" class="pesonallabel">
                <label for="" style="margin-bottom: 0px;margin-top: 10px">血型：</label>
            </div>
            <div align="center" class="personaldata" >
                <div style="margin-top: 10px" id="bloodRadio">

                </div>
            </div>
        </div>
        <div style="height: 50px;margin-top: 20px">
            <div align="center" class="pesonallabel">
                <label for="" style="margin-bottom: 0px;margin-top: 10px">健康状况：</label>
            </div>
            <div align="center" class="personaldata" >
                <div style="float: left" id="healthTypeRadio">

                </div>
                <div style="width: 250px;float: left" align="left">
                    <input type="text" style="width: 200px;margin-left: 10px;height: 50px" value="${requestScope.personal.disability}" name="disability" id="disability">
                </div>
            </div>
        </div>
        <div style="height: 50px;margin-top: 20px">
            <div align="center" class="pesonallabel">
                <label for="" style="margin-bottom: 0px;margin-top: 10px">从业状况：</label>
            </div>
            <div align="center" class="personaldata" >
                <div id="backgRoundRadioOne">

                </div>
                <div id="backgRoundRadioTwo">

                </div>
            </div>
        </div>
        <div style="height: 50px;margin-top: 20px">
            <div align="center" class="pesonallabel">
                <label for="" style="margin-bottom: 0px;margin-top: 10px">婚姻状况：</label>
            </div>
            <div align="center" class="personaldata" >
                <div style="margin-top: 10px" id="maritalStatusRadio">

                </div>
            </div>
        </div>
        <div style="height: 50px;margin-top: 20px">
            <a href="#" style="width: 100px;height: 50px;"  class="btn btn-primary btn-lg active" onclick="personalDo()" role="button">保存</a>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <a style="width: 100px;height:50px" href="#" class="btn btn-primary btn-lg active" role="button">下一页</a>
        </div>
    </form>
    <div style="height: 80px;margin-top: 20px" align="center">
        <div style="height:80px;width:900px;background-color: #999999" align="center">
            <div style="height:50px;width:500px;background-color: #c4e3f3">
                <h1>版权所有：公安局</h1>
            </div>
        </div>
    </div>
</body>