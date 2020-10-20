package com.zhaolian.demo.data.dao;

import com.zhaolian.demo.data.entity.Users;
import com.zhaolian.demo.data.entity.UsersExample;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;


import com.zhaolian.demo.web.util.SearchUsersDTO;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UsersMapper {

    //查询用户总数
    int getUserCount();
    //后台查询用户总数
    int getTotalCountkefu(SearchUsersDTO dto);
    //后台查询用户总数
    int getTotalCountUser(SearchUsersDTO dto);
    //系统登录
    List<Users> SystemLogin(Users user);
    //后台查询记录总数
    public int getTotalCount(SearchUsersDTO dto);
    //用户分页
    public List<Users> selectByPage(Map<String, Object> param);
    //房屋认证修改额度
    int updateHome(Users record);
    //车辆认证修改额度
    int updateCAR(Users record);
    //学历认证修改额度
    int update(Users record);
    //查询客服分页
    public List<Users> selectByPageService(Map<String, Object> param);
    //查询管理员分页
    public List<Users> selectByPageAdmin(Map<String, Object> param);

    Users LoginBypetnameAnduspws(Map<String,Object> map);

    long countByExample(UsersExample example);

    int deleteByExample(UsersExample example);

    int deleteByPrimaryKey(BigDecimal usersid);

    int insert(Users record);

    int insertSelective(Users record);

    List<Users> selectByExample(UsersExample example);

    Users selectByPrimaryKey(BigDecimal usersid);

    int updateByExampleSelective(@Param("record") Users record, @Param("example") UsersExample example);

    int updateByExample(@Param("record") Users record, @Param("example") UsersExample example);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
}