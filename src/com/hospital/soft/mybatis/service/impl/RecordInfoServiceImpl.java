package com.hospital.soft.mybatis.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.hospital.soft.mybatis.mapper.RecordMapper;
import com.hospital.soft.mybatis.pojo.Record;
import com.hospital.soft.mybatis.service.RecordInfoService;
import org.springframework.stereotype.Service;

@Service
public class RecordInfoServiceImpl extends ServiceImpl<RecordMapper, Record> implements RecordInfoService {
}
