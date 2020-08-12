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
public class Sjwkjzssrecord extends Model<Sjwkjzssrecord> {

    private static final long serialVersionUID = 1L;

    @TableId("SJID")
    private Integer sjId;
    @TableField("BRNAME")
    private String brName;
    @TableField("BRSEX")
    private String brSex;
    @TableField("BRAGE")
    private Integer brAge;
    @TableField("ZYNUM")
    private String zyNum;
    @TableField("ZHENDUAN")
    private String zhenduan;
    @TableField("INYTIME")
    private Date inyTime;
    @TableField("SHOUSHUTIME")
    private Date shoushuTime;
    @TableField("USERID")
    private Integer userId;
    @TableField("CREATEDATESJ")
    private Date createDatesj;
    @TableField("TYPEID")
    private String typId;

    public Integer getSjId() {
        return sjId;
    }

    public void setSjId(Integer sjId) {
        this.sjId = sjId;
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

    public Integer getBrAge() {
        return brAge;
    }

    public void setBrAge(Integer brAge) {
        this.brAge = brAge;
    }

    public String getZyNum() {
        return zyNum;
    }

    public void setZyNum(String zyNum) {
        this.zyNum = zyNum;
    }

    public String getZhenduan() {
        return zhenduan;
    }

    public void setZhenduan(String zhenduan) {
        this.zhenduan = zhenduan;
    }

    public Date getInyTime() {
        return inyTime;
    }

    public void setInyTime(Date inyTime) {
        this.inyTime = inyTime;
    }

    public Date getShoushuTime() {
        return shoushuTime;
    }

    public void setShoushuTime(Date shoushuTime) {
        this.shoushuTime = shoushuTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getCreateDatesj() {
        return createDatesj;
    }

    public void setCreateDatesj(Date createDatesj) {
        this.createDatesj = createDatesj;
    }

    public String getTypId() {
        return typId;
    }

    public void setTypId(String typId) {
        this.typId = typId;
    }

    @Override
    public String toString() {
        return "Sjwkjzssrecord{" +
                "sjId=" + sjId +
                ", brName='" + brName + '\'' +
                ", brSex='" + brSex + '\'' +
                ", brAge=" + brAge +
                ", zyNum=" + zyNum +
                ", zhenduan='" + zhenduan + '\'' +
                ", inyTime=" + inyTime +
                ", shoushuTime=" + shoushuTime +
                ", userId=" + userId +
                ", createDatesj=" + createDatesj +
                ", typId='" + typId + '\'' +
                "} " + super.toString();
    }

    @Override
    protected Serializable pkVal() {
        return this.sjId;
    }
}
