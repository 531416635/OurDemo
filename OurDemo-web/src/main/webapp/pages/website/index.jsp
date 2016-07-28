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
<title>OurDemo1</title>
<link href="<%=path%>/css/style.css" rel="stylesheet" />
<link href="<%=path%>/css/viewer.css" rel="stylesheet" />
 <link href="http://vjs.zencdn.net/5.0.2/video-js.css" rel="stylesheet">
    <script src="http://vjs.zencdn.net/ie8/1.1.0/videojs-ie8.min.js"></script>
    <script src="http://vjs.zencdn.net/5.0.2/video.js"></script>

<style>
.image, .images img {
	max-height: 20%;
	max-width: 30%;
}
</style>
</head>
<body>
	<h1>Hello World! This is OurDemo.</h1>
http://www.jq22.com/jquery-info404
	<video id="example_video_1" class="video-js vjs-default-skin" controls preload="none" width="640" height="264" poster="http://vjs.zencdn.net/v/oceans.png" data-setup="{}">
    <source src="video1.mp4" type="video/mp4">
    <source src="video1.mp4" type="video/webm">
    <source src="video1.mp4" type="video/ogg">
    <track kind="captions" src="../shared/example-captions.vtt" srclang="en" label="English"></track>
    <!-- Tracks need an ending tag thanks to IE9 -->
    <track kind="subtitles" src="../shared/example-captions.vtt" srclang="en" label="English"></track>
    <!-- Tracks need an ending tag thanks to IE9 -->
    <p class="vjs-no-js">To view this video please enable JavaScript, and consider upgrading to a web browser that <a href="http://videojs.com/html5-video-support/" target="_blank">supports HTML5 video</a></p>
  </video>
	<div>
		<img class="image" src="<%=path%>/img/picture.png" alt="Picture" /> 
		<img class="image2" src="<%=path%>/img/picture.png" alt="Picture" />
	</div>

	<div>
		<ul class="images">
			<li><img src="<%=path%>/img/picture.png" alt="Picture" /></li>
			<li><img src="<%=path%>/img/picture.png" alt="Picture" /></li>
			<li><img src="<%=path%>/img/picture.png" alt="Picture" /></li>
		</ul>
	</div>


	<!-- Scripts -->
	<script src="<%=path%>/js/jquery-3.0.0.min.js"></script>
	<script src="<%=path%>/js/viewer.js"></script>
	<script src="<%=path%>/js/video.js"></script>
	<script>
		$('.image').viewer();
		$('.image2').viewer();
		$('.images').viewer();
	</script>
</body>
</html>
