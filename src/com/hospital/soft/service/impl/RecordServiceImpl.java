package com.hospital.soft.service.impl;

import com.hospital.soft.mybatis.pojo.*;
import com.hospital.soft.mybatis.service.*;
import com.hospital.soft.service.IRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecordServiceImpl implements IRecordService {
    @Autowired
    RecordtypeService recordtypeServicel;
    @Autowired
    OutpatientService service;
    @Autowired
    JzpreviewService jzService;
    @Autowired
    KscheckService kscheckService;
    @Autowired
    DaoguanrecordService daoguanrecordService;
    @Autowired
    LivehospitalService livehospitalService;
    @Autowired
    JzrecordService jzrecordServicer;
    @Autowired
    QjyyrecordService qjyyrecordService;
    @Autowired
    QjbrrecordService qjbrrecordService;
    @Autowired
    SjwkjzssrecordService sjwkjzssrecordService;

    /**
     * 院前系统添加
     *
     * @param outpatient
     * @throws Exception
     */
    @Override
    public void addsTimeRecord(Outpatient outpatient) throws Exception {
        if (outpatient.getOutpatientId() == null) {
            service.insert(outpatient);
        } else {
            service.updateById(outpatient);
        }

    }

    /**
     * 急诊预检添加
     *
     * @param jzpreview
     * @throws Exception
     */
    @Override
    public void addTimejzRecord(Jzpreview jzpreview) throws Exception {
        if (jzpreview.getJzpreviewId() == null) {
            jzService.insert(jzpreview);
        } else {
            jzService.updateById(jzpreview);
        }

    }

    /**
     * 科室检查添加
     *
     * @param kscheck
     * @throws Exception
     */
    @Override
    public void addTimeKscRecord(Kscheck kscheck) throws Exception {
        if (kscheck.getKscheckId() == null) {
            kscheckService.insert(kscheck);
        } else {
            kscheckService.updateById(kscheck);
        }
    }

    /**
     * 导管室添加修改
     *
     * @param daoguanrecord
     * @throws Exception
     */
    @Override
    public void addTimeDgsRecord(Daoguanrecord daoguanrecord) throws Exception {
        if (daoguanrecord.getDgrecordId() == null) {
            daoguanrecordService.insert(daoguanrecord);
        } else {
            daoguanrecordService.updateById(daoguanrecord);
        }
    }

    /**
     * 出院转归添加修改
     *
     * @param livehospital
     * @throws Exception
     */
    @Override
    public void addTimeCyRecord(Livehospital livehospital) throws Exception {
        if (livehospital.getLivehospitalId() == null) {
            livehospitalService.insert(livehospital);
        } else {
            livehospitalService.updateById(livehospital);
        }
    }

    /**
     * 宁都急诊添加修改
     *
     * @param jzrecord
     * @throws Exception
     */
    @Override
    public void addNdJzRecord(Jzrecord jzrecord) throws Exception {
        if (jzrecord.getJzrecordId() == null) {
            jzrecordServicer.insert(jzrecord);
        } else {
            jzrecordServicer.updateById(jzrecord);
        }
    }

    /**
     * 抢救用药记录添加修改
     *
     * @param qjyyrecord
     * @throws Exception
     */
    @Override
    public void addQjyyRrcord(Qjyyrecord qjyyrecord) throws Exception {
        if (qjyyrecord.getQjId() == null) {
            qjyyrecordService.insert(qjyyrecord);
        } else {
            qjyyrecordService.updateById(qjyyrecord);
        }
    }

    /**
     * 抢救病人记录添加修改
     *
     * @param qjbrrecord
     * @throws Exception
     */
    @Override
    public void addQjbrRecord(Qjbrrecord qjbrrecord) throws Exception {
        if (qjbrrecord.getJqbrId() == null) {
            qjbrrecordService.insert(qjbrrecord);
        } else {
            qjbrrecordService.updateById(qjbrrecord);
        }
    }

    /**
     * 神经外科创伤病人登记表
     *
     * @param sjwkjzssrecord
     * @throws Exception
     */
    @Override
    public void addSjBrRecord(Sjwkjzssrecord sjwkjzssrecord) throws Exception {
        if (sjwkjzssrecord.getSjId() == null) {
            sjwkjzssrecordService.insert(sjwkjzssrecord);
        } else {
            sjwkjzssrecordService.updateById(sjwkjzssrecord);
        }
    }

    /**
     * 院前系统(及网络医院)查询
     *
     * @param outpatient
     * @throws Exception
     */
    @Override
    public Outpatient findYqById(Integer outpatient) throws Exception {
        return service.selectById(outpatient);
    }

    /**
     * 急诊预检查询通过ID
     *
     * @param jzId
     * @return
     * @throws Exception
     */
    @Override
    public Jzpreview findJzBrById(Integer jzId) throws Exception {
        Jzpreview jzpreview = jzService.selectById(jzId);
        return jzpreview;
    }

    /**
     * 科室检查信息查询
     *
     * @param ksId
     * @return
     * @throws Exception
     */
    @Override
    public Kscheck findKsById(Integer ksId) throws Exception {
        Kscheck kscheck = kscheckService.selectById(ksId);
        return kscheck;
    }

    /**
     * 查询导管记录
     *
     * @param dgId
     * @return
     * @throws Exception
     */
    @Override
    public Daoguanrecord findDgById(Integer dgId) throws Exception {
        Daoguanrecord daoguanrecord = daoguanrecordService.selectById(dgId);
        return daoguanrecord;
    }

    /**
     * 查询出院记录
     *
     * @param cyId
     * @return
     * @throws Exception
     */
    @Override
    public Livehospital findLhById(Integer cyId) throws Exception {
        Livehospital livehospital = livehospitalService.selectById(cyId);
        return livehospital;
    }

    /**
     * 神经外科
     *
     * @param sjId
     * @return
     * @throws Exception
     */
    @Override
    public Sjwkjzssrecord findSjById(Integer sjId) throws Exception {
        Sjwkjzssrecord sjwkjzssrecord = sjwkjzssrecordService.selectById(sjId);
        return sjwkjzssrecord;
    }

    /**
     * 宁都急诊
     *
     * @param ndId
     * @return
     * @throws Exception
     */
    @Override
    public Jzrecord findNdjzById(Integer ndId) throws Exception {
        Jzrecord jzrecord = jzrecordServicer.selectById(ndId);
        return jzrecord;
    }

    /**
     * 抢救用药
     *
     * @param yyId
     * @return
     * @throws Exception
     */
    @Override
    public Qjyyrecord findYyById(Integer yyId) throws Exception {
        Qjyyrecord qjyyrecord = qjyyrecordService.selectById(yyId);
        return qjyyrecord;
    }

    /**
     * 抢救病人
     *
     * @param qjbrId
     * @return
     * @throws Exception
     */
    @Override
    public Qjbrrecord findQjbrById(Integer qjbrId) throws Exception {
        Qjbrrecord qjbrrecord = qjbrrecordService.selectById(qjbrId);
        return qjbrrecord;
    }

    @Override
    public void delTimeQj(Integer qjId) throws Exception {
        service.deleteById(qjId);
    }

    @Override
    public void delTimeJzyj(Integer jzyjId) throws Exception {
        jzService.deleteById(jzyjId);
    }

    @Override
    public void delTimeKs(Integer ksId) throws Exception {
        kscheckService.deleteById(ksId);
    }

    @Override
    public void delTimeDg(Integer dgId) throws Exception {
        daoguanrecordService.deleteById(dgId);
    }

    @Override
    public void delCyzg(Integer cyId) throws Exception {
        livehospitalService.deleteById(cyId);
    }

    @Override
    public void delSjbr(Integer sjbrId) throws Exception {
        sjwkjzssrecordService.deleteById(sjbrId);
    }

    @Override
    public void delNdjz(Integer ndjzId) throws Exception {
        jzrecordServicer.deleteById(ndjzId);
    }

    @Override
    public void delYyjl(Integer yyId) throws Exception {
        qjyyrecordService.deleteById(yyId);
    }

    @Override
    public void delCsBr(Integer csBrId) throws Exception {
        qjbrrecordService.deleteById(csBrId);
    }

    @Override
    public void addRecordType(Recordtype recordtype) throws Exception {
        if (recordtype.getTypeId() == null) {
            recordtypeServicel.insert(recordtype);
        } else {
            recordtypeServicel.updateById(recordtype);
        }
    }

    @Override
    public Recordtype findRecordTypeById(Integer rtId) throws Exception {
        Recordtype recordtype = recordtypeServicel.selectById(rtId);
        return recordtype;
    }

    @Override
    public void delRecordTypeById(Integer rtId) throws Exception {
        recordtypeServicel.deleteById(rtId);
    }
}
