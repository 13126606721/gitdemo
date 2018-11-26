<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
 		<script type="text/javascript">
 			$(function(){
 				
 				$("#tguru").edatagrid({
 					toolbar:"#toolguru",
 					autoSave:true,
 					fitColumns:true,
 					updateUrl:"${pageContext.request.contextPath}/guru/update.do",
 					url:"${pageContext.request.contextPath}/guru/queryAll.do",
 					
 				});
 				$("#updateguru").linkbutton({
 					iconCls:"icon-edit",
 					text:"修改",
 					onClick:function(){
 						if($("#tguru").edatagrid("getSelected")==null){
 							alert("请选择修改的行");
 						}else{
 							alert("修改后点保存");
 						}
 					
 					}
 				});
 				$("#updateaginguru").linkbutton({
 					iconCls:"icon-edit",
 					text:"保存",
 					onClick:function(){
 							$("#tguru").edatagrid("editRow");
 					}
 				});
 				
 				$("#insertguru").linkbutton({
 					iconCls:"icon-add",
 					text:"添加",
 					onClick:function(){
 						$("#dialoginsertguru").dialog("open");
 					}
 				});
 				$("#dialoginsertguru").dialog({
 					closed:true,
 					title:"添加",
 					width:400,
 					height:200,
 					href:"${pageContext.request.contextPath}/insertguru.jsp"
 				})
 				
				
 			});
 			function guruformatter(value,row,index){
 				return "<img style='width:30;height:25' src='"+value+"'/>";
 			};
 			function statusformatter(value,row,index){
 				if(value==0){
 					return "冻结";
 				}else{
 					return "正常";
 				}
 			};
 			 


 		</script>
 		<div id="toolguru">
 			<a id="updateguru"></a>
 			<a id="updateaginguru"></a>
 			<a id="insertguru"></a>
 			<a id="selectguru"></a>
 		</div>
 		<div id="dialoginsertguru"></div>
 		<table id="tguru" style="width:100%"   title="轮播图"   singleSelect="true">   
    	<thead>   
        <tr>  
            <th field="guruName" width="100" editor="text">名字</th>   
            <th field="guruProfile" width="100" editor="text" formatter=guruformatter>头像</th>   
            <th field="guruBrief" width="100"  editor="text" >简介</th>   
            <th field="guruStatus" width="100"  editor="text" formatter=statusformatter>状态</th>   
        </tr>   
    </thead>   
</table>  