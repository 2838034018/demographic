<%@page contentType="text/html; utf-8" pageEncoding="UTF-8" isELIgnored="false" %>
<script src="${pageContext.request.contextPath}/js/four_linkage.js"></script>
<form class="form-inline">
    <div class="form-group">
        <label class="control-label">从</label>
        <input type="text" class="form-control">
        <label class="control-label">至</label>
        <input type="text" class="form-control">
    </div>
    <br/>
    <div class="form-group">
        <label class="control-label">省</label>
        <select name="province" id="shen" class="form-control">
            <option value="0">---请选择---</option>
        </select>
    </div>

    <div class="form-group">
        <label class="control-label">市</label>
        <select name="city" id="shi" class="form-control">
            <option value="0">---请选择---</option>
        </select>
    </div>

    <div class="form-group">
        <label class="control-label">县/区</label>
        <select name="district" id="xian" class="form-control">
            <option value="0">---请选择---</option>
        </select>
    </div>
    <div class="form-group">
        <label class="control-label">乡/镇</label>
        <select name="town" id="xiang" class="form-control">
            <option value="0">---请选择---</option>
        </select>
    </div>
    <button class="btn btn-primary">查询</button>
</form>
<!-- 为 ECharts 准备一个具备大小（宽高）的 DOM -->
<div id="main" style="width: 800px;height: 600px;"></div>
<script type="text/javascript">
    // 基于准备好的dom，初始化echarts实例
    var myChart = echarts.init(document.getElementById('main'));

    // 指定图表的配置项和数据

    // 指定图表的配置项和数据
    option = {
        title: {
            left: 'center'
        },
        tooltip: {
            trigger: 'item'
        },
        legend: {
            orient: 'vertical',
            left: 'left',
        },
        visualMap: {
            min: 0,
            max: 3000,
            left: 'left',
            top: 'bottom',
            text: ['高', '低'],           // 文本，默认为数值文本
            calculable: true
        },
        toolbox: {
            show: true,
            orient: 'vertical',
            left: 'right',
            top: 'center',
            feature: {
                mark: {show: true},
                dataView: {show: true, readOnly: false},
                restore: {show: true},
                saveAsImage: {show: true}
            }
        },
        series: [
            {
                name: '用户分布',
                type: 'map',
                mapType: 'china',
                /*data:[
                    {name:"北京",value:400},
                    {name:"河南",value:500},
                    {name:"山西",value:600},
                    {name:"山东",value:700},
                    {name:"湖南",value:1000}
                ],*/
                roam: false,
                label: {
                    normal: {
                        show: false
                    },
                    emphasis: {
                        show: true
                    }
                }

            }


        ]
    };
    // 使用刚指定的配置项和数据显示图表。
    myChart.setOption(option);
    $.ajax({
        url: "${pageContext.request.contextPath}/echarts/selectList",
        type: "post",
        datatype: "json",
        success: function (da) {
            myChart.setOption({
                series: [{data: da}]
            })
        }
    })
</script>