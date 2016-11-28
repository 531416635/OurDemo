$(function(){
	$('#tt').treegrid({
	    url:'getMenuList.html',
	    idField:'id',
	    treeField:'name',
	    columns:[[
			{title:'菜单名称',field:'name',width:180},
			{field:'菜单路径',title:'Persons',width:60,align:'right'},
			{field:'创建时间',title:'Begin Date',width:80},
	    ]]
	});
});