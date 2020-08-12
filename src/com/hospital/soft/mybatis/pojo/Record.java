package com.hospital.soft.mybatis.pojo;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

@TableName("VIEW_REOCRD ")
public class Record implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableField("ID")
    private Integer id;
    @TableField("AID")
    private Integer aid;
    @TableField("CREATETIME")
    private Date createtime;
    @TableField("RTYPE")
    private String rtype;
    @TableField("UNAME")
    private String uname;

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return aid;
    }

    public void setUid(Integer uid) {
        this.aid = uid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getRtype() {
        return rtype;
    }

    public void setRtype(String rtype) {
        this.rtype = rtype;
    }

    @Override
    public String toString() {
        return "Record{" +
                "id=" + id +
                ", uid=" + aid +
                ", createtime=" + createtime +
                ", rtype='" + rtype + '\'' +
                ", uname='" + uname + '\'' +
                '}';
    }
}
