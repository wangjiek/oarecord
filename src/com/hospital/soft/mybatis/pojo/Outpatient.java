package com.hospital.soft.mybatis.pojo;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 *
 * </p>
 *
 * @author lqh123
 * @since 2020-07-31
 */
public class Outpatient extends Model<Outpatient> {

    private static final long serialVersionUID = 1L;

    @TableId("OUTPATIENT_ID")
    private Integer outpatientId;
    /**
     * 病人名称
     */
    @TableField("PATIENTNAME")
    private String patientname;
    /**
     * 门诊id
     */
    @TableField("MZID")
    private String mzId;
    /**
     * 住院id
     */
    @TableField("ZYID")
    private String zyId;
    /**
     * 身份证
     */
    @TableField("IDCARD")
    private String idCard;
    /**
     * 性别
     */
    @TableField("SEX")
    private String sex;
    /**
     * 年龄
     */
    @TableField("AGE")
    private String age;
    /**
     * 发病地址
     */
    @TableField("FBADDRESS")
    private String fbAddress;
    /**
     * 发病时间
     */
    @TableField("FBTIME")
    private Date fbtime;
    /**
     * 呼叫120时间
     */
    @TableField("CALLOUTTIME")
    private Date callouttime;
    /**
     * 首次医疗接触时间
     */
    @TableField("SCYLJCTIME")
    private Date scyljcTime;
    /**
     * 网络医院入门时间
     */
    @TableField("WLYYINTIME")
    private Date wlyyinTime;
    /**
     * 转诊出门时间
     */
    @TableField("ZZCMTIME")
    private Date zzcmTime;
    /**
     * 院前首份心电图时间
     */
    @TableField("YQSFXDTTIME")
    private Date yqsfxdtTime;
    /**
     * 院前首份心电图确诊时间
     */
    @TableField("CONFIRMEDTIME")
    private Date confirmedTime;
    /**
     * 远程传输心电图0是1否
     */
    @TableField("YCXDTCS")
    private String ycxdtcs;
    /**
     * 传输时间
     */
    @TableField("CSTIME")
    private Date csTime;
    /**
     * 传输方式0微信1短信,2实时监控
     */
    @TableField("CSWAY")
    private String csWay;
    /**
     * 双联抗血小板药物给药0是1否
     */
    @TableField("GYSF")
    private String gysf;
    /**
     * 给药时间
     */
    @TableField("GYTIME")
    private Date gyTime;
    /**
     * 阿司匹林
     */
    @TableField("ASSIZE")
    private String asSize;
    /**
     * 替格瑞洛
     */
    @TableField("TGSIZE")
    private String tgSize;
    /**
     * 氯吡格雷
     */
    @TableField("LPSIZE")
    private String lpSize;
    /**
     * 院前溶栓筛查0适合1不适合2为筛查
     */
    @TableField("RSSC")
    private String rssc;
    /**
     * 是否实施院前溶栓0有1无
     */
    @TableField("SFYQRS")
    private String sfyqrs;
    /**
     * 溶栓场所0其它医院1救护车
     */
    @TableField("RSCS")
    private String rscs;
    /**
     * 院前溶栓知情同意开始时间
     */
    @TableField("YQRSBEGINTIME")
    private Date yqrsBeginTime;
    /**
     * 签署知情同意时间
     */
    @TableField("QSZTTYTIME")
    private Date qszttyTime;
    /**
     * 院前溶栓开始时间
     */
    @TableField("QSRSBEGINTIME")
    private Date qsrsbeginTime;
    /**
     * 院前溶栓结束时间
     */
    @TableField("QSRSENDTIME")
    private Date qsrsendTime;
    /**
     * 溶栓后造影时间
     */
    @TableField("RSHZYTIME")
    private Date rshzyTime;
    /**
     * 院前溶栓药物0一代1二代2三代
     */
    @TableField("YQRSYW")
    private String yqrsyw;
    /**
     * 院前溶栓药物0半量1全量
     */
    @TableField("YQRSYWSIZE")
    private String yqrsywSize;
    /**
     * 溶栓再通0是1否
     */
    @TableField("RSZT")
    private String rszt;
    /**
     * 诊断0STEMI1NSTEMI2UA3主动脉夹层4肺动脉栓塞5其他
     */
    @TableField("DIAGNOSE")
    private String diagnose;
    /**
     * 转运至 CPC,0导管室，急诊
     */
    @TableField("ZYZCPC")
    private String zyzCPC;
    @TableField("USERID")
    private Integer userId;
    @TableField("TIMEADMINTYPE")
    private Date timeAdminType;
    @TableField("TYPEID")
    private String typeId;

    public Integer getOutpatientId() {
        return outpatientId;
    }

    public void setOutpatientId(Integer outpatientId) {
        this.outpatientId = outpatientId;
    }

    public String getPatientname() {
        return patientname;
    }

    public void setPatientname(String patientname) {
        this.patientname = patientname;
    }

    public String getMzId() {
        return mzId;
    }

    public void setMzId(String mzId) {
        this.mzId = mzId;
    }

    public String getZyId() {
        return zyId;
    }

    public void setZyId(String zyId) {
        this.zyId = zyId;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getFbAddress() {
        return fbAddress;
    }

    public void setFbAddress(String fbAddress) {
        this.fbAddress = fbAddress;
    }

    public Date getFbtime() {
        return fbtime;
    }

    public void setFbtime(Date fbtime) {
        this.fbtime = fbtime;
    }

    public Date getCallouttime() {
        return callouttime;
    }

    public void setCallouttime(Date callouttime) {
        this.callouttime = callouttime;
    }

    public Date getScyljcTime() {
        return scyljcTime;
    }

    public void setScyljcTime(Date scyljcTime) {
        this.scyljcTime = scyljcTime;
    }

    public Date getWlyyinTime() {
        return wlyyinTime;
    }

    public void setWlyyinTime(Date wlyyinTime) {
        this.wlyyinTime = wlyyinTime;
    }

    public Date getZzcmTime() {
        return zzcmTime;
    }

    public void setZzcmTime(Date zzcmTime) {
        this.zzcmTime = zzcmTime;
    }

    public Date getYqsfxdtTime() {
        return yqsfxdtTime;
    }

    public void setYqsfxdtTime(Date yqsfxdtTime) {
        this.yqsfxdtTime = yqsfxdtTime;
    }

    public Date getConfirmedTime() {
        return confirmedTime;
    }

    public void setConfirmedTime(Date confirmedTime) {
        this.confirmedTime = confirmedTime;
    }

    public String getYcxdtcs() {
        return ycxdtcs;
    }

    public void setYcxdtcs(String ycxdtcs) {
        this.ycxdtcs = ycxdtcs;
    }

    public Date getCsTime() {
        return csTime;
    }

    public void setCsTime(Date csTime) {
        this.csTime = csTime;
    }

    public String getCsWay() {
        return csWay;
    }

    public void setCsWay(String csWay) {
        this.csWay = csWay;
    }

    public String getGysf() {
        return gysf;
    }

    public void setGysf(String gysf) {
        this.gysf = gysf;
    }

    public Date getGyTime() {
        return gyTime;
    }

    public void setGyTime(Date gyTime) {
        this.gyTime = gyTime;
    }

    public String getAsSize() {
        return asSize;
    }

    public void setAsSize(String asSize) {
        this.asSize = asSize;
    }

    public String getTgSize() {
        return tgSize;
    }

    public void setTgSize(String tgSize) {
        this.tgSize = tgSize;
    }

    public String getLpSize() {
        return lpSize;
    }

    public void setLpSize(String lpSize) {
        this.lpSize = lpSize;
    }

    public String getRssc() {
        return rssc;
    }

    public void setRssc(String rssc) {
        this.rssc = rssc;
    }

    public String getSfyqrs() {
        return sfyqrs;
    }

    public void setSfyqrs(String sfyqrs) {
        this.sfyqrs = sfyqrs;
    }

    public String getRscs() {
        return rscs;
    }

    public void setRscs(String rscs) {
        this.rscs = rscs;
    }

    public Date getYqrsBeginTime() {
        return yqrsBeginTime;
    }

    public void setYqrsBeginTime(Date yqrsBeginTime) {
        this.yqrsBeginTime = yqrsBeginTime;
    }

    public Date getQszttyTime() {
        return qszttyTime;
    }

    public void setQszttyTime(Date qszttyTime) {
        this.qszttyTime = qszttyTime;
    }

    public Date getQsrsbeginTime() {
        return qsrsbeginTime;
    }

    public void setQsrsbeginTime(Date qsrsbeginTime) {
        this.qsrsbeginTime = qsrsbeginTime;
    }

    public Date getQsrsendTime() {
        return qsrsendTime;
    }

    public void setQsrsendTime(Date qsrsendTime) {
        this.qsrsendTime = qsrsendTime;
    }

    public Date getRshzyTime() {
        return rshzyTime;
    }

    public void setRshzyTime(Date rshzyTime) {
        this.rshzyTime = rshzyTime;
    }

    public String getYqrsyw() {
        return yqrsyw;
    }

    public void setYqrsyw(String yqrsyw) {
        this.yqrsyw = yqrsyw;
    }

    public String getYqrsywSize() {
        return yqrsywSize;
    }

    public void setYqrsywSize(String yqrsywSize) {
        this.yqrsywSize = yqrsywSize;
    }

    public String getRszt() {
        return rszt;
    }

    public void setRszt(String rszt) {
        this.rszt = rszt;
    }

    public String getDiagnose() {
        return diagnose;
    }

    public void setDiagnose(String diagnose) {
        this.diagnose = diagnose;
    }

    public String getZyzCPC() {
        return zyzCPC;
    }

    public void setZyzCPC(String zyzCPC) {
        this.zyzCPC = zyzCPC;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getTimeAdminType() {
        return timeAdminType;
    }

    public void setTimeAdminType(Date timeAdminType) {
        this.timeAdminType = timeAdminType;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    @Override
    public String toString() {
        return "Outpatient{" +
                "outpatientId=" + outpatientId +
                ", patientname='" + patientname + '\'' +
                ", mzId='" + mzId + '\'' +
                ", zyId='" + zyId + '\'' +
                ", idCard='" + idCard + '\'' +
                ", sex='" + sex + '\'' +
                ", age='" + age + '\'' +
                ", fbAddress='" + fbAddress + '\'' +
                ", fbtime=" + fbtime +
                ", callouttime=" + callouttime +
                ", scyljcTime=" + scyljcTime +
                ", wlyyinTime=" + wlyyinTime +
                ", zzcmTime=" + zzcmTime +
                ", yqsfxdtTime=" + yqsfxdtTime +
                ", confirmedTime=" + confirmedTime +
                ", ycxdtcs='" + ycxdtcs + '\'' +
                ", csTime=" + csTime +
                ", csWay='" + csWay + '\'' +
                ", gysf='" + gysf + '\'' +
                ", gyTime=" + gyTime +
                ", asSize='" + asSize + '\'' +
                ", tgSize='" + tgSize + '\'' +
                ", lpSize='" + lpSize + '\'' +
                ", rssc='" + rssc + '\'' +
                ", sfyqrs='" + sfyqrs + '\'' +
                ", rscs='" + rscs + '\'' +
                ", yqrsBeginTime=" + yqrsBeginTime +
                ", qszttyTime=" + qszttyTime +
                ", qsrsbeginTime=" + qsrsbeginTime +
                ", qsrsendTime=" + qsrsendTime +
                ", rshzyTime=" + rshzyTime +
                ", yqrsyw='" + yqrsyw + '\'' +
                ", yqrsywSize='" + yqrsywSize + '\'' +
                ", rszt='" + rszt + '\'' +
                ", diagnose='" + diagnose + '\'' +
                ", zyzCPC='" + zyzCPC + '\'' +
                ", userId='" + userId + '\'' +
                ", timeAdminType=" + timeAdminType +
                ", typeId='" + typeId + '\'' +
                "} " + super.toString();
    }

    @Override
    protected Serializable pkVal() {
        return this.outpatientId;
    }
}
