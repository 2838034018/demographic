<%@page isELIgnored="false" contentType="text/html; utf-8" pageEncoding="UTF-8" %>
<script>
    $(function () {
        $("#registerList").jqGrid({
            url: "",
            editurl: "",
            datatype: "json",
            colNames: ["编号", "单位名称", "姓名", "联系方式", "提交时间", "详情", "审核员", "审核状态"],
            colModel: [
                {name: "id"},
                {name: ""},
                {name: ""},
                {name: ""},
                {name: ""},
                {
                    name: "",
                    formatter: function (a, b, c) {
                        return "<a href=''>查看详情</a>"
                    }
                },
                {name: ""},
                {name: ""}

            ],
            styleUI: "Bootstrap",
            autowidth: true,
            height: "60%",
            pager: "#registerPage",
            page: 1,
            rowNum: 2,
            rowList: [4, 6, 10],
            viewrecords: true,
            multiselect: true
        }).jqGrid("navGrid", "#registerPage",
            {//处理页面几个按钮的样式
                search: false
            },
            {//在编辑之前或者之后进行额外的操作

            },
            {//在添加数据 之前或者之后进行额外的操作

            },
            {//在删除数据之前或者之后进行额外的操作

            }
        )
    });

</script>
<div>
    <!-- Nav tabs -->
    <ul class="nav nav-tabs" role="tablist">
        <div class="input-group" style="width: 30%; float: right">
            <button><a href="">通过审核</a></button>
            <button><a href="">不通过</a></button>
        </div>
        <div class="input-group" style="width: 30%; float: left">
            <input id="esValue" type="text" class="form-control" placeholder="请输入关键字" aria-describedby="basic-addon2">
            <span class="input-group-addon" id="basic-addon2"><a>搜索</a></span>
        </div>
    </ul>
</div>
<table id="registerList"></table>
<div id="registerPage"></div>