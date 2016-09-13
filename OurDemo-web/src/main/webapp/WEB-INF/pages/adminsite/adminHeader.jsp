<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.opensymphony.com/sitemesh/decorator"	prefix="decorator"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<!-- 这里就是装饰页面 -->
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title><decorator:title default="OurDemo" /></title>
<%-- <link rel="stylesheet" href="<%=path%>/css/redcss/detail.css"
	type="text/css" /> --%>
<%-- <script type="text/javascript" src="<%=path%>/js/redjs/jquery.min.2.js"></script> --%>
<!-- head装饰页面 -->
<decorator:head />
</head>
<body>
	<span>导航头部页面</span>
	<!-- 中间装饰内容页面 -->
	<decorator:body />
	<span>尾部页面</span>
</body>
</html>