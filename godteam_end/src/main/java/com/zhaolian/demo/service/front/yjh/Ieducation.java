package com.zhaolian.demo.service.front.yjh;

import com.zhaolian.demo.data.entity.Education;
import com.zhaolian.demo.data.entity.Users;
import com.zhaolian.demo.service.util.PageBean;

public interface Ieducation {
    //学历全部查询分页
    PageBean<Education> queryReturnPage(int pageNo, int pageSize);
    //学历审核通过增加小额额度
    public void EducationAdd(Education edu, Users user);
    //根据用户id查询学历信息
    public Education selectByid(Integer id);

}
