package com.zhaolian.demo.service.end.li.impl;

import com.zhaolian.demo.data.dao.BigdaiMapper;
import com.zhaolian.demo.data.dao.BigdaiorderMapper;
import com.zhaolian.demo.data.entity.Bigdai;
import com.zhaolian.demo.data.entity.Bigdaiorder;
import com.zhaolian.demo.service.end.li.Bigdaiordeservice;
import com.zhaolian.demo.web.util.BigdaiordeDTO;
import com.zhaolian.demo.web.util.PageBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;
@Service(value = "Bigdaioderserviceimpl")
public class Bigdaiordeserviceimpl implements Bigdaiordeservice {
    @Resource
    BigdaiorderMapper dao;
    @Override
    public PageBean<Bigdaiorder> getByPage(BigdaiordeDTO dto, int pageNo, int pageSize) {
        System.out.println("进入业务层分页和高级查询方法getByPage");
        PageBean<Bigdaiorder> pd=new PageBean<>();
        System.out.println("数据层getByPage   DTO"+dto.toString());
        Map<String,Object> parms=new HashMap<>();
        parms.put("dto",dto);
        int start=(pageNo-1)*pageSize+1;
        int end=pageNo*pageSize;
        parms.put("startIndex",start);
        parms.put("endIndex",end);
        pd.setRows(this.dao.selectBigdaiorderByPage(parms));
        pd.setTotal(this.dao.getBigdaiorderCount(dto));
        pd.setPageSize(pageSize);

        return pd;
    }
}
