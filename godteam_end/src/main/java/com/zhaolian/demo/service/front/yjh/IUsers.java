package com.zhaolian.demo.service.front.yjh;

import com.zhaolian.demo.data.entity.*;
import com.zhaolian.demo.service.util.PageBean;
import com.zhaolian.demo.web.util.SearchUsersDTO;

import java.util.List;

public interface IUsers {
    //组合查询和分页
    public abstract PageBean<Users>
    getByPage(SearchUsersDTO dto, //查询参数DTO
              Integer pageNo,//页号
              Integer pageSize);//页大小


    //根据个人显示用户的详细信息（真实姓名，身份证，学历信息，车辆信息，房屋信息）
    public Users  selectAll(Users user);
}
