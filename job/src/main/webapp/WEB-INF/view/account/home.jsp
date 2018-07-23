<%--
  Created by IntelliJ IDEA.
  User: meng
  Date: 2018/7/20
  Time: 10:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <link rel="stylesheet" href="../layui/css/layui.css" media="all">
    <script src="../layui/layui.js" charset="utf-8"></script>


</head>
<body class="layui-layout-body">

<%@include file="header.jsp" %>
<%@include file="left.jsp" %>
<div class="layui-body">
    <!-- 内容主体区域 -->
    <%@include file="user.jsp" %>
    <div style="padding: 15px;">内容主体区域</div>
</div>

<div class="layui-footer">
    <!-- 底部固定区域 -->
    © layui.com - 底部固定区域
</div>
</div>

<script>
    //JavaScript代码区域
    layui.use('element', function () {
        var element = layui.element;

    });
</script>

</body>
</html>
