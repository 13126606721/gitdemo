<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
 		<script type="text/javascript">
 			$(function(){
 				
 				$("#tcourse").edatagrid({
 					toolbar:"#toolcourse",
 					//autoSave:true,
 					fitColumns:true,
 					updateUrl:"${pageContext.request.contextPath}/course/update.do",
 					url:"${pageContext.request.contextPath}/course/queryAll.do",
 				});
 				$("#updatecourse").linkbutton({
 					iconCls:"icon-edit",
 					text:"修改",
 					onClick:function(){
 						if($("#tcourse").edatagrid("getSelected")==null){
 							alert("请选择修改的行");
 						}else{
 							alert("修改后点保存");
 						}
 					
 					}
 				});
 				$("#updateagincourse").linkbutton({
 					iconCls:"icon-edit",
 					text:"保存",
 					onClick:function(){
 							$("#tcourse").edatagrid("editRow");
 					}
 				});
 				
 				$("#insertcourse").linkbutton({
 					iconCls:"icon-add",
 					text:"添加",
 					onClick:function(){
 						$("#dialoginsertcourse").dialog("open");
 					}
 				});
 				$("#dialoginsertcourse").dialog({
 					closed:true,
 					title:"添加",
 					width:400,
 					height:200,
 					href:"${pageContext.request.contextPath}/insertcourse.jsp"
 				})
 				$("#selectcourse").linkbutton({
 					text:"查询自定义课程",
 					onClick:function(){
 						$("#tcourse").edatagrid({
 							toolbar:"#toolcourse",
 						autoSave:true,
 						fitColumns:true,
 						url:"${pageContext.request.contextPath}/course/queryByMarking.do",
 						view:detailview,
 						detailFormatter:function(rowIndex, rowData){ 
 						return null;}
 						})
 					}
 				})
				
 			});
 			function courseformatter(value,row,index){
 				if(row.user==null){
 					return "所有用户";
 				}else{
 					return row.user.userName;
 				}
 			};
 			function statusformatter(value,row,index){
 				if(value==0){
 					return "下线";
 				}else if(value==null){
 					return "无";
 				}else{
 					return "上线";
 				}
 			};
 			 


 		</script>
 		<div id="toolcourse">
 			<a id="updatecourse"></a>
 			<a id="updateagincourse"></a>
 			<a id="insertcourse"></a>
 			<a id="selectcourse"></a>
 		</div>
 		<div id="dialoginsertcourse"></div>
 		<table id="tcourse" style="width:100%"   title="课程"   singleSelect="true">   
    	<thead>   
        <tr>  
            <th field="courseTitle" width="100" >名字</th>   
            <th field="courseMarking" width="100"  >标记</th>   
            <th field="courseStatus" width="100"  editor="text" formatter=statusformatter>状态</th>   
            <th field="courseCreateTime" width="100"  >创建时间</th>   
            <th field="xx" width="100"   formatter=courseformatter>所属用户</th>   
        </tr>   
    </thead>   
</table>  