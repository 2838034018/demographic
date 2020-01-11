<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" contentType="text/html; utf-8" pageEncoding="UTF-8" %>
<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap Login Form Template</title>
    <!-- CSS -->
    <%--<link rel="icon" href="${pageContext.request.contextPath}/img/favicon.ico">--%>

    <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Roboto:400,100,300,500">
    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="assets/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="assets/css/form-elements.css">
    <link rel="stylesheet" href="assets/css/style.css">
    <link rel="shortcut icon" href="assets/ico/favicon.png">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="assets/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="assets/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="assets/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="assets/ico/apple-touch-icon-57-precomposed.png">
    <script src="${pageContext.request.contextPath}/js/jquery-1.11.0.min.js"></script>
    <script src="${pageContext.request.contextPath}/boot/js/jquery-2.2.1.min.js"></script>
    <script src="assets/bootstrap/js/bootstrap.min.js"></script>
    <script src="assets/js/jquery.backstretch.min.js"></script>
    <script src="assets/js/scripts.js"></script>
    <script src="${pageContext.request.contextPath}/boot/js/jquery.validate.min.js"></script>



    <script >
        //判断单选是否选中
        $(function () {
            //触发保存按钮判断是否选中
            $("#submit").click(function(){
                var flatType=$('input:radio[name="flatType"]:checked').val();
                var laborContract= $('input:radio[name="laborContract"]:checked').val();
                var rank= $('input:radio[name="rank"]:checked').val();
                var skillLevel= $('input:radio[name="skillLevel"]:checked').val();

                //保险情况  --复选框

                if(flatType==null  ||  laborContract==null  || rank==null ||skillLevel==null  ){
                    alert("要选中欧!");
                    return false;
                }
                $("#subForm").submit;
            });
        });

        function birthcontrolinfo() {
            window.location.href("/demographic/");
        }

    </script>
</head>
<body>


<form   class="text-left" id="subForm" action="/demographic/addEmploymentinfo">

    <div class="form-group">
        <label for="e_entityName">用工单位名称：</label>
        <input type="text"  id="e_entityName" name="entityName">
    </div>

    <div class="form-group">
        <label for="e_flatType" class="-inline">单位类型：
            <input type="radio" name="flatType"  value="1101"> 国营
            <input type="radio" name="flatType"  value="1102"> 民营
            <input type="radio" name="flatType"  value="1103"> 事业
            <input type="radio" name="flatType"  value="1104"> 外企
            <input type="radio" name="flatType"  value="1105"> 个体
        </label>
        <input type="hidden"   id="e_flatType" >
    </div>
    <div class="form-group">
        <label for="e_unitAddress">单位地址：

            <table class="table table-bordered" border="1" cellpadding="1" cellspacing="1" width="80%">
                <tr class="active">
                    <td class="active">
                        <input type="text" name="city">（市县区）
                        <input type="text" name="steet">街办
                        <input type="text" name="community">社区、居（村）委会
                        <input type="text" name="lane">（街路巷）
                        <input type="text" name="houseNum">门楼牌号
                        <input type="text" name="site">门楼详址
                    </td>
                </tr>
            </table>
        </label>
        <input type="hidden" id="e_unitAddress">
    </div>
    <div class="form-group">
        <label for="e_organizationCode">组织机构代码：</label>
        <input type="text" id="e_organizationCode" name="organizationCode">
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <label for="e_legalPerson">法人代表</label>
        <input type="text" id="e_legalPerson" name="legalPerson">
    </div>
    <div class="form-group">
        <label for="e_laborContract">劳动合同：</label>
            <label class="-inline">
                <input type="radio" name="laborContract"  value="1801"> 1年
                <input type="radio" name="laborContract"  value="1802"> 2年
                <input type="radio" name="laborContract"  value="1803"> 3年
                <input type="radio" name="laborContract"  value="1804"> 3年以上
                <input type="radio" name="laborContract"  value="1805"> 其他
            </label>
        <input type="hidden" id="e_laborContract">
    </div>
    <div class="form-group">
        <label for="e_contactPhoneNumber">联系电话：</label>
        <input type="text" id="e_contactPhoneNumber" name="contactPhoneNumber">
    </div>
    <div class="form-group">
        <label for="e_ginsengIs">参保情况：</label>
        <label>
            <input type="checkbox" name="endowmentInsurance"  value="1"> 养老保险
            <input type="checkbox" name="medicalInsurance"  value="1"> 医疗保险
            <input type="checkbox" name="unemploymentInsurance"  value="1"> 失业保险
            <input type="checkbox" name="injuryInsurance"  value="1"> 工伤保险
            <input type="checkbox" name="maternityInsurance"  value="1"> 生育保险
        </label>

        <input type="hidden" id="e_ginsengIs">
    </div>
    <div class="form-group">
        <label for="e_socialSecurityNum">单位社保号:</label>
        <input type="text" id="e_socialSecurityNum">
    </div>
    <div class="form-group">
        <label for="e_unitNumber">单位编号:</label>
        <input type="text" id="e_unitNumber" name="unitNumber">
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <label for="e_staffNum">用工人数:</label>
        <input type="text" id="e_staffNum" name="staffNum">
    </div>
    <div class="form-group">
        <label for="e_sectors">行业类别：</label>
        <c:forEach var="sectors" items="${sectors}">
            <input type="radio" name="${sectors.nid}">${sectors.name}
        </c:forEach>
        <input type="hidden" id="e_sectors">
    </div>
    <div class="form-group">
        <label for="e_rank">职称：</label>
        <label class="-inline">
            <input type="radio" name="rank"  value="1301"> 初级职称
            <input type="radio" name="rank"  value="1302"> 中级职称
            <input type="radio" name="rank"  value="1303"> 高级职称
            <input type="radio" name="rank"  value="1304"> 其他
        </label>
        <input type="hidden" id="e_rank">
    </div>
    <div class="form-group">
        <label for="e_skillLevel">职业技能等级：</label>
        <label class="-inline">
            <input type="radio" name="skillLevel"  value="1401"> 高级技师
            <input type="radio" name="skillLevel"  value="1402"> 技师
            <input type="radio" name="skillLevel"  value="1403"> 高级工
            <input type="radio" name="skillLevel"  value="1404"> 中级工
            <input type="radio" name="skillLevel"  value="1405"> 初级工
            <input type="radio" name="skillLevel"  value="1406"> 无职称，等级
        </label>
        <input type="hidden" id="e_skillLevel" name="skillLevel">
    </div>
    <div class="form-group">
        <label for="e_profession">职业：</label>
        <input type="text" id="e_profession"  name="profession">
    </div>


    <button   class="btn btn-default" id="submit">保存</button>
    <button  class="btn btn-default" function="birthcontrolinfo()">下一项</button>
</form>
</body>