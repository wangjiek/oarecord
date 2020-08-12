package com.hospital.soft.service;

import com.hospital.soft.mybatis.pojo.*;

public interface IRecordService {

    void addsTimeRecord(Outpatient outpatient) throws Exception;

    void addTimejzRecord(Jzpreview jzpreview) throws Exception;

    void addTimeKscRecord(Kscheck kscheck) throws Exception;

    void addTimeDgsRecord(Daoguanrecord daoguanrecord) throws Exception;

    void addTimeCyRecord(Livehospital livehospital) throws Exception;

    void addNdJzRecord(Jzrecord jzrecord) throws Exception;

    void addQjyyRrcord(Qjyyrecord qjyyrecord) throws Exception;

    void addQjbrRecord(Qjbrrecord qjbrrecord) throws Exception;

    void addSjBrRecord(Sjwkjzssrecord sjwkjzssrecord) throws Exception;

    Outpatient findYqById(Integer outpatient) throws Exception;

    Jzpreview findJzBrById(Integer jzId) throws Exception;

    Kscheck findKsById(Integer ksId) throws Exception;

    Daoguanrecord findDgById(Integer dgId) throws Exception;

    Livehospital findLhById(Integer cyId) throws Exception;

    Sjwkjzssrecord findSjById(Integer sjId) throws Exception;

    Jzrecord findNdjzById(Integer ndId) throws Exception;

    Qjyyrecord findYyById(Integer yyId) throws Exception;

    Qjbrrecord findQjbrById(Integer qjbrId) throws Exception;

    void delTimeQj(Integer qjId) throws Exception;

    void delTimeJzyj(Integer jzyjId) throws Exception;

    void delTimeKs(Integer ksId) throws Exception;

    void delTimeDg(Integer dgId) throws Exception;

    void delCyzg(Integer cyId) throws Exception;

    void delSjbr(Integer sjbrId) throws Exception;

    void delNdjz(Integer ndjzId) throws Exception;

    void delYyjl(Integer yyId) throws Exception;

    void delCsBr(Integer csBrId) throws Exception;

    void addRecordType(Recordtype recordtype) throws Exception;

    Recordtype findRecordTypeById(Integer rtId) throws Exception;

    void delRecordTypeById(Integer rtId) throws Exception;
}
