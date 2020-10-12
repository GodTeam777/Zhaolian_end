package com.zhaolian.demo.service.front.yjh.impl;

import com.zhaolian.demo.data.dao.SamlldaiOrderMapper;
import com.zhaolian.demo.data.entity.SamlldaiOrder;
import com.zhaolian.demo.data.entity.SamlldaiOrderExample;
import com.zhaolian.demo.service.front.yjh.ISamlldaiOrder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
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
