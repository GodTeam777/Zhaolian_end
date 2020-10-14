package com.zhaolian.demo.service.front.yjh;

import com.zhaolian.demo.data.entity.SmadaiLilv;
import com.zhaolian.demo.data.entity.Users;

public interface ISmadaiLilv {
    //按编号查询利率
    public SmadaiLilv selectlilv(Integer id);
    //修改利率
    boolean updatelilv(SmadaiLilv smadaiLilv );

}
