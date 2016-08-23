/**
 * 注册前，填写注册邮箱界面
 */
$("#toregisterbtn").click(function(){
  	var username=$("#toregisterusername").val().trim();
	var email=$("#toregisteremail").val().trim();
	$.ajax({
	    type: "post",
	    url: "sendRegisterMsg.do",
	    data: {
	    	username:username, 
	    	email:email
	    },
	    dataType: "json",
	    success: function(data){
	    	
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
	    	
	    }
	});
});