package com.hospital.soft.mybatis.pojo;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author lqh123
 * @since 2020-07-31
 */
public class Admin extends Model<Admin> {

    private static final long serialVersionUID = 1L;

    @TableId("ID")
    private Integer id;
    @TableField("NAME")
    private String name;
    @TableField("PWD")
    private String pwd;
    @TableField("AUTHCODE")
    private String authcode;


    public Integer getId() {
        return id;
    }

    public Admin setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Admin setName(String name) {
        this.name = name;
        return this;
    }

    public String getPwd() {
        return pwd;
    }

    public Admin setPwd(String pwd) {
        this.pwd = pwd;
        return this;
    }

    public String getAuthcode() {
        return authcode;
    }

    public Admin setAuthcode(String authcode) {
        this.authcode = authcode;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Admin{" +
        ", id=" + id +
        ", name=" + name +
        ", pwd=" + pwd +
        ", authcode=" + authcode +
        "}";
    }
}
