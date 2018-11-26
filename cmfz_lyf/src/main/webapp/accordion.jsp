<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<script type="text/javascript">
	$(function(){
		$.getJSON("${pageContext.request.contextPath}/cate/queryAll.do",
				function(res){
					$.each(res,function(idx,val){
						var content="<center><div>";
						
						$.each(val.category,function(idx1,val1){
							var s=JSON.stringify(val1);
							content+="<div onclick='add("+s+")' data-options=\"iconCls:'icon-"+val1.categoryIcon+"'\" style='width:90%;border:1px solid #95B8E7' class='easyui-linkbutton'>"+val1.categoryName+"</div><br/>";
						});
						content+="</div></center>";
						 $("#Accordion").accordion("add",{
                           title:val.categoryName,
                           iconCls:"icon-"+val.categoryIcon,
                           content:content,
                           animate:true,
                           selected:0,
                           multiple:true
                      	 });
					});
				}
			);
	});
	function add(s){
		 if($("#tab").tabs("exists",s.categoryName)){
			$("#tab").tabs("select",s.categoryName);
			
		}else{ 
			$("#tab").tabs("add",{
				title:s.categoryName,
				href:s.categoryUrl,
				closable:true
			});
		}
		
	}
</script>
  
<div id="Accordion" class="easyui-accordion"></div>