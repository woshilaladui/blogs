<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

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
    <script src="../assets/layui/layui.js"></script>
    <script src="../assets/jq/jquery.min.js"></script>

</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">

    <%@include file="header.jsp"%>

    <%@include file="left.jsp"%>

    <div class="layui-body">
        <!-- 内容主体区域 -->
        <fieldset class="layui-elem-field layui-field-title"
                  style="margin-top: 20px;">
            <legend>添加心得</legend>
        </fieldset>
        <form id="myform" class="layui-form layui-form-pane"
              method="post"
              style="padding-left: 30px; width: 450px;">
            <div class="layui-form-item">
                <label class="layui-form-label">心得标题</label>
                <div class="layui-input-block">
                    <input id="title" name="title" class="layui-input" type="text"
                           placeholder="心得标题" autocomplete="off" lay-verify="all">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">内容</label>
                <div class="layui-input-block">
                    <input name="content" class="layui-input" type="text"
                           placeholder="内容" autocomplete="off" lay-verify="all">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">作者</label>
                <div class="layui-input-inline">
                    <input value="admin" readonly="true" name="author" class="layui-input" type="text"
                           placeholder="admin" autocomplete="off" lay-verify="all">
                </div>
            </div>

            <div class="layui-form-item">
                <label class="layui-form-label">出版日期</label>
                <div class="layui-input-inline">
                    <input name="date" class="layui-input" id="date1" type="text"
                           autocomplete="off" lay-verify="all">
                </div>
            </div>


            <div class="layui-form-item">
                <label class="layui-form-label">是否可评论</label>
                <div class="layui-input-block">
                    <select name="interest" lay-filter="aihao">
                        <option value=""></option>
                        <option value="0">不可评论</option>
                        <option value="1" selected="">可评论</option>
                    </select>
                </div>
            </div>
            <div class="layui-form-item">
                <button class="layui-btn" lay-filter="demo1" lay-submit="">确认提交</button>
            </div>
        </form>

    </div>

    <div class="layui-footer"></div>
</div>


<script type="text/javascript">



    $("#myform").submit(function (envent)
    {
        envent.preventDefault();

        var form = $(this);
        $.ajax({
            url: "http://localhost:8080/heart/addHeart",
            type: "post",
            data: form.serialize(),
            dataType: "json",
            success: function (data)
            {
                if(data.code == 0){//登陆成功
                    alert(data.msg)
                    $("#myform").reset();
                }else{
                    alert(data.msg)
                }

            },
            error:function(e){

                alert("错误！！"+e);

            }
        });
    });
</script>

<script>
    //JavaScript代码区域
    layui.use('element', function() {
        var element = layui.element;

    });
    layui
        .use(
            [ 'form', 'layedit', 'laydate' ],
            function() {
                var form = layui.form, layer = layui.layer, layedit = layui.layedit, laydate = layui.laydate;

                laydate.render({
                    elem : '#date1'
                });

                //自定义验证规则
                form.verify({
                    all : function(value) {
                        if (value.length == 0) {
                            return '请填写完整';
                        }
                    }
                });
                //监听提交


            });
</script>
</body>
</html>
