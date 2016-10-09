<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>OurDemo1</title>
</head>
<body>
	<div class="easyui-layout" style="width: 400px; height: 200px;">
		<div region="west" split="true" title="Navigator"
			style="width: 150px;">
			<p style="padding: 5px; margin: 0;">Select language:</p>

		</div>
		<div  region="center" title="Language" style="padding: 5px;width:100%;"></div>
		<div region="east" split="true" title="Navigator"
			style="width: 150px;">
			<p style="padding: 5px; margin: 0;">Select language:</p>

		</div>
	</div>
</body>
</html>
