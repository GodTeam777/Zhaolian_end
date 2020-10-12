package com.zhaolian.demo.service.front.yjh.impl;

import com.zhaolian.demo.data.dao.HomeMapper;
import com.zhaolian.demo.data.dao.UsersMapper;
import com.zhaolian.demo.data.entity.Car;
import com.zhaolian.demo.data.entity.Home;
import com.zhaolian.demo.data.entity.Idcard;
import com.zhaolian.demo.data.entity.Users;
import com.zhaolian.demo.service.front.yjh.IHome;
import com.zhaolian.demo.service.util.PageBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class IHomeimpl implements IHome {

    @Resource
    HomeMapper dao;
    @Resource
    UsersMapper Usersdao;
    //分页
    @Override
    public PageBean<Home> queryReturnPage(int pageNo, int pageSize) {
        PageBean<Home> pageBean = new PageBean<>();
        try {
            Map<String, Object> parms = new HashMap<String, Object>();
            //第一页：pageNo:1
            //每页2条记录:pageSize:2
            int start = (pageNo - 1) * pageSize + 1;
            int end = pageNo * pageSize;
            parms.put("startIndex", start);//每一页第一条记录编号
            parms.put("endIndex", end);//每一页最后一条记录编号
            List<Home> blogs = dao.selectByPage(parms);//分页查询
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

    @Override
    public void HomeUpdateandAdd(Home home, Users user) {
        dao.updateByPrimaryKeySelective(home);
        //调用执行方法
        Usersdao.updateHome(user);
    }

    @Override
    public Home selectByid(Integer id) {
        //根据个人信息id查询详细信息
        Home all=this.dao.selectByPrimaryKey(new BigDecimal(id));
        return all;
    }
}
