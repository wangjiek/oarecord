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
public class Livehospital extends Model<Livehospital> {

    private static final long serialVersionUID = 1L;

    @TableId("LIVEHOSPITAL_ID")
    private Integer livehospitalId;
    /**
     * 转归0好转出院1转至其它医院2转至其它科室3死亡
     */
    @TableField("ZGINFO")
    private String zgInfo;
    /**
     * :0STEMI1NSTEMI2UA3主动脉夹层4肺栓塞5非 AC胸痛6其它非心源性胸痛
     */
    @TableField("CYZD")
    private String cyzd;
    /**
     * 确诊时间
     */
    @TableField("QZTIME")
    private Date qzTime;
    /**
     * 72h 内肌钙蛋白最高值
     */
    @TableField("JGMAXSIZE")
    private String jgmaxSize;
    /**
     * BNP:0是1否
     */
    @TableField("BNPIF")
    private String bnpif;
    /**
     * NT-proBNP:0是1否
     */
    @TableField("NTPROBNPIF")
    private String ntproBNPif;
    /**
     * 最高值
     */
    @TableField("MAXNUM")
    private String maxNum;
    /**
     * 超声心动图 LVEF
     */
    @TableField("CSXDTNUM")
    private String csxdtNum;
    /**
     * 合并症:0无1心衰2休克3机械性并发症4感染5再发心梗6血栓7卒中8TIA9出血10呼吸衰竭11肾衰竭12死亡
     */
    @TableField("HBZITEM")
    private String hbzItem;
    /**
     * 心血管疾病危险因素:0高血压1高脂血症2血糖升高3吸烟4肥胖5有家族史
     */
    @TableField("XXGJBYS")
    private String xxgjbys;
    /**
     * 院内新发心力衰竭:0是1否
     */
    @TableField("YNXFXNSJ")
    private String ynxfxnsj;
    /**
     * 出院时间
     */
    @TableField("OUTHOSPITAL")
    private Date outhospital;
    /**
     * 住院天数
     */
    @TableField("ZYNUM")
    private String zyNum;
    /**
     * 总费用
     */
    @TableField("SUMMONEY")
    private String sumMoney;
    /**
     * 出院治疗结果:0治愈1好转2脑死亡离院3其它原因离院
     */
    @TableField("OUTRESULT")
    private String outResult;
    /**
     * 出院带药:0DAPT1ACEI/ARB2β-受体阻滞剂3他汀
     */
    @TableField("CYDY")
    private String cydy;
    @TableField("USERID")
    private Integer userId;
    @TableField("TIMEADMINTYPE")
    private Date timeAdminType;
    @TableField("TYPEID")
    private String typeId;

    public Integer getLivehospitalId() {
        return livehospitalId;
    }

    public void setLivehospitalId(Integer livehospitalId) {
        this.livehospitalId = livehospitalId;
    }

    public String getZgInfo() {
        return zgInfo;
    }

    public void setZgInfo(String zgInfo) {
        this.zgInfo = zgInfo;
    }

    public String getCyzd() {
        return cyzd;
    }

    public void setCyzd(String cyzd) {
        this.cyzd = cyzd;
    }

    public Date getQzTime() {
        return qzTime;
    }

    public void setQzTime(Date qzTime) {
        this.qzTime = qzTime;
    }

    public String getJgmaxSize() {
        return jgmaxSize;
    }

    public void setJgmaxSize(String jgmaxSize) {
        this.jgmaxSize = jgmaxSize;
    }

    public String getBnpif() {
        return bnpif;
    }

    public void setBnpif(String bnpif) {
        this.bnpif = bnpif;
    }

    public String getNtproBNPif() {
        return ntproBNPif;
    }

    public void setNtproBNPif(String ntproBNPif) {
        this.ntproBNPif = ntproBNPif;
    }

    public String getMaxNum() {
        return maxNum;
    }

    public void setMaxNum(String maxNum) {
        this.maxNum = maxNum;
    }

    public String getCsxdtNum() {
        return csxdtNum;
    }

    public void setCsxdtNum(String csxdtNum) {
        this.csxdtNum = csxdtNum;
    }

    public String getHbzItem() {
        return hbzItem;
    }

    public void setHbzItem(String hbzItem) {
        this.hbzItem = hbzItem;
    }

    public String getXxgjbys() {
        return xxgjbys;
    }

    public void setXxgjbys(String xxgjbys) {
        this.xxgjbys = xxgjbys;
    }

    public String getYnxfxnsj() {
        return ynxfxnsj;
    }

    public void setYnxfxnsj(String ynxfxnsj) {
        this.ynxfxnsj = ynxfxnsj;
    }

    public Date getOuthospital() {
        return outhospital;
    }

    public void setOuthospital(Date outhospital) {
        this.outhospital = outhospital;
    }

    public String getZyNum() {
        return zyNum;
    }

    public void setZyNum(String zyNum) {
        this.zyNum = zyNum;
    }

    public String getSumMoney() {
        return sumMoney;
    }

    public void setSumMoney(String sumMoney) {
        this.sumMoney = sumMoney;
    }

    public String getOutResult() {
        return outResult;
    }

    public void setOutResult(String outResult) {
        this.outResult = outResult;
    }

    public String getCydy() {
        return cydy;
    }

    public void setCydy(String cydy) {
        this.cydy = cydy;
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
        return "Livehospital{" +
                "livehospitalId=" + livehospitalId +
                ", zgInfo='" + zgInfo + '\'' +
                ", cyzd='" + cyzd + '\'' +
                ", qzTime=" + qzTime +
                ", jgmaxSize='" + jgmaxSize + '\'' +
                ", bnpif='" + bnpif + '\'' +
                ", ntproBNPif='" + ntproBNPif + '\'' +
                ", maxNum='" + maxNum + '\'' +
                ", csxdtNum='" + csxdtNum + '\'' +
                ", hbzItem='" + hbzItem + '\'' +
                ", xxgjbys='" + xxgjbys + '\'' +
                ", ynxfxnsj='" + ynxfxnsj + '\'' +
                ", outhospital=" + outhospital +
                ", zyNum='" + zyNum + '\'' +
                ", sumMoney='" + sumMoney + '\'' +
                ", outResult='" + outResult + '\'' +
                ", cydy='" + cydy + '\'' +
                ", userId='" + userId + '\'' +
                ", timeAdminType=" + timeAdminType +
                ", typeId='" + typeId + '\'' +
                "} " + super.toString();
    }

    @Override
    protected Serializable pkVal() {
        return this.livehospitalId;
    }
}
