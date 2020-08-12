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
        #yyjl table tr {
            height: 40px;
        }

        #yyjl td {
            border: 1px black solid;
        }

        #yyjl input {
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
    <legend>抢救用药记录</legend>
</fieldset>
<form class="layui-form" action="" id="yyjl">
    <table align="center">
        <tr>
            <td>
                时间：
                <input type="text" name="qjTime" readonly
                       value="<fmt:formatDate value="${qjyy.qjTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"
                       id="yyt1">
            </td>
            <td>
                医嘱：
                <input type="text" name="yizhuInfo" value="${qjyy.yizhuInfo}">
            </td>
            <td>
                医生签名：
                <input type="text" name="doctorName" value="${qjyy.doctorName}">
            </td>
            <td>
                护士签名：
                <input type="text" name="hushiName" value="${qjyy.hushiName}">
            </td>
        </tr>
        <tr>
            <td colspan="4">
                抢救结果：
                <input type="text" name="qjresult" value="${qjyy.qjresult}" style="width: 100%"/>
            </td>
        </tr>
        <tr>
            <td rowspan="1">
                目前情况:
            </td>
            <td rowspan="1" colspan="4">
                <textarea class="layui-textarea" name="nowresult" style="border:none">${qjyy.nowresult}</textarea>
            </td>
        </tr>
        <tr>
            <td colspan="3">
                转科:
                <input type="text" name="chageks" value="${qjyy.chageks}">
                转院:
                <input type="text" name="chageyy" value="${qjyy.chageyy}">
            </td>
            <td>
                时间：
                <input type="text" name="chageTime" readonly
                       value="<fmt:formatDate value="${qjyy.chageTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"
                       id="yyt2">
            </td>

        </tr>
        <tr>
            <td colspan="4">
                陪送人员：
                <input type="text" name="peipeople" value="${qjyy.peipeople}" style="width: 80%;">
            </td>
        </tr>
        <tr>
            <td colspan="4">
                参加抢救人员：
                <input type="text" name="qjpeople" value="${qjyy.qjpeople}" style="width: 80%">
            </td>
        </tr>
        <tr>
            <td colspan="4" style="text-align: center;border:none">
                <input type="hidden" name="userId" value="${qjyy.userId}">
                <input type="hidden" name="qjId" value="${qjyy.qjId}">
                <input type="hidden" name="createTimej"
                       value="<fmt:formatDate value="${qjyy.createTimej}" pattern="yyyy-MM-dd HH:mm:ss"/>"
                >
                <button type="submit" class="layui-btn" lay-submit="" lay-filter="updateqjyy">立即修改</button>
                <button type="button" class="layui-btn layui-btn-primary" id="guanbi7">关闭</button>
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
        form.on('submit(updateqjyy)', function (data) {
            var doctorName = $("input[name='doctorName']").val();
            if (doctorName == '') {
                layer.alert("医生签名不能为空");
                return false;
            }
            var hushiName = $("input[name='hushiName']").val();
            if (hushiName == '') {
                layer.alert("护士签名不能为空");
                return false;
            }

            layer.confirm("是否确认修改?", function () {
                $.ajax({
                    url: '${ctx}/user/editQjyy',
                    data: data.field,
                    dataType: "json",
                    type: "post",
                    success: function (data) {
                        if (data.code != 0) {
                            layer.alert(data.msg, {icon: 2, title: "提示"})
                        } else {
                            layer.alert("修改成功", function () {
                                var index = parent.layer.getFrameIndex(window.name);
                                parent.layer.close(index);
                            });

                        }
                    },
                    error: function () {

                    }
                });
            })

            return false;

        });

        $("#guanbi7").click(function () {
            var index = parent.layer.getFrameIndex(window.name);
            parent.layer.close(index);
        })

        laydate.render({
            elem: "#yyt1",
            type: "datetime",
            trigger: 'click'
        });
        laydate.render({
            elem: "#yyt2",
            type: "datetime",
            trigger: 'click'
        });

    })
</script>
</html>

