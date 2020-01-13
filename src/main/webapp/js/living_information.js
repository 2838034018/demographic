$(function () {
    $.ajax({
        url: "/demographic/dataTable/livingType",
        type: "post",
        dataType: "json",
        success: function (data) {
            var input = "";
            $.each(data, function (i, p) {
                input += '<label class="radio-inline">' + '<input type="radio" name="livingType" value="p.nid">' + p.name + '</label>'
            })
            $("#livingType").append(input);
        }
    })
    $.ajax({
        url: "/demographic/dataTable/liveFor",
        type: "post",
        dataType: "json",
        success: function (data) {
            var input = "";
            $.each(data, function (i, p) {
                input += '<label class="radio-inline">' + '<input type="radio" name="liveFor" value="p.nid">' + p.name + '</label>'
            })
            $("#liveFor").append(input);
        }
    })
})
