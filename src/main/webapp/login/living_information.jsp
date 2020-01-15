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
    <script src="${pageContext.request.contextPath}/js/living_information.js"></script>
    <style type="text/css">
        body {
            background: url("../img/1.jpg");
        }
    </style>
</head>
<body>
<div class="row">
    <div class="col-xs-6 col-sm-1"></div>
    <div class="col-xs-6 col-sm-10">
        <form class="form-horizontal" id="houseForm">
            <div class="form-group">
                <label class="col-sm-2 control-label">居住方式</label>
                <div class="col-sm-10" id="livingType">
                </div>
                <span id="living_type"></span>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">居住事由</label>
                <div class="col-sm-10" id="liveFor">
                </div>
                <span id="live_for"></span>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">房屋类别</label>
                <div class="col-sm-10" id="houseType">
                </div>
                <span id="house_type"></span>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">房屋地址</label>
                <div class="col-sm-10">
                    <table border='1px' cellpadding='0' cellspacing='0'>
                        <tr>
                            <td><input type="text" name="area" id="area_text" onblur="areatext()"></td>
                            <td>(市区县)</td>
                            <td><input type="text" name="jieBan" id="jieBan_text" onblur="jieBantext()"></td>
                            <td>街办</td>
                            <td><input type="text" name="comMittee" id="comMittee_text" onblur="comMitteetext()"></td>
                            <td>社区、居(村)委会</td>
                        </tr>
                        <tr>
                            <td><input type="text" name="streetRoadAlley" id="streetRoadAlley_text"
                                       onblur="streetRoadAlleytext()"></td>
                            <td>(街路巷)</td>
                            <td><input type="text" name="houseNumber" id="houseNumber_text" onblur="houseNumbertext()">
                            </td>
                            <td>门楼牌号</td>
                            <td><input type="text" name="houseAddress" id="houseAddress_text"
                                       onblur="houseAddresstext()"></td>
                            <td>门楼详址</td>
                            <td>房间号</td>
                            <td><input type="text" name="roomNumber" id="roomNumber_text" onblur="roomNumbertext()">
                            </td>
                        </tr>
                    </table>
                    <div>
                        <span id="area_id"></span>
                        <span id="jieBan_id"></span>
                        <span id="comMittee_id"></span>
                        <span id="streetRoadAlley_id"></span>
                        <span id="houseNumber_id"></span>
                        <span id="houseAddress_id"></span>
                        <span id="roomNumber_id"></span>
                    </div>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">房屋类型</label>
                <div class="col-sm-10" id="housingTypes">
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">房屋用途</label>
                <div class="col-sm-10" id="usageHouse">
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">信息采集员</label>
                <div class="col-sm-10">
                    <label class="radio-inline">
                        <input type="text" name="informationCollector" id="name_text" onblur="informationname()">
                        <span id="name_id"></span>
                    </label>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">出租人情况</label>
                <div class="col-sm-10">
                    <form id="landForm">
                        <table border='1px' cellpadding='0' cellspacing='0'>
                            <tr>
                                <td>房东姓名</td>
                                <td><input type="text" name="landLord" id="landLord_text" onblur="landName()"></td>
                                <td>联系电话</td>
                                <td><input type="text" name="landPhone" id="lanPhone_text" onblur="landPh()"></td>
                                <td>是否签订治安责任书</td>
                                <td><input type="text" name="isSecurity" id="isSecurity1_text" onblur="isSecurity1()">
                                </td>
                            </tr>
                            <tr>
                                <td>房东身份号码</td>
                                <td colspan="5"><input type="text" name="landIdCard" style="width:100%;"
                                                       id="landIdCard_text" onblur="Card1()"></td>
                            </tr>
                        </table>
                        <div>
                            <span id="landLord_id"></span>
                            <span id="landPhone_id"></span>
                            <span id="isSecurity1_id"></span>
                            <span id="landIdCard1_id"></span>
                        </div>
                    </form>
                    <br>
                    <form id="agentForm">
                        <table border='1px' cellpadding='0' cellspacing='0'>
                            <tr>
                                <td>代理人姓名</td>
                                <td><input type="text" name="agentName" id="agentName_text" onblur="agName()"></td>
                                <td>联系电话</td>
                                <td><input type="text" name="agentPhone" id="agentPhone_text" onblur="adPh()"></td>
                                <td>是否签订治安责任书</td>
                                <td><input type="text" name="isSecurity" id="isSecurity2_text" onblur="isSecurity2()">
                                </td>
                            </tr>
                            <tr>
                                <td>代理人身份号码</td>
                                <td colspan="5"><input type="text" name="agentIdCard" style="width:100%;"
                                                       id="agentIdCard_text" onblur="Card2()"></td>
                            </tr>
                        </table>
                        <div>
                            <span id="agentName_id"></span>
                            <span id="agentPhone_id"></span>
                            <span id="isSecurity2_id"></span>
                            <span id="agentIdCard_id"></span>
                        </div>
                    </form>
                </div>
            </div>
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <button type="submit" class="btn btn-default" onclick="baocun()">提交</button>
                </div>
            </div>
        </form>
    </div>
    <div class="col-xs-6 col-sm-1"></div>
</div>
<nav class="navbar navbar-default navbar-fixed-bottom">
    <div class="panel panel-default">
        <div style="text-align: center" class="panel-body">
            版权所有:公安局
        </div>
    </div>
</nav>
</body>
<script>
    function baocun() {
        var livingInformation = $("#houseForm").serialize();
        var landlord = $("#landForm").serialize();
        var agent = $("#agentForm").serialize();
        var form = livingInformation + "&" + landlord + "&" + agent
        $.ajax({
            url: "${pageContext.request.contextPath}/personal/insertDwell",
            type: "post",
            data: form
        })
    }
</script>
</html>