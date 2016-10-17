var path = "/OurDemo/admin";
var JSpath = "/OurDemo/js/admin/";
// 页面加载js时，初始化方法
$(function() {
	initlayout();
});

/**
 * 初始化页面布局
 */
function initlayout() {
	// $("#indexlayout").layout('collapse','west');
	// $("#indexlayout").layout('remove','east');

}
//用户管理
$('#usermanager').click(function() {
	$.getScript(JSpath + 'usermanager.js')
});
//文章管理
$('#articlemanager').click(function() {
	$.getScript(JSpath + 'articlemanager.js')
});