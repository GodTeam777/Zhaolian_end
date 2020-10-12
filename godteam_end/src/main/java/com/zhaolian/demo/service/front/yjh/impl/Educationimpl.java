package com.zhaolian.demo.service.front.yjh.impl;

import com.zhaolian.demo.data.dao.EducationMapper;
import com.zhaolian.demo.data.dao.UsersMapper;
import com.zhaolian.demo.data.entity.Education;
import com.zhaolian.demo.data.entity.Users;
import com.zhaolian.demo.service.front.yjh.Ieducation;
import com.zhaolian.demo.service.util.PageBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class Educationimpl implements Ieducation {


    @Resource
    EducationMapper dao;

    @Resource
    UsersMapper Usersdao;
    //分页
    @Override
    public PageBean<Education> queryReturnPage(int pageNo, int pageSize) {
        PageBean<Education> pageBean = new PageBean<>();
        try {
            Map<String, Object> parms = new HashMap<String, Object>();
            //第一页：pageNo:1
            //每页2条记录:pageSize:2
            int start = (pageNo - 1) * pageSize + 1;
            int end = pageNo * pageSize;
            parms.put("startIndex", start);//每一页第一条记录编号
            parms.put("endIndex", end);//每一页最后一条记录编号
            List<com.zhaolian.demo.data.entity.Education> blogs = dao.selectByPage(parms);//分页查询
            int totalCount = dao.getTotalCount();//记录总数
            pageBean.setData(blogs);
            pageBean.setTotalRecords(totalCount);
            pageBean.setPageNo(pageNo);
            pageBean.setPageSize(pageSize);
            System.out.println("业务层返回的分页结果："+pageBean.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
        return pageBean;
    }
    //学历审核通过增加小额额度
    @Override
    public void EducationAdd(Education edu, Users user) {
             //修改状态
             dao.updateByPrimaryKeySelective(edu);
             //调用执行方法
             Usersdao.update(user);
    }

    //根据用户id查询学历信息
    @Override
    public Education selectByid(Integer id) {
        //根据个人信息id查询学历信息
        Education all= this.dao.selectByPrimaryKey(new BigDecimal(id));
        return all;
    }
}

