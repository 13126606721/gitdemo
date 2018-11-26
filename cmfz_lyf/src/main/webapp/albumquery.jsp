<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
 		<script type="text/javascript">
 			$(function(){
 				
 				$("#tt1").treegrid({    
   				 url:"${pageContext.request.contextPath}/album/select.do",    
   				idField:"albumId",
   				treeField:"albumTitle"  ,
   				/* columns:[[    
					        {title:"名字",field:"albumTitle",width:180},    
					        {field:"chapterSize",title:"下载大小",width:60},    
					        {field:"chapterDuration",title:"时长",width:80},    
					        {field:"chapterDownloadPath",title:"下载路径",width:80}  ,  
					        {field:"chapterUploadDate",title:"上传时间",width:80}    
					    ]]   */
      
			});  
 				$("#delete1").linkbutton({
 					iconCls:"icon-remove",
 					text:"删除",
 					onClick:function(node){
 						if($("#tt1").treegrid("getSelected")==null){
 							alert("请选删除的专辑");
 						}else{
		 					$.messager.confirm('确认对话框', '您想要删除该专辑吗？',
		 						 function(re){
									if (re){
									    $.get("${pageContext.request.contextPath}/album/delete.do",
 										"albumId="+$("#tt1").edatagrid("getSelected").albumId,
 										function(){
 											$("#tt1").edatagrid("reload");
 											$.messager.show({
 												title:"提示",
 												msg:"删除成功"
 											});
 										},
 										"text"
 										);
									}
								});
 						}
 					}
 				});
 				$("#insert1").linkbutton({
 					iconCls:"icon-add",
 					text:"添加专辑",
 					onClick:function(){
 						$("#dialoginsert1").dialog("open")
 					}
 				});
 				$("#download").linkbutton({
 					iconCls:"icon-down",
 					text:"下载音频",
 					onClick:function(){
 						console.log($("#tt1").edatagrid("getSelected").chapterDownloadPath.slice(8));
 						location.href="${pageContext.request.contextPath}/chapter/download.do?name="+$("#tt1").edatagrid("getSelected").chapterDownloadPath.slice(14);
 					}
 				});
 				$("#insert2").linkbutton({
 					iconCls:"icon-add",
 					text:"添加音频",
 					onClick:function(){
 						if($("#tt1").edatagrid("getSelected")==null){
 							alert("请选添加的专辑");
 						}else{
 							$("#dialoginsert2").dialog("open")
 						}
 					}
 				});
 				$("#dialoginsert1").dialog({
 					closed:true,
 					title:"添加专辑",
 					width:400,
 					height:300,
 					href:"${pageContext.request.contextPath}/insertalbum.jsp"
 				})
 				$("#dialoginsert2").dialog({
 					closed:true,
 					title:"添加音频",
 					width:400,
 					height:300,
 					href:"${pageContext.request.contextPath}/insertchapter.jsp"
 				});
				
 			});
 			function myformatter(value,row,index){
 				return "<img style='width:80;height:20' src='"+value+"'/>";
 			}
 			/* function downloadformatter(value,row,index){
 				return "<embed style='width:30;height:20' src='"+value+"'/>";
 			} */
 			
 		</script>
 		<div id="tool1">
 			<a id="insert1"></a>
 			<a id="insert2"></a>
 			<a id="delete1"></a>
 			<a id="download"   /></a>
 			
 		</div>
 		<div id="dialoginsert1"></div>
 		<div id="dialoginsert2"></div>
 		<table id="tt1"  style="width:100%;height:400px" >   
     <thead>   
        <tr>   
            <th data-options="field:'albumTitle',width:180">章节名</th>   
          <!--  <th data-options="field:'albumCover',width:60,align:'right'" formatter=myformatter>封面</th>   
            <th data-options="field:'albumCount',width:80">章节数</th>   
            <th data-options="field:'albumAuthor',width:80">作者</th>   
            <th data-options="field:'albumBroadCast',width:80">播音</th>   
            <th data-options="field:'albumPublishDate',width:80">发布时间</th>   
            <th data-options="field:'albumBrief',width:80">简介</th>   
            <th data-options="field:'albumScore',width:80">星级</th>   
            <th data-options="field:'chapterTitle',width:80">章节名</th>  -->  
            <th data-options="field:'chapterSize',width:80">下载大小</th>   
            <th data-options="field:'chapterDuration',width:80">时长</th>   
            <th data-options="field:'chapterDownloadPath',width:80" >下载路径</th>   
            <th data-options="field:'chapterUploadDate',width:80">上传时间</th>   
        </tr>   
    </thead>  
</table>  

 