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

$(function(){
	$('#tt').treegrid({
	    url:'getMenuList.do',
	    idField:'id',
	    treeField:'menuname',
	    columns:[[
			{title:'菜单名称',field:'menuname'},
			{title:'菜单路径',field:'menupath'},
			{title:'创建时间',field:'createtime'},
	    ]],
	    toolbar:toolbar,
	    loadFilter : function(data,parentId) {
	    	console.log(parentId);
	    	console.log(data);
			var returnData;
			if (data.errorID == 0) {
				returnData = {
					rows : data.result,
					errorID:data.errorID 
				};
				$.each(returnData.rows, function(i) {  
                    var parentId = returnData.rows[i].pid; 
                    if(parentId != "0"){  
                    	returnData.rows[i]._parentId = parentId;  
                    }  
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

function newData(){
	$('#insertMenu').window({
	    width:600,
	    height:400,
	    modal:true
	});
	$('#insertMenu').window('open'); 
}