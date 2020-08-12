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
public class Jzrecord extends Model<Jzrecord> {

    private static final long serialVersionUID = 1L;

    @TableId("JZRECORD_ID")
    private Integer jzrecordId;
    @TableField("BRNAME")
    private String brName;
    @TableField("BRSEX")
    private String brSex;
    @TableField("BRAGE")
    private String brAge;
    @TableField("CAUSE")
    private String cause;
    @TableField("SHENZHI")
    private String shenzhi;
    @TableField("MAIBO")
    private String maibo;
    @TableField("TIWEN")
    private String tiwen;
    @TableField("XUEYANG")
    private String xueyang;
    @TableField("XUEYA")
    private String xueya;
    @TableField("HUXI")
    private String huxi;
    @TableField("PANDUAN")
    private String panduan;
    @TableField("BINGQING")
    private String bingqing;
    @TableField("JZFZCHECK")
    private String jzfzCheck;
    @TableField("JZCHULI")
    private String jzchuli;
    @TableField("INJZTIME")
    private Date injzTime;
    @TableField("OUTJZTIME")
    private Date outjzTime;
    @TableField("QUXIANG")
    private String quxiang;
    @TableField("DOCTORNAME")
    private String doctorName;
    @TableField("HUSHINAME")
    private String hushiName;
    @TableField("PEISONGNAME")
    private String peisongName;
    @TableField("USERID")
    private Integer userId;
    @TableField("CREATETIME")
    private Date creattime;
    @TableField("TYPEID")
    private String typeId;

    public Integer getJzrecordId() {
        return jzrecordId;
    }

    public void setJzrecordId(Integer jzrecordId) {
        this.jzrecordId = jzrecordId;
    }

    public String getBrName() {
        return brName;
    }

    public void setBrName(String brName) {
        this.brName = brName;
    }

    public String getBrSex() {
        return brSex;
    }

    public void setBrSex(String brSex) {
        this.brSex = brSex;
    }

    public String getBrAge() {
        return brAge;
    }

    public void setBrAge(String brAge) {
        this.brAge = brAge;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public String getShenzhi() {
        return shenzhi;
    }

    public void setShenzhi(String shenzhi) {
        this.shenzhi = shenzhi;
    }

    public String getMaibo() {
        return maibo;
    }

    public void setMaibo(String maibo) {
        this.maibo = maibo;
    }

    public String getTiwen() {
        return tiwen;
    }

    public void setTiwen(String tiwen) {
        this.tiwen = tiwen;
    }

    public String getXueyang() {
        return xueyang;
    }

    public void setXueyang(String xueyang) {
        this.xueyang = xueyang;
    }

    public String getXueya() {
        return xueya;
    }

    public void setXueya(String xueya) {
        this.xueya = xueya;
    }

    public String getHuxi() {
        return huxi;
    }

    public void setHuxi(String huxi) {
        this.huxi = huxi;
    }

    public String getPanduan() {
        return panduan;
    }

    public void setPanduan(String panduan) {
        this.panduan = panduan;
    }

    public String getBingqing() {
        return bingqing;
    }

    public void setBingqing(String bingqing) {
        this.bingqing = bingqing;
    }

    public String getJzfzCheck() {
        return jzfzCheck;
    }

    public void setJzfzCheck(String jzfzCheck) {
        this.jzfzCheck = jzfzCheck;
    }

    public String getJzchuli() {
        return jzchuli;
    }

    public void setJzchuli(String jzchuli) {
        this.jzchuli = jzchuli;
    }

    public Date getInjzTime() {
        return injzTime;
    }

    public void setInjzTime(Date injzTime) {
        this.injzTime = injzTime;
    }

    public Date getOutjzTime() {
        return outjzTime;
    }

    public void setOutjzTime(Date outjzTime) {
        this.outjzTime = outjzTime;
    }

    public String getQuxiang() {
        return quxiang;
    }

    public void setQuxiang(String quxiang) {
        this.quxiang = quxiang;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getHushiName() {
        return hushiName;
    }

    public void setHushiName(String hushiName) {
        this.hushiName = hushiName;
    }

    public String getPeisongName() {
        return peisongName;
    }

    public void setPeisongName(String peisongName) {
        this.peisongName = peisongName;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getCreattime() {
        return creattime;
    }

    public void setCreattime(Date creatTime) {
        this.creattime = creatTime;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    @Override
    public String toString() {
        return "Jzrecord{" +
                "jzrecordId=" + jzrecordId +
                ", brName='" + brName + '\'' +
                ", brSex='" + brSex + '\'' +
                ", brAge='" + brAge + '\'' +
                ", cause='" + cause + '\'' +
                ", shenzhi='" + shenzhi + '\'' +
                ", maibo='" + maibo + '\'' +
                ", tiwen='" + tiwen + '\'' +
                ", xueyang='" + xueyang + '\'' +
                ", xueya='" + xueya + '\'' +
                ", huxi='" + huxi + '\'' +
                ", panduan='" + panduan + '\'' +
                ", bingqing='" + bingqing + '\'' +
                ", jzfzCheck='" + jzfzCheck + '\'' +
                ", jzchuli='" + jzchuli + '\'' +
                ", injzTime=" + injzTime +
                ", outjzTime=" + outjzTime +
                ", quxiang='" + quxiang + '\'' +
                ", doctorName='" + doctorName + '\'' +
                ", hushiName='" + hushiName + '\'' +
                ", peisongName='" + peisongName + '\'' +
                ", userId='" + userId + '\'' +
                ", creatTime=" + creattime +
                ", typeId='" + typeId + '\'' +
                "} " + super.toString();
    }

    @Override
    protected Serializable pkVal() {
        return this.jzrecordId;
    }
}
