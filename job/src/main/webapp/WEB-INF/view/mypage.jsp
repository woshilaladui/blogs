<%@ page import="com.wust.job.entity.UsersInformation" %>
<%--
  Created by IntelliJ IDEA.
  User: meng
  Date: 2018/7/16
  Time: 15:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%
        UsersInformation users = new UsersInformation();
    %>
    <title>Title</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>个人中心</title>
    <link rel="stylesheet" href="../assets/css/reset.css">
    <link rel="stylesheet" href="../assets/layui/css/layui.css">
    <link href=".././css/mypage.css" rel="stylesheet"></head>
</head>
<body>
<div style="overflow: hidden;">
    <header class="btHeader" >
        <!-- logo -->
        <a href="../index.html">
            <img src="data:image/png;base64,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" alt="" class="logoA">
        </a>

        <ul class="layui-nav">
            <li class="layui-nav-item iconfont icon-gengduo1">
                <!-- <i class="iconfont icon-gengduo1"></i> -->
                <a href="">作品分类</a>
                <dl class="layui-nav-child">
                    <dd>
                        <a href="./goodComposition.html" class="iconfont icon-text_icon" style="width:145px;">优秀作文</a>
                    </dd>
                    <dd>
                        <a href="./Handwriting.html" class="iconfont icon-text_icon" style="width:145px;">书法</a>
                    </dd>
                    <dd>
                        <a href="./ListWorks.html" class="iconfont icon-text_icon" style="width:145px;">散文</a>
                    </dd>
                    <dd>
                        <a href="./ListWorks.html" class="iconfont icon-text_icon" style="width:145px;">议论文</a>
                    </dd>
                    <dd>
                        <a href="./ListWorks.html" class="iconfont icon-text_icon" style="width:145px;">国内名著</a>
                    </dd>
                    <dd>
                        <a href="./ListWorks.html" class="iconfont icon-text_icon" style="width:145px;">国外名著</a>
                    </dd>
                </dl>
            </li>
            </li>
            <li class="layui-nav-item">
                <a href="./oeuvre.html">作品阅读</a>
            </li>
            <li class="layui-nav-item">
                <a href="./experience.html">写作互动</a>
            </li>
            <li class="layui-nav-item">
                <a href="./Handwriting.html">书写互动</a>

            </li>
            <li class="layui-nav-item">
                <a href="./corpus.html" style="width: 150px;">作文语料库</a>
            </li>
        </ul>

        <!-- 搜索 -->
        <div class="search">
            <input type="text" class="searchInput" placeholder="请输入搜索内容..">
            <i class="iconfont icon-suosou searchShow"></i>
            <i class="iconfont icon-suosou searchsuosou" style="display:none"></i>
            <a href="/page/login.html">登录</a>
            <a href="/page/register.html" class="clearBorder">注册</a>
        </div>

    </header>
</div>
<div class="person-content">
    <div class="person-l">
        <div class="portrait">
            <a href="./index.html">退出</a>
            <img src="../img/111.40b0721.jpg" alt="头像">
            <span>
                    张三丰
                </span>
        </div>
        <div class="text-p">
            <ul>
                <li class="active">
                    <a href="./mypage.html">我的主页</a>
                </li>
                <li>
                    <a href="./personal-data.html">个人资料</a>
                </li>
                <li>
                    <a href="./mycomposition.html">我的作文</a>
                </li>
                <li>
                    <a href="javascript:;">我的书法</a>
                </li>
                <li>
                    <a href="./myheart.html">我的心得</a>
                </li>
                <li>
                    <a href="./mycollection.html">我的收藏</a>
                </li>
                <li>
                    <a href="./mygroup.html">我的分组</a>
                </li>
                <li>
                    <a href="./message.html">站内消息</a>
                </li>
            </ul>
        </div>
    </div>
    <div class="person-r">
        <div class="homepage">
            <div class="r-c">
                <img src="../img/111.40b0721.jpg" alt="">
                <form>
                    <label>
                        姓名：
                    </label>
                    <span id="nickName"></span>
                </form>
                <form>
                    <label>
                        性别：
                    </label>
                    <span>
                            男
                        </span>
                </form>
                <form>
                    <label>
                        年龄：
                    </label>
                    <span>
                            22
                        </span>
                </form>
                <form>
                    <label>
                        角色：
                    </label>
                    <span>
                            老师
                        </span>
                </form>
                <form>
                    <label>
                        账号：
                    </label>
                    <span>
                            158745545564
                        </span>
                </form>
                <form>
                    <label>
                        会员ID：
                    </label>
                    <span>
                            334565
                        </span>
                </form>
                <form>
                    <label>
                        邮箱：
                    </label>
                    <span>
                            15874545678@163.com
                        </span>
                </form>
            </div>
        </div>
    </div>
</div>
<footer>
    <ul class="footer-oneUl">
        <li class="footer-oneLi">
            平台介绍
            <ul class="footer-twoUl">
                <li class="footer-twoLi">
                    <a href="#">平台介绍</a>
                </li>
                <li class="footer-twoLi">
                    <a href="#">联系我们</a>
                </li>
            </ul>
        </li>
        <li class="footer-oneLi">
            平台动态
            <ul class="footer-twoUl">
                <li class="footer-twoLi">
                    <a href="#">动态新闻</a>
                </li>
                <li class="footer-twoLi">
                    <a href="#">平台活动</a>
                </li>
            </ul>
        </li>
        <li class="footer-oneLi">
            优秀作品
            <ul class="footer-twoUl">
                <li class="footer-twoLi">
                    <a href="#">优秀作文</a>
                </li>
                <li class="footer-twoLi">
                    <a href="#">优秀书法</a>
                </li>
            </ul>
        </li>
        <li class="footer-oneLi">
            帮助中心
            <ul class="footer-twoUl">
                <li class="footer-twoLi">
                    <a href="#">如何写作</a>
                </li>
                <li class="footer-twoLi">
                    <a href="#">如何联系书法</a>
                </li>
                <li class="footer-twoLi">
                    <a href="#">如何评测</a>
                </li>
            </ul>
        </li>
    </ul>
    <ul class="footer-text">
        <li class="liborder">
            <a href="#">平台微博</a>
        </li>
        <li class="liborder">
            <a href="#">平台公众号</a>
        </li>
        <li>
            <a href="#">意见反馈</a>
        </li>
    </ul>
    <p>XXXXXXXXXXXXXXXXX DEVELOPMENT CO LTD INC. 2018© ALL RIGHTS RESERVED</p>
</footer>
<script src="../assets/layui/layui.js"></script>
<script src="../assets/jq/jquery.min.js"></script>
<script type="text/javascript" src="../js/mypage.63f9712.js"></script></body>

<script>
    console.log("over.."+"asssssssssssssssssssss");

    $.ajax({
        url:"http://localhost:8080/users/get",
        type:"GET",
        dataType: "json",
        success:function(data){
            $("#nickName").html(data.nickName);
            console.log("over.."+data.nickName);
        },
        error:function(e){

            alert("错误！！"+e);

        }
    });
</script>
</body>
</html>
