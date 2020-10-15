package com.zhaolian.demo.service.end.li.impl;

import com.zhaolian.demo.data.dao.BigdaiVlidateMapper;
import com.zhaolian.demo.data.entity.Bigdai;
import com.zhaolian.demo.data.entity.BigdaiVlidate;
import com.zhaolian.demo.service.end.li.BigdaiVlidateservice;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "BigdaiVlidateimpl")
public class BigdaiVlidateimpl implements BigdaiVlidateservice {


    @Resource
    BigdaiVlidateMapper dao;
    @Override
    public int insert(BigdaiVlidate vldate) {
int a =dao.insert(vldate);
        return a;
    }

    @Override
    public List<BigdaiVlidate> selectall() {

        return dao.selectall();
    }
}
