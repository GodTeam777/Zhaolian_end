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
            all.setFront("http://localhost:10086/img/"+all.getFront());
            map.put("all",all);
        } if(data.get("edusersid")!=null){
            Education education=this.Educationserver.selectByid((Integer) data.get("edusersid"));
            education.setSpath("http://localhost:10086/img/"+education.getSpath());
            map.put("education",education);
        }
         if(data.get("cid")!=null){
            Car car=this.ICarserver.selectByid((Integer) data.get("cid"));
             car.setCpath("http://localhost:10086/img/"+car.getCpath());
            map.put("car",car);

        }
         if(data.get("hid")!=null){
            Home home=this.IHomeserver.selectByid((Integer) data.get("hid"));
             home.setHpath("http://localhost:10086/img/"+home.getHpath());
            map.put("home",home);

        }
        return  map;
    }

}
