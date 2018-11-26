$(function(){
 				$.extend($.fn.validatebox.defaults.rules,
 					{
 						//规则名
 						mustnumber:{
 							//规则函数
 							validator:function(value){
 								return !isNaN(value);
 							},
 							//不符合规则时显示的信息
 							message:"必须为数字"
 						},
 						mustlength:{
 							validator:function(value,param){
 								return value.length==param[0];
 							},
 							message:"长度必须为{0}"
 							
 						},
 						equals:{
 							validator:function(value,param){
 	 							var value1=$(param[0]).val();
 	 							return value1==value;
 							},
 							message:"俩次输入不一致"
 						}
 						
 						
 					}
 				
 				);
 			});