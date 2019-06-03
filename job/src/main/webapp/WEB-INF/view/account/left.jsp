<%@ page language="java" pageEncoding="utf-8" %>
<div class="layui-side layui-bg-black">
    <div class="layui-side-scroll">
        <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
        <ul class="layui-nav layui-nav-tree" lay-filter="test">
            <li class="layui-nav-item layui-nav-itemed"><a class="" href="javascript:;">用户管理</a>
                <dl class="layui-nav-child">
                    <dd>
                        <a href="http://172.16.9.77:8080/busers/homePage">用户管理</a>
                    </dd>
                </dl>
            </li>

            <li class="layui-nav-item layui-nav-itemed"><a class="" href="javascript:;">文章管理</a>
                <dl class="layui-nav-child">
                    <dd>
                        <a href="http://172.16.9.77:8080/busers/essayPage">所有文章</a>
                    </dd>
                    <dd>
                        <a href="http://172.16.9.77:8080/essay/addEssayPage">添加文章</a>
                    </dd>
                </dl>
            </li>




            <li class="layui-nav-item layui-nav-itemed"><a class="" href="javascript:;">心得管理</a>
                <dl class="layui-nav-child">
                    <dd>
                        <a href="http://172.16.9.77:8080/busers/heartPage">心得管理</a>
                    </dd>
                    <dd>
                        <a href="http://172.16.9.77:8080/heart/addHeartPage">添加心得</a>
                    </dd>
                </dl>
            </li>

            <li class="layui-nav-item layui-nav-itemed"><a class="" href="javascript:;">书法管理</a>
                <dl class="layui-nav-child">
                    <dd>
                        <a href="http://172.16.9.77:8080/busers/writingPage">书法管理</a>
                    </dd>
                    <dd>
                        <a href="http://172.16.9.77:8080/writing/addWritingPage">添加书法</a>
                    </dd>
                </dl>
            </li>

            <li class="layui-nav-item layui-nav-itemed"><a class="" href="javascript:;">信息管理</a>
                <dl class="layui-nav-child">
                    <dd>
                        <a href="http://172.16.9.77:8080/busers/messagePage">站内消息管理</a>
                    </dd>
                    <dd>
                        <a href="http://172.16.9.77:8080/message/addMessagePage">发送信息</a>
                    </dd>
                </dl>
            </li>




            <li class="layui-nav-item"><a href="javascript:;">权限管理</a>
                <dl class="layui-nav-child">
                    <dd>
                        <a href="javascript:;">普通用户</a>
                    </dd>
                    <dd>
                        <a href="javascript:;">管理员用户</a>
                    </dd>
                </dl>
            </li>

        </ul>
    </div>
</div>