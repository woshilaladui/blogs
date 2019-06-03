<%--
  Created by IntelliJ IDEA.
  User: meng
  Date: 2018/7/19
  Time: 10:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>layui</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <%--<link rel="stylesheet" href="//res.layui.com/layui/dist/css/layui.css" media="all">--%>
    <link rel="stylesheet" href="../layui/css/layui.css" media="all">
    <script src="../layui/layui.js" charset="utf-8"></script>
    <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
</head>

<%--<center>--%>


<div class="layui-form">
    <blockquote class="layui-elem-quote demoTable">

        <br/>
        <br/>
        <div class="layui-inline">
            <input name="name" class="layui-input"
                   placeholder="请输入搜索的内容" autocomplete="off" id="searchname">
        </div>
        <button class="layui-btn" data-type="search" id="search" style="margin-left:10px;width:80px">搜索</button>


    </blockquote>
</div>


<div id="test1">
    <table class="layui-table"
           lay-data="{width: 1100, height:800, url:'http://172.16.9.77:8080/busers/getAllUserInf', page:true, id:'idTest'}"
           lay-filter="demo">
        <thead>
        <tr>
            <th lay-data="{type:'checkbox', fixed: 'left'}"></th>
            <th lay-data="{field:'id', width:60, sort: true, fixed: true}">ID</th>
            <th lay-data="{field:'username', width:150}">用户名</th>
            <th lay-data="{field:'accountId', width:100, sort: true}">账号</th>
            <th lay-data="{field:'age', width:60}">年龄</th>
            <th lay-data="{field:'sex', width:60}">性别</th>
            <th lay-data="{field:'mail', width:160}">邮箱</th>
            <th lay-data="{field:'nickName', width:140}">昵称</th>
            <th lay-data="{field:'role', width:60}">职业</th>
            <th lay-data="{fixed: 'right', width:178, align:'center', toolbar: '#barDemo'}"></th>
        </tr>
        </thead>
    </table>
</div>


</center>


<script type="text/html" id="barDemo">
    <a class="layui-btn layui-btn-primary layui-btn-xs" lay-event="detail">查看</a>
    <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
    <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>

<%--<script src="//res.layui.com/layui/dist/layui.js" charset="utf-8"></script>--%>

<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
<script>
    layui.use('table', function () {
        var table = layui.table;


        table.render({
            elem: 'test1', //注意，这里的 test1 是 ID，不用加 # 号,
            count: 10,//数据总数，从服务端得到
            limit: 10
        });


        //监听表格复选框选择
        table.on('checkbox(demo)', function (obj) {
            console.log(obj)
        });
        //监听工具条
        table.on('tool(demo)', function (obj) {
            var data = obj.data;
            if (obj.event === 'detail') {
                layer.msg('ID：' + data.id + ' 的查看操作');
            } else if (obj.event === 'del') {
                layer.confirm('真的删除行么', function (index) {
                    obj.del();
                    $.ajax({
                        type: "post",
                        url: "http://172.16.9.77:8080/busers/delete",
                        data: {
                            username: data.username
                        },
                        dataType: 'json',
                        success: function (result) {

                            if (result.code == 0) {
                                //error
                                layer.alert('删除成功');

                            } else {
                                layer.alert('删除失败');

                            }
                        }
                    });
                    layer.close(index);
                });
            } else if (obj.event === 'edit') {
                layer.alert('编辑行：<br>' + JSON.stringify(data))
            }
        });


        var $ = layui.$, active = {
            getCheckData: function () { //获取选中数据
                var checkStatus = table.checkStatus('idTest')
                    , data = checkStatus.data;
                layer.alert(JSON.stringify(data));
            }
            , getCheckLength: function () { //获取选中数目
                var checkStatus = table.checkStatus('idTest')
                    , data = checkStatus.data;
                layer.msg('选中了：' + data.length + ' 个');
            }
            , isAll: function () { //验证是否全选
                var checkStatus = table.checkStatus('idTest');
                layer.msg(checkStatus.isAll ? '全选' : '未全选')
            },
            search: function () {
                var searchname = $('#searchname');

                alert(searchname.val());
                table.reload('idTest', {
                    page: {
                        curr: 1
                    }
                    , where: {
                        name: searchname.val()
                    }
                });
            }
        };


        $('.demoTable .layui-btn').on('click', function () {
            var type = $(this).data('type');
            active[type] ? active[type].call(this) : '';
        });
    });
</script>


<body>

</body>
</html>
