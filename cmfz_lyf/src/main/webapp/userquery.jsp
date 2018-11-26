<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
 		<script type="text/javascript">
 			$(function(){
 				
 				$("#tuser").edatagrid({
 					toolbar:"#tooluser",
 					autoSave:true,
 					fitColumns:true,
 					updateUrl:"${pageContext.request.contextPath}/user/update.do",
 					url:"${pageContext.request.contextPath}/user/queryAll.do",
 					view:detailview,
 					detailFormatter:function(rowIndex, rowData){ 
 						return "<table><tr>" + 
					"<td rowspan=2 style='border:0'><img src='" + rowData.userProfile +" ' style='height:50px;'></td>" + 
					"<td style='border:0'>" + 
					"<p>签名: " + rowData.userSign + "</p>" + 
					"<p>所在省: " + rowData.userProvince + "</p>" + 
					"<p>所在市: " + rowData.userCity + "</p>" + 
					"</td>" + 
					"</tr></table>"; 
					}
 				});
 				$("#updateuser").linkbutton({
 					iconCls:"icon-edit",
 					text:"修改",
 					onClick:function(){
 						if($("#tuser").edatagrid("getSelected")==null){
 							alert("请选择修改的行");
 						}else{
 							alert("修改后点保存");
 						}
 					
 					}
 				});
 				$("#updateaginuser").linkbutton({
 					iconCls:"icon-edit",
 					text:"保存",
 					onClick:function(){
 							$("#tuser").edatagrid("editRow");
 					}
 				});
 				
 				$("#insertuser").linkbutton({
 					iconCls:"icon-add",
 					text:"添加",
 					onClick:function(){
 						$("#dialoginsertuser").dialog("open");
 					}
 				});
 				
 				
				
 			});
 			
 			 function userstatusformatter(value,row,index){
 			 	if(value==0){
 			 		return "冻结";	
 			 	}else{
 			 		return "正常";
 			 	}
			};
 			 function passwordformatter(value,row,index){
 			 	return "********";
			};

 		</script>
 		<div id="tooluser">
 			<a id="updateuser"></a>
 			<a id="updateaginuser"></a>
 		</div>
 		<div id="dialoginsertuser"></div>
 		<table id="tuser" style="width:100%"   title="轮播图"   singleSelect="true">   
    	<thead>   
        <tr>  
            <th field="userName" width="100" >名字</th>   
            <th field="userPassword" width="100" formatter=passwordformatter>密码</th>   
            <th field="userDharmaName" width="100"  >法名</th>   
            <th field="userSex" width="100"  >性别</th>   
            <th field="userStatus" width="100"  editor="text" formatter=userstatusformatter>状态</th>   
        </tr>   
    </thead>   
</table>  