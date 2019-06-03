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




    <table class="layui-table"
           lay-data="{width: 1100, height:800, url:'http://172.16.9.77:8080/heart/getAllHeart', page:true, id:'idTest'}"
           lay-filter="demo">
        <thead>
        <tr>
            <th lay-data="{type:'checkbox', fixed: 'left'}"></th>
            <th lay-data="{field:'id', width:60, sort: true, fixed: true}">ID</th>
            <th lay-data="{field:'title', width:140}">标题</th>
            <th lay-data="{field:'username', width:140}">用户名</th>
            <th lay-data="{field:'viewCount', width:80, sort: true}">浏览数</th>
            <th lay-data="{field:'remarkCount', width:80}">评论数</th>
            <th lay-data="{field:'collectCount', width:80}">收藏数</th>
            <th lay-data="{field:'titleid', width:80}">文章ID</th>
            <th lay-data="{field:'date', width:140}">时间</th>
            <th lay-data="{fixed: 'right', width:80, align:'center', toolbar: '#barDemo'}"></th>
        </tr>
        </thead>
    </table>


    </center>


    <script type="text/html" id="barDemo">
        <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
    </script>

    <%--<script src="//res.layui.com/layui/dist/layui.js" charset="utf-8"></script>--%>

    <!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
    <script>
        layui.use('table', function () {
            var table = layui.table;


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
                            url: "http://172.16.9.77:8080/heart/deleteMyHeart",
                            data: {
                                titleid: data.titleid
                            },
                            dataType: 'json',
                            success: function (result) {
                                alert(result.code)
                                if (result.code == 0) {
                                    //error
                                    layer.alert('删除心得成功');

                                } else {
                                    layer.alert('删除心得失败');

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
                getCheckData: function(){ //获取选中数据
                    var checkStatus = table.checkStatus('idTest')
                        ,data = checkStatus.data;
                    layer.alert(JSON.stringify(data));
                }
                ,getCheckLength: function(){ //获取选中数目
                    var checkStatus = table.checkStatus('idTest')
                        ,data = checkStatus.data;
                    layer.msg('选中了：'+ data.length + ' 个');
                }
                ,isAll: function(){ //验证是否全选
                    var checkStatus = table.checkStatus('idTest');
                    layer.msg(checkStatus.isAll ? '全选': '未全选')
                },
                search:function () {
                    var searchname=$('#searchname');

                    alert(searchname.val());
                    table.reload('idTest',{
                        page:{
                            curr:1
                        }
                        ,where:{
                            username : searchname.val(),
                            title :searchname.val()
                        }
                    });
                }
            };


            $('.demoTable .layui-btn').on('click', function(){
                var type = $(this).data('type');
                active[type] ? active[type].call(this) : '';
            });
        });
    </script>



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
