package com.zhaolian.demo.web.control.end.yjh;

import com.zhaolian.demo.data.entity.Car;
import com.zhaolian.demo.data.entity.Education;
import com.zhaolian.demo.data.entity.Home;
import com.zhaolian.demo.data.entity.Idcard;
import com.zhaolian.demo.service.end.yjh.impl.Educationimpl;
import com.zhaolian.demo.service.end.yjh.impl.ICarompl;
import com.zhaolian.demo.service.end.yjh.impl.IHomeimpl;
import com.zhaolian.demo.service.end.yjh.impl.Idcardimpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Controller
public class IDcardControl {
    @Resource
    Idcardimpl server;

    @Resource
    Educationimpl Educationserver;

    @Resource
    ICarompl  ICarserver;


    @Resource
    IHomeimpl IHomeserver;


    //查看详情信息
    @RequestMapping(value="selectByid",method = RequestMethod.POST)
    public @ResponseBody
    Map<String,Object> selectByid (@RequestBody Map data){
        Map<String,Object> map=new HashMap<>();
        if(data.get("id")!=null){
            Idcard all=   this.server.selectByid((Integer) data.get("id"));
            map.put("all",all);
            System.out.println("查询身份证:"+all.toString());
        } if(data.get("edusersid")!=null){
            Education education=this.Educationserver.selectByid((Integer) data.get("edusersid"));
            map.put("education",education);
            System.out.println("查询学历:"+education.toString());
        }
         if(data.get("cid")!=null){
            Car car=this.ICarserver.selectByid((Integer) data.get("cid"));
            map.put("car",car);
            System.out.println("查询车辆:"+car.toString());
        }
         if(data.get("hid")!=null){
            Home home=this.IHomeserver.selectByid((Integer) data.get("hid"));
            map.put("home",home);
            System.out.println("查询房屋:"+home.toString());
        }
        return  map;
    }

}
