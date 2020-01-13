<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>插入配偶信息--hjl</title>
    <!-- 引入bootstrap的css -->
    <link  href="../hejl/js/bootstrap/css/bootstrap.min.css" rel="stylesheet" >
    <!-- 引入bootstrap-treeview的css -->
    <link  href="../hejl/js/treeview/bootstrap-treeview.min.css" rel="stylesheet" >
    <!-- 引入bootstrap-addTabs的css -->
    <link  href="../hejl/js/addTabs/addTabs.css" rel="stylesheet" >
    <!-- 引入jquery -->
    <script type="text/javascript" src="../hejl/js/easyui1.5/jquery.min.js"></script>
    <!-- 引入bootstrap的js-->
    <script type="text/javascript" src="../hejl/js/bootstrap/js/bootstrap.min.js"></script>
    <!-- 引入bootstrap的js-->
    <script type="text/javascript" src="../hejl/js/treeview/bootstrap-treeview.min.js"></script>
    <!-- 引入bootstrap的js-->
    <script type="text/javascript" src="../hejl/js/addTabs/addTabs.js"></script>
    <script src="../hejl/js/jquery-1.9.1.min.js"></script>

    <script type="text/javascript" src="../js/four_linkage.js"></script>
    <script src="${pageContext.request.contextPath}/js/four_linkage.js"></script>
    <style type="text/css">
        body {padding-top:50px;margin-left:0px}
    </style>
</head>
<body>
<div class="form-horizontal">
    <form id="addUserForm" >
        <div class="form-group">
            <label   class="col-sm-2 control-label">配偶姓名</label>
            <div class="col-sm-5">
                <input type="text" class="form-control" name="spouseName"  placeholder="配偶姓名">
            </div>
        </div>

        <div class="form-group">
            <label   class="col-sm-2 control-label">配偶身份号码</label>

            <div class="col-sm-5">
                <input type="" class="form-control" name="spouseNum" placeholder="身份证号" maxlength="18">
            </div>
        </div>



        <div class="modal-body">

                <div class="form-group form-inline">
                    <label class="col-sm-2 control-label">现居住地址</label>
                    <div class="col-sm-8">
                        <select class="form-control selectpicker" style="width:120px" id="shen" name="province">
                            <option value="">--省份--</option>
                        </select>
                        <select class="form-control selectpicker" style="width:120px" id="shi" name="city">
                            <option value="">--城市--</option>
                        </select>
                        <select class="form-control selectpicker" style="width:120px" id="xian" name="district">
                            <option value="">--县区--</option>
                        </select>
                        <select class="form-control selectpicker" style="width:120px" id="xiang" name="town">
                            <option value="">--街道--</option>
                        </select>
                        <input type="text" class="form-control" size="10px" id="userArea" name="village" placeholder="             村(社区)" />
                    </div>
                </div>

                <div class="form-group">
                    <label   class="col-sm-2 control-label"></label>
                    <div class="col-sm-5">
                        <input type="text" class="form-control" id="" name="site" placeholder="门楼详址" />
                    </div>
                </div>

        </div>




        <div class="form-group">
            <label   class="col-sm-2 control-label">从业状况</label>
            <div class="col-sm-10">
                <label class="radio-inline">
                    <input type="radio" name="workingType"  value="132"> 国家机关
                </label>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                <label class="radio-inline">
                    <input type="radio" name="workingType"  value="133"> 企、事业单位
                </label>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                <label class="radio-inline">
                    <input type="radio" name="workingType"  value="134"> 自由职业
                </label>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                <label class="radio-inline">
                    <input type="radio" name="workingType"  value="135"> 民营（个体）
                </label>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                <label class="radio-inline">
                    <input type="radio" name="workingType"  value="136"> 离（退）休
                </label>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                <label class="radio-inline">
                    <input type="radio" name="workingType"  value="137"> 学生
                </label><br>
                <label class="radio-inline">
                    <input type="radio" name="workingType"  value="138"> 农民
                </label>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                <label class="radio-inline">
                    <input type="radio" name="workingType"  value="139"> 无业
                </label>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                <label class="radio-inline">
                    <input type="radio" name="workingType"  value="140"> 其他
                </label>
            </div>
        </div>

        <div class="form-group">
            <label   class="col-sm-2 control-label">工作单位</label>

            <div class="col-sm-5">
                <input type="text" class="form-control" name="companyName" >
            </div>
        </div>


        <div class="form-group">
            <label   class="col-sm-2 control-label">本人联系电话</label>
            <div class="col-sm-5">
                <input type="text" class="form-control" name="phone" maxlength="11">
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-4 control-label">
                <button type="button" class="btn btn-success" id="save">保 存</button>

            </label>

            <label class="col-sm-1 control-label">
                <button type="button" class="btn btn-info" id="next">下一项</button>
            </label>

        </div>



    </form>
</div>
</body>
<script type="text/javascript">

$("#save").click(function(){
    $.ajax({
        url:'/demographic/persion/addSpouseinfomation',
        type:'post',
        data:$("#addUserForm").serialize(),
        dataType:'json',
        success:function(data){

            if(data==true){
               alert("新增通过！");

            };
        },
        error:function(data){
            if(data==false){
                alert("保存失败！");
            };
        }
    })
})
$("#next").click(function(){
    location.href = "/demographic/leadingend/familymember.jsp"
})

</script>
</html>