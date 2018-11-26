<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
 		<script type="text/javascript">
 			$(function(){
 				
 				$("#tt").edatagrid({
 					toolbar:"#tool",
 					autoSave:true,
 					fitColumns:true,
 					pagination:true,
 					pageSize:4,
 					pageList:[4,5,6,7],
 					updateUrl:"${pageContext.request.contextPath}/banner/update.do",
 					destroyUrl:"${pageContext.request.contextPath}/banner/delete.do",
 					url:"${pageContext.request.contextPath}/banner/queryByPaging.do",
 					view:detailview,
 					detailFormatter:function(rowIndex, rowData){ 
					return "<table><tr>" + 
					"<td rowspan=2 style='border:0'><img src='" + rowData.bannerPath +" ' style='height:50px;'></td>" + 
					"<td style='border:0'>" + 
					"<p>创建时间: " + rowData.bannerCreateTime + "</p>" + 
					"<p>状态: " + rowData.bannerStatus + "</p>" + 
					"</td>" + 
					"</tr></table>"; 
}
 				});
 				//$("#tool").menu({});
 				$("#update").linkbutton({
 					iconCls:"icon-edit",
 					text:"修改",
 					onClick:function(){
 						if($("#tt").edatagrid("getSelected")==null){
 							alert("请选择修改的行");
 						}else{
 							alert("修改后点保存");
 						}
 					
 					}
 				});
 				$("#updateagin").linkbutton({
 					iconCls:"icon-edit",
 					text:"保存",
 					onClick:function(){
 							$("#tt").edatagrid("editRow");
 					}
 				});
 				//var s=$("#tt").edatagrid("getChecked");
 				
 				$("#delete").linkbutton({
 					iconCls:"icon-remove",
 					text:"删除",
 					onClick:function(){
 						if($("#tt").edatagrid("getSelected")==null){
 							alert("请选择删除的行");
 						}else{
 							$.messager.confirm('确认对话框', '确定删除？', function(r){
							if (r){
	   						 
 						$.get("${pageContext.request.contextPath}/banner/delete.do",
 							"bannerId="+$("#tt").edatagrid("getSelected").bannerId,
 							function(){
 								$("#tt").edatagrid("reload");
 							},
 							"text"
 							)
							}
						});
 						}
 						

 						
 						
 					}
 				});
 				$("#insert").linkbutton({
 					iconCls:"icon-add",
 					text:"添加",
 					onClick:function(){
 						$("#dialoginsert").dialog("open")
 					}
 				});
 				$("#dialoginsert").dialog({
 					closed:true,
 					title:"添加",
 					width:400,
 					height:200,
 					href:"${pageContext.request.contextPath}/insertbanner.jsp"
 				})
				
 			});
 			function bannerformatter(value,row,index){
 				if(value==1){
 					return "显示";
 				}else{
 					return "不显示";
 				}
 			};
 			 


 		</script>
 		<div id="tool">
 			<a id="update"></a>
 			<a id="updateagin"></a>
 			<a id="insert"></a>
 			<a id="delete"></a>
 		</div>
 		<div id="dialoginsert"></div>
 		<table id="tt" style="width:100%"   title="轮播图"   singleSelect="true">   
    	<thead>   
        <tr>  
            <th field="bannerTitle" width="100" >名字</th>   
            <th field="bannerStatus" width="100" editor="text" formatter=bannerformatter>状态</th>   
            <th field="bannerPath" width="100" align="right" >路径</th>   
            <th field="bannerCreateTime" width="100" align="right" >时间</th>   
        </tr>   
    </thead>   
</table>  