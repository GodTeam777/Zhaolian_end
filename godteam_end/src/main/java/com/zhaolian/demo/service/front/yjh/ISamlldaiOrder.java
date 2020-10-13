package com.zhaolian.demo.service.front.yjh;

import com.zhaolian.demo.data.entity.SamlldaiOrder;
import com.zhaolian.demo.data.entity.SamlldaiOrderExample;

import java.util.List;

public interface ISamlldaiOrder {
    //根据用户id查询货贷记录
    public List<SamlldaiOrder> selectByid(Integer id);

}
