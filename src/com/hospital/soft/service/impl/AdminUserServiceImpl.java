package com.hospital.soft.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.hospital.soft.common.DateUtil;
import com.hospital.soft.mybatis.pojo.Admin;
import com.hospital.soft.mybatis.pojo.Record;
import com.hospital.soft.mybatis.service.AdminService;
import com.hospital.soft.mybatis.service.RecordInfoService;
import com.hospital.soft.service.IAdminUserService;
import com.mysql.jdbc.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class AdminUserServiceImpl implements IAdminUserService {
    @Autowired
    AdminService userService;
    @Autowired
    RecordInfoService recordInfoService;

    @Override
    public Admin getUserByLoginName(String loginName) {
        EntityWrapper<Admin> entityWrapper = new EntityWrapper<>();
        entityWrapper.where("name={0}", loginName);
        List<Admin> users = userService.selectList(entityWrapper);
        if (users.size() > 0) {
            return users.get(0);
        }
        return null;
    }

    @Override
    public Page<Record> getRecordList(int curPage, int pageSize, Record record, Date endTime) throws Exception {
        Page<Record> page = new Page<Record>(curPage, pageSize, "id", false);
        EntityWrapper<Record> wrapper = new EntityWrapper<>();
        wrapper.where("1=1");
        if (record != null) {
            if (!StringUtils.isNullOrEmpty(record.getRtype())) {
                wrapper.eq("rtype", record.getRtype());
            }
            if (record.getCreatetime() != null) {
                String date = DateUtil.parseDateToString(record.getCreatetime(), "yyyy-MM-dd");
                String end = DateUtil.parseDateToString(endTime, "yyyy-MM-dd");
                wrapper.between("to_char(createtime,'yyyy-MM-dd')", date, end);

            }
        }
        wrapper.orderDesc(Arrays.asList(new String[]{"createtime"}));

        Page<Record> records = recordInfoService.selectPage(page, wrapper);
        page.getRecords();
        return records;
    }

    @Override
    public void addAndUpdate(Admin user) {
        if (user.getId() == null) {
            userService.insert(user);
        } else {
            userService.updateById(user);
        }
    }

    @Override
    public Admin getAdminUserByAuthCode(String authCode) {
        EntityWrapper<Admin> user = new EntityWrapper<>();
        user.where("authCode={0}", authCode);
        Admin user1 = userService.selectOne(user);
        return user1;
    }
}
