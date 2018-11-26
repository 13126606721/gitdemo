<%@page import="org.springframework.web.context.request.SessionScope"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
 		<script type="text/javascript">
 			$(function(){
 			
 				$("#dialog").dialog({
 					title:"修改信息",
 					width:400,
 					height:200,
 					modal:true,
 					closed:true,
 					href:"${pageContext.request.contextPath}/managerupdate.jsp",
 				});
	 			$("#id3").linkbutton({
	 				text:"修改密码",
	 				iconCls:"icon-edit",
	 				onClick:function(){
	 					$("#dialog").dialog("open");
	 				}
	 			});
	 			$("#id4").linkbutton({
	 				text:"退出系统",
	 				iconCls:"icon-no",
	 				onClick:function(){
	 					$.messager.confirm({
	 							title:"提示信息",
	 							msg:"是否退出",
	 							fn:function(){
	 								window.location.href="${pageContext.request.contextPath}/manager/exit.do";
	 								/* $.ajax({url:"${pageContext.request.contextPath}/manager/exit.do",
	 										type:"post",
	 										async:false,
	 										 cache:false, 
 											success:function(){
	 											$("#north").panel("refresh");
	 											$("#west").panel("refresh");
	 											$("#tab").panel("refresh"); 
 											},
 											dataType:"html"}); */
	 								return true;
	 							}
	 						});
	 				},
	 			});
	 			
 			});
 			
 		</script>
 		<style>
			#bb{
				border:1 solid red;
				background-color:rbg(121,5,2);
			}
		</style>
 		<div id="id1" style="font-size: 24px;color: #FAF7F7;font-family: 楷体;font-weight: 900;width: 450px;float:left;padding-left: 20px;padding-top: 10px" >持名法州后台管理系统</div>
	    	<div id="id2" style="font-size: 16px;color: #FAF7F7;font-family: 楷体;width: 300px;float:right;padding-top:15px">欢迎您:${sessionScope.ma.managerName} &nbsp;
	    		<a id="id3"  class="easyui-linkbutton" data-options="iconCls:'icon-edit'">修改密码</a>&nbsp;&nbsp;
	    		<a id="id4"  class="easyui-linkbutton" data-options="iconCls:'icon-01'">退出系统</a>
	    	</div>
	    <div id="dialog"></div>
 		<%-- <div id="bb">
			<div id="id1"><h1>持明法州管理后台系统</h1></div>
			<div id="id2">欢迎您：${sessionScope.ma.managerName}&nbsp;&nbsp;&nbsp;
				<a id="id3"></a>
				<a id="id4"></a>
			</div>
			<div id="dialog"></div>
		</div> --%>