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
public class Kscheck extends Model<Kscheck> {

    private static final long serialVersionUID = 1L;

    @TableId("KSCHECK_ID")
    private Integer kscheckId;
    /**
     * 院内首份心电图时间
     */
    @TableField("YNSCXDTTIME")
    private Date ynscxdTime;
    /**
     * 院内首份心电图确诊时间
     */
    @TableField("QZXDTTIME")
    private Date qzxdtTime;
    /**
     * 病情评估及合并情况:0持续性症状1间断性症状2胸痛症状已缓解3腹痛4齿痛5肩背痛6呼吸困难7休克8突发意识丧失9合并心衰10合并恶性心律失常11合并出血
     */
    @TableField("BQPGITEM")
    private String bqpgItem;
    /**
     * 肌 钙蛋白 抽 血完 成 时间
     */
    @TableField("GJDBCXTIME")
    private Date gjdbcxTime;
    /**
     * 报告时间
     */
    @TableField("BGNUM")
    private String bgNum;
    /**
     * 获得 报 告时 间
     */
    @TableField("BGTIME")
    private Date bgTime;
    /**
     * 实验室检查Cr
     */
    @TableField("CRNUM")
    private String crNum;
    /**
     * 实验室检查D-dimer
     */
    @TableField("DDIMERNUM")
    private String ddimerNum;
    /**
     * 实验室检查BNP/NT-proBNP
     */
    @TableField("PROBNPNUM")
    private String probnpNum;
    /**
     * 通知心超检查时间
     */
    @TableField("TZXCTIME")
    private Date tzxcTime;
    /**
     * 心超检查完成时间
     */
    @TableField("XCJCTIME")
    private Date xcjcTime;
    /**
     * 通知 CT 检查时间
     */
    @TableField("TZCTTIME")
    private Date tzctTime;
    /**
     * 增强 CT 检查开始时间
     */
    @TableField("QCCTTIME")
    private Date qcctTime;
    /**
     * 诊断0STEMI1NSTEMI2UA3主动脉夹层4肺栓塞5非 ACS 胸痛6其它非心源性胸痛7放弃诊治，病因不明
     */
    @TableField("ZHENDUAN")
    private String zhenduan;
    /**
     * 诊断时间
     */
    @TableField("ZHENDUANTIME")
    private Date zhenduanTime;
    /**
     * 是否呼叫心内科会诊0是1否
     */
    @TableField("IFXNDOCTOR")
    private String ifxnDoctor;
    /**
     * 是否呼叫心内科会诊
     */
    @TableField("CALLTIME")
    private Date callTime;
    /**
     * 二线会诊时间
     */
    @TableField("SENDTIME")
    private Date sendTime;
    /**
     * 会诊医师签名
     */
    @TableField("HZDOCTORNAME")
    private String hzDoctorName;
    /**
     * 心内诊断0STEMI1NSTEMI2UA3主动脉夹层4肺栓塞5非ACS 胸痛6其它非心源性胸痛7放弃诊治，病因不明
     */
    @TableField("XNZHENDUAN")
    private String xnzhenduan;
    /**
     * 决定介入手术时间
     */
    @TableField("JDJRSSTIME")
    private Date jdjrssTime;
    /**
     * 启动导管室时间
     */
    @TableField("QDDGTIME")
    private Date qddgTime;
    /**
     * 开始知情同意时间
     */
    @TableField("BEGINTYTIME")
    private Date begintyTime;
    /**
     * 签署知情同意书时间
     */
    @TableField("XSTYTIME")
    private Date xstyTime;
    /**
     * 院内溶栓筛查0是1否
     */
    @TableField("YNRSJC")
    private String ynrsjc;
    /**
     * 实施院内溶栓0有1无
     */
    @TableField("SSYNRS")
    private String ssynrs;
    /**
     * 溶栓开始时间
     */
    @TableField("RSBEGINTIME")
    private Date rsbeginTime;
    /**
     * 溶栓结束时间
     */
    @TableField("RSENDTIME")
    private Date rsendTime;
    /**
     * 溶栓后造影时间
     */
    @TableField("RSAFTERTIME")
    private Date rsafterTime;
    /**
     * 溶栓药物 0一代1二代2三代
     */
    @TableField("RSYW")
    private String rsyw;
    /**
     * 溶栓药物剂量0半量1全量
     */
    @TableField("RSYWSIZE")
    private String rsywSize;
    /**
     * 溶栓再通 0 是1 否
     */
    @TableField("RSZT")
    private String rszt;
    /**
     * 复测心电图时间
     */
    @TableField("FCXDTTIME")
    private Date fcxdtTime;
    /**
     * 肌钙蛋白复测结果
     */
    @TableField("JGDBRESULT")
    private String jgdbResult;
    /**
     * 复测肌钙蛋白抽血完成时间
     */
    @TableField("JGDBTIME")
    private Date jgdbTime;
    /**
     * 复测肌钙蛋白报告时间
     */
    @TableField("JGDBBGTIME")
    private Date jgdbbgTime;
    /**
     * Grace分层 0极高危 1高危 2中危 3低危
     */
    @TableField("GRACE")
    private String grace;
    /**
     * :0药物治疗无法控制的顽固性心绞痛1严重心衰2危及生命的室性心率失常3血流动力学不稳定或心源性休克4心肌梗死的机械并发症
     */
    @TableField("WEIITEM")
    private String weiItem;
    /**
     * 诊断0STEMI 1NSTEMI 2UA 3主动脉夹层 4肺栓塞 5非 ACS 胸痛
     */
    @TableField("ZDINFO")
    private String zdInfo;
    /**
     * Killip分级 0I 1 II 3III 4IV
     */
    @TableField("KILLIP")
    private String killip;
    /**
     * NYHA分级 0I 1 II 3III 4IV
     */
    @TableField("NYHA")
    private String nyha;
    /**
     * 0药物无法控制的顽固性心绞痛1危及生命的室性心率失常2血流动力学不稳或心源性休克3血流动力学不稳或心源性休克4严重心衰
     */
    @TableField("GAOWEIITEM")
    private String gaoweiItem;
    /**
     * STEMI再灌注措施:0急诊PCI1溶栓2补救PCI3急诊仅造影4择期PCI5转运 PCI6择期仅造影7CABG8无再灌注措施8其它
     */
    @TableField("SETMI")
    private String setmi;
    /**
     * NSTE-ACS  血运重建措施:0紧急 PCI1紧急仅造影2转运324h 内介入472h 内介入5早期仅造影6择期介入7保守治疗8CABG其它
     */
    @TableField("NSTEACS")
    private String nsteacs;
    /**
     * 实际介入时间
     */
    @TableField("SJJRTIME")
    private Date sjjrTime;
    /**
     * 双联抗血小板药物给药时间
     */
    @TableField("SLKXXBGYTIME")
    private Date slkxxbgyTime;
    /**
     * 阿司匹林
     */
    @TableField("KSASNUM")
    private String ksasNum;
    /**
     * 替格瑞洛
     */
    @TableField("KSTGRLNUM")
    private String kstgrlNum;
    /**
     * 氯吡格雷
     */
    @TableField("KQBGLNUM")
    private String kqbglNum;
    /**
     * 24h他汀治疗 0是1否
     */
    @TableField("TDZL")
    private String tdzl;
    /**
     * 受体阻滞剂使用 0是1否
     */
    @TableField("AEF")
    private String aef;
    @TableField("USERID")
    private Integer userId;
    @TableField("TIMEADMINTYPE")
    private Date timeAdminType;
    @TableField("TYPEID")
    private String typeId;


    public Integer getKscheckId() {
        return kscheckId;
    }

    public void setKscheckId(Integer kscheckId) {
        this.kscheckId = kscheckId;
    }

    public Date getYnscxdTime() {
        return ynscxdTime;
    }

    public void setYnscxdTime(Date ynscxdTime) {
        this.ynscxdTime = ynscxdTime;
    }

    public Date getQzxdtTime() {
        return qzxdtTime;
    }

    public void setQzxdtTime(Date qzxdtTime) {
        this.qzxdtTime = qzxdtTime;
    }

    public String getBqpgItem() {
        return bqpgItem;
    }

    public void setBqpgItem(String bqpgItem) {
        this.bqpgItem = bqpgItem;
    }

    public Date getGjdbcxTime() {
        return gjdbcxTime;
    }

    public void setGjdbcxTime(Date gjdbcxTime) {
        this.gjdbcxTime = gjdbcxTime;
    }

    public String getBgNum() {
        return bgNum;
    }

    public void setBgNum(String bgNum) {
        this.bgNum = bgNum;
    }

    public Date getBgTime() {
        return bgTime;
    }

    public void setBgTime(Date bgTime) {
        this.bgTime = bgTime;
    }

    public String getCrNum() {
        return crNum;
    }

    public void setCrNum(String crNum) {
        this.crNum = crNum;
    }

    public String getDdimerNum() {
        return ddimerNum;
    }

    public void setDdimerNum(String ddimerNum) {
        this.ddimerNum = ddimerNum;
    }

    public String getProbnpNum() {
        return probnpNum;
    }

    public void setProbnpNum(String probnpNum) {
        this.probnpNum = probnpNum;
    }

    public Date getTzxcTime() {
        return tzxcTime;
    }

    public void setTzxcTime(Date tzxcTime) {
        this.tzxcTime = tzxcTime;
    }

    public Date getXcjcTime() {
        return xcjcTime;
    }

    public void setXcjcTime(Date xcjcTime) {
        this.xcjcTime = xcjcTime;
    }

    public Date getTzctTime() {
        return tzctTime;
    }

    public void setTzctTime(Date tzctTime) {
        this.tzctTime = tzctTime;
    }

    public Date getQcctTime() {
        return qcctTime;
    }

    public void setQcctTime(Date qcctTime) {
        this.qcctTime = qcctTime;
    }

    public String getZhenduan() {
        return zhenduan;
    }

    public void setZhenduan(String zhenduan) {
        this.zhenduan = zhenduan;
    }

    public Date getZhenduanTime() {
        return zhenduanTime;
    }

    public void setZhenduanTime(Date zhenduanTime) {
        this.zhenduanTime = zhenduanTime;
    }

    public String getIfxnDoctor() {
        return ifxnDoctor;
    }

    public void setIfxnDoctor(String ifxnDoctor) {
        this.ifxnDoctor = ifxnDoctor;
    }

    public Date getCallTime() {
        return callTime;
    }

    public void setCallTime(Date callTime) {
        this.callTime = callTime;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public String getHzDoctorName() {
        return hzDoctorName;
    }

    public void setHzDoctorName(String hzDoctorName) {
        this.hzDoctorName = hzDoctorName;
    }

    public String getXnzhenduan() {
        return xnzhenduan;
    }

    public void setXnzhenduan(String xnzhenduan) {
        this.xnzhenduan = xnzhenduan;
    }

    public Date getJdjrssTime() {
        return jdjrssTime;
    }

    public void setJdjrssTime(Date jdjrssTime) {
        this.jdjrssTime = jdjrssTime;
    }

    public Date getQddgTime() {
        return qddgTime;
    }

    public void setQddgTime(Date qddgTime) {
        this.qddgTime = qddgTime;
    }

    public Date getBegintyTime() {
        return begintyTime;
    }

    public void setBegintyTime(Date begintyTime) {
        this.begintyTime = begintyTime;
    }

    public Date getXstyTime() {
        return xstyTime;
    }

    public void setXstyTime(Date xstyTime) {
        this.xstyTime = xstyTime;
    }

    public String getYnrsjc() {
        return ynrsjc;
    }

    public void setYnrsjc(String ynrsjc) {
        this.ynrsjc = ynrsjc;
    }

    public String getSsynrs() {
        return ssynrs;
    }

    public void setSsynrs(String ssynrs) {
        this.ssynrs = ssynrs;
    }

    public Date getRsbeginTime() {
        return rsbeginTime;
    }

    public void setRsbeginTime(Date rsbeginTime) {
        this.rsbeginTime = rsbeginTime;
    }

    public Date getRsendTime() {
        return rsendTime;
    }

    public void setRsendTime(Date rsendTime) {
        this.rsendTime = rsendTime;
    }

    public Date getRsafterTime() {
        return rsafterTime;
    }

    public void setRsafterTime(Date rsafterTime) {
        this.rsafterTime = rsafterTime;
    }

    public String getRsyw() {
        return rsyw;
    }

    public void setRsyw(String rsyw) {
        this.rsyw = rsyw;
    }

    public String getRsywSize() {
        return rsywSize;
    }

    public void setRsywSize(String rsywSize) {
        this.rsywSize = rsywSize;
    }

    public String getRszt() {
        return rszt;
    }

    public void setRszt(String rszt) {
        this.rszt = rszt;
    }

    public Date getFcxdtTime() {
        return fcxdtTime;
    }

    public void setFcxdtTime(Date fcxdtTime) {
        this.fcxdtTime = fcxdtTime;
    }

    public String getJgdbResult() {
        return jgdbResult;
    }

    public void setJgdbResult(String jgdbResult) {
        this.jgdbResult = jgdbResult;
    }

    public Date getJgdbTime() {
        return jgdbTime;
    }

    public void setJgdbTime(Date jgdbTime) {
        this.jgdbTime = jgdbTime;
    }

    public Date getJgdbbgTime() {
        return jgdbbgTime;
    }

    public void setJgdbbgTime(Date jgdbbgTime) {
        this.jgdbbgTime = jgdbbgTime;
    }

    public String getGrace() {
        return grace;
    }

    public void setGrace(String grace) {
        this.grace = grace;
    }

    public String getWeiItem() {
        return weiItem;
    }

    public void setWeiItem(String weiItem) {
        this.weiItem = weiItem;
    }

    public String getZdInfo() {
        return zdInfo;
    }

    public void setZdInfo(String zdInfo) {
        this.zdInfo = zdInfo;
    }

    public String getKillip() {
        return killip;
    }

    public void setKillip(String killip) {
        this.killip = killip;
    }

    public String getNyha() {
        return nyha;
    }

    public void setNyha(String nyha) {
        this.nyha = nyha;
    }

    public String getGaoweiItem() {
        return gaoweiItem;
    }

    public void setGaoweiItem(String gaoweiItem) {
        this.gaoweiItem = gaoweiItem;
    }

    public String getSetmi() {
        return setmi;
    }

    public void setSetmi(String setmi) {
        this.setmi = setmi;
    }

    public String getNsteacs() {
        return nsteacs;
    }

    public void setNsteacs(String nsteacs) {
        this.nsteacs = nsteacs;
    }

    public Date getSjjrTime() {
        return sjjrTime;
    }

    public void setSjjrTime(Date sjjrTime) {
        this.sjjrTime = sjjrTime;
    }

    public Date getSlkxxbgyTime() {
        return slkxxbgyTime;
    }

    public void setSlkxxbgyTime(Date slkxxbgyTime) {
        this.slkxxbgyTime = slkxxbgyTime;
    }

    public String getKsasNum() {
        return ksasNum;
    }

    public void setKsasNum(String ksasNum) {
        this.ksasNum = ksasNum;
    }

    public String getKstgrlNum() {
        return kstgrlNum;
    }

    public void setKstgrlNum(String kstgrlNum) {
        this.kstgrlNum = kstgrlNum;
    }

    public String getKqbglNum() {
        return kqbglNum;
    }

    public void setKqbglNum(String kqbglNum) {
        this.kqbglNum = kqbglNum;
    }

    public String getTdzl() {
        return tdzl;
    }

    public void setTdzl(String tdzl) {
        this.tdzl = tdzl;
    }

    public String getAef() {
        return aef;
    }

    public void setAef(String aef) {
        this.aef = aef;
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
        return "Kscheck{" +
                "kscheckId=" + kscheckId +
                ", ynscxdTime=" + ynscxdTime +
                ", qzxdtTime=" + qzxdtTime +
                ", bqpgItem='" + bqpgItem + '\'' +
                ", gjdbcxTime=" + gjdbcxTime +
                ", bgNum='" + bgNum + '\'' +
                ", bgTime=" + bgTime +
                ", crNum='" + crNum + '\'' +
                ", ddimerNum='" + ddimerNum + '\'' +
                ", probnpNum='" + probnpNum + '\'' +
                ", tzxcTime=" + tzxcTime +
                ", xcjcTime=" + xcjcTime +
                ", tzctTime=" + tzctTime +
                ", qcctTime=" + qcctTime +
                ", zhenduan='" + zhenduan + '\'' +
                ", zhenduanTime=" + zhenduanTime +
                ", ifxnDoctor='" + ifxnDoctor + '\'' +
                ", callTime=" + callTime +
                ", sendTime=" + sendTime +
                ", hzDoctorName='" + hzDoctorName + '\'' +
                ", xnzhenduan='" + xnzhenduan + '\'' +
                ", jdjrssTime=" + jdjrssTime +
                ", qddgTime=" + qddgTime +
                ", begintyTime=" + begintyTime +
                ", xstyTime=" + xstyTime +
                ", ynrsjc='" + ynrsjc + '\'' +
                ", ssynrs='" + ssynrs + '\'' +
                ", rsbeginTime=" + rsbeginTime +
                ", rsendTime=" + rsendTime +
                ", rsafterTime=" + rsafterTime +
                ", rsyw='" + rsyw + '\'' +
                ", rsywSize='" + rsywSize + '\'' +
                ", rszt='" + rszt + '\'' +
                ", fcxdtTime=" + fcxdtTime +
                ", jgdbResult='" + jgdbResult + '\'' +
                ", jgdbTime=" + jgdbTime +
                ", jgdbbgTime=" + jgdbbgTime +
                ", grace='" + grace + '\'' +
                ", weiItem='" + weiItem + '\'' +
                ", zdinfo='" + zdInfo + '\'' +
                ", killip='" + killip + '\'' +
                ", nyha='" + nyha + '\'' +
                ", gaoweiItem='" + gaoweiItem + '\'' +
                ", setmi='" + setmi + '\'' +
                ", nsteacs='" + nsteacs + '\'' +
                ", sjjrTime=" + sjjrTime +
                ", slkxxbgyTime=" + slkxxbgyTime +
                ", ksasNum='" + ksasNum + '\'' +
                ", kstgrlNum='" + kstgrlNum + '\'' +
                ", kqbglNum='" + kqbglNum + '\'' +
                ", tdzl='" + tdzl + '\'' +
                ", aef='" + aef + '\'' +
                ", userId='" + userId + '\'' +
                ", timeAdminType=" + timeAdminType +
                ", typeId='" + typeId + '\'' +
                "} " + super.toString();
    }

    @Override
    protected Serializable pkVal() {
        return this.kscheckId;
    }
}
