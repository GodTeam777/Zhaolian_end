package com.zhaolian.demo.service.end.yjh;

import com.zhaolian.demo.data.entity.*;
import com.zhaolian.demo.service.util.PageBean;
import com.zhaolian.demo.web.util.SearchUsersDTO;

public interface IUsers {

    //添加客服
    int AddSerivce(Users user);

    //用户查询和分页
    public abstract PageBean<Users>
    getByPage(SearchUsersDTO dto, //查询参数DTO
              Integer pageNo,//页号
              Integer pageSize);//页大小

    //客服查询和分页
    public abstract PageBean<Users>
    getByPageService(SearchUsersDTO dto, //查询参数DTO
              Integer pageNo,//页号
              Integer pageSize);//页大小

    //管理员查询和分页
    public abstract PageBean<Users>
    getByPageAdmin(SearchUsersDTO dto, //查询参数DTO
                     Integer pageNo,//页号
                     Integer pageSize);//页大小


    //按编号查询一条记录
    public Users selectByid(Integer id);

    //修改小额贷款额度
    public boolean updatedaikuan(Users users);





}
