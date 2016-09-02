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
<link href="<%=path%>/css/fileinput.css" media="all" rel="stylesheet" type="text/css" />
<style type="text/css">
.images img {
	max-height: 10%;
	max-width: 10%;
}

</style>
</head>
<body>
	<input id="input-700" name="filename" type="file" multiple="true" class="file-loading">
	<div class="container">
		<ul class="images">
			<c:forEach  var="fileImage" items="${fileInfos }" varStatus="status">
				<li><img src="<%=path%>${fileImage.filepath}" alt="Picture" /></li>
				
			</c:forEach >
			<li style="display:none"><img src="<%=path%>/img/picture.png" alt="Picture" /></li>
		</ul>
	</div>
	<script src="<%=path%>/js/jquery.min.js"></script>
	<script src="<%=path%>/js/viewer.js"></script>
	<script src="<%=path%>/js/fileinput.js" type="text/javascript"></script>
	<script>
		$('.images').viewer();
		$("#input-700").fileinput({
			language:"zh",
			/* initialPreview: [
			                 'http://upload.wikimedia.org/wikipedia/commons/thumb/e/e1/FullMoon2010.jpg/631px-FullMoon2010.jpg',
			                 'http://upload.wikimedia.org/wikipedia/commons/thumb/6/6f/Earth_Eastern_Hemisphere.jpg/600px-Earth_Eastern_Hemisphere.jpg'
			             ], */
			uploadUrl : "http://localhost:8888/OurDemo/web/toalbumajax.do", // server upload action
			uploadAsync: true,
		    minFileCount: 1,
		    maxFileCount: 10,
		    deleturl : "http://localhost:8888/OurDemo/web/toalbumajax.do",
		    allowedFileTypes: ['image']
	        //dropZoneEnabled:false,
	       // resizeImage: false,
	        //showCaption: false,
	        //showPreview: false,
		}).on("filebatchselected", function(event, files) {
           //	$(this).fileinput("upload");
        }).on('fileuploaded', function(event, data, previewId, index) {
			var form = data.form, files = data.files, extra = data.extra,
			response = data.response, reader = data.reader;
			console.log(form);
			console.log(files);
			console.log(extra);
			console.log(response);
			console.log(reader);
			console.log(index);
		    console.log('File uploaded triggered');
		}); 
	</script>
	
</body>
</html>