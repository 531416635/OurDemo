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
<link rel="stylesheet" href="<%=path%>/css/admin/index.css" />
</head>
<body>
	<div id="indexlayout" class="easyui-layout"
		style="width: 100%; min-height: 500px;">
		<div data-options="region:'east',title:'East',split:true"
			style="width: 10%;"></div>
		<div data-options="region:'west',title:'West',split:true"
			style="width: 10%;overflow:hidden">
			<div id="aa" class="easyui-accordion"
				style="width: 100%;height: 100%; ">
				<div title="一级管理" data-options="iconCls:'icon-save',selected:true"
					style="overflow: auto; width: 100%;">
					<div id="menu1" class="menudiv">用户管理</div>
					<div class="menudiv">File 12</div>
					<div class="menudiv">File 13</div>
				</div>
				<div title="二级管理" data-options="iconCls:'icon-reload'" 
					style="overflow: auto; width: 100%;">content2</div>
				<div title="三级管理" data-options="iconCls:'icon-reload'" 
					style="overflow: auto; width: 100%;">content3</div>
			</div>

		</div>
		<div data-options="region:'center',title:'center title'"
			style="padding: 5px; background: #eee;">
			<div id="tt" class="easyui-tabs" style="width: 100%; height: 100%;">
			</div>
		</div>
	</div>

	<script src="<%=path%>/js/admin/index.js"></script>
</body>
</html>
