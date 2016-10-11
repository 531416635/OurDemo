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
	<div id="indexlayout" class="easyui-layout"
		style="width: 100%; min-height: 500px;">
		<div data-options="region:'east',title:'East',split:true"
			style="width: 10%;"></div>
		<div data-options="region:'west',title:'West',split:true"
			style="width: 10%;">
			<div id="aa" class="easyui-accordion"
				style="width: 100%; ">
				<div title="Title1" data-options="iconCls:'icon-save'"
					style="overflow: auto; padding: 10px;">
					<h3 style="color: #0099FF;">Accordion for jQuery</h3>
					<p>Accordion is a part of easyui framework for jQuery. It lets
						you define your accordion component on web page more easily.</p>
				</div>
				<div title="Title2"
					data-options="iconCls:'icon-reload',selected:true"
					style="padding: 10px;">content2</div>
				<div title="Title3">content3</div>
			</div>

		</div>
		<div data-options="region:'center',title:'center title'"
			style="padding: 5px; background: #eee;"></div>
	</div>

	<script src="<%=path%>/js/admin/index.js"></script>
</body>
</html>
