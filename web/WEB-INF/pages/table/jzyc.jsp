<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/7/8
  Time: 16:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
        #jizhenyucha table tr {
            height: 45px;
        }

        #jizhenyucha td {
            border: 1px black solid;
        }

        #jizhenyucha input {
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
        .radioCentenr3{
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
<form class="layui-form" action="" id="jizhenyucha">
    <table align="center">
        <tr>
            <td colspan="2">
                发病时间：
                <input type="text" readonly class="layui-input-inline" name="fbTime" id="jzc1" style="width: 150px">

            </td>
            <td colspan="2">
                到达医院大门时间：
                <input type="text" readonly  class="layui-input-inline" name="daodaTime" id="jzc2" style="width: 150px">

            </td>
            <td colspan="3">
                院内接诊时间(分诊时间)：
                <input type="text" readonly class="layui-input-inline" name="jzTime" id="jzc3" style="width: 150px">

            </td>
        </tr>
        <tr>
            <td colspan="6" >到达方式：
                <input type="radio" name="ddWay" value="0" title="120救护车" lay-filter="erweima">
                <input type="radio" name="ddWay" value="1" title="外院转运(包含网络医院）" lay-filter="erweima">
                <input type="radio" name="ddWay" value="2" title="自行来院" lay-filter="erweima">
                <input type="radio" name="ddWay" value="3" title="院内发病" lay-filter="erweima">

            </td>
        </tr>
        <tr id="zhuyuan" class="radioCentenr">
            <td  colspan="6">
                (发病科室 ：<input type="text" name="fbks"> ；
                床位医师会诊时间 ；<input type="text" class="layui-input-inline" readonly id="jzc4" name="yshzTime" style="height: 20px">；
                离开科室时间 ：<input type="text" readonly name="lkkeTime" class="layui-input-inline" id="jzc5" style="height: 20px">
            </td>
        </tr>
        <tr>
            <td colspan="6"
                style="border:none;border-top: 1px black solid;border-right:1px black solid;   border-left: 1px black solid;">
                生命体征：意识
                <input type="radio" name="sbtz" value="0" title="清醒">
                <input type="radio" name="sbtz" value="1" title="对语言有反应">
                <input type="radio" name="sbtz" value="2" title="对刺痛有反应">
                <input type="radio" name="sbtz" value="3" title="对任何刺激无反应">
            </td>
        </tr>
        <tr>
            <td style="border:none;border-bottom: 1px black solid;border-right:1px black solid;border-left: 1px black solid;"
                colspan="6">
                呼吸 <input type="text" name="breatheSize" style="width: 50px">次 / 分
                脉搏<input type="text" name="maibo" style="width: 50px"> 次 / 分
                心率 <input type="text" name="xinlv" style="width: 50px">次 / 分
                血 压：<input type="text" name="xueya" style="width: 50px"> / mmHg
                末梢血氧饱和度：<input type="text" name="msxybhd" style="width: 50px"> %
            </td>
        </tr>


        <tr>
            <td colspan="6">
                <input type="radio" name="zxtks" value="0" title="至胸痛诊室（急诊内科）">
                <input type="radio" name="zxtks" value="1" title="至急救科抢救室">
                <input type="radio" name="zxtks" value="2" title="至导管室">
            </td>

        </tr>
    </table>
</form>
        <jsp:include page="kscheck.jsp"/>
<script src="${ctx}/layui/layui.js" charset="utf-8"></script>

<script src="${ctx}/js/app.js"></script>

</body>
</html>
