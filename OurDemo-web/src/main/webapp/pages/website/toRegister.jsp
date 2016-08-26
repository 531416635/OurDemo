<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户注册</title>
<style type="text/css">

.bs-example-form{
	max-width: 250px;
}
.input-danger{
	border-color: #FC4343 !important;
    outline: 0 !important;
    background-color: #F2DEDE !important;
    -webkit-box-shadow: inset 0 1px 1px rgba(0,0,0,.075),0 0 8px rgba(102,175,233,.6) !important;
    box-shadow: inset 0 1px 1px rgba(0,0,0,.075),0 0 8px rgba(102,175,233,.6) !important;
}
.form-tr{
	position: relative;
}
.from-success{
	color: #3c763d;
}
.from-error{
	color: #a94442;
}
</style>
<link rel="stylesheet" href="<%=path%>/css/bootstrap.min.css"  />
</head>
<body>
	<div class="panel panel-default">
		<div class="panel-body">
			<form class="bs-example bs-example-form  center-block" data-example-id="simple-input-groups">
				<div class="form-group">
					<label>用户名：</label>
					<div class="form-tr">
						<input id="toregisterusername" type="text" name="username"  class="form-control" placeholder="请输入用户名">
						<i class="from-success form-control-feedback glyphicon glyphicon-remove" style="display: block;"></i>
					</div>
				</div>
				<div class="form-group">
					<label>邮箱：</label>
					<div class="form-tr">
						<input id="toregisteremail" type="email" name="email"  class="form-control"  placeholder="请输入邮箱">
						<i class="from-error form-control-feedback glyphicon glyphicon-ok" data-bv-icon-for="firstName" style="display: block;"></i>
					</div>
				</div>
				<div class="form-group" id="msgDIV"></div>
				<button type="button" id="toregisterbtn" class="btn btn-default">注册</button>
			</form>
		</div>
	</div>



	<div class="col-lg-5">
	</div>











	<script type="text/javascript">
	$("#toregisterusername").focus(function(){
		$("#toregisterusername").removeClass("input-danger");
	});
	$("#toregisteremail").focus(function(){
		$("#toregisteremail").removeClass("input-danger");
	});
	</script>
	<script src="<%=path%>/js/toRegister.js"></script>
</body>
</html>