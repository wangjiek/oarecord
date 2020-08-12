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
public class Jzpreview extends Model<Jzpreview> {

    private static final long serialVersionUID = 1L;

    @TableId("JZPREVIEW_ID")
    private Integer jzpreviewId;
    /**
     * 患者姓名
     */
    @TableField("JZPATIENTNAME")
    private String jzpatientName;
    @TableField("SEX")
    private String sex;
    @TableField("AGE")
    private String age;
    @TableField("FBADDRESS")
    private String fbAddress;
    /**
     * 发病时间
     */
    @TableField("FBTIME")
    private Date fbTime;
    /**
     * 到达医院大门时间
     */
    @TableField("DAODATIME")
    private Date daodaTime;
    /**
     * 院内接诊时间
     */
    @TableField("JZTIME")
    private Date jzTime;
    /**
     * 到达方式0:120救护车1外院转运2自行来院
     */
    @TableField("DDWAY")
    private String ddWay;
    /**
     * 院内发病 0否，1是
     */
    @TableField("YNFB")
    private String ynfb;
    /**
     * 发病科室
     */
    @TableField("FBKS")
    private String fbks;
    /**
     * 床位医师会诊时间
     */
    @TableField("YSHZTIME")
    private Date yshzTime;
    /**
     * 离开科室时间
     */
    @TableField("LKKETIME")
    private Date lkkeTime;
    /**
     * 生命体征0清醒1对语言有反应2对刺痛有反应3对任何刺激无反应
     */
    @TableField("SBTZ")
    private String sbtz;
    /**
     * 呼吸
     */
    @TableField("BREATHESIZE")
    private String breatheSize;
    /**
     * 脉搏
     */
    @TableField("MAIBO")
    private String maibo;
    /**
     * 心率
     */
    @TableField("XINLV")
    private Float xinlv;
    /**
     * 血压
     */
    @TableField("XUEYA")
    private String xueya;
    /**
     * 末梢血氧饱和度
     */
    @TableField("MSXYBHD")
    private String msxybhd;
    /**
     * 至胸痛诊室0是1否
     */
    @TableField("ZXTKS")
    private String zxtks;
    /**
     * 至急救科抢救室0是1否
     */
    @TableField("ZJJKS")
    private String zjjks;
    /**
     * 至导管室0是1否
     */
    @TableField("ZDGS")
    private String zdgs;
    @TableField("USERID")
    private Integer userId;
    @TableField("TIMEADMINTYPE")
    private Date timeAdminType;
    @TableField("TYPEID")
    private String typeId;

    public Integer getJzpreviewId() {
        return jzpreviewId;
    }

    public void setJzpreviewId(Integer jzpreviewId) {
        this.jzpreviewId = jzpreviewId;
    }

    public String getJzpatientName() {
        return jzpatientName;
    }

    public void setJzpatientName(String jzpatientName) {
        this.jzpatientName = jzpatientName;
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

    public Date getFbTime() {
        return fbTime;
    }

    public void setFbTime(Date fbTime) {
        this.fbTime = fbTime;
    }

    public Date getDaodaTime() {
        return daodaTime;
    }

    public void setDaodaTime(Date daodaTime) {
        this.daodaTime = daodaTime;
    }

    public Date getJzTime() {
        return jzTime;
    }

    public void setJzTime(Date jzTime) {
        this.jzTime = jzTime;
    }

    public String getDdWay() {
        return ddWay;
    }

    public void setDdWay(String ddWay) {
        this.ddWay = ddWay;
    }

    public String getYnfb() {
        return ynfb;
    }

    public void setYnfb(String ynfb) {
        this.ynfb = ynfb;
    }

    public String getFbks() {
        return fbks;
    }

    public void setFbks(String fbks) {
        this.fbks = fbks;
    }

    public Date getYshzTime() {
        return yshzTime;
    }

    public void setYshzTime(Date yshzTime) {
        this.yshzTime = yshzTime;
    }

    public Date getLkkeTime() {
        return lkkeTime;
    }

    public void setLkkeTime(Date lkkeTime) {
        this.lkkeTime = lkkeTime;
    }

    public String getSbtz() {
        return sbtz;
    }

    public void setSbtz(String sbtz) {
        this.sbtz = sbtz;
    }

    public String getBreatheSize() {
        return breatheSize;
    }

    public void setBreatheSize(String breatheSize) {
        this.breatheSize = breatheSize;
    }

    public String getMaibo() {
        return maibo;
    }

    public void setMaibo(String maibo) {
        this.maibo = maibo;
    }

    public Float getXinlv() {
        return xinlv;
    }

    public void setXinlv(Float xinlv) {
        this.xinlv = xinlv;
    }

    public String getXueya() {
        return xueya;
    }

    public void setXueya(String xueya) {
        this.xueya = xueya;
    }

    public String getMsxybhd() {
        return msxybhd;
    }

    public void setMsxybhd(String msxybhd) {
        this.msxybhd = msxybhd;
    }

    public String getZxtks() {
        return zxtks;
    }

    public void setZxtks(String zxtks) {
        this.zxtks = zxtks;
    }

    public String getZjjks() {
        return zjjks;
    }

    public void setZjjks(String zjjks) {
        this.zjjks = zjjks;
    }

    public String getZdgs() {
        return zdgs;
    }

    public void setZdgs(String zdgs) {
        this.zdgs = zdgs;
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
        return "Jzpreview{" +
                "jzpreviewId=" + jzpreviewId +
                ", jzpatientName='" + jzpatientName + '\'' +
                ", sex='" + sex + '\'' +
                ", age='" + age + '\'' +
                ", fbAddress='" + fbAddress + '\'' +
                ", fbTime=" + fbTime +
                ", daodaTime=" + daodaTime +
                ", jzTime=" + jzTime +
                ", ddWay='" + ddWay + '\'' +
                ", ynfb='" + ynfb + '\'' +
                ", fbks='" + fbks + '\'' +
                ", yshzTime=" + yshzTime +
                ", lkkeTime=" + lkkeTime +
                ", sbtz='" + sbtz + '\'' +
                ", breatheSize='" + breatheSize + '\'' +
                ", maibo='" + maibo + '\'' +
                ", xinlv=" + xinlv +
                ", xueya='" + xueya + '\'' +
                ", msxybhd='" + msxybhd + '\'' +
                ", zxtks='" + zxtks + '\'' +
                ", zjjks='" + zjjks + '\'' +
                ", zdgs='" + zdgs + '\'' +
                ", userId='" + userId + '\'' +
                ", timeAdminType=" + timeAdminType +
                ", typeId='" + typeId + '\'' +
                "} " + super.toString();
    }

    @Override
    protected Serializable pkVal() {
        return this.jzpreviewId;
    }
}
