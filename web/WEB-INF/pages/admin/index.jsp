<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
    <title>登录</title>
    <%@ include file="/include/adminhead.jsp" %>
    <style type="text/css">
        body {
            background: #18c8f6;
            height: auto;
            background: url(${ctx}/images/login_background.jpg) no-repeat center fixed;
            -webkit-background-size: cover;
            -moz-background-size: cover;
            -o-background-size: cover;
            background-size: cover;
        }

        .login {
            height: 200px;
            width: 260px;
            padding: 20px;
            background-color: rgba(0, 0, 0, 0.5);
            border-radius: 4px;
            position: absolute;
            left: 50%;
            top: 50%;
            margin: -150px 0 0 -150px;
            z-index: 99;
        }

        .login h1 {
            text-align: center;
            color: #fff;
            font-size: 24px;
            margin-bottom: 20px;
        }

        .form_code {
            position: relative;
        }

        .form_code .code {
            position: absolute;
            right: 0;
            top: 1px;
            cursor: pointer;
        }

        .login_btn {
            width: 100%;
        }
    </style>
</head>
<body>
<div class="login">
    <h1>Record管理平台-登录</h1>
    <form class="layui-form">
        <div class="layui-form-item">
            <input class="layui-input" name="username" id="username" placeholder="用户名"
                   lay-verify="required" type="text" autocomplete="off">
        </div>
        <div class="layui-form-item">
            <input class="layui-input" name="password" id="password" placeholder="密码"
                   lay-verify="required" type="password" autocomplete="off">
        </div>
        <button class="layui-btn login_btn" lay-submit="" lay-filter="login">登录</button>
    </form>
</div>
</body>
<script type="text/javascript">
    layui.use(['layer', 'form'],function () {
        var $ = layui.jquery;
        var from = layui.form;
        var layer = layui.layer;
        from.on("submit(login)", function (data) {
            var name = $("#username").val();
            var pwd = $("#password").val();
            var index;
            $.ajax({
                url: '${ctx}/user/postLogin',
                data: {"name": name, "pwd": pwd},
                dataType: "json",
                type: "post",
                timeout: "20000",
                beforeSend: function (XMLHttpRequest) {
                    index = layer.load(2);
                },
                success: function (data) {
                    if (data.code != 0) {
                        layer.alert(data.msg, {icon: 2, title: "提示"})
                    } else {
                        window.location.href = '${ctx}/user/main';
                    }
                },
                complete:function(){
                    layer.close(index);
                },
                error:function(){

                }
            })
            return false;
        })

    });
</script>
</html>