<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>Record管理平台-登录</title>
    <link rel="stylesheet" href="${ctx}/layui/css/layui.css">
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
    <div class="layui-header">
        <div class="layui-logo">Record系统</div>
        <!-- 头部区域（可配合layui已有的水平导航） -->
        <%--        <ul class="layui-nav layui-layout-left">--%>
        <%--            <li class="layui-nav-item"><a href="">控制台</a></li>--%>
        <%--            <li class="layui-nav-item"><a href="">商品管理</a></li>--%>
        <%--            <li class="layui-nav-item"><a href="">用户</a></li>--%>
        <%--            <li class="layui-nav-item">--%>
        <%--                <a href="javascript:;">其它系统</a>--%>
        <%--                <dl class="layui-nav-child">--%>
        <%--                    <dd><a href="">邮件管理</a></dd>--%>
        <%--                    <dd><a href="">消息管理</a></dd>--%>
        <%--                    <dd><a href="">授权管理</a></dd>--%>
        <%--                </dl>--%>
        <%--            </li>--%>
        <%--        </ul>--%>
        <ul class="layui-nav layui-layout-right">
            <li class="layui-nav-item">
                <a href="javascript:;">
                    <img src="http://t.cn/RCzsdCq" class="layui-nav-img">
                    ${sessionScope.adminUser.name}
                </a>
                <%--                <dl class="layui-nav-child">--%>
                <%--                    <dd><a href="">基本资料</a></dd>--%>
                <%--                    <dd><a href="">安全设置</a></dd>--%>
                <%--                </dl>--%>
            </li>
            <li class="layui-nav-item" id="loagt"><a href="javascript:;">退出</a></li>
        </ul>
    </div>

    <div class="layui-side layui-bg-black">
        <div class="layui-side-scroll">
            <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
            <ul class="layui-nav layui-nav-tree" lay-filter="test">
                <li class="layui-nav-item layui-nav-itemed" id="recodInfo">
                    <a class="" href="javascript:;">操作记录</a>
                </li>
                <li class="layui-nav-item">
                    <a href="javascript:;">表类型</a>
                    <dl class="layui-nav-child" id="tableType">
                        <dd><a href="javascript:;" data-url="yuanqian"  data-id="11" data-title="时间管理记录表"class="site-demo-active" data-type="tabAdd">时间管理记录表</a></dd>
                        <dd><a href="javascript:;" da data-id="22" class="site-demo-active" data-type="tabAdd" >神经外科创伤病人急诊手术登记</a></dd>
                        <dd><a href="javascript:;" data-title="宁都县人民医院急诊"  data-id="33" class="site-demo-active" data-type="tabAdd" >宁都县人民医院急诊</a></dd>
                        <dd><a href="javascript:;"  data-title="抢救用药记录"  data-id="44" class="site-demo-active" data-type="tabAdd">抢救用药记录</a></dd>
                        <dd><a href="javascript:;"  data-title="创伤病人抢救"  data-id="55" class="site-demo-active" data-type="tabAdd">创伤病人抢救</a></dd>
                    </dl>
                </li>
            </ul>
        </div>
    </div>

    <div class="layui-body">
        <!-- 内容主体区域 -->
        <iframe src="javascript:;" id="main" width="100%" style="height: 99.9%" frameborder="0"></iframe>
    </div>

</div>
<script src="${ctx}/layui/layui.js"></script>
<script>

    layui.use(['element', 'jquery'], function () {
        var $ = layui.jquery;
        var element = layui.element;
        $(document).ready(function () {
            $("#tableType a:eq(0)").click(function () {
                $("#main").attr("src", "${ctx}/user/yuanqian");
            });
            $("#tableType a:eq(1)").click(function () {
                $("#main").attr("src", "${ctx}/user/surgeryBr");
            });
            $("#tableType a:eq(2)").click(function () {
                $("#main").attr("src", "${ctx}/user/jztable");

            });
            $("#tableType a:eq(3)").click(function () {
                $("#main").attr("src", "${ctx}/user/medications");
            });
            $("#tableType a:eq(4)").click(function () {
                $("#main").attr("src", "${ctx}/user/rescueBr");
            })
            $("#recodInfo a:eq(0)").click(function () {
                $("#main").attr("src", "${ctx}/user/recode");
            })


        });


</script>
</body>
</html>