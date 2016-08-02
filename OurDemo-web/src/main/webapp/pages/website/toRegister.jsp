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
<!-- 对移动设备的支持更友好-->
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>用户注册</title>
<link rel="stylesheet" href="<%=path%>/css/responsive-nav.css">
</head>
<body>
<div id="nav">
		<ul>
			<li><a href="#">Home</a></li>
			<li><a href="#">About</a></li>
			<li><a href="#">Projects</a></li>
			<li><a href="#">Contact</a></li>
		</ul>
	</div>
	<script src="<%=path%>/js/jquery-3.0.0.js"></script>
	<script src="<%=path%>/js/bootstrap.js"></script>
	<script src="<%=path%>/js/responsive-nav.js"></script>
	<script>
		var navigation = responsiveNav("#nav");
	</script>
</body>
</html>