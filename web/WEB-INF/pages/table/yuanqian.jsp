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
        #yuanqiiantable table tr {
            height: 40px;
        }

        #yuanqiiantable td {
            border: 1px black solid;
        }

        #yuanqiiantable input {
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
    <legend>院前系统(及网络医院)</legend>
</fieldset>
<div class="layui-form">
    <form class="layui-form" action="" id="yuanqiiantable" >
        <input type="hidden" id="ctx" value="${pageContext.request.contextPath}"/>
        <table>
            <tr>
                <td>
                    姓名：<input type="text" class="layui-input" name="patientname">
                </td>
                <td>
                    门诊ID：<input type="text" name="mzId">
                </td>
                <td>
                    住院ID：<input type="text" name="zyId">
                </td>
                <td>
                    性别
                    <div class="layui-input-inline">

                        <input type="radio" name="sex" value="男" title="男" checked="">
                        <input type="radio" name="sex" value="女" title="女">
                    </div>
                </td>
                <td>
                    年龄：<input type="text" name="age" style="width: 100px">
                </td>
                <td>
                    发病地址：
                    <input type="text" name="fbAddress">
                </td>
                <td>
                    身份证：<input type="text" name="idCard">
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    发病时间：
                    <input type="text" class="layui-input-inline" name="fbtime" id="test1" style="width: 150px" readonly>

                </td>
                <td colspan="2">
                    呼叫120时间：
                    <input type="text" class="layui-input-inline" name="callouttime" id="test2" style="width: 150px" readonly>

                </td>
                <td colspan="3">
                    首次医疗接触时间：
                    <input type="text" class="layui-input-inline" name="scyljcTime" id="test3" style="width: 150px" readonly>

                </td>
            </tr>
            <tr>
                <td colspan="2">
                    网络医院入门时间：
                    <input type="text" readonly class="layui-input-inline" name="wlyyinTime" id="test4" style="width: 150px">

                </td>
                <td colspan="2">
                    门诊转出时间：
                    <input type="text" readonly class="layui-input-inline" name="zzcmTime" id="test5"
                           style="width: 140px">

                </td>
                <td colspan="3">
                    院内首份心电图时间：
                    <input type="text" readonly  class="layui-input-inline" name="yqsfxdtTime" id="test6">
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    院内首份心电图确诊时间：
                    <input type="text" readonly class="layui-input-inline" name="confirmedTime" id="test7" style="width: 150px"/>
                </td>
                <td colspan="2">
                    院前溶栓知情同意开始时间：
                    <input type="text" readonly class="layui-input-inline" name="yqrsBeginTime" id="test9" style="width: 130px">

                </td>
                <td colspan="3">
                    签署知情同意时间：
                    <input type="text" readonly class="layui-input-inline" name="qszttyTime" id="test10" style="width: 150px">
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    远程传输心电图：
                    <input type="radio" name="ycxdtcs" value="0"
                           style="vertical-align:middle;margin-top:-2px;margin-bottom:1px;" title="是">
                    <input type="radio" name="ycxdtcs" value="1"
                           style="vertical-align:middle;margin-top:-2px;margin-bottom:1px;" title="否">

                </td>
                <td colspan="2">
                    传输时间：
                    <input type="text" readonly class="layui-input-inline" name="csTime" id="test13" style="    width: 150px">

                </td>
                <td colspan="3">
                    传输方式 <input type="radio" name="csWay" value="0"
                                style="vertical-align:middle;margin-top:-2px;margin-bottom:1px;" title="微信">
                    <input type="radio" name="csWay" value="1"
                           style="vertical-align:middle;margin-top:-2px;margin-bottom:1px;" title="短信">
                    <input type="radio" name="csWay" value="2"
                           style="vertical-align:middle;margin-top:-2px;margin-bottom:1px;" title="实时监控">
                </td>
            </tr>
            <tr>
                <td colspan="7">
                    双联抗血小板药物给药：<input type="radio" value="0" name="gysf" class="radioCentenr" title="是">
                    <input type="radio" value="1" name="gysf" class="radioCentenr" title="否"/>
                    &nbsp; &nbsp; &nbsp; &nbsp; 给药时间：
                    <input type="text" readonly class="layui-input-inline" name="gyTime" id="test8" style="width: 150px">
                    &nbsp; &nbsp; &nbsp; &nbsp; 阿司匹林：<input type="text" name="asSize" style="width: 30px">mg
                    &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp;替格瑞洛：<input type="text" name="tgSize" style="width: 30px">mg/氯吡格雷：<input
                        type="text" name="lpSize" style="width: 30px">mg
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    院前溶栓筛查：<br/>
                    <input type="radio" name="rssc" value="0" class="radioCentenr" title="适合">
                    <input type="radio" name="rssc" value="1" class="radioCentenr" title="不适合">
                    <input type="radio" name="rssc" value="2" class="radioCentenr" title="未筛查">
                </td>
                <td colspan="2">
                    是否实施院前溶栓：<input type="radio" name="sfyqrs" value="0" class="radioCentenr" title="有">
                    <input type="radio" name="sfyqrs" value="1" class="radioCentenr" title="无">
                </td>
                <td colspan="3">
                    溶栓场所：<input type="radio" name="rscs" class="radioCentenr" value="0" title="其它医院">
                    <input type="radio" name="rscs" class="radioCentenr" value="1" title="救护车">
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    院前溶栓开始时间：
                    <input type="text" readonly class="layui-input-inline" name="qsrsbeginTime" id="test11" style="width: 150px">

                </td>
                <td colspan="2">
                    院前溶栓结束时间：<input type="text" readonly class="layui-input-inline" name="qsrsendTime" id="test12"
                                    style="width: 144px">
                </td>
                <td colspan="3">
                    溶栓后造影时间
                    <input type="text" readonly class="layui-input-inline" name="rshzyTime" id="test14" style="width: 150px">(心内科或导管室人员填写)
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    院前溶栓药物：<input type="radio" name="yqrsyw" value="0" class="radioCentenr" title="一代">
                    <input type="radio" name="yqrsyw" value="1" class="radioCentenr" title="二代">
                    <input type="radio" name="yqrsyw" value="2" class="radioCentenr" title="三代">
                </td>
                <td colspan="2">
                    院前溶栓药物剂量：<input type="radio" value="0" name="yqrsywSize" class="radioCentenr" title="半量">
                    <input type="radio" value="1" name="yqrsywSize" class="radioCentenr" title="全量">
                </td>
                <td colspan="3">
                    溶栓再通：<input type="radio" value="0" name="rszt" class="radioCentenr" title="是">
                    <input type="radio" value="1" name="rszt" class="radioCentenr" title="否">
                </td>
            </tr>
            <tr>
                <td colspan="3">
                    诊断：<input type="radio" value="0" name="diagnose" class="radioCentenr" title="STEMI">
                    <input type="radio" value="1" name="diagnose" class="radioCentenr" title="NSTEMI">
                    <input type="radio" value="2" name="diagnose" class="radioCentenr" title="UA">
                    <input type="radio" value="3" name="diagnose" class="radioCentenr" title="主动脉夹层">
                    <input type="radio" value="4" name="diagnose" class="radioCentenr" title="肺动脉栓塞">
                    <input type="radio" value="5" name="diagnose" class="radioCentenr" title="其他">
                </td>
                <td colspan="4">
                    转运至CPC ：<input type="radio" name="zyzCPC" value="0" class="radioCentenr" title="导管室">
                    <input type="radio" name="zyzCPC" value="1" class="radioCentenr" title="急诊">
                </td>
            </tr>

        </table>
        <div class="layer-footer" style="z-index: 10; position: fixed; text-align: right; margin-right: -10%; bottom: 0; width:100%; height:50px">
            <button type="submit" class="layui-btn" style="height: 40px;width: 60px" type="button"  lay-submit=""  lay-filter="yuanqian">添加</button>
            <button style="height: 40px;width: 60px" type="button"  type="button" class="layui-btn layui-btn-primary" id="rest">重置</button>
        </div>
        <jsp:include page="jzyc.jsp"/>
    </form>
</div>



<script src="${ctx}/layui/layui.js" charset="utf-8"></script>

<script src="${ctx}/js/app.js"></script>

</body>
</html>
