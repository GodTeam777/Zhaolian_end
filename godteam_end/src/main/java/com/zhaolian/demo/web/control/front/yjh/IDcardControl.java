package com.zhaolian.demo.web.control.front.yjh;

import com.zhaolian.demo.data.entity.Car;
import com.zhaolian.demo.data.entity.Education;
import com.zhaolian.demo.data.entity.Home;
import com.zhaolian.demo.data.entity.Idcard;
import com.zhaolian.demo.service.front.yjh.impl.Educationimpl;
import com.zhaolian.demo.service.front.yjh.impl.ICarompl;
import com.zhaolian.demo.service.front.yjh.impl.IHomeimpl;
import com.zhaolian.demo.service.front.yjh.impl.Idcardimpl;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
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
        Idcard all=   this.server.selectByid((Integer) data.get("id"));
        Education education=this.Educationserver.selectByid((Integer) data.get("edusersid"));
        Car car=this.ICarserver.selectByid((Integer) data.get("cid"));
        Home home=this.IHomeserver.selectByid((Integer) data.get("cid"));
        Map<String,Object> map=new HashMap<>();
        map.put("all",all);
        map.put("education",education);
        map.put("car",car);
        map.put("home",home);
        return map;
    }

}
