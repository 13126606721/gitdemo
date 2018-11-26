<%@ page pageEncoding="utf-8"%>

 <script type="text/javascript">
	$(function(){
	//初始化名字
	$("#updateName").textbox({
		required:true
	});
	$("#updatePassword").textbox({
		required:true
	});
	$("#fo1").form("load","${pageContext.request.contextPath}/manager/updateBySelectOne.do?managerId="+${sessionScope.ma.managerId});
	$("#a11").linkbutton({
		iconCls:"icon-ok",
		onClick:function(){
			$("#fo1").form("submit",{
				url:"${pageContext.request.contextPath}/manager/update.do",
				onsubmit:function(){
					return $(this).form("validate");
				},
				success:function(){
					$("#dialog").dialog("close");
					$.messager.show({
						title:"提示",
						msg:"修改成功"
					});
					
				}
			});
		}
		
	});
	
	
});
</script>
  		<form id="fo1" method="post">
 		 <input type="hidden"  name="managerId" id="updateId" readonly/><br/>
  		用户名：  <input type="text" name="managerName"  id="updateName"/><br/>
  		密   码： <input type="text" name="managerPassword" id="updatePassword"/><br/>
  		<a id="a11"></a><br/>
  			</form>
 			

