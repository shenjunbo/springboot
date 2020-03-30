let nginx_url = "http://localhost:8080";

$("#addStu").click(function() {
    $.ajax({
        type: "post",
        url: nginx_url + "/user/save",
        data: {},
       // dataType: "json",
        async: false,
        success: function(result) {
            if (result === "success") {
                alert("学生信息添加成功！");
                $("#stuForm")[0].reset();
                window.location.href=nginx_url+"/user/select";
            } else {
                alert("学生信息添加失败！请重新添加");
            }
        },error:function(XMLHttpRequest, textStatus, errorThrown){
            
             alert("111");
        }
    });
});
