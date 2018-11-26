<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<script type="text/javascript">
	$(function(){
		//初始化组件
		$("#name").textbox({
			required:true,
		});
		$("#path").textbox({
			required:true,
		});
		$("#tijiao").linkbutton({
			required:true,
		});
		$("#chongzhi").linkbutton({
			required:true,
		});
		$("#tijiao").linkbutton({
			onClick:function(){
				$("#form").form("submit",{
					url:"${pageContext.request.contextPath}/img/insert.do",
					onsubmit:function(){
						$("#form").form(validate);
					},
					success:function(){
						$.messager.show({
							title:"提示",
							msg:"添加成功"
						});
					}
				})
			}
		});
	});
	
</script>
 <center>
<form id="form">
	名字：<input id="name" name="imgName"/><br/>
	路径：<input id="path" name="imgPath"/><br/>
	<a id="tijiao">提交</a> &nbsp;&nbsp;&nbsp;<a id="chongzhi">重置</a>
</form>
</center>