layui.use(['laydate', 'form', 'layer'], function () {
    var laydate = layui.laydate;
    var form = layui.form;
    var $ = layui.jquery;
    var layer = layui.layer;
    // var layer = layui.layer;
    var ctx = $("#ctx").val();


    form.on('submit(updateYQ)', function (data) {
        var cf = confirm("是否确认修改?");
        if (cf) {
            $.ajax({
                url: ctx + '/user/editQy',
                data: data.field,
                dataType: "json",
                type: "post",
                success: function (data) {
                    if (data.code != 0) {
                        alert("修改失败");
                    } else {
                        alert("修改成功")
                        var index = parent.layer.getFrameIndex(window.name);
                        parent.layer.close(index);
                    }
                },
                error: function () {

                }
            })
        }
        return false
    })

    //院前

    $("#guanbi").click(function () {
        var index = parent.layer.getFrameIndex(window.name);
        parent.layer.close(index);
    })


    //预检
    var way = $("input[name='ddWay']:checked").val();
    if (way == 3) {
        $("#zhuyuan").removeClass("radioCentenr")
    }
    form.on('submit(updateInfo2)', function (data) {
        var cf = confirm("是否确认修改?");
        if (cf) {
            $.ajax({
                url: ctx + '/user/editJzyj',
                data: data.field,
                dataType: "json",
                type: "post",
                success: function (data) {
                    if (data.code != 0) {
                        alert(data.msg)
                    } else {
                        alert("修改成功");
                        var index = parent.layer.getFrameIndex(window.name);
                        parent.layer.close(index);

                    }
                },
                error: function () {

                }
            })
        }
        return false;
    })
    //单选框选中事件
    form.on('radio(erweima)', function (data) {
        if (data.value == 3) {
            $("#zhuyuan").removeClass("radioCentenr")

        } else {
            $("#zhuyuan").addClass("radioCentenr");
        }
    });
    $("#guanbi2").click(function () {
        var index = parent.layer.getFrameIndex(window.name);
        parent.layer.close(index);
    })
    //科室
    form.on('submit(updateJz)', function (data) {
        var bqpgItems = new Array();//病情评估及合并情况
        $('input[name="bqpgItem"]:checked').each(function (index, domEle) {
            bqpgItems.push($(this).val());
        });
        var zhenduans = new Array();//诊断
        $('input[name="zhenduan"]:checked').each(function (index, domEle) {
            zhenduans.push($(this).val());
        });
        var xnzhenduans = new Array();//心内诊断
        $('input[name="xnzhenduan"]:checked').each(function (index, doeEle) {
            xnzhenduans.push($(this).val());
        });
        var weis = new Array();//高危选项
        $('input[name="weiItem"]:checked').each(function (index, doeEle) {
            weis.push($(this).val());
        });
        var zdInfos = new Array();//急诊留观心内病房诊断
        $('input[name="zdInfo"]:checked').each(function (index, doeEle) {
            zdInfos.push($(this).val())
        })
        var gaoweiItems = new Array();//操作人员高危选中
        $("input[name='gaoweiItem']:checked").each(function (index, doeEle) {
            gaoweiItems.push($(this).val());
        })
        var setmis = new Array();//STEMI再灌注措施
        $("input[name='setmi']:checked").each(function (index, doeEle) {
            setmis.push($(this).val());
        });
        var nsteacss = new Array();// NSTE-ACS 血运重建措施
        $("input[name='nsteacs']:checked").each(function (index, deoEle) {
            nsteacss.push($(this).val())
        });

        data.field.nsteacs = nsteacss.join(",");
        data.field.setmi = setmis.join(",");
        data.field.gaoweiItem = gaoweiItems.join(",");
        data.field.zdInfo = zdInfos.join(",");
        data.field.bqpgItem = bqpgItems.join(",");
        data.field.zhenduan = zhenduans.join(",");
        data.field.xnzhenduan = xnzhenduans.join(",");
        data.field.weiItem = weis.join(",");
        var cf = confirm("是否确认修改?");
        alert(JSON.stringify(data.field))
        if (cf) {
            $.ajax({
                url: ctx + '/user/editKsjc',
                data: data.field,
                dataType: "json",
                type: "post",
                success: function (data) {
                    if (data.code != 0) {
                        alert(data.msg);
                    } else {
                        alert("修改成功");
                        var index = parent.layer.getFrameIndex(window.name);
                        parent.layer.close(index);
                    }
                },
                error: function () {

                }
            })
        }


        return false;
    })
    $("#guanbi3").click(function () {
        var index = parent.layer.getFrameIndex(window.name);
        parent.layer.close(index);
    })
    var bq = $("input[name='bq']").val();
    var bqlist = bq.split(",");
    var checkBoxAll = $("input[name='bqpgItem']");
    checkBoxx(checkBoxAll, bqlist);
    var zd = $("input[name='zd']").val();
    var zdlist = zd.split(",");
    var zdAll = $("input[name='zhenduan']");
    checkBoxx(zdAll, zdlist);
    var xnzd = $("input[name='xnzd']").val();
    var xnzdList = xnzd.split(",");
    var xnzdAll = $("input[name='xnzhenduan']");
    checkBoxx(xnzdAll, xnzdList);
    var wx = $("input[name='wx']").val();
    var wxList = wx.split(",");
    var wxAll = $("input[name='weiItem']");
    checkBoxx(wxAll, wxList);
    var zdxz = $("input[name='zdxz']").val();
    var zdxzList = zdxz.split(",");
    var zdxzAll = $("input[name='zdInfo']");
    checkBoxx(zdxzAll, zdxzList);
    var gw = $("input[name='gw']").val();
    var gwList = gw.split(",");
    var gwAll = $("input[name='gaoweiItem']");
    checkBoxx(gwAll, gwList);
    var sm = $("input[name='sm']").val();
    var smList = sm.split(",");
    var smAll = $("input[name='setmi']");
    checkBoxx(smAll, smList);
    var nsteacsInfo = $("input[name='nsteacsInfo']").val();
    var nstList = nsteacsInfo.split(",");
    var nstAll = $("input[name='nsteacs']");
    checkBoxx(nstAll, nstList);
    form.render('checkbox');
    //导管
    var bfz = $("input[name='bfz']").val();
    var bfzList = bfz.split(",");
    var bfzAll = $("input[name='szbfz']");
    checkBoxx(bfzAll, bfzList);
    form.render('checkbox');

    //导管室
    form.on('submit(updatedg)',
        function (data) {

            var cf = confirm("是否确认修改?");
            if (cf) {
                var szbfz = new Array();
                $("input[name='szbfz']:checked").each(function (index, deoElm) {
                    szbfz.push($(this).val());
                })
                data.field.szbfz = szbfz.join(",");
                $.ajax({
                    url: ctx + '/user/editDg',
                    data: data.field,
                    dataType: "json",
                    type: "post",
                    success: function (data) {
                        if (data.code != 0) {
                            alert(data.msg, {icon: 2, title: "提示"})
                        } else {
                            alert("修改成功");
                            var index = parent.layer.getFrameIndex(window.name);
                            parent.layer.close(index)

                        }
                    },
                    error: function () {

                    }
                })
            }
            return false;
        })

    $("#biguan").click(function () {
        var index = parent.layer.getFrameIndex(window.name);
        parent.layer.close(index)
    })
//出院
    var hbz = $("input[name='hbz']").val();
    var hbzList = hbz.split(",");
    var hbzAll = $("input[name='hbzItem']");
    checkBoxx(hbzAll, hbzList);
    var xxg = $("input[name='xxg']").val();
    var xxgList = xxg.split(",");
    var xxgAll = $("input[name='xxgjbys']");
    checkBoxx(xxgAll, xxgList);
    var dy = $("input[name='dy']").val();
    var dyList = dy.split(",");
    var dyAll = $("input[name='cydy']");
    checkBoxx(dyAll, dyList);
    form.render('checkbox');

    form.on('submit(updatecy)', function (data) {
        var cf = confirm("是否确定修改?");
        if (cf) {
            //合并症
            var hbzItem = new Array();
            $("input[name='hbzItem']:checked").each(function (index, docElm) {
                hbzItem.push($(this).val());
            });
            //心血管疾病危险因素：
            var xxgjbys = new Array();
            $("input[name='xxgjbys']:checked").each(function (index, deoElm) {
                xxgjbys.push($(this).val());
            });
            //出院带药:
            var cydy = new Array();
            $("input[name='cydy']:checked").each(function (inxd, deoElm) {
                cydy.push($(this).val());
            });
            data.field.cydy = cydy.join(",");
            data.field.xxgjbys = xxgjbys.join(",");
            data.field.hbzItem = hbzItem.join(",");
            $.ajax({
                url: ctx + '/user/editCyzg',
                data: data.field,
                dataType: "json",
                type: "post",
                success: function (data) {
                    if (data.code != 0) {
                        alert(data.msg)
                    } else {
                        alert("修改成功")
                        var index = parent.layer.getFrameIndex(window.name);
                        parent.layer.close(index)

                    }
                },
                error: function () {

                }
            })
        }
        return false;
    })


    $("#guanbi4").click(function () {
        var index = parent.layer.getFrameIndex(window.name);
        parent.layer.close(index)
    })


    function checkBoxx(checkBoxAll, bqlist) {
        for (var i = 0; i < bqlist.length; i++) {
            //获取所有复选框对象的value属性，然后，用checkArray[i]和他们匹配，如果有，则说明他应被选中
            $.each(checkBoxAll, function (j, checkbox) {
                //获取复选框的value属性
                var checkValue = $(checkbox).val();
                if (bqlist[i] == checkValue) {
                    $(checkbox).prop("checked", true);
                }
            });
        }
    }

//关闭页面
    $("#guanbi").click(function () {
        var index = parent.layer.getFrameIndex(window.name);
        parent.layer.close(index);
    })
//出院转归时间
    laydate.render({
        elem: '#cyt1',
        type: "datetime",
        trigger: 'click'
    });
    laydate.render({
        elem: '#cyt2',
        type: "datetime",
        trigger: 'click'
    });
//导管室时间
    laydate.render({
        elem: '#dgt1',
        type: "datetime",
        trigger: 'click'
    });
    laydate.render({
        elem: '#dgt2',
        type: "datetime",
        trigger: 'click'
    });
    laydate.render({
        elem: '#dgt3',
        type: "datetime",
        trigger: 'click'
    });
    laydate.render({
        elem: '#dgt4',
        type: "datetime",
        trigger: 'click'
    });
    laydate.render({
        elem: '#dgt5',
        type: "datetime",
        trigger: 'click'
    });
    laydate.render({
        elem: '#dgt6',
        type: "datetime",
        trigger: 'click'
    });

//科室检查时间
    laydate.render({
        elem: '#ksc1',
        type: "datetime",
        trigger: 'click'
    });
    laydate.render({
        elem: '#ksc2',
        type: "datetime",
        trigger: 'click'
    });
    laydate.render({
        elem: '#ksc3',
        type: "datetime",
        trigger: 'click'
    });
    laydate.render({
        elem: '#ksc4',
        type: "datetime",
        trigger: 'click'
    });
    laydate.render({
        elem: '#ksc5',
        type: "datetime",
        trigger: 'click'
    });
    laydate.render({
        elem: '#ksc6',
        type: "datetime",
        trigger: 'click'
    });
    laydate.render({
        elem: '#ksc7',
        type: "datetime",
        trigger: 'click'
    });
    laydate.render({
        elem: '#ksc8',
        type: "datetime",
        trigger: 'click'
    });
    laydate.render({
        elem: '#ksc9',
        type: 'datetime',
        trigger: 'click'
    });
    laydate.render({
        elem: '#ksc10',
        type: "datetime",
        trigger: 'click'
    });
    laydate.render({
        elem: '#ksc11',
        type: 'datetime',
        trigger: 'click'
    });
    laydate.render({
        elem: '#ksc12',
        type: 'datetime',
        trigger: 'click'
    });
    laydate.render({
        elem: '#ksc13',
        type: 'datetime',
        trigger: 'click'
    });
    laydate.render({
        elem: '#ksc14',
        type: 'datetime',
        trigger: 'click'
    });
    laydate.render({
        elem: '#ksc15',
        type: 'datetime',
        trigger: 'click'
    });
    laydate.render({
        elem: '#ksc16',
        type: 'datetime',
        trigger: 'click'
    });
    laydate.render({
        elem: '#ksc17',
        type: 'datetime',
        trigger: 'click'
    });
    laydate.render({
        elem: '#ksc18',
        type: 'datetime',
        trigger: 'click'
    });
    laydate.render({
        elem: '#ksc19',
        type: 'datetime',
        trigger: 'click'
    });
    laydate.render({
        elem: '#ksc22',
        type: 'datetime',
        trigger: 'click'
    });
    laydate.render({
        elem: '#ksc23',
        type: 'datetime',
        trigger: 'click'
    });
    laydate.render({
        elem: '#ksc24',
        type: 'datetime',
        trigger: 'click'
    });
    laydate.render({
        elem: '#ksc21',
        type: 'datetime',
        trigger: 'click'
    });
//急诊预检时间
    laydate.render({
        elem: '#jzc1'
        , type: 'datetime'
        , trigger: 'click'
    });
    laydate.render({
        elem: '#jzc2'
        , type: 'datetime'
        , trigger: 'click'
    });
    laydate.render({
        elem: '#jzc3'
        , type: 'datetime'
        , trigger: 'click'
    });
    laydate.render({
        elem: '#jzc4'
        , type: 'datetime'
        , trigger: 'click'
    });
    laydate.render({
        elem: '#jzc5'
        , type: 'datetime'
        , trigger: 'click'
    });

//院前系统时间
    laydate.render({
        elem: '#test1'
        , type: 'datetime'
        , trigger: 'click'
    });
    laydate.render({
        elem: '#test2'
        , type: 'datetime'
        , trigger: 'click'
    });
    laydate.render({
        elem: '#test3'
        , type: 'datetime'
        , trigger: 'click'
    });
    laydate.render({
        elem: '#test4'
        , type: 'datetime'
        , trigger: 'click'
    });
    laydate.render({
        elem: '#test5'
        , type: 'datetime'
        , trigger: 'click'
    });
    laydate.render({
        elem: '#test6'
        , type: 'datetime'
        , trigger: 'click'
    });
    laydate.render({
        elem: '#test7'
        , type: 'datetime'
        , trigger: 'click'
    });
    laydate.render({
        elem: '#test8'
        , type: 'datetime'
        , trigger: 'click'
    });
    laydate.render({
        elem: '#test9'
        , type: 'datetime'
        , trigger: 'click'
    });
    laydate.render({
        elem: '#test10'
        , type: 'datetime'
        , trigger: 'click'
    });
    laydate.render({
        elem: '#test11'
        , type: 'datetime'
        , trigger: 'click'
    });
    laydate.render({
        elem: '#test12'
        , type: 'datetime'
        , trigger: 'click'
    });
    laydate.render({
        elem: '#test13'
        , type: 'datetime'
        , trigger: 'click'
    });
    laydate.render({
        elem: '#test14'
        , type: 'datetime'
        , trigger: 'click'
    });
})