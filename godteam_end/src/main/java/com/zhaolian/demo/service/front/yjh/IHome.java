package com.zhaolian.demo.service.front.yjh;

import com.zhaolian.demo.data.entity.Education;
import com.zhaolian.demo.data.entity.Home;
import com.zhaolian.demo.data.entity.Users;
import com.zhaolian.demo.service.util.PageBean;

public interface IHome {
    //房屋全部查询分页
    PageBean<Home> queryReturnPage(int pageNo, int pageSize);
    //学历审核通过增加小额额度
    public void HomeUpdateandAdd(Home home, Users user);
    //根据用户id查询学历信息
    public Home selectByid(Integer id);
}
