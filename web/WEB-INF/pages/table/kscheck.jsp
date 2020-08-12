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
        #kezhenduan table tr {
            height: 45px;
        }

        .first {
            width: 20px;
        }

        #kezhenduan td {
            border: 1px black solid;

        }

        #kezhenduan input {
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


        .num {
            width: 40px;
        }

    </style>
</head>
<body>


<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
    <legend>科室检查诊断</legend>
</fieldset>
<form class="layui-form" action="" id="kezhenduan">
    <table align="center">
        <tr>
            <td rowspan="9" style="width: 20px">
                胸痛诊室<br/>(急诊内科)<br/>发病科
            </td>
            <td>
                院内首份心电图时间：
                <input type="text" readonly class="layui-input-inline" id="ksc1" name="ynscxdTime" style="height: 20px">
            </td>
            <td> ynscxdTime
                院内首份心电图确诊时间：
                <input type="text" readonly class="layui-input-inline" id="ksc2" name="qzxdtTime" style="height: 20px"/>
            </td>
        </tr>
        <tr>
            <td style="border-bottom: none" colspan="2">
                病情评估及合并情况：
                <input type="checkbox" name="bqpgItem" value="0" title="持续性症状">
                <input type="checkbox" name="bqpgItem" value="1" title="间断性症状">
                <input type="checkbox" name="bqpgItem" value="2" title="胸痛症状已缓解">
                <input type="checkbox" name="bqpgItem" value="3" title="腹痛">
                <input type="checkbox" name="bqpgItem" value="4" title="齿痛">
                <input type="checkbox" name="bqpgItem" value="5" title="肩背痛">

            </td>
        </tr>
        <tr>
            <td colspan="2" style="border-top: none">
                <span style="visibility: hidden;">病情评估及合并情况：</span>
                <input type="checkbox" name="bqpgItem" value="6" title="呼吸困难">
                <input type="checkbox" name="bqpgItem" value="7" title="休克">
                <input type="checkbox" name="bqpgItem" value="8" title="突发意识丧失">
                <input type="checkbox" name="bqpgItem" value="9" title="合并心衰">
                <input type="checkbox" name="bqpgItem" value="10" title="合并恶性心律失常">
                <input type="checkbox" name="bqpgItem" value="11" title="合并出血">
            </td>
        </tr>
        <tr>
            <td colspan="2">
                肌钙蛋白抽血成时间：
                <input type="text" readonly name="gjdbcxTime" id="ksc3" class="layui-input-inline">
                获得报告时间：
                <input type="text" name="bgTime" id="ksc4" readonly class="layui-input-inline">
                <input type="text" name="bgNum">ng/ml
            </td>
        </tr>
        <tr>
            <td colspan="2">实验室检查：Cr：<input type="text" name="crNum" class="num">μmol/L; &nbsp; &nbsp; &nbsp;
                D-dimer：<input type="text" name="ddimerNum" class="num">ug/(Lmg/L);&nbsp; &nbsp; &nbsp;
                BNP/NT-proBNP：<input type="text" name="probnpNum" class="num">pg/ml
            </td>
        </tr>
        <tr>
            <td colspan="2" style="border-bottom: none">
                辅助检查：
                通知心超检查时间：<input type="text" readonly class="layui-input-inline" name="tzxcTime" id="ksc5">
                &nbsp;&nbsp;&nbsp;
                心超检查完成时间：<input type="text" readonly class="layui-input-inline" name="xcjcTime" id="ksc6">
                &nbsp;&nbsp;&nbsp;
                通知 CT 检查时间：<input type="text" readonly class="layui-input-inline" name="tzctTime" id="ksc7">
            </td>
        </tr>
        <tr>
            <td colspan="2" style="border-top: none">
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                增强 CT 检查开始时间：<input type="text" readonly class="layui-input-inline" name="qcctTime" height="5px" id="ksc8">
            </td>

        </tr>
        <tr>
            <td colspan="2" style="border-bottom: none">
                诊断：
                <input type="checkbox" name="zhenduan" value="0" title="STEMI">
                <input type="checkbox" name="zhenduan" value="1" title="NSTEMI">
                <input type="checkbox" name="zhenduan" value="2" title="UA">
                <input type="checkbox" name="zhenduan" value="3" title="主动脉夹层">
                <input type="checkbox" name="zhenduan" value="4" title="肺栓塞">
                <input type="checkbox" name="zhenduan" value="5" title="非ACS胸痛">
                <input type="checkbox" name="zhenduan" value="6" title="其它非心源性胸痛">
                <input type="checkbox" name="zhenduan" value="7" title="放弃诊治，病因不明">

            </td>
        </tr>
        <tr>
            <td style="border-top: none;" colspan="2">
                诊断时间：
                <input type="text" readonly name="zhenduanTime" class="layui-input-inline" id="ksc9">


                &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;是否呼叫心内科会诊:
                <input type="radio" name="ifxnDoctor" value="0" title="否">
                <input type="radio" name="ifxnDoctor" value="1" title="是">
                呼叫时间<input type="text" name="callTime" id="ksc10">
            </td>
        </tr>
        <tr>
            <td rowspan="6">
                心内科
            </td>
            <td>

                二线会诊时间（包含远程会诊）:
                <input type="text" name="sendTime" readonly class="layui-input-inline" id="ksc11">
            </td>
            <td>
                会诊医生：
                <input type="text" name="hzDoctorName">
            </td>
        </tr>
        <tr>
            <td colspan="2">
                心内诊断：
                <input type="checkbox" name="xnzhenduan" value="0" title="STEMI">
                <input type="checkbox" name="xnzhenduan" value="1" title="NSTEMI">
                <input type="checkbox" name="xnzhenduan" value="2" title="UA">
                <input type="checkbox" name="xnzhenduan" value="3" title="主动脉夹层">
                <input type="checkbox" name="xnzhenduan" value="4" title="肺栓塞">
                <input type="checkbox" name="xnzhenduan" value="5" title="非ACS胸痛">
                <input type="checkbox" name="xnzhenduan" value="6" title="其它非心源性胸痛">
                <input type="checkbox" name="xnzhenduan" value="7" title="放弃诊治，病因不明">
            </td>
        </tr>
        <tr>
            <td colspan="2" style=" white-space: nowrap;">
                决定介入手术时间:
                <input type="text"  readonly name="jdjrssTime" id="ksc12">
                启动导管室时间:
                <input type="text" readonly name="qddgTime" id="ksc13">
                开始知情同意时间:
                <input type="text" readonly name="begintyTime" id="ksc14">
                签署知情同意书时间：
                <input type="text" readonly name="xstyTime" id="ksc15">
            </td>
        </tr>
        <tr>
            <td>
                院内溶栓筛查：
                <input type="radio" name="ynrsjc" title="是" value="0">
                <input type="radio" name="ynrsjc" title="否" value="1">
            </td>
            <td>
                实施院内溶栓：
                <input type="radio" name="ssynrs" title="有" value="0">
                <input type="radio" name="ssynrs" title="无" value="1">
            </td>
        </tr>
        <tr>
            <td colspan="2">
                溶栓开始时：
                <input type="text" readonly name="rsbeginTime" id="ksc16">
                溶栓结束时间:
                <input type="text" readonly name="rsendTime" id="ksc17">
                溶栓后造影时间:：
                <input type="text" readonly name="rsafterTime" id="ksc18">
            </td>
        </tr>
        <tr>
            <td colspan="2">
                溶栓药物:
                <input type="radio" name="rsyw" title="一代" value="0">
                <input type="radio" name="rsyw" title="二代" value="1">
                <input type="radio" name="rsyw" title="三代" value="2">
                溶栓药物剂量：
                <input type="radio" name="rsywSize" title="半量" value="0">
                <input type="radio" name="rsywSize" title="全量" value="1">
                溶栓再通:
                <input type="radio" name="rszt" title="是" value="0">
                <input type="radio" name="rszt" title="否" value="1">
            </td>
        </tr>
        <tr>
            <td rowspan="5">
                急诊留观心内病房
            </td>
            <td>
                复测心电图时间：
                <input type="text" readonly id="ksc19" name="fcxdtTime">
            </td>
            <td>
                肌钙蛋白复测结果:
                <input type="text" id="ksc20" name="jgdbResult">ng/ml
            </td>
        </tr>
        <tr>
            <td>
                复测肌钙蛋白抽血完成时间：
                <input type="text" readonly id="ksc21" name="jgdbTime">
            </td>
            <td>
                复测肌钙蛋白报告时间:
                <input type="text" readonly id="ksc22" name="jgdbbgTime">
            </td>
        </tr>
        <tr>
            <td colspan="2">
                Grace 危险分层：
                <input type="radio" value="0" name="grace" title="极高危"/>
                <input type="radio" value="1" name="grace" title="高危"/>
                <input type="radio" value="2" name="grace" title="中危"/>
                <input type="radio" value="3" name="grace" title="低危"/>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                备以下任意一条，即为极高危：<br/>
                <input type="checkbox" name="weiItem" value="0" title="药物治疗无法控制的顽固性心绞痛">
                <input type="checkbox" name="weiItem" value="1" title="严重心衰">
                <input type="checkbox" name="weiItem" value="2" title="危及生命的室性心率失常">
                <input type="checkbox" name="weiItem" value="3" title="血流动力学不稳定或心源性休克">
                <input type="checkbox" name="weiItem" value="4" title="心肌梗死的机械并发症">
            </td>
        </tr>
        <tr>
            <td colspan="2">
                诊 断：
                <input type="checkbox" name="zdInfo" value="0" title="STEMI"/>
                <input type="checkbox" name="zdInfo" value="1" title="NSTEMI"/>
                <input type="checkbox" name="zdInfo" value="2" title="UA"/>
                <input type="checkbox" name="zdInfo" value="3" title="主动脉夹层"/>
                <input type="checkbox" name="zdInfo" value="4" title="肺栓塞"/>
                <input type="checkbox" name="zdInfo" value="5" title="非ACS胸痛"/>
            </td>
        </tr>
        <tr>
            <td colspan="3">
                由实际判定或实施人员勾选：
                Killip 分：
                <input type="radio" name="killip" value="0" title="I">
                <input type="radio" name="killip" value="1" title="II">
                <input type="radio" name="killip" value="2" title="III">
                <input type="radio" name="killip" value="3" title="IV">
                NYHA分级：
                <input type="radio" name="nyha" value="0" title="I"/>
                <input type="radio" name="nyha" value="1" title="II"/>
                <input type="radio" name="nyha" value="2" title="III">
                <input type="radio" name="nyha" value="2" title="IV"> <br/>

                具备任意一条，即为极高危： <br/>
                <input type="checkbox" name="gaoweiItem" value="0" title="药物无法控制的顽固性心绞痛">
                <input type="checkbox" name="gaoweiItem" value="1" title="危及生命的室性心率失常">
                <input type="checkbox" name="gaoweiItem" value="2" title="血流动力学不稳或心源性休克">
                <input type="checkbox" name="gaoweiItem" value="3" title="心肌梗死的机械并发症">
                <input type="checkbox" name="gaoweiItem" value="4" title="严重心衰">
                <br/>
                STEMI再灌注措施： <br/>
                <input type="checkbox" name="setmi" value="0" title="急诊PCI">
                <input type="checkbox" name="setmi" value="1" title="溶栓">
                <input type="checkbox" name="setmi" value="2" title="补救PCI">
                <input type="checkbox" name="setmi" value="3" title="急诊仅造影">
                <input type="checkbox" name="setmi" value="4" title="择期PCI">
                <input type="checkbox" name="setmi" value="5" title="转运 PCI">
                <input type="checkbox" name="setmi" value="6" title="择期仅造影">
                <input type="checkbox" name="setmi" value="7" title="CABG">

                <input type="checkbox" name="setmi" value="8" title="无再灌注措施">
                <input type="checkbox" name="setmi" value="9" title="其它">
                NSTE-ACS 血运重建措施 :<br/>
                <input type="checkbox" name="nsteacs" value="0" title="紧急PCI">
                <input type="checkbox" name="nsteacs" value="1" title="紧急仅造影">
                <input type="checkbox" name="nsteacs" value="2" title="24h 内介入">
                <input type="checkbox" name="nsteacs" value="3" title="72h 内介入">
                <input type="checkbox" name="nsteacs" value="4" title="早期仅造影">
                <input type="checkbox" name="nsteacs" value="5" title="择期介入">
                <input type="checkbox" name="nsteacs" value="6" title="保守治疗">
                <input type="checkbox" name="nsteacs" value="7" title="CABG">
                <input type="checkbox" name="nsteacs" value="8" title="其它"><br/>
                实际介入时间:
                <input type="text" readonly name="sjjrTime" id="ksc23">
                双联抗血小板药物给药时间:
                <input type="text" readonly name="slkxxbgyTime" id="ksc24"><br/>
                阿司匹林：
                <input type="text" name="ksasNum"/>mg
                替格瑞洛:
                <input type="text" name="kstgrlNum"/>mg
                氯吡格雷：
                <input type="text" name="kqbglNum">mg
                <br/>
                24h 他汀治疗:
                <input type="radio" name="tdzl" value="0" title="是">
                <input type="radio" name="tdzl" value="1" title="否">
                β受体阻滞剂使用：
                <input type="radio" name="aef" value="0" title="是"/>
                <input type="radio" name="aef" value="1" title="否"/>

            </td>
        </tr>

    </table>
</form>
<jsp:include page="daoguan.jsp"/>
<script src="${ctx}/layui/layui.js" charset="utf-8"></script>

<script src="${ctx}/js/app.js"></script>

</body>
</html>
