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
<link rel="stylesheet" href="<%=path%>/css/bootstrap.min.css"  />
</head>
<body>
	<form id="form1" class="form-inline" action="<%=path %>/web/sendRegisterMsg.do">
		<div class="form-group">
			<label for="exampleInputEmail1">Email address</label>
			<input id="inut9" type="email" name="email1" style="width: 200px;" class="form-control" id="exampleInputEmail1" placeholder="Email">
		</div>
		<button type="button" id="toregisterbtn" class="btn btn-default">Submit</button>
	</form>
	<script src="<%=path%>/js/user.js"></script>
</body>
</html>