<%@ page  pageEncoding="utf-8"%>
<script type="text/javascript">
$(function(){
	//初始化名字
	$("#chapterTitle").textbox({
		required:true
	});
	//初始邮箱
	$("#chapterSize").textbox({
		required:true
	});
	//初始化日期
	
	$("#chapterDuration").textbox({
		required:true
	});
	$("#chapterDownloadPath").filebox({
		required:true
	});
	$("#chapterUploadDate").datebox({
		editable:false,
		required:true
	});
	
	
	//初始化提交
	$("#tijiao2").linkbutton({
		editable:false,
		iconCls:"icon-ok"
		
	});
	//初始化重置
	$("#chongzhi2").linkbutton({
		
		editable:false,
		iconCls:"icon-undo"
	});
	$("#tijiao2").linkbutton({
		
		onClick:function(){
			$("#fo2").form("submit",{
				url:"${pageContext.request.contextPath}/chapter/insert.do?album.albumId="+$("#tt1").edatagrid("getSelected").albumId,
				onsubmit:function(){
					return $(this).form("validate");
				},
				success:function(){
					$("#dialoginsert2").dialog("close");
					$.messager.show({
						title:"提示",
						msg:"添加成功",
					});
					$("#tt1").treegrid("load");
				}
			});
		}
		
	});
	$("#chongzhi2").linkbutton({
		onClick:function(){
			$("#fo2").form("reset");
		}
		
	});
});
</script>

<form id="fo2" method="post" enctype="multipart/form-data">
  		标题： <input id="chapterTitle" name="chapterTitle"/><br/>
  		大小： <input id="chapterSize"  name="chapterSize"/><br/>
  		时长： <input id="chapterDuration"  name="chapterDuration"/><br/>
  		下载路径： <input id="chapterDownloadPath"  name="cc"/><br/>
  		上传时间： <input id="chapterUploadDate"  name="chapterUploadDate"/><br/>
  		<a id="tijiao2">提交</a>  <a id="chongzhi2" >重置</a>
  		</form>