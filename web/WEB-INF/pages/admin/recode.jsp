<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/7/20
  Time: 14:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>

<html>
<head>
    <title>Title</title>
    <%@ include file="/include/adminhead.jsp" %>
    <link rel="stylesheet" href="${ctx}/layui/css/layui.css" media="all">

</head>
<body>
<div class="layui-form table-head-two-line" action="">
    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">类型</label>
            <div class="layui-input-inline">
                <select name="rtype" id="mySelect">
                    <option value="">--全部--</option>
                    <option value="时间管理记录">时间管理记录</option>
                    <option value="神经外科创伤病人急诊手术登记表" >神经外科创伤病人急诊手术登记表</option>
                    <option value="宁都县人民医院急诊">宁都县人民医院急诊</option>
                    <option value="抢救用药记录">抢救用药记录</option>
                    <option value="创伤病人抢救表">创伤病人抢救表</option>

                </select>
            </div>
        </div>
        <div class="layui-inline">
            <label class="layui-form-label">提交时间</label>
            <div class="layui-input-inline">
                <input type="text" id="create" name="createtime" class="layui-input" pattern="yyyy-MM-dd">
                <input type="hidden" name="ses" value="${sessionScope.adminUser.getName()}">
            </div>
            ——
            <div class="layui-inline">
                <input type="text" id="create2" name="endTime" class="layui-input" pattern="yyyy-MM-dd">
            </div>
        </div>

        <div class="layui-inline">
            <button class="layui-btn search-btn">
                <i class="layui-icon">&#xe615;</i> 搜索
            </button>
        </div>
    </div>
</div>
<table id="tb" class="layui-table" lay-filter="tb" align="center">

</table>
<script type="text/html" id="barDemo">
    <a class="layui-btn layui-btn-xs" lay-event="edit">修改</a>
    <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>
<script src="${ctx}/layui/layui.js" charset="utf-8"></script>
<script type="text/javascript" charset="utf-8">

    layui.use(['laydate', 'form', 'layer', 'table'], function () {
        var laydate = layui.laydate;
        var form = layui.form;
        var $ = layui.jquery;
        var layer = layui.layer;
        var table = layui.table;
        table.render({
            elem: '#tb',
            url: 'getRecord',
            limit: 10,
            page: true,
            limits: [10, 15, 20],
            id: 'tb',
            text: {
                none: '没有找到数据'
            },
            autoSort: true,
            height: 'full-60',
            cols: [[
                {
                    title: "序号",
                    align: 'center',
                    width: 80,
                    type: 'numbers'
                },
                {
                    title: '编号',
                    field: 'id',
                    align: 'center',
                    width: 80,

                },
                {
                    title: "用户",
                    field:
                        "uname",
                    align:
                        'center',
                    width:
                        140
                }
                ,
                {
                    title: '类型',
                    field:
                        "rtype",
                    align:
                        'center',
                    width:
                        220
                }
                ,
                {
                    title: '提交时间',
                    field:
                        'createtime',
                    align:
                        'center',
                    width:
                        180,
                }
                , {
                    title: '操作',
                    toolbar:
                        "#barDemo",
                    align:
                        'center',
                    width:
                        180
                }
            ]]
        })
        ;//渲染结束

        //搜索框
        $(".search-btn").click(function () {
            var begin = $("#create").val();//开始时间
            var end = $("#create2").val();//结束时间
            if (begin != '') {
                if (end == '') {
                    layer.alert("请选择正确时间段");
                    return false;
                }
            }
            if (end != '') {
                if (begin == '') {
                    layer.alert("请选择正确时间段");
                    return false
                }
            }

            table.reload('tb', {
                where: {
                    'createtime': $("#create").val(),
                    'rtype': $("#mySelect option:selected").val(),
                    'endTime': $("#create2").val()
                },
                page: {
                    curr: 1
                },
                method: 'post'
            })
        })
        //监听工具条
        table.on('tool(tb)', function (obj) {
            var data = obj.data;

            if (obj.event === 'del') {//删除
                var name = data.uname;
                var uname = $("input[name='ses']").val();
                if (name != uname) {
                    layer.alert("不是您提交的表，您无法修改");
                    return false;
                }
                layer.confirm('真的删除行么', function (index) {
                    var name = data.uname;
                    var uname = $("input[name='ses']").val();
                    if (name != uname) {
                        layer.alert("不是您提交的表，您无法删除");
                        return false;
                    }
                    var id = data.id;
                    var rtype = data.rtype;
                    $.ajax({
                        url: '${ctx}/user/delRecord',
                        data: {"id": id, "rtype": rtype},
                        dataType: "json",
                        type: "post",
                        success: function (data) {
                            if (data.code != 0) {
                                layer.alert(data.msg, {icon: 2, title: "提示"})
                            } else {
                                layer.alert("删除成功");
                                obj.del();
                                layer.close(index)
                            }
                        },
                        error: function () {
                        }
                    })
                    ;
                });
            } else if (obj.event === 'edit') {
                var name = data.uname;
                var uname = $("input[name='ses']").val();
                if (name != uname) {
                    layer.alert("不是您提交的表，您无法修改");
                    return false;
                }
                layer.open({
                    type: 2,
                    content: '${ctx}/user/editRecord?id=' + data.id + '&rtype=' + data.rtype,
                    area: ["100%", "100%"],
                    title: ["修改记录"],
                    fixed: false,
                    shadeClose: true
                })
            }
        });
        //
        laydate.render({
            elem: "#create",
            type: "date",
            trigger: 'click'
        });
        laydate.render({
            elem: "#create2",
            type: "date",
            trigger: 'click'
        });
    })

</script>
</body>
</html>
