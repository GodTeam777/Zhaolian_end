package com.zhaolian.demo.service.end.yjh.impl;

import com.zhaolian.demo.data.dao.SmadaiLilvMapper;
import com.zhaolian.demo.data.entity.SmadaiLilv;
import com.zhaolian.demo.service.end.yjh.ISmadaiLilv;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;

@Service
public class ISmadaiLilvimpl implements ISmadaiLilv {

    @Resource
    SmadaiLilvMapper dao;

    @Override
    public SmadaiLilv selectlilv(Integer id) {
        SmadaiLilv all= this.dao.selectByid(new BigDecimal(id));
        return all;
    }

    @Override
    public boolean updatelilv(SmadaiLilv smadaiLilv) {
        boolean isFlag = false;
        int count= this.dao.updateByidlilv(smadaiLilv);
        if (count > 0) {
            isFlag = true;
            System.out.println("修改成功");
        }
        return isFlag;
    }

}
