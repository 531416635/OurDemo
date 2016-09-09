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
<link href="<%=path%>/css/fileinput.css" media="all" rel="stylesheet"
	type="text/css" />
<link href="<%=path%>/css/album.css" rel="stylesheet" />
</head>
<body>
	<div class="container" id="box">
		<!-- 上传图片的按钮 -->
		<button type="button" class="btn btn-primary" id="imagebtn"
			data-toggle="modal" data-target="#imagefile">上传照片</button>
		<!-- 上传图片的模态框 bootstrap的Modal -->
		<div class="modal fade bs-example-modal-lg" id="imagefile"
			tabindex="-1" role="dialog">
			<div class="modal-dialog  modal-lg" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">
							<span aria-hidden="true">×</span><span class="sr-only">Close</span>
						</button>
						<h4 class="modal-title">文件上传</h4>
					</div>
					<div class="modal-body">
						<input id="input-700" name="filename" type="file" multiple="true"
							class="file-loading">
					</div>
				</div>
			</div>
		</div>
		<!-- 处理图片二次弹出模态框的转换层 -->
		<div id="othermodal"></div>
		<!-- 图册集层-->
		<div class="container center-black">
			<c:forEach var="photoAlbum" items="${photoAlbums }" varStatus="status">
				<div class="albums">
					<a href="javascript:void(0);" class="b-link-stripe b-animate-go  thickbox">
					<img src="<%=path%>${photoAlbum.albumpath}" class="img-thumbnail" />
						<%-- <div >
							<h2>
								<span>${photoAlbum.albumname}</span>
								<p>点击浏览图册</p>
							</h2>
						</div> --%>
					</a>
				</div>
			</c:forEach>
		</div>
		<!-- 下载测试 -->
		<div>
			<c:forEach var="fileImage" items="${fileInfos }" varStatus="status">
				<a
					href="../web/downloadfile.do?path=${fileImage.filepath}&filename=${fileImage.filename}${fileImage.filetype}">${fileImage.filename}</a>
				<%-- <img src="<%=path%>${fileImage.filepath}" class="img-thumbnail" /> --%>
			</c:forEach>
		</div>
	</div>
	<script src="<%=path%>/js/viewer.js"></script>
	<script src="<%=path%>/js/fileinput.js"></script>
	<script src="<%=path%>/js/album.js"></script>
</body>
</html>