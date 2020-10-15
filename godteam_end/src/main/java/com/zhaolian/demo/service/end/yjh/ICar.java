package com.zhaolian.demo.service.end.yjh;

import com.zhaolian.demo.data.entity.Car;
import com.zhaolian.demo.data.entity.Users;
import com.zhaolian.demo.service.util.PageBean;

public interface ICar {
    //车辆全部查询分页
    PageBean<Car> queryReturnPage(int pageNo, int pageSize);
    //车辆审核通过增加小额额度
    public void CarUpdateandAdd(Car car, Users user);
    //根据用户id查询真实姓名，身份证
    public Car selectByid(Integer id);
}
