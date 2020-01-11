<%@page isELIgnored="false" contentType="text/html; utf-8" pageEncoding="UTF-8" %>
<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap Login Form Template</title>
    <!-- CSS -->
    <%--<link rel="icon" href="../img/favicon.ico">--%>
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
    <script src="../boot/js/jquery-2.2.1.min.js"></script>
    <script src="assets/bootstrap/js/bootstrap.min.js"></script>
    <script src="assets/js/jquery.backstretch.min.js"></script>
    <script src="assets/js/scripts.js"></script>
    <script src="../boot/js/jquery.validate.min.js"></script>

</head>
<body>


<form   class="form-horizontal">

    <div class="form-group">
        <label for="e_entityName">用工单位名称：</label>
        <input type="email"  id="e_entityName">
    </div>

    <div class="form-group">
        <label for="e_flatType">单位类型：</label>
        <div class="col-sm-9">
            <label class="radio-inline">
                <input type="radio" name="flatType"  value="1"> 国营
                <input type="radio" name="flatType"  value="2"> 民营
                <input type="radio" name="flatType"  value="3"> 事业
                <input type="radio" name="flatType"  value="4"> 外企
                <input type="radio" name="flatType"  value="5"> 个体
            </label>
        </div>
        <input type="hidden"   id="e_flatType" >
    </div>
    <div class="form-group">
        <label for="e_unitAddress">单位地址：</label>
        <input type="text" id="e_unitAddress">
    </div>
    <div class="form-group">
        <label for="e_organizationCode">组织机构代码：</label>
        <input type="text" id="e_organizationCode">
    </div>
    <div class="form-group">
        <label for="e_laborContract">劳动合同：</label>
        <input type="text" id="e_laborContract">
    </div>
    <div class="form-group">
        <label for="e_contactPhoneNumber">联系电话：</label>
        <input type="text" id="e_contactPhoneNumber">
    </div>
    <div class="form-group">
        <label for="e_ginsengIs">参保情况：</label>
        <input type="text" id="e_ginsengIs">
    </div>
    <div class="form-group">
        <label for="e_socialSecurityNum">单位社保号:</label>
        <input type="text" id="e_socialSecurityNum">
    </div>
    <div class="form-group">
        <label for="e_unitNumber">单位编号:</label>
        <input type="text" id="e_unitNumber">
    </div>
    <div class="form-group">
        <label for="e_sectors">行业类别：</label>
        <input type="text" id="e_sectors">
    </div>
    <div class="form-group">
        <label for="e_rank">职称：</label>
        <input type="text" id="e_rank">
    </div>
    <div class="form-group">
        <label for="e_skillLevel">职业技能等级：</label>
        <input type="text" id="e_skillLevel" name="skillLevel">
    </div>
    <div class="form-group">
        <label for="e_profession">职业：</label>
        <input type="text" id="e_profession"  name="profession">
    </div>


    <button type="submit" class="btn btn-default">保存</button>
    <button type="submit" class="btn btn-default">下一步</button>
</form>


</body>