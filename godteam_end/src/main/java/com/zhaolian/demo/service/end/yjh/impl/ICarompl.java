package com.zhaolian.demo.service.end.yjh.impl;

import com.zhaolian.demo.data.dao.CarMapper;
import com.zhaolian.demo.data.dao.UsersMapper;
import com.zhaolian.demo.data.entity.Car;
import com.zhaolian.demo.data.entity.Education;
import com.zhaolian.demo.data.entity.Users;
import com.zhaolian.demo.service.end.yjh.ICar;
import com.zhaolian.demo.service.util.PageBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ICarompl implements ICar {


    @Resource
    CarMapper dao;

    @Resource
    UsersMapper Usersdao;
    //分页
    @Override
    public PageBean<Car> queryReturnPage(int pageNo, int pageSize) {
        PageBean<Car> pageBean = new PageBean<>();
        try {
            Map<String, Object> parms = new HashMap<String, Object>();
            //第一页：pageNo:1
            //每页2条记录:pageSize:2
            int start = (pageNo - 1) * pageSize + 1;
            int end = pageNo * pageSize;
            parms.put("startIndex", start);//每一页第一条记录编号
            parms.put("endIndex", end);//每一页最后一条记录编号
            List<Car> blogs = dao.selectByPage(parms);//分页查询
            for(Car car:blogs){
                car.setCpath("http://localhost:10086/img/"+car.getCpath());
            }
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
    public void CarUpdateandAdd(Car car, Users user) {
        dao.updateByPrimaryKeySelective(car);
        //调用执行方法
        Usersdao.updateCAR(user);
    }

    @Override
    public Car selectByid(Integer id) {
        //根据个人信息id查询详细信息
        Car all=this.dao.selectByPrimaryKey(new BigDecimal(id));
        return all;
    }
}

