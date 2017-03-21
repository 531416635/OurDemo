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
<title>用户激活</title>
<style type="text/css">
</style>
<link rel="stylesheet" href="<%=path%>/css/plugin/bootstrap.css" />
</head>
<body>
	<div class="panel panel-default">
		<div class="panel-body">
			<c:if test="${result > 0}">
				<c:out value="${userModel.username}" />
			</c:if>
			<c:if test="${result = 0}">
				链接失效
			</c:if>
		</div>
	</div>

	<div class="col-lg-5"></div>
</body>
</html>