var toolbar = [ {
	text : '增加',
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
}];
/**
 * 菜单管理初始化
 */
$(function(){
	$('#dg').datagrid({
	    url:'getRoleList.do',
	    idField:'id',
	    treeField:'rolename',
	    fit:true,
	    columns:[[
			{title:'角色名称',field:'rolename'},
			{title:'角色编码',field:'rolecode'},
			{title:'角色时间',field:'status'},
			{title:'创建时间',field:'createtime'}
	    ]],
	    toolbar:toolbar,
	    loadFilter : function(data,parentId) {
			var returnData;
			if (data.errorID == 0) {
				returnData = {
					rows : data.result,
					errorID:data.errorID 
				};
				$.each(returnData.rows, function(i) { 
					returnData.rows[i].createtime = new Date(returnData.rows[i].createtime).Format("yyyy-MM-dd hh:mm:ss");
                }); 
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

/**
 * 弹出新增菜单窗口
 */
function newData(){
	$('#insertMenu').window({
	    width:600,
	    height:400,
	    modal:true
	});
	$('#cc').combotree({
	    url: 'getCombotreeMenu.do',
		method : 'POST',
		width : 250,
		panelHeight : 250,
		panelWidth : 250,
		loadFilter : function(data) {
			if (data.errorID == 0) {
				data = data.result;
			}
			return data;
		}
	});
	$('#insertMenu').window('open'); 
}
/**
 * 保存菜单信息
 */
function saveMenuButton(){
	var  menuname= $("#savemenuname").val().trim();
	var  menupath= $("#savemenupath").val().trim();
	var  pid= $("#cc").combotree('getValue').trim();
	if( pid == null || pid == '' ){
		pid = 0;
	}
	$.ajax({
		url : 'saveMenu.do',
		data : {
			menuname : menuname,
			menupath : menupath,
			pid : pid
		},
		method : 'POST',
		success : function(data) {
			if (data.errorID == 0 && data.result > 0) {
				$('#tt').treegrid('reload');
				$('#insertMenu').window('close');
				$.messager.alert('通知', '添加菜单成功！');
			} else {
				$.messager.alert('通知', '添加菜单失败！');
			}
		}
	});
}
