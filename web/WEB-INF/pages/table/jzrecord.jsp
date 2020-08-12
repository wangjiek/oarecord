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
        #ndjz table tr {
            height: 40px;
        }

        #ndjz td {
            border: 1px black solid;
        }

        #ndjz input {
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
    <legend>宁都县人民医院</legend>
</fieldset>
<form class="layui-form" action="" id="ndjz">
    <input type="hidden" id="ctx" value="${pageContext.request.contextPath}"/>
    <table align="center">
        <tr>
            <td>
                姓名：
                <input type="text" name="brName">
            </td>
            <td>
                性别：
                <input type="text" name="brSex">
            </td>
            <td>
                年龄
                <input type="text" name="brAge">
            </td>
            <td>
                受伤原因：
                <input type="text" name="cause">
            </td>
        </tr>
        <tr>
            <td colspan="4">
                生命体征：
                神态： <input type="text" name="shenzhi">
                血压：<input type="text" name="xueya" style="width: 40px">
                脉搏：<input type="text" name="maibo" style="width: 40px">
                血氧：<input type="text" name="xueyang" style="width: 40px">
                呼吸：<input type="text" name="huxi" style="width: 40px">
                体温：<input type="text" name="tiwen" style="width: 40px"/>
            </td>
        </tr>
        <tr>
            <td>
                初步诊断:
                <input type="text" name="panduan">
            </td>
            <td>
                病情：
                <input type="text" name="bingqing">
            </td>
            <td>
                急诊辅助检查:
                <input type="text" name="jzfzCheck">
            </td>
            <td>
                急诊处理情况:
                <input type="text" name="jzchuli">
            </td>
        </tr>
        <tr>
            <td>
                入急诊科时间:
                <input readonly type="text" name="injzTime" id="ndt1">
            </td>
            <td>
                离开急诊科时间:
                <input readonly type="text" name="outjzTime" id="ndt2">
            </td>
            <td>
                去向：
                <input type="text" name="quxiang">
            </td>
            <td>
                接诊医生：
                <input type="text" name="doctorName">
            </td>
        </tr>
        <tr>
            <td>
                接诊护士：
                <input type="text" name="hushiName">
            <td>
                陪送人员：
                <input type="text" name="peisongName">
            </td>
            <td colspan="2" style="text-align: center">
                <button type="submit" class="layui-btn" lay-submit="" lay-filter="ndjzInfo">立即提交</button>
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

        form.on('submit(ndjzInfo)', function (data) {
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
            var index;
            $.ajax({
                url: '${ctx}/user/addndjz',
                data: data.field,
                dataType: 'json',
                type: "post",
                timeout: "20000",
                beforeSend: function (XMLHttpRequest) {
                    index = layer.load(2);
                },
                success: function (data) {
                    layer.alert(data.code);
                    if (data.code != 0) {
                        layer.alert(data.msg, {icon: 2, title: "提示"})
                    } else {
                        layer.alert("添加成功");
                        $("#ndjz")[0].reset();
                        layui.form.render()
                    }
                },
                complete: function () {
                    layer.close(index);
                },
                error: function () {
                }
            });
            return false;
        });


        laydate.render({
            elem: "#ndt1",
            type: "datetime",
            trigger: 'click'
        });
        laydate.render({
            elem: "#ndt2 ",
            type: "datetime",
            trigger: 'click'
        });
    })
</script>
</html>

