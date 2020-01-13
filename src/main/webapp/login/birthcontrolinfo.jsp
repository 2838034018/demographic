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
      <script src="${pageContext.request.contextPath}/boot/js/jquery-2.2.1.min.js"></script>
      <script src="assets/bootstrap/js/bootstrap.min.js"></script>
      <script src="assets/js/jquery.backstretch.min.js"></script>
      <script src="assets/js/scripts.js"></script>
      <script src="${pageContext.request.contextPath}/boot/js/jquery.validate.min.js"></script>

      <script>
            $(function () {
                //怀孕避孕情况
                $.ajax({
                    url: "/demographic/contraceptionPregnancy",
                    type: "post",
                    dataType: "json",
                    success: function (data) {
                        var input = "";
                        for(var a=0;a<data.length;a++){
                            input += '<input type="radio" name="' + data[a].nid + '" >'+ data[a].name;
                        }
                        $("#e_contraceptionPregnancy").append(input);
                    }
                })
            })

          $("#subForm").submit(){
                window.location.href="/demographic/birthcontrolinfo";
            }

      </script>
</head>
<body >


<form   class="text-left" id="subForm"  method="post">

    <div class="form-group">
        <label for="e_spousePeer">夫妻同行：</label>
        <label class="-inline" id="e_spousePeer">
            <input type="radio" name="spousePeer"  value="1"> 是
            <input type="radio" name="spousePeer"  value="2"> 否
        </label>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <label for="e_maritalProve">婚育证明：</label>
        <label class="-inline" id="e_maritalProve">
            <input type="radio" name="maritalProve"  value="1"> 有
            <input type="radio" name="maritalProve"  value="2"> 无
        </label>
    </div>

    <div class="form-group">
        <label for="e_maritalCardNumber"  >婚育证编号：<input type="text"   id="e_maritalCardNumber"  >
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
         是否验证：
        <label class="-inline" id="e_verification">
            <input type="radio" name="verification"  value="1"> 是
            <input type="radio" name="verification"  value="2"> 否
        </label>
        </label>
    </div>
    <%--<div class="form-group">
        <label for="e_unitAddress">生育情况：</label>
        <input type="hidden" id="e_unitAddress">
    </div>

    <div class="form-group" >
        <label for="e_childrenNumber">生育子女数：</label>
        男<input type="text" id="man" name="childrenNumber">人
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        女<input type="text" id="e_childrenNumber" name="childrenNumber">人

        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <label for="e_childrenNumber">政策内：</label>
        <label class="-inline">
            <input type="radio" name="flatType"  value="1"> 1孩
            <input type="radio" name="flatType"  value="2"> 2孩
        </label>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <label for="e_childrenNumber">政策外：</label>
        <label class="-inline">
            <input type="radio" name="flatType"  value="1"> 2孩
            <input type="radio" name="flatType"  value="2"> 3孩
        </label>

    </div>--%>
    <div class="form-group">
        <label for="e_oneChildCertificate">独生子女证：</label>
        <label class="-inline" id="e_oneChildCertificate">
            <input type="radio" name="oneChildCertificate"  value="1"> 有
            <input type="radio" name="oneChildCertificate"  value="2"> 无
        </label>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <label for="e_socialSupportFee">社会抚养费征收：</label>
        <label class="-inline" id="e_socialSupportFee">
            <input type="radio" name="socialSupportFee"  value="1"> 已缴
            <input type="radio" name="socialSupportFee"  value="2"> 未缴
        </label>
        <input type="hidden" id="e_socialSupportFees">
    </div>
    <div class="form-group" id="a-contraceptionPregnancy">
        <label for="e_contraceptionPregnancy">怀孕避孕情况：</label>
        <label id="e_contraceptionPregnancy"></label>

        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <label for="e_measureTime">措施时间：</label>
        <input type="text" id="e_measureTime" name="measureTime">
    </div>
    <div class="form-group">
        <label for="e_theFertility">当年生育子女：</label>
        <label class="-inline" id="e_theFertility">
            <input type="radio" name="theFertility"  value="1"> 男
            <input type="radio" name="theFertility"  value="2"> 女
        </label>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        出生日期：<input type="text" name="flatType"  >
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <label for="e_policy">政策：</label>
        <label class="-inline" id="e_policy">
            <input type="radio" name="policy"  value="1"> 内
            <input type="radio" name="policy"  value="2"> 外
        </label>

        <input type="hidden" id="e_ginsengIs">
    </div>


    <button  class="btn btn-default" >保存</button>
    <button class="btn btn-default">下一项</button>
</form>


</body>