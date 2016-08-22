/**
 * 注册前，填写注册邮箱界面
 */
$("#toregisterbtn").click(function(){
  	var username=$("#username").val().trim();
	var email=MD5($("#email").val().trim());
	$.ajax({
	    type: "post",
	    url: "sendRegisterMsg.do",
	    data: {
	    	username:username, 
	    	email:email
	    },
	    dataType: "json",
	    success: function(data){}
	});
});