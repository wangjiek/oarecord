//院前系统
layui.use(['laydate', 'form'], function () {
    var laydate = layui.laydate;
    var form = layui.form;
    var $ = layui.jquery;

    var ctx = $("#ctx").val();
    $("#rest").click(function () {
        $("#yuanqiiantable")[0].reset();

        $("#keshi")[0].reset();
        $("#chuyuan")[0].reset();
        $("#daoguan")[0].reset();
        layui.form.render();
    })

    //院前系统
    form.on('submit(yuanqian)', function (data) {
        var brName = $("input[name='patientname']").val();
        if (brName == '') {
            layer.alert("请填写病人姓名");

            return false;
        }
        var mzId = $("input[name='mzId']").val();
        var zyId = $("input[name='zyId']").val();
        if (mzId == '' && zyId == '') {
            layer.alert("请填写住院号和门诊号其中一个");
            return false;
        }
        var idCard = $("input[name='idCard']").val();
        if (idCard == '') {

            layer.alert("请填写身份证");
            return false;
        }


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
        //导管
        var szbfz = new Array();
        $("input[name='szbfz']:checked").each(function (index, deoElm) {
            szbfz.push($(this).val());
        })
        data.field.szbfz = szbfz.join(",");
        //出院转归
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
            url: ctx + '/user/addTimeRecord',
            data: data.field,
            dataType: "json",
            type: "post",
            success: function (data) {
                if (data.code != 0) {
                    layer.alert(data.msg, {icon: 2, title: "提示"})
                } else {
                    layer.alert("添加成功")
                    $("#yuanqiiantable")[0].reset();
                    $("#kezhenduan")[0].reset();
                    $("#chuyuan")[0].reset();
                    $("#daoguan")[0].reset();
                    layui.form.render();

                }
            },
            error: function () {

            }
        });
        return false;
    });
    //单选框选中事件
    form.on('radio(erweima)', function (data) {
        if (data.value == 3) {
            $("#zhuyuan").removeClass("radioCentenr")

        } else {
            $("#zhuyuan").addClass("radioCentenr");
        }
    });
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