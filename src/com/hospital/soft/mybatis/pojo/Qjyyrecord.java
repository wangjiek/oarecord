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
public class Qjyyrecord extends Model<Qjyyrecord> {

    private static final long serialVersionUID = 1L;

    @TableId("QJID")
    private Integer qjId;
    @TableField("QJTIME")
    private Date qjTime;
    @TableField("YIZHUINFO")
    private String yizhuInfo;
    @TableField("DOCTORNAME")
    private String doctorName;
    @TableField("HUSHINAME")
    private String hushiName;
    @TableField("USERID")
    private Integer userId;
    @TableField("CREATETIMEJ")
    private Date createTimej;
    @TableField("QJRESULT")
    private String qjresult;
    @TableField("NOWRESULT")
    private String nowresult;
    @TableField("CHAGEKS")
    private String chageks;
    @TableField("CHAGEYY")
    private String chageyy;
    @TableField("CHAGETIME")
    private Date chageTime;
    @TableField("PEIPEOPLE")
    private String peipeople;
    @TableField("QJPEOPLE")
    private String qjpeople;
    @TableField("TYPEID")
    private String typeId;

    public Integer getQjId() {
        return qjId;
    }

    public void setQjId(Integer qjId) {
        this.qjId = qjId;
    }

    public Date getQjTime() {
        return qjTime;
    }

    public void setQjTime(Date qjTime) {
        this.qjTime = qjTime;
    }

    public String getYizhuInfo() {
        return yizhuInfo;
    }

    public void setYizhuInfo(String yizhuInfo) {
        this.yizhuInfo = yizhuInfo;
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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getCreateTimej() {
        return createTimej;
    }

    public void setCreateTimej(Date createTimej) {
        this.createTimej = createTimej;
    }

    public String getQjresult() {
        return qjresult;
    }

    public void setQjresult(String qjresult) {
        this.qjresult = qjresult;
    }

    public String getNowresult() {
        return nowresult;
    }

    public void setNowresult(String nowresult) {
        this.nowresult = nowresult;
    }

    public String getChageks() {
        return chageks;
    }

    public void setChageks(String chageks) {
        this.chageks = chageks;
    }

    public String getChageyy() {
        return chageyy;
    }

    public void setChageyy(String chageyy) {
        this.chageyy = chageyy;
    }

    public Date getChageTime() {
        return chageTime;
    }

    public void setChageTime(Date chageTime) {
        this.chageTime = chageTime;
    }

    public String getPeipeople() {
        return peipeople;
    }

    public void setPeipeople(String peipeople) {
        this.peipeople = peipeople;
    }

    public String getQjpeople() {
        return qjpeople;
    }

    public void setQjpeople(String qjpeople) {
        this.qjpeople = qjpeople;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    @Override
    public String toString() {
        return "Qjyyrecord{" +
                "qjId=" + qjId +
                ", qjTime=" + qjTime +
                ", yizhuInfo='" + yizhuInfo + '\'' +
                ", doctorName='" + doctorName + '\'' +
                ", hushiName='" + hushiName + '\'' +
                ", userId=" + userId +
                ", createTimej=" + createTimej +
                ", qjresult='" + qjresult + '\'' +
                ", nowresult='" + nowresult + '\'' +
                ", chageks='" + chageks + '\'' +
                ", chageyy='" + chageyy + '\'' +
                ", chageTime=" + chageTime +
                ", peipeople='" + peipeople + '\'' +
                ", qjpeople='" + qjpeople + '\'' +
                ", typeId='" + typeId + '\'' +
                "} " + super.toString();
    }

    @Override
    protected Serializable pkVal() {
        return this.qjId;
    }
}
