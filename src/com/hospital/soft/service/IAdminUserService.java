package com.hospital.soft.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.hospital.soft.mybatis.pojo.Admin;
import com.hospital.soft.mybatis.pojo.Record;

import java.util.Date;

public interface IAdminUserService {

    Admin getUserByLoginName(String loginName);

    Page<Record> getRecordList(int curPage, int pageSize, Record record, Date endTime) throws Exception;

    void addAndUpdate(Admin user);

    Admin getAdminUserByAuthCode(String authCode);
}
