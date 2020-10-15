package com.zhaolian.demo.service.front.yjh.impl;

import com.zhaolian.demo.data.dao.NewesMapper;
import com.zhaolian.demo.data.entity.Newes;
import com.zhaolian.demo.data.entity.NewesExample;
import com.zhaolian.demo.service.front.yjh.INewes;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class INewesimpl implements INewes {

    @Resource
    NewesMapper dao;

    @Override
    public List<Newes> select(NewesExample newes) {
        List<Newes> all=  this.dao.selectByExample(newes);
        return all;
    }

    @Override
    public List<Newes> selectType(NewesExample newes) {
        List<Newes> all=  this.dao.selectByExampletype(newes);
        return all;
    }

    @Override
    public List<Newes> selectByType(NewesExample newes) {
        List<Newes> all=  this.dao.selectBytype(newes);
        return all;
    }
}
