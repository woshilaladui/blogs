<%@ page language="java" pageEncoding="utf-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">

    <title>My JSP 'login.jsp' starting page</title>

    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <!--
        <link rel="stylesheet" type="text/css" href="styles.css">
        -->

    <link rel="stylesheet" href="../layui/css/layui.css" media="all">
    <script src="../layui/layui.js" charset="utf-8"></script>
    <link rel="stylesheet" href="../css/main.css">
</head>

<body>


<div class="login">
    <div class="message">博客系统后台登录</div>
    <div id="darkbannerwrap" class=""></div>
    <form class="layui-form layui-form-pane formbox" action="http://localhost:8080/busers/login"
          method="post">

        <div class="layui-form-item" style="">


            <!-- <i class="layui-icon " style="font-size: 40px;">&#xe612;</i> -->
            <!-- <label class="layui-form-label">密码</label> -->

            <input name="username" class="layui-input" type="text"
                   placeholder="Username" autocomplete="off" lay-verify="account"
                   value="admin" style="height: 45px;">

        </div>
        <hr class="hr15">

        <div class="layui-form-item">

            <input name="password" class="layui-input" type="password"
                   placeholder="Password" autocomplete="off" lay-verify="account"
                   value="123456">

        </div>
        <hr class="hr15">

        <hr class="hr15">
        <div class="layui-form-item">
            <button class="layui-btn layui-btn-fluid layui-bg-blue" lay-submit
                    lay-filter="login" style="height: 50px">提交
            </button>
        </div>
    </form>
</div>


<script>

    //JavaScript代码区域
    layui.use('element', function () {
        var element = layui.element;

    });
    layui.use(['form', 'layedit', 'laydate'],
        function () {
            var form = layui.form, layer = layui.layer, layedit = layui.layedit, laydate = layui.laydate;
            //日期
            laydate.render({
                elem: '#date'
            });
            laydate.render({
                elem: '#date1'
            });

            var editIndex = layedit.build('LAY_demo_editor');
            //自定义验证规则
            form.verify({
                account: function (value) {

                    if (value.length == 0) {
                        return '不能为空';
                    }
                },
                pass: [/(.+){6,12}$/, '密码必须6到12位']
            });

            //监听提交
            form.on('submit(login)', function (data) {
                console.log(data.field);

                /* layer.alert(JSON.stringify(data.field), {
                    title : '最终的提交信息'
                }) */

                return true;
            });

            //是否登陆成功
            var msg = '<%=request.getParameter("msg")%>';

            if (msg == "error") {
                layer.alert("账号或者密码错误");
            }

        });
</script>

</body>
</html>
