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
public class Daoguanrecord extends Model<Daoguanrecord> {

    private static final long serialVersionUID = 1L;

    @TableId("DGRECORD_ID")
    private Integer dgrecordId;
    /**
     * 急诊 PCI 启动方式
     */
    @TableField("DGPCIBEGIN")
    private String dgpcibegin;
    /**
     * 介入医生
     */
    @TableField("DGDOCTORNAME")
    private String dgdoctorName;
    /**
     * 导管室激活时间
     */
    @TableField("DGSBEGINTIME")
    private Date dgsbeginTime;
    /**
     * PCI 血管路径:0桡动脉（左）1桡动脉(右)2股动脉3其他
     */
    @TableField("DGXGWAY")
    private String dgxgway;
    /**
     * 开始穿刺时间
     */
    @TableField("BEGINCHUANCI")
    private Date beginchuanci;
    /**
     * 造影开始时间
     */
    @TableField("BEGINZY")
    private Date beginzy;
    /**
     * 导丝通过时间
     */
    @TableField("DSTGTIME")
    private Date dstgTime;
    /**
     * PCI 手术完成时间
     */
    @TableField("ENDPCITIME")
    private Date endpciTime;
    /**
     * 罪犯血管狭窄程度:0＜50%1:50-69%2:70-89%3:90-99%4:100%
     */
    @TableField("FZXG")
    private String fzxg;
    /**
     * 术前 TIMI
     */
    @TableField("SHUQIAN")
    private String shuqian;
    /**
     * 术后 TIMI
     */
    @TableField("SHUHOU")
    private String shuhou;
    /**
     * 术前 TIMI 级：0是1否
     */
    @TableField("FFZXG")
    private String ffzxg;
    /**
     * 犯罪血管图
     */
    @TableField("FZIMG")
    private String fzImg;
    /**
     * 非犯罪血管图
     */
    @TableField("FFZIMG")
    private String ffImg;
    /**
     * 支架内血栓:0是1否
     */
    @TableField("ZJNXS")
    private String zjnxs;
    /**
     * 分叉病变:0是1否
     */
    @TableField("FCBB")
    private String fcbb;
    /**
     * 0是1否
     */
    @TableField("CTO")
    private String cto;
    /**
     * 植入支架个数
     */
    @TableField("ZRZJSIZE")
    private String zrzjSize;
    /**
     * 首次抗凝:0普通肝素1比伐芦定2依诺肝素
     */
    @TableField("SCKN")
    private String sckn;
    /**
     * 首次抗凝剂量
     */
    @TableField("SCKNSIZE")
    private String scknSize;
    /**
     * 首次抗凝时间
     */
    @TableField("SCKNTIME")
    private Date scknTime;
    /**
     * 腔内影像0IVUS1OCT2OCT3无
     */
    @TableField("QNYX")
    private String qnyx;
    /**
     * 功能检测;0FFR1其他2无
     */
    @TableField("GNJC")
    private String gnjc;
    /**
     * IABP 植入:0是1否
     */
    @TableField("IABPZR")
    private String iabpzr;
    /**
     * 血栓抽吸0是1否
     */
    @TableField("XSCX")
    private String xscx;
    /**
     * 临时起搏器植入:0是1否
     */
    @TableField("LSQBQ")
    private String lsqbq;
    /**
     * ECMO 0是1否
     */
    @TableField("ECMO")
    private String ecmo;
    /**
     * 左心室辅助装置 0是1否
     */
    @TableField("ZXSFZ")
    private String zxsfz;
    /**
     * 术中并发症;0无1恶性心律失常2低血压3慢血流/无复流4血管夹层5非干预血管急性闭塞6血管穿孔7死亡8死亡
     */
    @TableField("SZBFZ")
    private String szbfz;
    /**
     * D2B 时间
     */
    @TableField("DTOWBTIME")
    private String dtowbTime;
    /**
     * 是否延误0是，1否
     */
    @TableField("SFYC")
    private String sfyc;
    @TableField("USERID")
    private Integer userId;
    @TableField("TIMEADMINTYPE")
    private Date timeAdminType;
    @TableField("TYPEID")
    private String typId;

    public Integer getDgrecordId() {
        return dgrecordId;
    }

    public void setDgrecordId(Integer dgrecordId) {
        this.dgrecordId = dgrecordId;
    }

    public String getDgpcibegin() {
        return dgpcibegin;
    }

    public void setDgpcibegin(String dgpcibegin) {
        this.dgpcibegin = dgpcibegin;
    }

    public String getDgdoctorName() {
        return dgdoctorName;
    }

    public void setDgdoctorName(String dgdoctorName) {
        this.dgdoctorName = dgdoctorName;
    }

    public Date getDgsbeginTime() {
        return dgsbeginTime;
    }

    public void setDgsbeginTime(Date dgsbeginTime) {
        this.dgsbeginTime = dgsbeginTime;
    }

    public String getDgxgway() {
        return dgxgway;
    }

    public void setDgxgway(String dgxgway) {
        this.dgxgway = dgxgway;
    }

    public Date getBeginchuanci() {
        return beginchuanci;
    }

    public void setBeginchuanci(Date beginchuanci) {
        this.beginchuanci = beginchuanci;
    }

    public Date getBeginzy() {
        return beginzy;
    }

    public void setBeginzy(Date beginzy) {
        this.beginzy = beginzy;
    }

    public Date getDstgTime() {
        return dstgTime;
    }

    public void setDstgTime(Date dstgTime) {
        this.dstgTime = dstgTime;
    }

    public Date getEndpciTime() {
        return endpciTime;
    }

    public void setEndpciTime(Date endpciTime) {
        this.endpciTime = endpciTime;
    }

    public String getFzxg() {
        return fzxg;
    }

    public void setFzxg(String fzxg) {
        this.fzxg = fzxg;
    }

    public String getShuqian() {
        return shuqian;
    }

    public void setShuqian(String shuqian) {
        this.shuqian = shuqian;
    }

    public String getShuhou() {
        return shuhou;
    }

    public void setShuhou(String shuhou) {
        this.shuhou = shuhou;
    }

    public String getFfzxg() {
        return ffzxg;
    }

    public void setFfzxg(String ffzxg) {
        this.ffzxg = ffzxg;
    }

    public String getFzImg() {
        return fzImg;
    }

    public void setFzImg(String fzImg) {
        this.fzImg = fzImg;
    }

    public String getFfImg() {
        return ffImg;
    }

    public void setFfImg(String ffImg) {
        this.ffImg = ffImg;
    }

    public String getZjnxs() {
        return zjnxs;
    }

    public void setZjnxs(String zjnxs) {
        this.zjnxs = zjnxs;
    }

    public String getFcbb() {
        return fcbb;
    }

    public void setFcbb(String fcbb) {
        this.fcbb = fcbb;
    }

    public String getCto() {
        return cto;
    }

    public void setCto(String cto) {
        this.cto = cto;
    }

    public String getZrzjSize() {
        return zrzjSize;
    }

    public void setZrzjSize(String zrzjSize) {
        this.zrzjSize = zrzjSize;
    }

    public String getSckn() {
        return sckn;
    }

    public void setSckn(String sckn) {
        this.sckn = sckn;
    }

    public String getScknSize() {
        return scknSize;
    }

    public void setScknSize(String scknSize) {
        this.scknSize = scknSize;
    }

    public Date getScknTime() {
        return scknTime;
    }

    public void setScknTime(Date scknTime) {
        this.scknTime = scknTime;
    }

    public String getQnyx() {
        return qnyx;
    }

    public void setQnyx(String qnyx) {
        this.qnyx = qnyx;
    }

    public String getGnjc() {
        return gnjc;
    }

    public void setGnjc(String gnjc) {
        this.gnjc = gnjc;
    }

    public String getIabpzr() {
        return iabpzr;
    }

    public void setIabpzr(String iabpzr) {
        this.iabpzr = iabpzr;
    }

    public String getXscx() {
        return xscx;
    }

    public void setXscx(String xscx) {
        this.xscx = xscx;
    }

    public String getLsqbq() {
        return lsqbq;
    }

    public void setLsqbq(String lsqbq) {
        this.lsqbq = lsqbq;
    }

    public String getEcmo() {
        return ecmo;
    }

    public void setEcmo(String ecmo) {
        this.ecmo = ecmo;
    }

    public String getZxsfz() {
        return zxsfz;
    }

    public void setZxsfz(String zxsfz) {
        this.zxsfz = zxsfz;
    }

    public String getSzbfz() {
        return szbfz;
    }

    public void setSzbfz(String szbfz) {
        this.szbfz = szbfz;
    }

    public String getDtowbTime() {
        return dtowbTime;
    }

    public void setDtowbTime(String dtowbTime) {
        this.dtowbTime = dtowbTime;
    }

    public String getSfyc() {
        return sfyc;
    }

    public void setSfyc(String sfyc) {
        this.sfyc = sfyc;
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

    public String getTypId() {
        return typId;
    }

    public void setTypId(String typId) {
        this.typId = typId;
    }

    @Override
    public String toString() {
        return "Daoguanrecord{" +
                "dgrecordId=" + dgrecordId +
                ", dgpcibegin='" + dgpcibegin + '\'' +
                ", dgdoctorName='" + dgdoctorName + '\'' +
                ", dgsbeginTime=" + dgsbeginTime +
                ", dgxgway='" + dgxgway + '\'' +
                ", beginchuanci=" + beginchuanci +
                ", beginzy=" + beginzy +
                ", dstgTime=" + dstgTime +
                ", endpciTime=" + endpciTime +
                ", fzxg='" + fzxg + '\'' +
                ", shuqian='" + shuqian + '\'' +
                ", shuhou='" + shuhou + '\'' +
                ", ffzxg='" + ffzxg + '\'' +
                ", fzImg='" + fzImg + '\'' +
                ", ffImg='" + ffImg + '\'' +
                ", zjnxs='" + zjnxs + '\'' +
                ", fcbb='" + fcbb + '\'' +
                ", cto='" + cto + '\'' +
                ", zrzjSize='" + zrzjSize + '\'' +
                ", sckn='" + sckn + '\'' +
                ", scknSize='" + scknSize + '\'' +
                ", scknTime=" + scknTime +
                ", qnyx='" + qnyx + '\'' +
                ", gnjc='" + gnjc + '\'' +
                ", iabpzr='" + iabpzr + '\'' +
                ", xscx='" + xscx + '\'' +
                ", lsqbq='" + lsqbq + '\'' +
                ", ecmo='" + ecmo + '\'' +
                ", zxsfz='" + zxsfz + '\'' +
                ", szbfz='" + szbfz + '\'' +
                ", dtowbTime='" + dtowbTime + '\'' +
                ", sfyc='" + sfyc + '\'' +
                ", userId='" + userId + '\'' +
                ", timeAdminType=" + timeAdminType +
                ", typId='" + typId + '\'' +
                "} " + super.toString();
    }

    @Override
    protected Serializable pkVal() {
        return this.dgrecordId;
    }
}
