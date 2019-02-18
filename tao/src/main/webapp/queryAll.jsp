<%--
  Created by IntelliJ IDEA.
  User: Hasee
  Date: 2019/1/13
  Time: 14:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; utf-8" language="java" pageEncoding="UTF-8" isELIgnored="false" %>
<html>
<head>

    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/easyui-lang-zh_CN.js"></script>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/themes/default/easyui.css"></link>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/themes/icon.css"></link>
    <script type="text/javascript">
        $(function () {
            $('#dg').datagrid({
                url:'student/queryAll.do',
                columns:[[
                    {field:'studentId',title:'ID',width:100},
                    {field:'studentName',title:'姓名',width:100},
                    {field:'studentPassword',title:'密码',width:100,align:'right'},
                    {field:'studentAge',title:'年龄',width:100,align:'right'},
                    {field:'studentSex',title:'性别',width:100,align:'right'},
                    {field:'studentClazz',title:'班级',width:100,align:'right'},
                    {field:'studentImage',title:'图片',width:100,align:'right',formatter:img},
                ]]
            });

        })
        function img(value,row,index) {
            return "<img style='width:80;height:20' src='"+value+"'/>";
        }
    </script>
</head>
<body>
        <table id="dg"></table>
</body>
</html>
