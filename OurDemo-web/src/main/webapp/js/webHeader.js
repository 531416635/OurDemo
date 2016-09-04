/**
 * 清除登录框信息
 */
$("#loginbtn").click(function() {
	$("#exampleInputEmail1").val("");
	$("#exampleInputPassword1").val("");
});

$("#signin").click(function(){
	var email=$("#webheaderInputEmail1").val().trim();
	var password=MD5($("#webheaderInputPassword1").val().trim());
	$.ajax({
        type: "post",
        url: "login.do",
        data: {
        	email:email, 
        	password:password.toString()
        },
        dataType: "json",
        success: function(data){
        	if(1==data){
        		$("#warninglogin").html("");
        		var html="<div class=\"alert alert-danger alert-dismissible text-left\" role=\"alert\">"
				+"<button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\">"
				+"<span aria-hidden=\"true\">&times;</span>"
				+"</button>"
				+"<strong>警告！</strong>用户名或密码错误,请重新输入"
				+"</div>";
        		$("#exampleInputEmail1").val("");
        		$("#exampleInputPassword1").val("");
        		$("#warninglogin").append(html);
        	}else if(2==data){
        		location.reload();
        	}
        }
    });
});
$("#midiv").css("margin-top",$("#webheadernavbar").height());