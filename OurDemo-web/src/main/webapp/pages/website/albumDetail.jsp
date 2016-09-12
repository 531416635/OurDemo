<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
<title>我的相册</title>
<link href="<%=path%>/css/viewer.css" rel="stylesheet" />
<style type="text/css">
.images {
	list-style-type: none;
	display: inline;
}
.images li {
	display: inline;
}
.images img {
	min-width: 100px;
	max-width: 200px;
}
</style>
</head>
<body>
	<div class="container" id="box">
		<div class="container content">
			<ul class="images content-grid">
				<c:forEach var="fileImage" items="${images }" varStatus="status">
					<li><img src="<%=path%>${fileImage.filepath}" alt="Picture"  class="img-thumbnail"/></li>
				</c:forEach>
			</ul>

		</div>
		<div>
			<c:forEach var="fileImage" items="${images }" varStatus="status">
				<a href="../web/downloadfile.do?path=${fileImage.filepath}&filename=${fileImage.filename}${fileImage.filetype}">${fileImage.filename}</a>
			</c:forEach>
		</div>
	</div>
	<script src="<%=path%>/js/viewer.js"></script>
	<script type="text/javascript">
		$(".images").viewer();
	</script>
</body>
</html>