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
	    dataType: "text",
	    success: function(data){
	    	if(data=="1"){
	    		$("#msgDIV").html("");
	    		var html="<div class=\"alert alert-danger alert-dismissible text-left\" role=\"alert\">"
				+"<button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\">"
				+"<span aria-hidden=\"true\">&times;</span>"
				+"</button>"
				+"用户名已被注册,请重新输入"
				+"</div>";
	    		$("#toregisterusername").addClass("input-danger");
	    		$("#toregisteremail").removeClass("input-danger");
	    		$("#msgDIV").append(html);
	    	}else if(data=="2"){
	    		$("#msgDIV").html("");
	    		var html="<div class=\"alert alert-danger alert-dismissible text-left\" role=\"alert\">"
				+"<button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\">"
				+"<span aria-hidden=\"true\">&times;</span>"
				+"</button>"
				+"邮箱已被注册,请重新输入"
				+"</div>";
	    		$("#toregisteremail").addClass("input-danger");
	    		$("#toregisterusername").removeClass("input-danger");
	    		$("#msgDIV").append(html);
	    	}else if(data=="3"){
	    		$("#msgDIV").html("");
	    		var html="<div class=\"alert alert-success alert-dismissible text-left\" role=\"alert\">"
				+"<button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\">"
				+"<span aria-hidden=\"true\">&times;</span>"
				+"</button>"
				+"邮件已发送，请注意查收！"
				+"</div>";
	    		$("#msgDIV").append(html);
	    	}else{
	    		$("#msgDIV").html("");
	    		var html="<div class=\"alert alert-warning alert-dismissible text-left\" role=\"alert\">"
				+"<button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\">"
				+"<span aria-hidden=\"true\">&times;</span>"
				+"</button>"
				+"发生未知错误，请稍后再试！"
				+"</div>";
	    		$("#toregisterusername").addClass("input-danger");
	    		$("#toregisteremail").addClass("input-danger");
	    		$("#msgDIV").append(html);
	    	}
	    	
	    }
	});
});