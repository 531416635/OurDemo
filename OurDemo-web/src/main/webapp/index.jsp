<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
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
<!-- 对移动设备的支持更友好-->
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>OurDemo</title>
<link rel="stylesheet" href="<%=path%>/css/bootstrap.css"  media="screen" />
<script src="<%=path%>/js/jquery-3.0.0.js"></script>
<script src="<%=path%>/js/bootstrap.js"></script>

<!-- <script language="javascript" type="text/javascript">
	function bodyload() {
		window.location = "/GraduationDesign/web/toIndex.do";
	}
</script>
 -->
</head>
<!-- <body onload="bodyload()"> -->
<body>
	<h1>Hello World! This is OurDemo.</h1>
	<h1><a href="web/index.do">web index</a></h1>
	<h1><a href="admin/index.do">admin index</a></h1>
</body>
</html>
