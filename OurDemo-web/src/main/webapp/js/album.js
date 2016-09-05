//$("#midiv").css("margin-top",$("#webheadernavbar").height());bottom:-390%;
//alert($("img").height());
$("img + span").css("bottom",-($("#imghety").height()/2-8));
$("img + span").css("width",$("#imghety").width()+10);
/***
 * 相册图片浏览
 */
$('.images').viewer();

/**
 * 图片上传插件
 */
$("#input-700").fileinput({
	language:"zh",
	/* initialPreview: [
	                 'http://upload.wikimedia.org/wikipedia/commons/thumb/e/e1/FullMoon2010.jpg/631px-FullMoon2010.jpg',
	                 'http://upload.wikimedia.org/wikipedia/commons/thumb/6/6f/Earth_Eastern_Hemisphere.jpg/600px-Earth_Eastern_Hemisphere.jpg'
	             ], */
	uploadUrl : "../web/toalbumajax.do", // server upload action
	uploadAsync: true,
    minFileCount: 1,
    maxFileCount: 10,
    deleturl : "../web/toalbumajax.do",
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

addEventListener("load", function() {
	setTimeout(hideURLbar, 0);
}, false);

function hideURLbar() {
	window.scrollTo(0, 1);
}


