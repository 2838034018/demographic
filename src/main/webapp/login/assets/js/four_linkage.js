$(function () {
    $.ajax({
        url: "/demographic/dataTable/shen",
        type: "post",
        dataType: "json",
        success: function (data) {
            var option = "";
            $.each(data, function (i, p) {
                option += '<option   value="' + p.id + '">' + p.name + '</option>'
            })
            $("#shen").append(option);
        }
    })
    $("#shen").change(function () {
        var shenId = $("#shen").val();
        $.ajax({
            url: "/demographic/dataTable/all",
            data: {"id": shenId},
            type: "post",
            dataType: "json",
            success: function (data) {
                $("#shi").empty();
                var option1 = '<option value="0">请选择</option>';
                $("#shi").append(option1)
                var option = "";
                $.each(data, function (i, p) {
                    option += '<option selected="selected" value="' + p.id + '">' + p.name + '</option>'
                })
                $("#shi").append(option);
                $("#shi").change();
            }
        })
    })
    $("#shi").change(function () {
        var cityId = $("#shi").val();
        $.ajax({
            url: "/demographic/dataTable/all",
            data: {"id": cityId},
            type: "post",
            dataType: "json",
            success: function (data) {
                $("#xian").empty();
                var option1 = '<option value="0">请选择</option>';
                $("#xian").append(option1)
                var option = "";
                $.each(data, function (i, p) {
                    option += '<option selected="selected" value="' + p.id + '">' + p.name + '</option>'
                })
                $("#xian").append(option);
                $("#xian").change();
            }
        })
    })
    $("#xian").change(function () {
        var xianId = $("#xian").val();
        $.ajax({
            url: "/demographic/dataTable/all",
            data: {"id": xianId},
            type: "post",
            dataType: "json",
            success: function (data) {
                $("#xiang").empty();
                var option1 = '<option value="0">请选择</option>';
                $("#xiang").append(option1)
                var option = "";
                $.each(data, function (i, p) {
                    option += '<option selected="selected" value="' + p.id + '">' + p.name + '</option>'
                })
                $("#xiang").append(option);
            }
        })
    })
})