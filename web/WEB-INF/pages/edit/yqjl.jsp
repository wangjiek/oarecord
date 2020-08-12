<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/7/21
  Time: 10:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title>修改</title>
    <link rel="stylesheet" href="${ctx}/layui/css/layui.css" media="all">
    <style>
        #yuanqiiantable1 table tr {
            height: 40px;
        }

        #yuanqiiantable1 td {
            border: 1px black solid;
        }

        #yuanqiiantable1 input {
            height: 30px;
            border: none;
            width: 100px;
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
<form class="layui-form" action="" id="yuanqiiantable1">
    <input type="hidden" id="ctx" value="${pageContext.request.contextPath}"/>
    <table>
        <tr>
            <td>
                姓名：<input type="text" name="patientname" value="${outparient.patientname}">
            </td>
            <td>
                门诊ID：<input type="text" name="mzId" value="${outparient.mzId}">
            </td>
            <td>
                住院ID：<input type="text" name="zyId" value="${outparient.zyId}">
            </td>
            <td>
                性别
                <div class="layui-input-inline">

                    <input type="radio" name="sex" value="男" title="男"
                           <c:if test="${outparient.sex=='男'}">checked</c:if>>
                    <input type="radio" name="sex" value="女" title="女"
                           <c:if test="${outparient.sex=='女'}">checked</c:if>>
                </div>
            </td>
            <td>
                年龄：<input type="text" name="age" value="${outparient.age}" style="width: 100px">
            </td>
            <td>
                发病地址：
                <input type="text" name="fbAddress" value="${outparient.fbAddress}" style="width: 150px">
            </td>
            <td>
                身份证：<input type="text" name="idCard" value="${outparient.idCard}" style="width: 150px">
            </td>
        </tr>
        <tr>
            <td colspan="2">
                发病时间：
                <input readonly type="text" class="layui-input-inline" name="fbtime"
                       value="<fmt:formatDate value="${outparient.fbtime}" pattern="yyyy-MM-dd  HH:mm:ss"/>"
                       id="test1" style="width: 160px">

            </td>
            <td colspan="2">
                呼叫120时间：
                <input readonly type="text" class="layui-input-inline" name="callouttime"
                       value="<fmt:formatDate value="${outparient.callouttime}" pattern="yyyy-MM-dd HH:mm:ss"/>"
                       id="test2" style="width: 150px">

            </td>
            <td colspan="3">
                首次医疗接触时间：
                <input type="text" readonly class="layui-input-inline" name="scyljcTime"
                       value="<fmt:formatDate value="${outparient.scyljcTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"
                       id="test3" style="width: 150px">

            </td>
        </tr>
        <tr>
            <td colspan="2">
                网络医院入门时间：
                <input type="text" readonly class="layui-input-inline" name="wlyyinTime"
                       value="<fmt:formatDate value="${outparient.wlyyinTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"
                       id="test4" style="width: 150px">

            </td>
            <td colspan="2">
                门诊转出时间：
                <input type="text" readonly class="layui-input-inline" name="zzcmTime"
                       value="<fmt:formatDate value="${outparient.zzcmTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"
                       id="test5" style="width: 160px">

            </td>
            <td colspan="3">
                院内首份心电图时间：
                <input type="text" readonly class="layui-input-inline" name="yqsfxdtTime"
                       value="<fmt:formatDate value="${outparient.yqsfxdtTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"
                       id="test6" style="width: 160px">
            </td>
        </tr>
        <tr>
            <td colspan="2">
                院内首份心电图确诊时间：
                <input type="text" readonly class="layui-input-inline" name="confirmedTime"
                       value="<fmt:formatDate value="${outparient.confirmedTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"
                       id="test7" style="width: 160px"/>
            </td>
            <td colspan="2">
                院前溶栓知情同意开始时间：
                <input type="text" readonly class="layui-input-inline" name="yqrsBeginTime"
                       value="<fmt:formatDate value="${outparient.yqrsBeginTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"
                       id="test9" style="width: 160px">

            </td>
            <td colspan="3">
                签署知情同意时间：
                <input type="text" readonly class="layui-input-inline" name="qszttyTime"
                       value="<fmt:formatDate value="${outparient.qszttyTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"
                       id="test10" style="width: 160px">
            </td>
        </tr>
        <tr>
            <td colspan="2">
                远程传输心电图：
                <input type="radio" name="ycxdtcs" value="0"
                       style="vertical-align:middle;margin-top:-2px;margin-bottom:1px;" title="是"
                       <c:if test="${outparient.ycxdtcs==0}">checked</c:if>>
                <input type="radio" name="ycxdtcs" value="1"
                       style="vertical-align:middle;margin-top:-2px;margin-bottom:1px;" title="否"
                       <c:if test="${outparient.ycxdtcs==1}">checked</c:if>>


            </td>
            <td colspan="2">
                传输时间：
                <input type="text" readonly class="layui-input-inline" name="csTime"
                       value="<fmt:formatDate value="${outparient.csTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"
                       id="test13" style="width: 160px">

            </td>
            <td colspan="3">
                传输方式 <input type="radio" name="csWay" value="0"
                            <c:if test="${outparient.csWay==0}">checked</c:if>
                            style="vertical-align:middle;margin-top:-2px;margin-bottom:1px;" title="微信">
                <input type="radio" name="csWay" value="1"
                       <c:if test="${outparient.csWay==1}">checked</c:if>
                       style="vertical-align:middle;margin-top:-2px;margin-bottom:1px;" title="短信">
                <input type="radio" name="csWay" value="2"
                       <c:if test="${outparient.csWay==2}">checked</c:if>
                       style="vertical-align:middle;margin-top:-2px;margin-bottom:1px;" title="实时监控">
            </td>
        </tr>
        <tr>
            <td colspan="7">
                双联抗血小板药物给药：
                <input type="radio" value="0" name="gysf" class="radioCentenr" title="是"
                       <c:if test="${outparient.gysf==0}">checked</c:if>>
                <input type="radio" value="1" name="gysf" class="radioCentenr" title="否"
                       <c:if test="${outparient.gysf==1}">checked</c:if>/>
                &nbsp; &nbsp; &nbsp; &nbsp; 给药时间：
                <input type="text" readonly class="layui-input-inline" name="gyTime"
                       value="<fmt:formatDate value="${outparient.gyTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"
                       id="test8" style="width: 160px">
                &nbsp; &nbsp; &nbsp; &nbsp; 阿司匹林：<input type="text" name="asSize" value="${outparient.asSize}"
                                                        style="width: 30px">mg
                &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp;替格瑞洛：<input type="text" name="tgSize"
                                                                    value="${outparient.tgSize}" style="width: 30px">mg/氯吡格雷：<input
                    type="text" name="lpSize" value="${outparient.lpSize}" style="width: 30px">mg
            </td>
        </tr>
        <tr>
            <td colspan="2">
                院前溶栓筛查
                ：<input type="radio" name="rssc" value="0" class="radioCentenr"
                        <c:if test="${outparient.rssc==0}">checked</c:if>
                        title="适合">
                <input type="radio" name="rssc" value="1" class="radioCentenr"
                       <c:if test="${outparient.rssc==1}">checked</c:if>
                       title="不适合">
                <input type="radio" name="rssc" value="2" class="radioCentenr"
                       <c:if test="${outparient.rssc==2}">checked</c:if>
                       title="未筛查">
            </td>
            <td colspan="2">
                是否实施院前溶栓：
                <input type="radio" name="sfyqrs" value="0" class="radioCentenr"
                       <c:if test="${outparient.sfyqrs==0}">checked</c:if>
                       title="有">
                <input type="radio" name="sfyqrs" value="1" class="radioCentenr"
                       <c:if test="${outparient.sfyqrs==1}">checked</c:if>
                       title="无">
            </td>
            <td colspan="3">
                溶栓场所：
                <input type="radio" name="rscs" class="radioCentenr" value="0"
                       <c:if test="${outparient.rscs==0}">checked</c:if>
                       title="其它医院">
                <input type="radio" name="rscs" class="radioCentenr" value="1"
                       <c:if test="${outparient.rscs==1}">checked</c:if>
                       title="救护车">
            </td>
        </tr>
        <tr>
            <td colspan="2">
                院前溶栓开始时间：
                <input type="text" readonly class="layui-input-inline" name="qsrsbeginTime"
                       value="<fmt:formatDate value="${outparient.qsrsbeginTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"
                       id="test11" style="width: 160px">
            </td>
            <td colspan="2">
                院前溶栓结束时间：<input type="text" readonly class="layui-input-inline" name="qsrsendTime"
                                value="<fmt:formatDate value="${outparient.qsrsendTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"
                                id="test12" style="width: 160px">
            </td>
            <td colspan="3">
                溶栓后造影时间
                <input type="text" readonly class="layui-input-inline" name="rshzyTime"
                       value="<fmt:formatDate value="${outparient.rshzyTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"
                       id="test14" style="width: 160px">(心内科或导管室人员填写)
            </td>
        </tr>
        <tr>
            <td colspan="2">
                院前溶栓药物：<br/>
                <input type="radio" name="yqrsyw" value="0" class="radioCentenr"
                       <c:if test="${outparient.yqrsyw==0}">checked</c:if>
                       title="一代">
                <input type="radio" name="yqrsyw" value="1" class="radioCentenr"
                       <c:if test="${outparient.yqrsyw==1}">checked</c:if>
                       title="二代">
                <input type="radio" name="yqrsyw" value="2" class="radioCentenr"
                       <c:if test="${outparient.yqrsyw==2}">checked</c:if>
                       title="三代">
            </td>
            <td colspan="2">
                院前溶栓药物剂量：<br/>
                <input type="radio" value="0" name="yqrsywSize" class="radioCentenr"
                       <c:if test="${outparient.yqrsywSize==0}">checked</c:if>
                       title="半量">
                <input type="radio" value="1" name="yqrsywSize" class="radioCentenr"
                       <c:if test="${outparient.yqrsywSize==1}">checked</c:if>
                       title="全量">
            </td>
            <td colspan="3">
                溶栓再通：
                <input type="radio" value="0" name="rszt" class="radioCentenr"
                       <c:if test="${outparient.rszt==0}">checked</c:if>
                       title="是">
                <input type="radio" value="1" name="rszt" class="radioCentenr"
                       <c:if test="${outparient.rszt==1}">checked</c:if>
                       title="否">
            </td>
        </tr>
        <tr>
            <td colspan="5">
                诊断：
                <input type="radio" value="0" name="diagnose" class="radioCentenr"
                       <c:if test="${outparient.diagnose==0}">checked</c:if>
                       title="STEMI">
                <input type="radio" value="1" name="diagnose" class="radioCentenr"
                       <c:if test="${outparient.diagnose==1}">checked</c:if>
                       title="NSTEMI">
                <input type="radio" value="2" name="diagnose" class="radioCentenr"
                       <c:if test="${outparient.diagnose==2}">checked</c:if>
                       title="UA">
                <input type="radio" value="3" name="diagnose" class="radioCentenr"
                       <c:if test="${outparient.diagnose==3}">checked</c:if>
                       title="主动脉夹层">
                <input type="radio" value="4" name="diagnose" class="radioCentenr"
                       <c:if test="${outparient.diagnose==4}">checked</c:if>
                       title="肺动脉栓塞">
                <input type="radio" value="5" name="diagnose" class="radioCentenr"
                       <c:if test="${outparient.diagnose==5}">checked</c:if>
                       title="其他">
            </td>
            <td colspan="2">
                转运至CPC ：
                <input type="radio" name="zyzCPC" value="0" class="radioCentenr"
                       <c:if test="${outparient.zyzCPC==0}">checked</c:if>
                       title="导管室">
                <input type="radio" name="zyzCPC" value="1" class="radioCentenr"
                       <c:if test="${outparient.zyzCPC==1}">checked</c:if>
                       title="急诊">
                <input type="hidden" name="timeAdminType"
                       value="<fmt:formatDate value="${outparient.timeAdminType}" pattern="yyyy-MM-dd HH:mm:ss"/>">
                <input type="hidden" name="outpatientId" value="${outparient.outpatientId}">
            </td>
        </tr>
        <tr style="text-align: center">
            <td colspan="7" style="border-bottom: none;">
                <button type="submit" class="layui-btn" lay-submit="" lay-filter="updateYQ">修改</button>
                <button type="button" class="layui-btn layui-btn-primary" id="guanbi">关闭</button>

            </td>
        </tr>
    </table>
</form>
<jsp:include page="jzyjjl.jsp"/>
<script src="${ctx}/layui/layui.js" charset="utf-8"></script>
<script src="${ctx}/js/editapp.js" type="text/javascript"></script>
</body>
<script>
</script>
</html>
