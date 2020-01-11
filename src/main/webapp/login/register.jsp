<%@page isELIgnored="false" contentType="text/html; utf-8" pageEncoding="UTF-8" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <%--引入bootstrap的css--%>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/boot/css/bootstrap.min.css">
    <%--引入bootstrap和jqgrid的核心css--%>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/jqgrid/css/trirand/ui.jqgrid-bootstrap.css">
    <%--引入jquery的css--%>
    <script src="${pageContext.request.contextPath}/boot/js/jquery-2.2.1.min.js"></script>
    <%--引入bootstrap的js--%>
    <script src="${pageContext.request.contextPath}/boot/js/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/boot/js/ajaxfileupload.js"></script>
    <script src="${pageContext.request.contextPath}/js/four_linkage.js"></script>
    <style type="text/css">
        body {
            background: url("../img/1.jpg");
        }
    </style>
</head>
<body>
<div class="row">
    <div class="col-xs-6 col-md-4"></div>
    <div class="col-xs-6 col-md-4">
        <form role="form" action="" method="post" class="login-form" id="loginForm">
            <table>
                <tr>
                    <td>手机号：</td>
                    <td><input type="text" name="phone"></td>
                </tr>
                <tr>
                    <td>密码：</td>
                    <td><input type="text" name="password"></td>
                </tr>
                <tr>
                    <td>单位名称：</td>
                    <td><input type="text" name="companyName"></td>
                </tr>
                <tr>
                    <td>所在地：</td>
                    <td>
                        <span>省</span>
                        <select name="name" id="shen">
                            <option value="0">请选择</option>
                        </select>
                        <span>市</span>
                        <select name="name" id="shi">
                            <option value="0">请选择</option>
                        </select>
                        <span>县</span>
                        <select name="name" id="xian">
                            <option value="0">请选择</option>
                        </select>
                        <span>乡/镇</span>
                        <select name="name" id="xiang">
                            <option value="0">请选择</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="button" value="立即注册"></td>
                    <td></td>
                </tr>
            </table>
        </form>
    </div>
    <div class="col-xs-6 col-md-4"></div>
</div>
</body>
</html>