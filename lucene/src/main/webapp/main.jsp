<%@page  pageEncoding="UTF-8" language="java" contentType="text/html;utf-8" %>
<html>
<head>

<title>百度一下，你就知道</title>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/easyui-lang-zh_CN.js"></script>
	<style id="style_super_inline">
html {
	color: #000;
	overflow-y: scroll;
}
body,button,input,select,textarea {
	font: 12px arial
}


.s_lm_hide {
	display: none !important
}


.s-lite-version #m {
	padding-top: 125px
}

#head_wrapper .s-p-top {
	height: 61.8%;
	min-height: 181px;
	position: relative;
	z-index: 0;
	text-align: center
}

#s_lg_img {
	position: absolute;
	bottom: 10px;
	left: 50%;
	margin-left: -135px
}

#head_wrapper .s-word-top {
	margin-top: -1px;
	margin-bottom: 11px
}

#form {
	z-index: 1
}

#s_lm_wrap {
	position: absolute;
	margin-left: -447px;
	bottom: 0;
	left: 50%;
	z-index: 0;
	height: 30px;
	width: 895px;
	line-height: 30px;
	text-align: center
}

#lm {
	color: #666;
	height: 15px;
	line-height: 16px;
	padding: 7px 0
}

#lm a {
	text-decoration: underline;
	color: #666
}

#nv {
	margin: 0 0 5px;
	_margin-bottom: 4px;
	padding: 2px 0 0;
	text-align: left;
	text-indent: 50px
}

#nv a,#nv b {
	margin-left: 19px
}

#nv a,#nv b,.btn,#lk {
	font-size: 14px
}

.s_form {
	width: 641px;
	height: 100%;
	min-height: 293px;
	margin: 0 auto 0 auto;
	text-align: left;
	z-index: 100
}

.s-down .s_form {
	padding-left: 0;
	margin-top: 0;
	min-height: 0
}

.s_form .tools {
	position: absolute;
	right: -55px
}

.s_form_wrapper {
	height: 100%
}

#head_wrapper.s-down #kw,#kw {
	width: 500px;
	height: 20px;
	padding: 9px 7px;
	font: 16px arial;
	border: 1px solid #b8b8b8;
	border-bottom: 1px solid #ccc;
	border-right: 0;
	vertical-align: top;
	outline: none;
	box-shadow: none
}

.s-skin-hasbg .self-btn {
	background:
		url(https://ss0.bdstatic.com/5aV1bjqh_Q23odCf/static/superman/img/spis7_d7c9959e.png)
		no-repeat #fff
}

.btn {
	color: white;
	background-color: #38f;
	width: 102px;
	height: 38px;
	font-size: 16px;
	border: 0
}

</style>
	<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/themes/black/easyui.css"></link>
	<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/themes/icon.css"></lin

	<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/themes/black/easyui.css"></link>
	<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/themes/icon.css"></link>

	<link rel="stylesheet" id="s_superplus_css_lnk" type="text/css" href="./index_files/super_min_0cb4b166.css">
<link rel="stylesheet" type="text/css" href="./index_files/card_min_e8bcf60d.css">
<link rel="stylesheet" href="./index_files/ubase_83c8f0ba.css">
<link rel="stylesheet" href="./index_files/mt_min_d0e7c6d2.css">
<link rel="stylesheet" href="./index_files/nsguide_a8cbc2e7.css">
<link rel="stylesheet" href="./index_files/super_ext_c02dfc40.css">

<script type="text/javascript">
	$(function(){

		$("#s").linkbutton({
			onClick:function () {
				$.get("${pageContext.request.contextPath}/book/select.do",
					function (res) {
						$("#lucene").datagrid({
							url:"${pageContext.request.contextPath}/book/select.do",
                            fitColumns:true,
						})
                    },
					"json"
				)
            }
		})

		
	
	});
	function myformatter(value,row,index) {
		return "<img src='"+value+"'/>";
    }
</script>
</head>
<body>
	<div style="height: 200px; margin-bottom:50px" id="head_wrapper" class="s-isindex-wrap head_wrapper s-title-img ">
		<div id="s_fm" class="s_form">
			<div class="s_form_wrapper" id="s_form_wrapper">
				<div id="lg" class="s-p-top">
					<img id="s_lg_img" src="./index_files/logo.png"/>
				</div>
				<form id="fo" class="fm">
					<input type="text" class="s_ipt" name="keyWords" id="kw" maxlength="100" autocomplete="off"/>
					<input  value="搜索一下" id="s" class="btn self-btn bg s_btn"/>
				</form>
				
			</div>
		</div>
	</div>
	
	
	<hr>
	<div id="ff"></div>
	<div>

	<form>
		<table id="lucene">
			<thead>
				<tr>
					<th field="id" width="100" >id</th>
					<th field="name" width="100" >名字</th>
					<th field="path" width="100"  formatter=myformatter>图片</th>
					<th field="authod" width="100"  >作者</th>
				</tr>
			</thead>
		</table>
	</form>
	</div>
</body>
</html>