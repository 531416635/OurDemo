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
	position: relative;
}
.slidesjs-pagination{
	z-index:20;
	margin-top: -10px;
	display:block;
	position: absolute;
	right: 0;
}
.slidesjs-pagination-item{
	list-style-type:none;
	display: inline-block;
}
.slidesjs-pagination-item a{
	list-style-type:none;
	cursor: pointer;
    width: 3rem;
    height: 0.5rem;
    background: #ECF0F1;
    opacity: 0.4;
    filter: alpha(opacity=40);
    float: left;
    margin: 0 0.3em;
}
.active{
	background: red !important;
}


</style>
</head>
<body>
	
	<div id="slides">
		<img src="<%=path%>/img/example-slide-1.jpg" /> 
		<img src="<%=path%>/img/example-slide-2.jpg" /> 
		<img src="<%=path%>/img/example-slide-3.jpg" /> 
		<img src="<%=path%>/img/example-slide-4.jpg" />
	</div>
	<div class="jumbotron">
		<div class="container">
			<h1 class="text-center">青春</h1>
			<div class="text-center">所有的结局都已写好</div>
			<div class="text-center">所有的泪水也都已启程</div>
			<div class="text-center">却忽然忘了是怎么样的一个开始</div>
			<div class="text-center">在那个古老的不再回来的夏日</div>
			<div class="text-center">无论我如何的去追索</div>
			<div class="text-center">年轻的你只如云影掠过</div>
			<div class="text-center">而你微笑的面容极浅极淡</div>
			<div class="text-center">逐渐隐没在日落后的群岚</div>
			<div class="text-center">遂翻开那发黄的扉页</div>
			<div class="text-center">命运将它装订的极为拙劣</div>
			<div class="text-center">含着泪 我一读再读</div>
			<div class="text-center">却不得不承认</div>
			<div class="text-center">青春 是一本太仓促的书</div>
			<p>
				<a class="btn btn-primary btn-lg" href="#" role="button">Learn
					more</a>
			</p>
		</div>
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
