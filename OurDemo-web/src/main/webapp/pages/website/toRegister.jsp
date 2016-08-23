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
	border-color: #EBCCD1 !important;
    outline: 0 !important;
    background-color: #F2DEDE !important;
    -webkit-box-shadow: inset 0 1px 1px rgba(0,0,0,.075),0 0 8px rgba(102,175,233,.6) !important;
    box-shadow: inset 0 1px 1px rgba(0,0,0,.075),0 0 8px rgba(102,175,233,.6) !important;
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
					<input id="toregisterusername" type="text" name="username"  class="form-control" placeholder="请输入用户名">
				</div>
				<div class="form-group">
					<label>邮箱：</label>
					<input id="toregisteremail" type="email" name="email"  class="form-control"  placeholder="请输入邮箱">
				</div>
				<button type="button" id="toregisterbtn" class="btn btn-default">注册</button>
			</form>
		</div>
	</div>
	<script type="text/javascript">
	$("#toregisterusername").focus(function(){
		$("#toregisterusername").removeClass("input-danger");
	});
	</script>
	<script src="<%=path%>/js/toRegister.js"></script>
</body>
</html>