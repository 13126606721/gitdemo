<%@ page  pageEncoding="utf-8"%>
<script type="text/javascript">
$(function(){
	
	$("#guruName").textbox({
		required:true
	});
	
	$("#guruProfile").filebox({
		required:true
	});
	$("#guruBrief").textbox({
		required:true
	});
	$("#guruStatus").textbox({
		
		required:true
	});
	
	
	//初始化提交
	$("#tijiaoguru").linkbutton({
		editable:false,
		iconCls:"icon-ok"
		
	});
	//初始化重置
	$("#chongzhiguru").linkbutton({
		
		editable:false,
		iconCls:"icon-undo"
	});
	$("#tijiaoguru").linkbutton({
		
		onClick:function(){
			$("#foguru").form("submit",{
				url:"${pageContext.request.contextPath}/guru/insert.do",
				onsubmit:function(){
					return $(this).form("validate");
				},
				success:function(){
					$("#dialoginsertguru").dialog("close");
					$.messager.show({
						title:"提示",
						msg:"添加成功",
					});
					$("#tguru").edatagrid("load");
				}
			});
		}
		
	});
	$("#chongzhiguru").linkbutton({
		onClick:function(){
			$("#foguru").form("reset");
		}
		
	});
});
</script>

<form id="foguru" method="post" enctype="multipart/form-data">
  		标题： <input id="guruName" name="guruName"/><br/>
  		头像： <input id="guruProfile"  name="xxx"/><br/>
  		简介： <input id="guruBrief"  name="guruBrief"/><br/>
  		状态： <input id="guruStatus"  name="guruStatus"/><br/>
  		<a id="tijiaoguru">提交</a>  <a id="chongzhiguru" >重置</a>
  		</form>