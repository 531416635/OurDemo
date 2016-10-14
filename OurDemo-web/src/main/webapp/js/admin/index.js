var path = "/OurDemo/admin";
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
// 用户管理页面初始化
$("#menu1").click(
				function() {
					var title = 'New Tab';
					if ($('#tt').tabs('exists', title)) {
						$('#tt').tabs('select', title);
					} else {
						$('#tt')
								.tabs(
										'add',
										{
											title : title,
											selected : true,
											content : '<table id="dg"  style="height:100%;"></table>',
											closable : true
										});
					}
					// 加载网格数据
					$('#dg')
							.datagrid(
									{
										url : path + '/getAllUser.do',
										// 要显示的字段
										columns : [ [ {
											field : 'username',
											title : '用户名',
											sortable : true,
											order : 'asc',
											align : "center",
											width : 200
										}, {
											field : 'usertype',
											title : '用户类型',
											align : "center",
											width : 200
										}, {
											field : 'email',
											title : '邮箱',
											align : "center",
											width : 200
										}, {
											field : 'phone',
											title : '电话',
											align : "center",
											width : 200
										}, {
											field : 'roleid',
											title : '角色',
											align : "center",
											width : 200
										} ] ],
										// 标题菜单
										toolbar : [ {
											text : '新增',
											iconCls : 'icon-add',
											handler : function() {
												newData();
											}
										}, '-', {
											text : '修改',
											iconCls : 'icon-edit',
											handler : function() {
												editData();
											}
										}, '-', {
											text : '删除',
											iconCls : 'icon-remove',
											handler : function() {
												delData();
											}
										} ],
										fitColumns : true,
										striped : true,
										pagination : true,
										pageNumber : 1,
										pageSize : 10,
										rownumbers : true,
										sortName : "username",
										view : detailview,
										detailFormatter : function(rowIndex,
												rowData) {
											return "<table class=\"datagridtable\">"
													+ "<tr>"
													+ "<td>用户ID</td><td>"+rowData.id+"</td><td>用户名</td><td>"+rowData.username+"</td><td>用户密码</td><td>"+rowData.password+"</td><td>用户类型</td><td>"+rowData.usertype+"</td>"
													+ "</tr>"
													+ "<tr>"
													+ "<td>用户头像</td><td>"+rowData.userphoto+"</td><td>邮箱</td><td>"+rowData.email+"</td><td>电话</td><td>"+rowData.phone+"</td><td>用户角色</td><td>"+rowData.roleid+"</td>"
													+ "</tr>"
													+ "<tr>"
													+ "<td>注册时间</td><td>"+rowData.regtime+"</td><td>用户状态</td><td>"+rowData.userstatus+"</td><td>激活状态</td><td>"+rowData.activestatus+"</td><td>激活码</td><td>"+rowData.activecode+"</td>"
													+ "</tr>" + "</table>";
										},
										loadFilter : function(data) {
											var returnData;
											if (data.errorID == 0) {
												returnData = {
													total : data.result.totalCount,
													rows : data.result.users,
												};
											} else {
												returnData = {
													total : 0,
													rows : [],
												};
											}
											return returnData;
										}
									});
				});