<%@page isELIgnored="false" contentType="text/html; utf-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script>
    $(function(){
        selectPersonal(1);
    });

    function selectPersonal(pageNow) {
        console.log($("#selCompanyName").val())
        $.ajax({
            url: "${pageContext.request.contextPath}/registrationInformation/selectList",
            type: "POST",
            async: false,
            data: {
                pageNow: pageNow,
                companyName: $("#selCompanyName").val(),
                identity: $("#identity").val(),
            },
            dataType: "json",
            success:function (data) {
                console.log(data);
                if(data.total > 0){
                    $("#tbodyAdd").remove();
                    $("#tableAdd").append(`<tbody id="tbodyAdd"></tbody>`);
                    $.each(data.list,function (i,p) {
                        var num = i + 1;
                        $("#tbodyAdd").append(`<tr id="trAdd">
                        <th><input type="checkbox" name="checkboxs"></th>
                        <th>${'${num}'}</th>
                        <th>${'${p.companyName}'}</th>
                        <th>${'${p.name}'}</th>
                        <th>${'${p.movePhone}'}</th>
                        <th>${'${p.createTime}'}</th>
                        <th><a href="#">查看详情</a></th>
                        <th>${'${p.auditor == null ? "":p.auditor}'}</th>
                        <th>${'${p.status == 0 ? "未审核":"未通过"}'}</th>
                    </tr>`)
                    })
                    if(data.pages <= 4){
                        $("#ulAdd").remove();
                        $("#pageAdd").append(`<ul class="pagination" id="ulAdd"></ul>`)
                        if(data.pageNow != 1){
                            $("#ulAdd").append(`<li><a href="#" style="border-radius: 5px">上一页</a></li>`)
                        }
                        for(var i = 1;i <= data.pages;i++){
                            $("#ulAdd").append(`<li><a href="javascript:;" style="border-radius: 0px" onclick="selectPersonal(${'${i}'})">${'${i}'}</a></li>`)
                        }
                        if(data.pageNow != data.pages){
                            $("#ulAdd").append(`<li><a href="#" style="border-radius: 5px">下一页</a></li>`)
                        }
                    }else {
                        if(data.pageNow <= 4){

                        }
                    }
                }else {
                    $("#tbodyAdd").remove();
                    $("#nullAdd").append(`<p>未查到任何信息!!!</p>`);
                }
                $("#selCompanyName").val(data.selCompanyName);

            },
        })
    }
</script>
<div>
    <input type="hidden" id="identity" value="1702">
    <!-- Nav tabs -->
    <ul class="nav nav-tabs" role="tablist">
        <div class="input-group" style="width: 30%; float: right">
            <button><a href="">通过审核</a></button>
            <button><a href="">不通过</a></button>
        </div>
        <div class="input-group" style="width: 30%; float: left">
            <input type="text" class="form-control" placeholder="请输入关键字" aria-describedby="basic-addon2" id="selCompanyName">
            <span class="input-group-addon" id="basic-addon2"><a href="javascript:;" onclick="selectPersonal(1)">搜索</a></span>
        </div>
    </ul>
</div>
<table class="table table-bordered table-hover" id="tableAdd">
    <thead>
        <tr class="success" id="trAdd">
            <th></th>
            <th>编号</th>
            <th>公司名称</th>
            <th>姓名</th>
            <th>联系方式</th>
            <th>提交时间</th>
            <th>详情</th>
            <th>审核员</th>
            <th>审核状态</th>
        </tr>
    </thead>
    <tbody id="tbodyAdd">
    </tbody>
</table>
<div id="nullAdd"></div>
<div align="right" id="pageAdd">
    <ul class="pagination" id="ulAdd">
            <li><a href="#">«</a></li>
            <li><a href="#">1</a></li>
            <li><a href="#">2</a></li>
            <li><a href="#">3</a></li>
            <li><a href="#">4</a></li>
            <li><a href="#" style="border-style: none solid ">......</a></li>
            <li><a href="#" style="border-radius: 15px">下一页</a></li>
    </ul>
</div>
<div id="registerPage"></div>