/**
 * 清除登录框信息
 */
$("#loginbtn").click(function() {
	$("#exampleInputEmail1").val("");
	$("#exampleInputPassword1").val("");
});

$("#signin").click(function(){
	var email=$("#exampleInputEmail1").val().trim();
	var password=MD5($("#exampleInputPassword1").val().trim());
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
        		$("#exampleInputEmail1").val("");
        		$("#exampleInputPassword1").val("");
        		$("#warninglogin").removeClass("hide");
        	}else if(2==data){
        		
        	}
        }
    });
});
