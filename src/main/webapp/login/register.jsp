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
    <script>
        $(function () {
            $("#register").click(function () {
                $.ajax({
                    url: "${pageContext.request.contextPath}/register",
                    type: "post",
                    data: $("#registerForm").serialize(),
                    success: function (data) {
                        alert("注册完成，等待审核")
                        window.location.href = "${pageContext.request.contextPath}/login/login.jsp"
                    }
                })
            })
        })
    </script>
</head>
<body>
<form style="margin-left:500px;margin-top:200px;" id="registerForm">
    <div class="form-group">
        <label stype="display:inline;">手机号：</label>
        <input type="text" class="form-control" id="phone_text" name="phone" onblur="phone_id()"
               style="display:inline;width:200px;"
               autocomplete="off"/>
        <span id="phone"></span>
    </div>
    <div class="form-group">
        <label style="display:inline;">密码：</label>
        <input type="text" class="form-control" id="password_text" name="password" onblur="password_id()"
               style="display:inline;width:200px;"
               autocomplete="off"/>
        <span id="password"></span>
    </div>
    <div class="form-group">
        <label style="display:inline;">单位名称：</label>
        <input type="text" class="form-control" name="companyName" style="display:inline;width:200px;"
               autocomplete="off"/>
        <span id="companyName"></span>
    </div>
    <div class="form-group">
        <label style="display:inline;">所在地：</label>
        <select name="province" id="shen" <%--class="form-control"--%>>
            <option value="0">请选择</option>
        </select>
        <span>—</span>
        <select name="city" id="shi" <%--class="form-control"--%>>
            <option value="0">请选择</option>
        </select>
        <span>—</span>

        <select name="district" id="xian" <%--class="form-control"--%>>
            <option value="0">请选择</option>
        </select>
        <span>—</span>

        <select name="town" id="xiang" <%--class="form-control"--%>>
            <option value="0">请选择</option>
        </select>
    </div>
    <input type="button" class="btn btn-primary" value="确认注册" id="register">
</form>

<nav class="navbar navbar-default navbar-fixed-bottom">
    <div class="panel panel-default">
        <div style="text-align: center" class="panel-body">
            版权所有:公安局
        </div>
    </div>
</nav>
</body>
<script>
    function phone_id() {
        var phone = $("#phone_text").val();
        $("#phone_text").html("");
        var phon = validatePhoneNumber(phone)
        if (phone == "") {
            $("#phone").html("不能为空").css("color", "red");
        } else if (phon == false) {
            $("#phone").html("请输入有效的手机号").css("color", "red");
        } else {
            $("#phone").html("√").css("color", "green");
        }
    }

    function validatePhoneNumber(str) {
        const reg = /^[1][3,4,5,6,7,8,9][0-9]{9}$/
        return reg.test(str)
    }

    function password_id() {
        var password = $("#password_text").val();
        $("#password_text").html("");
        if (password == "") {
            $("#password").html("不能为空").css("color", "red");
        } else {
            $("#password").html("√").css("color", "green");
        }
    }
</script>
</html>