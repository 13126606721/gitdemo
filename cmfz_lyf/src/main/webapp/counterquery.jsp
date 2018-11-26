<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
 		<script type="text/javascript">
 			$(function(){
 				
 				$("#tcounter").edatagrid({
 					autoSave:true,
 					fitColumns:true,
 					updateUrl:"${pageContext.request.contextPath}/counter/update.do",
 					url:"${pageContext.request.contextPath}/counter/queryAll.do",
 				});
 			});
 			function counterformatter1(value,row,index){
 				if(value==null){
 					return "";
 				}else{
 					return value.courseTitle;
 				}
 			};
 			function counterformatter2(value,row,index){
 				if(value!=null){
 					return value.userName;
 				}else{
 					return "";
 				}
 			};
 			 


 		</script>
 		<div id="dialoginsertcounter"></div>
 		<table id="tcounter" style="width:100%"   title="轮播图"   singleSelect="true">   
    	<thead>   
        <tr>  
            <th field="counterTitle" width="100" editor="text">名字</th>   
            <th field="counterCount" width="100" editor="text" >计数</th>   
            <th field="counterCreateTime" width="100"  editor="text" >创建时间</th>   
            <th field="course" width="100"  editor="text" formatter=counterformatter1>所属课程</th>   
            <th field="user" width="100"  editor="text" formatter=counterformatter2>所属用户</th>   
        </tr>   
    </thead>   
</table>  