<%@ page  pageEncoding="utf-8"%>
<script type="text/javascript">
$(function(){
	//初始化名字
	$("#albumTitle").textbox({
		required:true
	});
	//初始邮箱
	$("#albumCover").filebox({
		required:true
	});
	//初始化日期
	
	$("#albumAuthor").textbox({
		required:true
	});
	$("#albumBroadCast").textbox({
		required:true
	});
	$("#albumBrief").textbox({
		required:true
	});
	$("#albumScore").textbox({
		required:true
	});
	$("#albumPublishDate").datebox({
		editable:false,
		required:true
	});
	
	//初始化提交
	$("#tijiao").linkbutton({
		editable:false,
		iconCls:"icon-ok"
		
	});
	//初始化重置
	$("#chongzhi").linkbutton({
		
		editable:false,
		iconCls:"icon-undo"
	});
	$("#tijiao").linkbutton({
		onClick:function(){
			$("#fo").form("submit",{
				url:"${pageContext.request.contextPath}/album/insert.do",
				onsubmit:function(){
					return $(this).form("validate");
				},
				success:function(){
					$("#dialoginsert1").dialog("close");
					$.messager.show({
						title:"提示",
						msg:"添加成功",
					});
					$("#tt1").treegrid("load");
				}
			});
		}
		
	});
	$("#chongzhi").linkbutton({
		onClick:function(){
			$("#fo").form("reset");
		}
		
	});
});
</script>

<form id="fo" method="post" enctype="multipart/form-data">
  		标题： <input id="albumTitle" name="albumTitle"/><br/>
  		封面： <input id="albumCover"  name="xxx"/><br/>
  		作者： <input id="albumAuthor"  name="albumAuthor"/><br/>
  		播音： <input id="albumBroadCast"  name="albumBroadCast"/><br/>
  		发布时间： <input id="albumPublishDate"  name="albumPublishDate"/><br/>
  		简介： <input id="albumBrief"  name="albumBrief"/><br/>
  		星级： <input id="albumScore"  name="albumScore"/><br/>
  		<a id="tijiao">提交</a>  <a id="chongzhi" >重置</a>
  		</form>