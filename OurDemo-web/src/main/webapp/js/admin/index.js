//页面加载js时，初始化方法
$(function() {
	initlayout();
});

/**
 *  初始化页面布局
 */
function initlayout() {
	//$("#indexlayout").layout('collapse','west');
	//$("#indexlayout").layout('remove','east');
	
}

$("#menu1").click(function() {
	var title = 'New Tab';
	if ($('#tt').tabs('exists', title)) {
		$('#tt').tabs('select', title);
	} else {
		$('#tt').tabs('add', {
			title : title,
			selected : true,
			content : '<table id="dg"></table>',
			closable : true
		});
		$('#dg').datagrid({
		    url:'datagrid_data.json',
		    columns:[[
				{field:'code',title:'Code',width:100},
				{field:'name',title:'Name',width:100},
				{field:'price',title:'Price',width:100,align:'right'}
		    ]]
		});
	}
});