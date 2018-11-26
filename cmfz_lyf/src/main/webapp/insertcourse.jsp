<%@ page  pageEncoding="utf-8"%>
<script type="text/javascript">
$(function(){
	
	$("#courseTitle").textbox({
		required:true
	});
	
	$("#courseMarking").textbox({
		required:true
	});
	$("#courseCreateTime").datebox({
		editable:false,
		required:true
	});
	$("#courseStatus").textbox({
		
		required:true
	});
	
	
	//初始化提交
	$("#tijiaocourse").linkbutton({
		editable:false,
		iconCls:"icon-ok"
		
	});
	//初始化重置
	$("#chongzhicourse").linkbutton({
		
		editable:false,
		iconCls:"icon-undo"
	});
	$("#tijiaocourse").linkbutton({
		
		onClick:function(){
			$("#focourse").form("submit",{
				url:"${pageContext.request.contextPath}/course/insert.do",
				onsubmit:function(){
					return $(this).form("validate");
				},
				success:function(){
					$("#dialoginsertcourse").dialog("close");
					$.messager.show({
						title:"提示",
						msg:"添加成功",
					});
					$("#tcourse").edatagrid("load");
				}
			});
		}
		
	});
	$("#chongzhicourse").linkbutton({
		onClick:function(){
			$("#focourse").form("reset");
		}
		
	});
});
</script>

<form id="focourse" method="post" >
  		标题： <input id="courseTitle" name="courseTitle"/><br/>
  		标记： <input id="courseMarking"  name="courseMarking"/><br/>
  		创建时间： <input id="courseCreateTime"  name="courseCreateTime"/><br/>
  		状态： <input id="courseStatus"  name="courseStatus"/><br/>
  		<a id="tijiaocourse">提交</a>  <a id="chongzhicourse" >重置</a>
  		</form>