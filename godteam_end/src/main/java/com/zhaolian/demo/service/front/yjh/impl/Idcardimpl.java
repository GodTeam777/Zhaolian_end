package com.zhaolian.demo.service.front.yjh.impl;

import com.zhaolian.demo.data.dao.IdcardMapper;
import com.zhaolian.demo.data.entity.Idcard;
import com.zhaolian.demo.service.front.yjh.IDcard;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;

@Service
public class Idcardimpl implements IDcard {

    @Resource
    IdcardMapper Idcarddao;

    @Override
    public Idcard selectByid(Integer id) {
        //根据个人信息id查询详细信息
        Idcard all=this.Idcarddao.selectByPrimaryKey(new BigDecimal(id));
        return all;
    }
}
