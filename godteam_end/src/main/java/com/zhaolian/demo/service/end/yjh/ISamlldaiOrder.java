package com.zhaolian.demo.service.end.yjh;

import com.zhaolian.demo.data.entity.SamlldaiOrder;

import java.util.List;

public interface ISamlldaiOrder {
    //根据用户id查询货贷记录
    public List<SamlldaiOrder> selectByid(Integer id);

}
