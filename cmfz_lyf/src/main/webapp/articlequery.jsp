<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
 		<script type="text/javascript">
 			$(function(){
 				
 				$("#tt5").edatagrid({
 					toolbar:"#tool5",
 					autoSave:true,
 					fitColumns:true,
 					updateUrl:"${pageContext.request.contextPath}/article/update.do",
 					url:"${pageContext.request.contextPath}/article/select.do",
 					view:detailview,
 					detailFormatter:function(rowIndex, rowData){ 
					return "<table><tr>" + 
					"<td rowspan=2 style='border:0'><img src='" + rowData.articleImg +" ' style='height:50px;'></td>" + 
					"<td style='border:0'>" + 
					"<p>内容: " + rowData.articleContent + "</p>" + 
					"</td>" + 
					"</tr></table>"; 
}
 				});
 				//$("#tool").menu({});
 				$("#update5").linkbutton({
 					iconCls:"icon-edit",
 					text:"修改",
 					onClick:function(){
 						if($("#tt5").edatagrid("getSelected")==null){
 							alert("请选择修改的行");
 						}else{
 							alert("修改后点保存");
 						}
 					
 					}
 				});
 				$("#updateagin5").linkbutton({
 					iconCls:"icon-edit",
 					text:"保存",
 					onClick:function(){
 							$("#tt5").edatagrid("editRow");
 					}
 				});
 				//var s=$("#tt").edatagrid("getChecked");
 				
 				
 				
 			});
 			function articleformatter(value,row,index){
 				if(value==1){
 					return "正常";
 				}else {
 					return "冻结";
 				}
 			};
 			 


 		</script>
 		<div id="tool5">
 			<a id="update5"></a>
 			<a id="updateagin5"></a>
 		</div>
 		<div id="dialoginsert5"></div>
 		<table id="tt5" style="width:100%"   title="轮播图"   singleSelect="true">   
    	<thead>   
        <tr>  
            <th field="articleTitle" width="100" editor="text">名字</th>   
            <th field="articlePublishDate" width="100"  editor="text">创建时间</th>   
            <th field="articleStatus" width="100" editor="text" formatter=articleformatter>状态</th>   
        </tr>   
    </thead>   
</table>  