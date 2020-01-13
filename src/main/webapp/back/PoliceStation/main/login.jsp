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
</head>
<body>
<!-- Top content -->
<div class="top-content">

    <div class="inner-bg">
        <div class="container">
            <div class="row">
                <div class="col-sm-8 col-sm-offset-2 text">
                    <h1>流动人口服务管理系统</h1>
                </div>
            </div>
            <div class="row">
                <div class="col-sm-6 col-sm-offset-3 form-box">
                    <div class="form-top" style="width: 450px">
                        <div class="form-top-left">
                            <p><font id="message" color="red"></font></p><%--表单验证提示--%>
                        </div>
                        <div class="form-top-right">
                            <i class="fa fa-key"></i>
                        </div>
                    </div>
                    <div class="form-bottom" style="width: 450px">
                        <form role="form" action="" method="post" class="login-form" id="loginForm">
                            <div class="form-group">
                                <label stype="display:inline;">账号：</label>
                                <input type="text" class="form-control" id="phone_text" name="phone" onblur="phone_id()"
                                       style="display:inline;width:200px;"
                                       autocomplete="off"/>
                                <span id="phone"></span>
                            </div>
                            <div class="form-group">
                                <label style="display:inline;">密码：</label>
                                <input type="text" class="form-control" id="password_text" name="password"
                                       onblur="password_id()" style="display:inline;width:200px;"
                                       autocomplete="off"/>
                                <span id="password"></span>
                            </div>
                            <input type="button" class="btn btn-primary" value="登录" id="">
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>

</div>
</body>
</html>