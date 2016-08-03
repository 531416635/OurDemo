$("#btn1").click(function() {
	var fr = $("#form1").serialize();
	var url = $("#form1").attr("action");
	fr = decodeURIComponent(fr, true);
	var arr = fr.split("&");
	var str="";
	$.each(arr, function(n, value) {
		var arr1 = arr[n].split("=");
		str+='<input type="hidden" name="'+arr1[0]+'" value="'+encryptJS(arr1[1])+'"/> ';
	});
	$("#form2").attr("action",url);
	$("#form2").append(str);
	$("#form2").submit();

});
