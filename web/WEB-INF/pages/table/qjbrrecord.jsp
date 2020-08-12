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
        #csbr table tr {
            height: 40px;
        }

        #csbr td {
            border: 1px black solid;
        }

        #csbr input {
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
    <legend>创伤病人抢救表</legend>
</fieldset>
<form class="layui-form" action="" id="csbr">
    <table align="center">
        <tr>
            <td colspan="5">
                入急诊科时间：
                <input type="text" name="injzTime" id="brt1">
            </td>
        </tr>
        <tr>
            <td>
                床位号：
                <input type="text" name="chuanNum"/>
            </td>
            <td>
                姓名：
                <input type="text" name="brName">
            </td>
            <td>
                性别：
                <input type="text" name="brSex">
            </td>
            <td>
                年龄：
                <input type="text" name="brAge">
            </td>
            <td>
                地址:
                <input type="text" name="brAddress">
            </td>
        </tr>
        <tr>
            <td colspan="5">
                受伤原因：
                <input type="text" name="cause" style="width: 80%">
            </td>
        </tr>
        <tr>
            <td colspan="3">
                既往史：
                <input type="text" name="jiwangs" style="width: 80%">
            </td>
            <td colspan="2">
                过敏史:
                <input type="text" name="guomingshi" style="width: 80%">
            </td>
        </tr>
        <tr>
            <td colspan="5">
                入院时生命体征:<br/>
                血压：<input type="text" name="xueya" style="width: 50px">
                呼吸：<input type="text" name="huxi" style="width: 50px">
                脉搏：<input type="text" name="maibo" style="width: 50px">
                神志：<input type="text" name="shenzhi" style="width: 50px;">
                血氧：<input type="text" name="xueyang" style="width: 50px">
                体温：<input type="text" name="tiwen" style="width: 50px">
                瞳孔：左<input type="radio" name="tongkong" value="灵敏" title="灵敏">
                <input type="radio" name="tongkong" value="迟钝" title="迟钝">
                <input type="radio" name="tongkong" value="消失" title="消失">
                右<input type="radio" name="tongkong2" value="灵敏" title="灵敏">
                <input type="radio" name="tongkong2" value="迟钝" title="迟钝">
                <input type="radio" name="tongkong2" value="消失" title="消失">
            </td>
        </tr>
        <tr>
            <td colspan="5">
                辅助检查：
                <input type="text" name="fuzhujiancha" style="width: 80%;">
            </td>
        </tr>
        <tr>
            <td colspan="5">
                初步诊断：
                <input type="text" name="chubuzd" style="width: 80%">
            </td>
        </tr>
        <tr>
            <td colspan="5">
                气管插管：
                <input type="radio" name="qichaguanif" value="0" title="是">
                <input type="radio" name="qichaguanif" value="1" title="否">
                执行时间：
                <input readonly type="text" name="qichaguanTime" id="brt2">
            </td>
        </tr>
        <tr>
            <td colspan="5">
                心肺复苏:
                <input type="radio" name="xinfeifsif" value="0" title="是">
                <input type="radio" name="xinfeifsif" value="1" title="否">
                执行时间：
                <input readonly type="text" name="xinfeiTime" id="brt3">
                持续时间：
                <input readonly type="text" name="xffshowTime" id="brt4">
            </td>
        </tr>
        <tr>
            <td colspan="5">
                除颤:
                <input type="radio" name="chucanif" value="0" title="是">
                <input type="radio" name="chucanif" value="1" title="否">
                次数：<input type="text" name="chuchanNum">
            </td>
        </tr>
        <tr>
            <td colspan="5">
                呼吸机：
                <input type="radio" name="huxijiif" value="0" title="是">
                <input type="radio" name="huxijiif" value="1" title="否">
                执行时间：
                <input readonly type="text" name="huxihowTime" id="brt5">
                持续时间：
                <input readonly type="text" name="huxiTime" id="brt6">
            </td>
        </tr>
        <tr>
            <td colspan="5">
                抢救记录：
                <textarea name="qjiujilu" cols="200" rows="5"></textarea>
            </td>
        </tr>
        <tr style="text-align: center">
            <td colspan="3" style="border: none; ">
                <button type="submit" class="layui-btn" lay-submit="" lay-filter="jjbtInfo">立即提交</button>
                <button type="reset" class="layui-btn layui-btn-primary">重置</button>
            </td>
        </tr>
    </table>
</form>

<script src="${ctx}/layui/layui.js" charset="utf-8"></script>
</body>
<script type="text/javascript">
    layui.use(['laydate', 'form', 'layer'], function () {
        var laydate = layui.laydate;
        var form = layui.form;
        var $ = layui.jquery;
        var layer = layui.layer;
        form.on('submit(jjbtInfo)', function (data) {
            var chuanNum = $("input[name='chuanNum']").val();
            if (chuanNum == '') {
                layer.alert("病人床位号不能为空");
                return false;
            }
            var brName = $("input[name='brName']").val();
            if (brName == '') {
                layer.alert("病人姓名不能为空");
                return false;
            }
            var brSex = $("input[name='brSex']").val();
            if (brSex == '') {
                layer.alert("病人性别不能为空");
                return false;
            }
            var brAge = $("input[name='brAge']").val();
            if (brAge == '') {
                layer.alert("病人年龄不能为空");
                return false;
            }
            var brAddress = $("input[name='brAddress']").val();
            if (brAddress == '') {
                layer.alert("病人地址不能为空");
                return false;
            }


            $.ajax({
                url: '${ctx}/user/addqjbr',
                data: data.field,
                dataType: "json",
                type: "post",
                success: function (data) {
                    if (data.code != 0) {
                        layer.alert(data.msg, {icon: 2, title: "提示"});
                    } else {
                        layer.alert("提交成功");
                        $("#csbr")[0].reset();
                        layui.render();
                    }
                }
            })
            return false;
        });

        laydate.render({
            elem: "#brt1",
            type: "datetime",
            trigger: 'click'
        });
        laydate.render({
            elem: "#brt2",
            type: "datetime",
            trigger: 'click'
        });
        laydate.render({
            elem: "#brt3",
            type: "datetime",
            trigger: 'click'
        });
        laydate.render({
            elem: "#brt4",
            type: "datetime",
            trigger: 'click'
        });
        laydate.render({
            elem: "#brt5",
            type: "datetime",
            trigger: 'click'
        });
        laydate.render({
            elem: "#brt6",
            type: "datetime",
            trigger: 'click'
        });
    })
</script>

</html>

