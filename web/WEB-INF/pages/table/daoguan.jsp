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
    <input type="hidden" id="ctx" value="${pageContext.request.contextPath}"/>
    <table align="center">
        <tr>
            <td style=" white-space: nowrap;">
                急诊 PCI 启动方式：
                <input type="radio" name="dgpcibegin" value="0" title="绕行急诊">
                <input type="radio" name="dgpcibegin" value="1" title="绕行 CCU">
                <input type="radio" name="dgpcibegin" value="2" title="病房启动">
            </td>
            <td style=" white-space: nowrap;">
                介入医生：<input type="text" name="dgdoctorName">
            </td>
            <td style=" white-space: nowrap;">
                导管室激活时间：<input readonly type="text" name="dgsbeginTime" id="dgt1">
            </td>
        </tr>
        <tr>
            <td colspan="2">
                PCI 血管路径:
                <input type="radio" name="dgxgway" value="0" title="桡动脉(左)">
                <input type="radio" name="dgxgway" value="1" title="桡动脉(右)">
                <input type="radio" name="dgxgway" value="2" title="股动脉">
                <input type="radio" name="dgxgway" value="3" title="其它">
            </td>
            <td>
                开始穿刺时间：
                <input type="text" readonly name="beginchuanci" id="dgt2">
            </td>
        </tr>
        <tr>
            <td>
                造影开始时间：
                <input type="text" readonly name="beginzy" id="dgt3">
            </td>
            <td style=" white-space: nowrap;">
                导丝通过时间：
                <input type="text" readonly name="dstgTime" id="dgt4">
            </td>
            <td style=" white-space: nowrap;">
                PCI 手术完成时间：
                <input type="text" readonly name="endpciTime" id="dgt5">
            </td>
        </tr>
        <tr>
            <td>
                罪犯血管狭窄程度:
                <input type="radio" name="fzxg" value="0" title="＜50%">
                <input type="radio" name="fzxg" value="1" title="50-69%">
                <input type="radio" name="fzxg" value="2" title="70-89%">
                <input type="radio" name="fzxg" value="3" title="90-99%">
                <input type="radio" name="fzxg" value="4" title="100%">
                术前 TIMI：<input type="text" name="shuqian" width="20px">
                术后 TIMI：<input type="text" name="shuhou" width="20px"><br/>
                <img src="${ctx}/images/dao1.jpg">
                <textarea placeholder="请输入描述内容" class="layui-textarea" name="fzImg"></textarea>
            </td>
            <td style=" white-space: nowrap;" colspan="2">
                非罪犯血管狭窄＞50%：
                <input type="radio" name="ffzxg" value="0" title="是">
                <input type="radio" name="ffzxg" value="1" title="否"><br/>
                <img src="${ctx}/images/dao1.jpg">
                <textarea placeholder="请输入描述内容" class="layui-textarea" name="ffImg"></textarea>
            </td>
        </tr>
        <tr>
            <td>
                支架内血栓:
                <input type="radio" name="zjnxs" value="0" title="是">
                <input type="radio" name="zjnxs" value="1" title="否">
            </td>
            <td>
                分叉病变 :
                <input type="radio" name="fcbb" value="0" title="是">
                <input type="radio" name="fcbb" value="1" title="否">
            </td>
            <td>
                <input type="radio" name="cto" value="1" title="CTO">
                植入支架个数：
                <input type="text" name="zrzjSize" style="width: 50px">个
            </td>
        </tr>
        <tr>
            <td colspan="3">
                首次抗凝：
                <input type="radio" name="sckn" value="0" title="普通肝素">
                <input type="radio" name="sckn" value="1" title="比伐芦定">
                <input type="radio" name="sckn" value="2" title="依诺肝素">
                剂量：
                <input type="text" name="scknSize">
                时间：
                <input type="text" readonly name="scknTime" id="dgt6">
            </td>
        </tr>
        <tr>
            <td colspan="3">
                腔内影像：
                <input type="radio" name="qnyx" value="0" title="IVUS">
                <input type="radio" name="qnyx" value="1" title="OCT">
                <input type="radio" name="qnyx" value="2" title="其他">
                <input type="radio" name="qnyx" value="3" title="无">
                功能检测：
                <input type="radio" name="gnjc" value="0" title="FFR">
                <input type="radio" name="gnjc" value="1" title="其他">
                <input type="radio" name="gnjc" value="2" title="无">
                IABP 植入：
                <input type="radio" name="iabpzr" value="0" title="是">
                <input type="radio" name="iabpzr" value="1" title="否">
                血栓抽吸：
                <input type="radio" name="xscx" value="0" title="是">
                <input type="radio" name="xscx" value="1" title="否">
            </td>
        </tr>
        <tr>
            <td colspan="3">
                临时起搏器植入:
                <input type="radio" name="lsqbq" value="0" title="是">
                <input type="radio" name="lsqbq" value="1" title="否">
                ECMO：
                <input type="radio" name="ecmo" value="0" title="是">
                <input type="radio" name="ecmo" value="1" title="否">
                左心室辅助装置：
                <input type="radio" name="zxsfz" value="0" title="是">
                <input type="radio" name="zxsfz" value="1" title="否">
            </td>
        </tr>
        <tr>
            <td colspan="3">
                术中并发症:<br/>
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
                <input type="text" name="dtowbTime">分钟
                是否延误：
                <input type="radio" name="sfyc" value="0" title="是">
                <input type="radio" name="sfyc" value="1" title="否">
                （具体原因请询问术者）
            </td>
        </tr>
    </table>
</form>
<jsp:include page="cyzg.jsp"/>
<script src="${ctx}/layui/layui.js" charset="utf-8"></script>
<script src="${ctx}/js/app.js"></script>

</body>
</html>
