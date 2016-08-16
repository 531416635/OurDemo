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
<meta name="viewport" content="width=device-width" />
<title>OurDemo1</title>
<link href="<%=path%>/css/style.css" rel="stylesheet" />
<link href="<%=path%>/css/viewer.css" rel="stylesheet" />
<style>
.image, .images img {
	max-height: 20%;
	max-width: 30%;
}

.video-js .vjs-tech {
	position: inherit;
}

#slides {
	display: none;
}
</style>
</head>
<body>
	<div  style="margin-top: 50px;"></div>
	<div id="slides">
		<img src="<%=path%>/img/example-slide-1.jpg" /> 
		<img src="<%=path%>/img/example-slide-2.jpg" /> 
		<img src="<%=path%>/img/example-slide-3.jpg" /> 
		<img src="<%=path%>/img/example-slide-4.jpg" />
	</div>
	<h1>Hello World! This is OurDemo.</h1>
	<!-- <div style="width: 100%; height: 100%;">
		<video style="width:100%;height:auto" controls="controls" id="example_video_1" loop="loop"
		 class="video-js vjs-default-skin" preload="none" autoplay poster="http://vjs.zencdn.net/v/oceans.png" data-setup="{}"> 
			<source src="http://vjs.zencdn.net/v/oceans.mp4" type='video/mp4' /> 
			<source src="video1.mp4" type="video/webm"> <source src="video1.mp4" type="video/ogg"> 
			<track kind="captions" src="../shared/example-captions.vtt" srclang="en" label="English"></track>
			Tracks need an ending tag thanks to IE9
			<track kind="subtitles" src="../shared/example-captions.vtt" srclang="en" label="English"></track> 
			Tracks need an ending tag thanks to IE9
			<p class="vjs-no-js"> To view this video please enable JavaScript, and consider upgrading to a web browser that 
				<a href="http://videojs.com/html5-video-support/" target="_blank">supports HTML5 video</a>
			</p>
		</video>
	</div> -->
	<div>
		<div>
			<img class="image" src="<%=path%>/img/picture.png" alt="Picture" />
		</div>
		<div>
			<ul class="images">
				<li><img src="<%=path%>/img/picture.png" alt="Picture" /></li>
				<li><img src="<%=path%>/img/picture.png" alt="Picture" /></li>
				<li><img src="<%=path%>/img/picture.png" alt="Picture" /></li>
			</ul>
		</div>
	</div>
	<!-- Scripts -->
	<script src="<%=path%>/js/jquery-3.0.0.min.js"></script>
	<script src="<%=path%>/js/viewer.js"></script>
	<script src="<%=path%>/js/video.js"></script>
	<script src="<%=path%>/js/jquery.slides.min.js"></script>
	<script>
		$('.image').viewer();
		$('.image2').viewer();
		$('.images').viewer();
		
		/* 首页图片轮播JS函数 */
		$(function() {
			$("#slides").slidesjs({
				width : 500,
				height : 200,
				start : 1,//默认首图显示第几张图片
				play: {
			          active: false,
			          auto: true,
			          interval: 6000,
			          swap: false
			        },
				navigation : false,// 控制上一页/下一页显示
				effect : {
					slide : {
						// Slide effect settings.
						speed : 3000
					// [number] Speed in milliseconds of the slide animation.
					},
					fade : {
						speed : 1000,
						// [number] Speed in milliseconds of the fade animation.
						crossfade : true
					// [boolean] Cross-fade the transition.
					}
				}
			});
		});
	</script>
</body>
</html>
