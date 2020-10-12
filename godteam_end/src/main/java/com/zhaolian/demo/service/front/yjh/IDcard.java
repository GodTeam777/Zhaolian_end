package com.zhaolian.demo.service.front.yjh;

import com.zhaolian.demo.data.entity.Idcard;

public interface IDcard {
    //根据用户id查询真实姓名，身份证
    public Idcard  selectByid(Integer id);
}
