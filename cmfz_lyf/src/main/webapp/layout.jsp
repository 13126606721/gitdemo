<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
  <head>
    
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
  		<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.easyui.min.js"></script>
  		 <script type="text/javascript" src="${pageContext.request.contextPath}/js/easyui-lang-zh_CN.js"></script>
  		<script type="text/javascript" src="${pageContext.request.contextPath}/js/function.js"></script>
  		<script type="text/javascript" src="${pageContext.request.contextPath}/js/datagrid-detailview.js"></script>
  		<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.edatagrid.js"></script>
  		<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/themes/black/easyui.css"></link>
  		<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/themes/icon.css"></link>
 		<script type="text/javascript">
 			$(function(){
 				//初始化
 				$("#tab").tabs({
 					
 				});
 				$("#layout").layout({
 					
 				});
 				$("#tab").tabs("add",{
 					closable:false,
 					title:"首页",
 					href:"${pageContext.request.contextPath}/shouye.jsp",
 				});
 				
 			});
 		</script>
 		<style>
			#id1{
				float:left;
			}
			#id2{
				float:right;
			}
			
	    </style>
  </head>
  
  <body id="layout" class="easyui-layout">
  		<div id="west" data-options="region:'west',title:'管理系统'" style="width:200" href="${pageContext.request.contextPath}/accordion.jsp"></div>
  		<div id="tab" data-options="region:'center',title:'功能模块'" ></div>
  		<div id="north" data-options="region:'north',split:true" style="height:60px;background-color:  #5C160C" href="${pageContext.request.contextPath}/north.jsp">
  			
  		</div>
  		<div data-options="region:'south',split:true" style="height: 40px;background: #5C160C">
    			<div style="text-align: center;font-size:15px; color: #FAF7F7;font-family: 楷体" >&copy;百知教育 htf@zparkhr.com.cn</div>
   		 </div> 
  </body>
</html>
