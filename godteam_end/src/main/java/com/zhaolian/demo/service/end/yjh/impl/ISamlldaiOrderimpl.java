package com.zhaolian.demo.service.end.yjh.impl;

import com.zhaolian.demo.data.dao.SamlldaiOrderMapper;
import com.zhaolian.demo.data.entity.SamlldaiOrder;
import com.zhaolian.demo.service.end.yjh.ISamlldaiOrder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ISamlldaiOrderimpl implements ISamlldaiOrder {
    @Resource
    SamlldaiOrderMapper dao;


    @Override
    public List<SamlldaiOrder> selectByid(Integer id) {
        List<SamlldaiOrder> all= this.dao.selectByid(id);
        return all;
    }
}
