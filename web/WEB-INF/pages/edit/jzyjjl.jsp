<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/7/8
  Time: 16:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Layui</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="${ctx}/layui/css/layui.css" media="all">
    <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
    <style>
        #jizhenyucha1 table tr {
            height: 45px;
        }

        #jizhenyucha1 td {
            border: 1px black solid;
        }

        #jizhenyucha1 input {
            height: 30px;
            border: none;
            border-bottom: 1px black solid;

        }

        .radioCentenr {
            display: none;

        }

        .radioCentenr2 {
            border: none;
            border-top: 1px black solid;
            border-right: 1px black solid;
            border-left: 1px black solid;
        }

        .radioCentenr3 {
            border: none;
            border-bottom: 1px black solid;
            border-right: 1px black solid;
            border-left: 1px black solid;
        }

    </style>
</head>
<body>


<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
    <legend>急诊预检</legend>
</fieldset>
<form class="layui-form" action="" id="jizhenyucha1">
    <table align="center">
        <tr>
            <td colspan="2">
                发病时间：
                <input  readonly type="text" class="layui-input-inline" name="fbTime"
                       value="<fmt:formatDate value="${jzyj.fbTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"
                       id="jzc1" style="width: 150px">

            </td>
            <td colspan="2">
                到达医院大门时间：
                <input type="text" readonly class="layui-input-inline" name="daodaTime" id="jzc2"
                       value="<fmt:formatDate value="${jzyj.daodaTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"
                       style="width: 150px">

            </td>
            <td colspan="3">
                院内接诊时间(分诊时间)：
                <input type="text" readonly class="layui-input-inline" name="jzTime" id="jzc3"
                       value="<fmt:formatDate value="${jzyj.jzTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"
                       style="width: 150px">

            </td>
        </tr>
        <tr>
            <td colspan="6">到达方式：
                <input type="radio" name="ddWay" value="0" title="120救护车"
                       <c:if test="${jzyj.ddWay==0}">checked</c:if>
                       lay-filter="erweima">
                <input type="radio" name="ddWay" value="1" title="外院转运(包含网络医院）"
                       <c:if test="${jzyj.ddWay==1}">checked</c:if>
                       lay-filter="erweima">
                <input type="radio" name="ddWay" value="2" title="自行来院"
                       <c:if test="${jzyj.ddWay==2}">checked</c:if>
                       lay-filter="erweima">
                <input type="radio" name="ddWay" value="3" title="院内发病"
                       <c:if test="${jzyj.ddWay==3}">checked</c:if>
                       lay-filter="erweima">

            </td>
        </tr>
        <tr id="zhuyuan" class="radioCentenr">
            <td colspan="6">
                (发病科室 ：<input type="text" name="fbks" value="${jzyj.fbks}"> ；
                床位医师会诊时间 ；<input type="text" readonly class="layui-input-inline" id="jzc4" name="yshzTime"
                                 value="<fmt:formatDate value="${jzyj.yshzTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"
                                 style="height: 20px">；
                离开科室时间 ：<input type="text" readonly name="lkkeTime" class="layui-input-inline"
                               value="<fmt:formatDate value="${jzyj.lkkeTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"
                               id="jzc5" style="height: 20px">
            </td>
        </tr>
        <tr>
            <td colspan="6"
                style="border:none;border-top: 1px black solid;border-right:1px black solid;   border-left: 1px black solid;">
                生命体征：意识
                <input type="radio" name="sbtz" value="0"
                       <c:if test="${jzyj.sbtz==0}">checked</c:if>
                       title="清醒">
                <input type="radio" name="sbtz" value="1"
                       <c:if test="${jzyj.sbtz==1}">checked</c:if>
                       title="对语言有反应">
                <input type="radio" name="sbtz" value="2"
                       <c:if test="${jzyj.sbtz==2}">checked</c:if>
                       title="对刺痛有反应">
                <input type="radio" name="sbtz" value="3"
                       <c:if test="${jzyj.sbtz==3}">checked</c:if>
                       title="对任何刺激无反应">
            </td>
        </tr>
        <tr>
            <td style="border:none;border-bottom: 1px black solid;border-right:1px black solid;border-left: 1px black solid;"
                colspan="6">
                呼吸: <input type="text" name="breatheSize" value="${jzyj.breatheSize}" style="width: 50px">次 / 分
                脉搏:<input type="text" name="maibo" value="${jzyj.maibo}" style="width: 50px"> 次 / 分
                心率 :<input type="text" name="xinlv" value="${jzyj.xinlv}" style="width: 50px">次 / 分
                血 压：<input type="text" name="xueya" value="${jzyj.xueya}" style="width: 50px"> / mmHg
                末梢血氧饱和度：<input type="text" name="msxybhd" value="${jzyj.msxybhd}" style="width: 50px"> %
            </td>
        </tr

        <tr>
            <td colspan="6">
                <input type="radio" name="zxtks" value="0"
                       <c:if test="${jzyj.zxtks==0}">checked</c:if>
                       title="至胸痛诊室（急诊内科）">
                <input type="radio" name="zxtks" value="1"
                       <c:if test="${jzyj.zxtks==1}">checked</c:if>
                       title="至急救科抢救室">
                <input type="radio" name="zxtks" value="2"
                       <c:if test="${jzyj.zxtks==2}">checked</c:if>
                       title="至导管室">
            </td>

        </tr>
        <tr style="text-align: center">
            <td colspan="7" style="border: none; ">
                <input type="hidden" name="jzpreviewId" value="${jzyj.jzpreviewId}">
                <input type="hidden" name="timeAdminType"
                       value="<fmt:formatDate value="${jzyj.timeAdminType}" pattern="yyyy-MM-dd HH:mm:ss"/>"
                >
                <button type="submit" class="layui-btn" lay-submit="" lay-filter="updateInfo2">修改</button>
                <button type="button" class="layui-btn layui-btn-primary" id="guanbi2">关闭</button>
            </td>
        </tr>
    </table>
</form>
<jsp:include page="ksjl.jsp"/>
</body>

</html>
