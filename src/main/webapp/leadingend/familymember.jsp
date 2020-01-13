<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>插入同住家庭成员--hjl</title>
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
        body {padding-top:50px;margin-left:0 }
        input {
                    outline:none;
                     background:transparent;
                   border:none;
                     outline:medium;
                }
            *:focus {
                         outline: none;
                        background-color: transparent;
                     }
             ::selection{background:transparent; }
           ::-moz-selection{background:transparent; }

    </style>
</head>
<body>


<div class="container">
    <h2><button id="addOne">添加家庭成员</button></h2>
    <form id="familyForm" accept-charset="utf-8">
    <table class="table table-bordered">
        <thead>
        <tr>
            <th>编号</th>
            <th>关系</th>
            <th>公民身份证号</th>
            <th>姓名</th>
            <th>性别</th>
            <th>出生日期</th>
            <th>有无预防接种证</th>
            <th>是否在本市上学</th>
            <th>操作</th>
        </tr>
        </thead>

        <tbody class="addds">

        <tr>
            <td>1</td>
            <td>
              <select size="1" style="width:100px;height:25px; line-height:35px;" name="relation">
                  <option>父亲</option><option>母亲</option><option>儿子</option><option>女儿</option>
                  <option>哥哥</option><option>姐姐</option><option>弟弟</option><option>妻子</option>
                  <option>朋友</option><option>无</option>
              </select>
            </td>
            <td><input type="text" name="idNumber"></td>
            <td><input type="text" name="name"></td>
            <td><input type="radio" value="0" name="sex">男　<input type="radio" value="1" name="sex">女</td>
            <td><input type="String"  name="birthday"></td>
            <td><input type="radio" name="vaccinationCertificate" value="0">有　<input type="radio" name="vaccinationCertificate" value="1">无</td>
            <td><input type="radio" name="studyLocally" value="0">是　<input type="radio" name="studyLocally" value="1">否</td>
            <td>

        <a href="javascript:;" onclick='{if(confirm("确定要删除【家庭成员】这一人吗?")) {deleteCurrentRow(this); }else {}}'>删除</a>
            </td>
        </tr>


        </tbody>

    </table>
    </form>
    <div class="form-group">
        <label class="col-sm-4 control-label">
            <button type="button" class="btn btn-success" id="save">保 存</button>

        </label>

        <label class="col-sm-1 control-label">
            <button type="button" class="btn btn-info" id="next">下一项</button>
        </label>

    </div>
</div>
</body>
<script type="text/javascript">
    $("#addOne").click(function(){

        var id = jQuery("table").find("tr").length;

        $('.addds').append(' <tr>\n' +
            '            <td>'+id+'</td>\n' +
            '            <td>\n' +
            '              <select size="1" style="width:100px;height:25px; line-height:35px;" name="relation">\n' +
            '                  <option>父亲</option><option>母亲</option><option>儿子</option><option>女儿</option>\n' +
            '                  <option>哥哥</option><option>姐姐</option><option>弟弟</option><option>妻子</option>\n' +
            '                  <option>朋友</option><option>无</option>\n' +
            '              </select>\n' +
            '            </td>\n' +
            '            <td><input type="text" name="idNumber"></td>\n' +
            '            <td><input type="text" name="name"></td>\n' +
            '            <td><input type="radio" value="0" name="sex">男　<input type="radio" value="1" name="sex">女</td>\n' +
            '            <td><input type="text"  name="birthday"></td>\n' +
            '            <td><input type="radio" name="vaccinationCertificate" value="0">有　<input type="radio" name="vaccinationCertificate" value="1">无</td>\n' +
            '            <td><input type="radio" name="studyLocally" value="0">是　<input type="radio" name="studyLocally" value="1">否</td>\n' +
            '            <td>\n' +
            '\n' +
            '        <a href="javascript:;" onclick=\'{if(confirm("确定要删除【家庭成员】这一人吗?")) {deleteCurrentRow(this); }else {}}\'>删除</a>\n' +
            '            </td>\n' +
            '        </tr>')

    });

    //删除一行
    function deleteCurrentRow(obj){
        var tr=obj.parentNode.parentNode;
        var tbody=tr.parentNode;

        //只剩行首时删除表格
        if(tbody.rows.length==1) {
            alert("只剩一人，不可继续删除操作了");
        }else{
            tbody.removeChild(tr);
        }
    }
    $("#save").click(function(){
        $.ajax({
            url:'/demographic/persion/addFamilyMenory',
            type:'post',
            data:$("#familyForm").serialize(),
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

    })
</script>
</html>