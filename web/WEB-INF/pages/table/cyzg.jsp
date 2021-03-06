<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/7/14
  Time: 17:01
  To change this template use File | Settings | File Templates.
--%>
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
        #chuyuan table tr {
            height: 40px;
        }

        #chuyuan td {
            border: 1px black solid;
        }

        #chuyuan input {
            height: 30px;
            border: none;
            width: 150px;
            border-bottom: 1px black solid;
        }

        .radioCentenr {
            vertical-align: middle;
            margin-top: -2px;
            margin-bottom: 1px;
        }

    </style>
</head>
<body>


<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
    <legend>出院转归</legend>
</fieldset>
<form class="layui-form" action="" id="chuyuan">
    <input type="hidden" id="ctx" value="${pageContext.request.contextPath}"/>
    <table align="center">
        <tr>
            <td colspan="3">
                转归：
                <input type="radio" name="zgInfo" value="0" title="好转出院">
                <input type="radio" name="zgInfo" value="1" title="转至其它医院">
                <input type="radio" name="zgInfo" value="2" title="转至其它科室">
                <input type="radio" name="zgInfo" value="3" title="死亡">

            </td>
        </tr>
        <tr>
            <td colspan="2 ">
                出院诊断<br/>
                <input type="radio" name="cyzd" value="0" title="STEMI">
                <input type="radio" name="cyzd" value="1" title="NSTEMI">
                <input type="radio" name="cyzd" value="2" title="UA">
                <input type="radio" name="cyzd" value="3" title="主动脉夹层">
                <input type="radio" name="cyzd" value="4" title="肺栓塞">
                <input type="radio" name="cyzd" value="5" title="非ACS胸痛">
                <input type="radio" name="cyzd" value="6" title="其它非心源性胸痛">
            </td>
            <td>
                确诊时间：
                <input type="text" readonly name="qzTime" id="cyt1">
            </td>
        </tr>
        <tr>
            <td>
                72h 内肌钙蛋白最高值：
                <input type="text" name="jgmaxSize">
            </td>
            <td style=" white-space: nowrap;">
                <input type="radio" name="bnpif" value="0" title="BNP">
                <input type="radio" name="ntproBNPif" value="0" title="NT-proBNP">
                最高值
                <input type="text" name="maxNum">
            </td>
            <td>
                超声心动图LVEF：
                <input type="text" name="csxdtNum">(最低值)
            </td>
        </tr>
        <tr>
            <td colspan="3">
                合并症:<br/>
                <input type="checkbox" name="hbzItem" value="0" title="无">
                <input type="checkbox" name="hbzItem" value="1" title="心衰">
                <input type="checkbox" name="hbzItem" value="2" title="休克">
                <input type="checkbox" name="hbzItem" value="3" title="机械性并发症">
                <input type="checkbox" name="hbzItem" value="4" title="感染">
                <input type="checkbox" name="hbzItem" value="5" title="再发心梗">
                <input type="checkbox" name="hbzItem" value="6" title="血栓">
                <input type="checkbox" name="hbzItem" value="7" title="卒中">
                <input type="checkbox" name="hbzItem" value="8" title="TIA">
                <input type="checkbox" name="hbzItem" value="9" title="出血">
                <input type="checkbox" name="hbzItem" value="10" title="呼吸衰竭">
                <input type="checkbox" name="hbzItem" value="11" title="肾衰竭">
                <input type="checkbox" name="hbzItem" value="12" title="死亡">
            </td>
        </tr>
        <tr>
            <td colspan="3">
                心血管疾病危险因素：
                <input type="checkbox" name="xxgjbys" value="0" title="高血压"/>
                <input type="checkbox" name="xxgjbys" value="1" title="高脂血症"/>
                <input type="checkbox" name="xxgjbys" value="2" title="血糖升高"/>
                <input type="checkbox" name="xxgjbys" value="3" title="吸烟"/>
                <input type="checkbox" name="xxgjbys" value="4" title="肥胖"/>
                <input type="checkbox" name="xxgjbys" value="5" title="有家族史"/>
            </td>
        </tr>
        <tr>
            <td>
                院内新发心力衰竭：
                <input type="radio" name="ynxfxnsj" value="0" title="是">
                <input type="radio" name="ynxfxnsj" value="1" title="否">
            </td>
            、
            <td>
                出院时间：
                <input type="text" readonly name="outhospital" id="cyt2">
            </td>
            <td>
                住院天数：
                <input type="text" name="zyNum" style="width: 50px">
                总费用：
                <input type="text" name="sumMoney" style="width: 70px">元
            </td>
        </tr>
        <tr>
            <td colspan="3">
                出院治疗结果：
                <input type="radio" name="outResult" value="0" title="治愈">
                <input type="radio" name="outResult" value="1" title="好转">
                <input type="radio" name="outResult" value="2" title="脑死亡离院">
                <input type="radio" name="outResult" value="3" title="其它原因离院">
            </td>
        </tr>
        <tr>
            <td colspan="3">
                出院带药:
                <input type="checkbox" name="cydy" value="0" title="DAPT">
                <input type="checkbox" name="cydy" value="1" title="ACEI/ARB">
                <input type="checkbox" name="cydy" value="2" title="低β-受体阻滞剂血流/无复流 ">
                <input type="checkbox" name="cydy" value=3 title="他汀">

            </td>
        </tr>
        <tr>
            <td style="border:none;"></td>
        </tr>
    </table>
</form>

<script src="${ctx}/layui/layui.js" charset="utf-8"></script>

<script src="${ctx}/js/app.js"></script>

</body>
</html>

