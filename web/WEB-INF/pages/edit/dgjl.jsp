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
        #daoguan table tr {
            height: 40px;
        }

        #daoguan td {
            border: 1px black solid;
        }

        #daoguan input {
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
    <legend>导管室</legend>
</fieldset>
<form class="layui-form" action="" id="daoguan">
    <table align="center">
        <tr>
            <td style=" white-space: nowrap;">
                急诊 PCI 启动方式：
                <input type="radio" name="dgpcibegin" value="0"
                       <c:if test="${dg.dgpcibegin==0}">checked</c:if>
                       title="绕行急诊">
                <input type="radio" name="dgpcibegin" value="1"
                       <c:if test="${dg.dgpcibegin==1}">checked</c:if>
                       title="绕行 CCU">
                <input type="radio" name="dgpcibegin" value="2"
                       <c:if test="${dg.dgpcibegin==2}">checked</c:if>
                       title="病房启动">
            </td>
            <td style=" white-space: nowrap;">
                介入医生：<input type="text" name="dgdoctorName" value="${dg.dgdoctorName}">
            </td>
            <td style=" white-space: nowrap;">
                导管室激活时间：<input type="text" name="dgsbeginTime"
                               readonly
                               value="<fmt:formatDate value="${dg.dgsbeginTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"
                               id="dgt1">
            </td>
        </tr>
        <tr>
            <td colspan="2">
                PCI 血管路径:
                <input type="radio" name="dgxgway" value="0"
                       <c:if test="${dg.dgxgway==0}">checked</c:if>
                       title="桡动脉(左)">
                <input type="radio" name="dgxgway" value="1"
                       <c:if test="${dg.dgxgway==1}">checked</c:if>
                       title="桡动脉(右)">
                <input type="radio" name="dgxgway" value="2"
                       <c:if test="${dg.dgxgway==2}">checked</c:if>
                       title="股动脉">
                <input type="radio" name="dgxgway" value="3"
                       <c:if test="${dg.dgxgway==3}">checked</c:if>
                       title="其它">
            </td>
            <td>
                开始穿刺时间：
                <input type="text" name="beginchuanci" readonly
                       value="<fmt:formatDate value="${dg.beginchuanci}" pattern="yyyy-MM-dd HH:mm:ss"/>"
                       id="dgt2">
            </td>
        </tr>
        <tr>
            <td>
                造影开始时间：
                <input type="text" name="beginzy" readonly
                       value="<fmt:formatDate value="${dg.beginzy}" pattern="yyyy-MM-dd HH:mm:ss"/>"
                       id="dgt3">
            </td>
            <td style=" white-space: nowrap;">
                导丝通过时间：
                <input type="text" name="dstgTime" readonly
                       value="<fmt:formatDate value="${dg.dstgTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"
                       id="dgt4">
            </td>
            <td style=" white-space: nowrap;">
                PCI 手术完成时间：
                <input type="text" name="endpciTime" readonly
                       value="<fmt:formatDate value="${dg.endpciTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"
                       id="dgt5">
            </td>
        </tr>
        <tr>
            <td>
                罪犯血管狭窄程度:
                <input type="radio" name="fzxg" value="0"
                       <c:if test="${dg.fzxg==0}">checked</c:if>
                       title="＜50%">
                <input type="radio" name="fzxg" value="1"
                       <c:if test="${dg.fzxg==1}">checked</c:if>
                       title="50-69%">
                <input type="radio" name="fzxg" value="2"
                       <c:if test="${dg.fzxg==2}">checked</c:if>
                       title="70-89%">
                <input type="radio" name="fzxg" value="3"
                       <c:if test="${dg.fzxg==3}">checked</c:if>
                       title="90-99%">
                <input type="radio" name="fzxg" value="4"
                       <c:if test="${dg.fzxg==4}">checked</c:if>
                       title="100%">
                <br/>
                术前 TIMI：<input type="text" name="shuqian" value="${dg.shuqian}" width="20px">
                术后 TIMI：<input type="text" name="shuhou" value="${dg.shuhou}" width="20px"><br/>
                <img src="${ctx}/images/dao1.jpg">
                <textarea placeholder="请输入描述内容" class="layui-textarea" name="fzImg">${dg.fzImg}</textarea>

            </td>
            <td style=" white-space: nowrap;" colspan="2">
                非罪犯血管狭窄＞50%：
                <input type="radio" name="ffzxg" value="0"
                       <c:if test="${dg.ffzxg==0}">checked</c:if>
                       title="是">
                <input type="radio" name="ffzxg" value="1"
                       <c:if test="${dg.ffzxg==1}">checked</c:if>
                       title="否"><br/>
                <img src="${ctx}/images/dao1.jpg">
                <textarea placeholder="请输入描述内容" class="layui-textarea" name="ffzImg">${dg.ffImg}</textarea>
            </td>
        </tr>
        <tr>
            <td>
                支架内血栓:
                <input type="radio" name="zjnxs" value="0"
                       <c:if test="${dg.zjnxs==0}">checked</c:if>
                       title="是">
                <input type="radio" name="zjnxs" value="1"
                       <c:if test="${dg.zjnxs==1}">checked</c:if>
                       title="否">
            </td>
            <td>
                分叉病变 :
                <input type="radio" name="fcbb" value="0"
                       <c:if test="${dg.fcbb==0}">checked</c:if>
                       title="是">
                <input type="radio" name="fcbb" value="1"
                       <c:if test="${dg.fcbb==1}">checked</c:if>
                       title="否">
            </td>
            <td>
                <input type="radio" name="cto" value="1"
                       <c:if test="${dg.cto==1}">checked</c:if>
                       title="CTO">
                植入支架个数：
                <input type="text" name="zrzjSize" value="${dg.zrzjSize}" style="width: 50px">个
            </td>
        </tr>
        <tr>
            <td colspan="3">
                首次抗凝：
                <input type="radio" name="sckn" value="0"
                       <c:if test="${dg.sckn==0}">checked</c:if>
                       title="普通肝素">
                <input type="radio" name="sckn" value="1"
                       <c:if test="${dg.sckn==1}">checked</c:if>
                       title="比伐芦定">
                <input type="radio" name="sckn" value="2"
                       <c:if test="${dg.sckn==2}">checked</c:if>
                       title="依诺肝素">
                剂量：
                <input type="text" name="scknSize" value="${dg.scknSize}">
                时间：
                <input type="text" name="scknTime"
                       value="<fmt:formatDate value="${dg.scknTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"
                       id="dgt6">
            </td>
        </tr>
        <tr>
            <td colspan="3">
                腔内影像：
                <input type="radio" name="qnyx" value="0"
                       <c:if test="${dg.qnyx==0}">checked</c:if>
                       title="IVUS">
                <input type="radio" name="qnyx" value="1"
                       <c:if test="${dg.qnyx==1}">checked</c:if>
                       title="OCT">
                <input type="radio" name="qnyx" value="2"
                       <c:if test="${dg.qnyx==2}">checked</c:if>
                       title="其他">
                <input type="radio" name="qnyx" value="3"
                       <c:if test="${dg.qnyx==3}">checked</c:if>
                       title="无">
                功能检测：
                <input type="radio" name="gnjc" value="0"
                       <c:if test="${dg.gnjc==0}">checked</c:if>
                       title="FFR">
                <input type="radio" name="gnjc" value="1"
                       <c:if test="${dg.gnjc==1}">checked</c:if>
                       title="其他">
                <input type="radio" name="gnjc" value="2"
                       <c:if test="${dg.gnjc==2}">checked</c:if>
                       title="无">
                IABP 植入：
                <input type="radio" name="iabpzr" value="0"
                       <c:if test="${dg.iabpzr==0}">checked</c:if>
                       title="是">
                <input type="radio" name="iabpzr" value="1"
                       <c:if test="${dg.iabpzr==1}">checked</c:if>
                       title="否"><br/>
                血栓抽吸：
                <input type="radio" name="xscx" value="0"
                       <c:if test="${dg.xscx==0}">checked</c:if>
                       title="是">
                <input type="radio" name="xscx" value="1"
                       <c:if test="${dg.xscx==1}">checked</c:if>
                       title="否">
            </td>
        </tr>
        <tr>
            <td colspan="3">
                临时起搏器植入:
                <input type="radio" name="lsqbq" value="0"
                       <c:if test="${dg.lsqbq==1}">checked</c:if>
                       title="是">
                <input type="radio" name="lsqbq" value="1"
                       <c:if test="${dg.lsqbq==1}">checked</c:if>
                       title="否">
                ECMO：
                <input type="radio" name="ecmo"
                       <c:if test="${dg.ecmo==0}">checked</c:if>
                       value="0" title="是">
                <input type="radio" name="ecmo" value="1"
                       <c:if test="${dg.ecmo==1}">checked</c:if>
                       title="否">
                左心室辅助装置：
                <input type="radio" name="zxsfz" value="0"
                       <c:if test="${dg.zxsfz==0}">checked</c:if>
                       title="是">
                <input type="radio" name="zxsfz" value="1"
                       <c:if test="${dg.zxsfz==1}">checked</c:if>
                       title="否">
            </td>
        </tr>
        <tr>
            <td colspan="3">
                术中并发症:<br/><input type="hidden" name="bfz" value="${dg.szbfz}">
                <input type="checkbox" name="szbfz" value="0" title="无">
                <input type="checkbox" name="szbfz" value="1" title="恶性心律失常">
                <input type="checkbox" name="szbfz" value="2" title="低血压">
                <input type="checkbox" name="szbfz" value="3" title="慢血流/无复流 ">
                <input type="checkbox" name="szbfz" value="4" title="血管夹层">
                <input type="checkbox" name="szbfz" value="5" title="非干预血管急性闭塞">
                <input type="checkbox" name="szbfz" value="6" title="血管穿孔">
                <input type="checkbox" name="szbfz" value="7" title="死亡">
                <input type="checkbox" name="szbfz" value="8" title="其他">
            </td>
        </tr>
        <tr>
            <td colspan="3">
                D2B 时间：
                <input type="text" readonly name="dtowbTime" value="${dg.dtowbTime}">分钟
                是否延误：
                <input type="radio" name="sfyc" value="0"
                       <c:if test="${dg.sfyc==0}">checked</c:if>
                       title="是">
                <input type="radio" name="sfyc" value="1"
                       <c:if test="${dg.sfyc==1}">checked</c:if>
                       title="否">
                （具体原因请询问术者）
            </td>
        </tr>
        <tr style="text-align: center">
            <td colspan="3" style="border: none; ">
                <input type="hidden" name="dgrecordId" value="${dg.dgrecordId}">
                <input type="hidden" name="timeAdminType"
                       value="<fmt:formatDate value="${dg.timeAdminType}" pattern="yyyy-MM-dd HH:mm:ss"/>">
                <button type="submit" class="layui-btn" lay-submit="" lay-filter="updatedg">修改</button>
                <button type="button" class="layui-btn layui-btn-primary" id="biguan">关闭</button>
            </td>
        </tr>
    </table>
</form>
<jsp:include page="cyjl.jsp"/>
<script src="${ctx}/js/vue.js" ></script>
</body>
<script>
     new Vue({

     })
</script>
</html>
