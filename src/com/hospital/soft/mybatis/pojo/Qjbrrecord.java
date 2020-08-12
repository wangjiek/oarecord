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
public class Qjbrrecord extends Model<Qjbrrecord> {

    private static final long serialVersionUID = 1L;

    @TableId("JQBR_ID")
    private Integer jqbrId;
    @TableField("CHUANNUM")
    private String chuanNum;
    @TableField("BRNAME")
    private String brName;
    @TableField("BRSEX")
    private String brSex;
    @TableField("BRAGE")
    private String brAge;
    @TableField("BRADDRESS")
    private String brAddress;
    @TableField("CAUSE")
    private String cause;
    @TableField("JIWANGS")
    private String jiwangs;
    @TableField("GUOMINGSHI")
    private String guomingshi;
    @TableField("XUEYA")
    private String xueya;
    @TableField("HUXI")
    private String huxi;
    @TableField("MAIBO")
    private String maibo;
    @TableField("SHENZHI")
    private String shenzhi;
    @TableField("XUEYANG")
    private String xueyang;
    @TableField("TIWEN")
    private String tiwen;
    @TableField("TONGKONG2")
    private String tongkong2;
    @TableField("TONGKONG")
    private String tongkong;
    @TableField("FUZHUJIANCHA")
    private String fuzhujiancha;
    @TableField("CHUBUZD")
    private String chubuzd;
    /**
     * 0是1否
     */
    @TableField("QICHAGUANIF")
    private String qichaguanif;
    @TableField("QICHAGUANTIME")
    private Date qichaguanTime;
    /**
     * 0是1否
     */
    @TableField("XINFEIFSIF")
    private String xinfeifsif;
    @TableField("XINFEITIME")
    private Date xinfeiTime;
    @TableField("XFFSHOWTIME")
    private Date xffshowTime;
    /**
     * 0是1否
     */
    @TableField("CHUCANIF")
    private String chucanif;
    @TableField("CHUCHANNUM")
    private String chuchanNum;
    /**
     * 0是1否
     */
    @TableField("HUXIJIIF")
    private String huxijiif;
    @TableField("HUXIHOWTIME")
    private Date huxihowTime;
    @TableField("HUXITIME")
    private Date huxiTime;
    @TableField("QJIUJILU")
    private String qjiujilu;
    @TableField("USERID")
    private Integer userid;
    @TableField("INJZTIME")
    private Date injzTime;
    @TableField("QJCREATETIME")
    private Date qjcreateTime;
    @TableField("TYPEID")
    private String typeId;

    public Integer getJqbrId() {
        return jqbrId;
    }

    public void setJqbrId(Integer jqbrId) {
        this.jqbrId = jqbrId;
    }

    public String getChuanNum() {
        return chuanNum;
    }

    public void setChuanNum(String chuanNum) {
        this.chuanNum = chuanNum;
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

    public String getBrAddress() {
        return brAddress;
    }

    public void setBrAddress(String brAddress) {
        this.brAddress = brAddress;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public String getJiwangs() {
        return jiwangs;
    }

    public void setJiwangs(String jiwangs) {
        this.jiwangs = jiwangs;
    }

    public String getGuomingshi() {
        return guomingshi;
    }

    public void setGuomingshi(String guomingshi) {
        this.guomingshi = guomingshi;
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

    public String getMaibo() {
        return maibo;
    }

    public void setMaibo(String maibo) {
        this.maibo = maibo;
    }

    public String getShenzhi() {
        return shenzhi;
    }

    public void setShenzhi(String shenzhi) {
        this.shenzhi = shenzhi;
    }

    public String getXueyang() {
        return xueyang;
    }

    public void setXueyang(String xueyang) {
        this.xueyang = xueyang;
    }

    public String getTiwen() {
        return tiwen;
    }

    public void setTiwen(String tiwen) {
        this.tiwen = tiwen;
    }

    public String getTongkong2() {
        return tongkong2;
    }

    public void setTongkong2(String tongkong2) {
        this.tongkong2 = tongkong2;
    }

    public String getTongkong() {
        return tongkong;
    }

    public void setTongkong(String tongkong) {
        this.tongkong = tongkong;
    }

    public String getFuzhujiancha() {
        return fuzhujiancha;
    }

    public void setFuzhujiancha(String fuzhujiancha) {
        this.fuzhujiancha = fuzhujiancha;
    }

    public String getChubuzd() {
        return chubuzd;
    }

    public void setChubuzd(String chubuzd) {
        this.chubuzd = chubuzd;
    }

    public String getQichaguanif() {
        return qichaguanif;
    }

    public void setQichaguanif(String qichaguanif) {
        this.qichaguanif = qichaguanif;
    }

    public Date getQichaguanTime() {
        return qichaguanTime;
    }

    public void setQichaguanTime(Date qichaguanTime) {
        this.qichaguanTime = qichaguanTime;
    }

    public String getXinfeifsif() {
        return xinfeifsif;
    }

    public void setXinfeifsif(String xinfeifsif) {
        this.xinfeifsif = xinfeifsif;
    }

    public Date getXinfeiTime() {
        return xinfeiTime;
    }

    public void setXinfeiTime(Date xinfeiTime) {
        this.xinfeiTime = xinfeiTime;
    }

    public Date getXffshowTime() {
        return xffshowTime;
    }

    public void setXffshowTime(Date xffshowTime) {
        this.xffshowTime = xffshowTime;
    }

    public String getChucanif() {
        return chucanif;
    }

    public void setChucanif(String chucanif) {
        this.chucanif = chucanif;
    }

    public String getChuchanNum() {
        return chuchanNum;
    }

    public void setChuchanNum(String chuchanNum) {
        this.chuchanNum = chuchanNum;
    }

    public String getHuxijiif() {
        return huxijiif;
    }

    public void setHuxijiif(String huxijiif) {
        this.huxijiif = huxijiif;
    }

    public Date getHuxihowTime() {
        return huxihowTime;
    }

    public void setHuxihowTime(Date huxihowTime) {
        this.huxihowTime = huxihowTime;
    }

    public Date getHuxiTime() {
        return huxiTime;
    }

    public void setHuxiTime(Date huxiTime) {
        this.huxiTime = huxiTime;
    }

    public String getQjiujilu() {
        return qjiujilu;
    }

    public void setQjiujilu(String qjiujilu) {
        this.qjiujilu = qjiujilu;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Date getInjzTime() {
        return injzTime;
    }

    public void setInjzTime(Date injzTime) {
        this.injzTime = injzTime;
    }

    @Override
    public String toString() {
        return "Qjbrrecord{" +
                "jqbrId=" + jqbrId +
                ", chuanNum='" + chuanNum + '\'' +
                ", brName='" + brName + '\'' +
                ", brSex='" + brSex + '\'' +
                ", brAge='" + brAge + '\'' +
                ", brAddress='" + brAddress + '\'' +
                ", cause='" + cause + '\'' +
                ", jiwangs='" + jiwangs + '\'' +
                ", guomingshi='" + guomingshi + '\'' +
                ", xueya='" + xueya + '\'' +
                ", huxi='" + huxi + '\'' +
                ", maibo='" + maibo + '\'' +
                ", shenzhi='" + shenzhi + '\'' +
                ", xueyang='" + xueyang + '\'' +
                ", tiwen='" + tiwen + '\'' +
                ", tongkong2='" + tongkong2 + '\'' +
                ", tongkong='" + tongkong + '\'' +
                ", fuzhujiancha='" + fuzhujiancha + '\'' +
                ", chubuzd='" + chubuzd + '\'' +
                ", qichaguanif='" + qichaguanif + '\'' +
                ", qichaguanTime=" + qichaguanTime +
                ", xinfeifsif='" + xinfeifsif + '\'' +
                ", xinfeiTime=" + xinfeiTime +
                ", xffshowTime=" + xffshowTime +
                ", chucanif='" + chucanif + '\'' +
                ", chuchanNum='" + chuchanNum + '\'' +
                ", huxijiif='" + huxijiif + '\'' +
                ", huxihowTime=" + huxihowTime +
                ", huxiTime=" + huxiTime +
                ", qjiujilu=" + qjiujilu +
                ", userid='" + userid + '\'' +
                ", injzTime=" + injzTime +
                ", qjcreateTime=" + qjcreateTime +
                ", typeId='" + typeId + '\'' +
                "} " + super.toString();
    }

    public Date getQjcreateTime() {
        return qjcreateTime;
    }

    public void setQjcreateTime(Date qjcreateTime) {
        this.qjcreateTime = qjcreateTime;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    @Override
    protected Serializable pkVal() {
        return this.jqbrId;
    }
}
