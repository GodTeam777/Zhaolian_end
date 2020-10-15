package com.zhaolian.demo.web.control.end;


import com.zhaolian.demo.data.entity.Bigdai;
import com.zhaolian.demo.data.entity.Users;

import com.zhaolian.demo.data.dao.UsersMapper;
import com.zhaolian.demo.data.entity.Users;
import com.zhaolian.demo.data.entity.UsersExample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.Map;

import javax.annotation.Resource;
import java.math.BigDecimal;


@Controller
public class Test {


//    @RequestMapping("test")
//    public @ResponseBody String test(@RequestBody Bigdai bigdai){
//        System.out.println("进入控制器");
//
//        System.err.println("前端传递的对象数据："+bigdai.getBdname());
//        System.err.println("前端传递的对象数据标题："+bigdai.getBigdaiTitle());
//        System.err.println("前端传递的对象数据身体："+bigdai.getBigdaiBody());
//        int a=Integer.valueOf(bigdai.getBddate()).intValue();
//        double b= Double.valueOf(bigdai.getInterest()).doubleValue();
//        int c=Integer.valueOf(bigdai.getSmallMoney()).intValue();
//        int d=Integer.valueOf(bigdai.getBigMoney()).intValue();
//        System.err.println("前端传递的对象数据周期："+a);
//        System.err.println("前端传递的对象数据as："+b);
//        System.err.println("前端传递的对象数据e："+c);
//        System.err.println("前端传递的对象数据c："+d);
//       String name = "张三";
//        return name;
//
//    @Resource
//    UsersMapper dao;
//
//    @RequestMapping(value = "select",method = RequestMethod.POST)
//    public @ResponseBody Users Select(@RequestBody String name){
//        System.err.println("启动Select方法！");
//        Users users = dao.selectByPrimaryKey(new BigDecimal(6));
//        return users;
//
//    }

}
