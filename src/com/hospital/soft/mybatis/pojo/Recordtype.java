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
public class Recordtype extends Model<Recordtype> {

    private static final long serialVersionUID = 1L;

    @TableId("TYPEID")
    private Integer typeId;
    @TableField("DAOGUANID")
    private Integer daoguanId;
    @TableField("JZID")
    private Integer jzId;
    @TableField("KSID")
    private Integer ksId;
    @TableField("ZYZGID")
    private Integer zyzgId;
    @TableField("YQID")
    private Integer yqId;
    @TableField("CREATETIME")
    private Date createTime;
    @TableField("USERID")
    private Integer userId;
    @TableField("TYPENAME")
    private String typeName;

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getDaoguanId() {
        return daoguanId;
    }

    public void setDaoguanId(Integer daoguanId) {
        this.daoguanId = daoguanId;
    }

    public Integer getJzId() {
        return jzId;
    }

    public void setJzId(Integer jzId) {
        this.jzId = jzId;
    }

    public Integer getKsId() {
        return ksId;
    }

    public void setKsId(Integer ksId) {
        this.ksId = ksId;
    }

    public Integer getZyzgId() {
        return zyzgId;
    }

    public void setZyzgId(Integer zyzgId) {
        this.zyzgId = zyzgId;
    }

    public Integer getYqId() {
        return yqId;
    }

    public void setYqId(Integer yqId) {
        this.yqId = yqId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return "Recordtype{" +
                "typeId=" + typeId +
                ", daoguanId=" + daoguanId +
                ", jzId=" + jzId +
                ", ksId=" + ksId +
                ", zyzgId=" + zyzgId +
                ", yqId=" + yqId +
                ", createTime=" + createTime +
                ", userId=" + userId +
                ", typeName='" + typeName + '\'' +
                "} " + super.toString();
    }

    @Override
    protected Serializable pkVal() {
        return this.typeId;
    }
}
