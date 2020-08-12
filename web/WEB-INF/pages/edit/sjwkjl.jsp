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
        #ssbr table tr {
            height: 40px;
        }

        #ssbr td {
            border: 1px black solid;
        }

        #ssbr input {
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
    <legend>神经外科创伤病人急诊手术登记表</legend>
</fieldset>
<form class="layui-form" action="" id="ssbr">
    <table align="center">
        <tr>
            <td>
                姓名：
                <input type="text" name="brName" value="${sjqj.brName}">
            </td>
            <td>
                性别：
                <input type="text" name="brSex" value="${sjqj.brSex}"/>
            </td>
            <td>
                年龄：
                <input type="text" name="brAge" value="${sjqj.brAge}">
            </td>
        </tr>
        <tr>
            <td>
                住院号：
                <input type="text" name="zyNum" value="${sjqj.zyNum}">
            </td>
            <td colspan="2">
                诊断：
                <input type="text" name="zhenduan" value="${sjqj.zhenduan}" style="width: 80%">

            </td>
        </tr>
        <tr>
            <td colspan="2">
                入院时间：
                <input type="text" name="inyTime" readonly
                       value="<fmt:formatDate value="${sjqj.inyTime}" pattern="yyy-MM-dd HH:mm:ss"/>"
                       id="sjt1">
            </td>
            <td colspan="2">
                手术时间：
                <input type="text" name="shoushuTime" readonly
                       value="<fmt:formatDate value="${sjqj.shoushuTime}" pattern="yyy-MM-dd HH:mm:ss"/>"
                       id="sjt2">
            </td>
        </tr>
        <tr style="text-align: center">
            <td colspan="3" style="border: none; ">
                <input type="hidden" name="userId" value="${sjqj.userId}">
                <input type="hidden" name="sjId" value="${sjqj.sjId}">
                <input type="hidden" name="createDatesj"
                       value="<fmt:formatDate value="${sjqj.createDatesj}" pattern="yyy-MM-dd HH:mm:ss"/>"
                >
<%--                <button onclick="window.print()">打印当前页面</button>--%>

                <button type="submit" class="layui-btn" lay-submit="" lay-filter="updateSjwk">修改</button>
                <button type="button" class="layui-btn layui-btn-primary" id="guanbi5">关闭</button>
            </td>
        </tr>
    </table>
</form>

<script src="${ctx}/layui/layui.js" charset="utf-8"></script>
</body>
<script type="text/javascript">
    layui.use(['laydate', 'form', 'layer'], function () {
        var form = layui.form;
        var laydate = layui.laydate;
        var $ = layui.jquery;
        form.on("submit(updateSjwk)", function (data) {
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
            var zyNum = $("input[name='zyNum']").val();
            if (zyNum == '') {
                layer.alert("病人住院号不能为空");
                return false;
            }

            layer.confirm("是否确认修改?", function () {

                $.ajax({
                    url: '${ctx}/user/editSjjz',
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
                    }
                });
            })

            return false;
        });


        $("#guanbi5").click(function () {
            var index = parent.layer.getFrameIndex(window.name);
            parent.layer.close(index);
        })
        laydate.render({
            elem: '#sjt1',
            type: "datetime",
            trigger: 'click'
        });
        laydate.render({
            elem: '#sjt2',
            type: "datetime",
            trigger: 'click'
        })
    })
</script>

</html>

