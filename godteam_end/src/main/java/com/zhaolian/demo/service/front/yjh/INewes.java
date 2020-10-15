package com.zhaolian.demo.service.front.yjh;

import com.zhaolian.demo.data.entity.Newes;
import com.zhaolian.demo.data.entity.NewesExample;

import java.util.List;

public interface INewes {
     //每日新闻查询1
     List<Newes> select(NewesExample newes);
    //每日新闻查询2
    List<Newes> selectType(NewesExample newes);
    //每日新闻查询3
    List<Newes> selectByType(NewesExample newes);
}
