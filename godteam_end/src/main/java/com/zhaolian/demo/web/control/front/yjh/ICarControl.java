package com.zhaolian.demo.web.control.front.yjh;

import com.zhaolian.demo.data.entity.Car;
import com.zhaolian.demo.data.entity.Education;
import com.zhaolian.demo.data.entity.Users;
import com.zhaolian.demo.service.front.yjh.ICar;
import com.zhaolian.demo.service.front.yjh.impl.ICarompl;
import com.zhaolian.demo.service.util.PageBean;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.URLDecoder;

@Controller
public class ICarControl {
    @Resource
    ICarompl service;


    //车辆分页
    @RequestMapping(value="queryPagesCar")
    public @ResponseBody
    PageBean<Car>
    queryPages(PageBean page){
        System.out.println("===========启动控制器=========");
        PageBean<Car> pageBeans =
                this.service.queryReturnPage(page.getPageNo(),
                        page.getPageSize());
        System.out.println("==========="+pageBeans.toString());
        return pageBeans;
    }
    //审核认证通过
    @RequestMapping(value="updateCar",method = RequestMethod.POST)
    public @ResponseBody
    Car update(@RequestBody String content) throws UnsupportedEncodingException {
        String myContent = URLDecoder.decode(content,"utf-8");
        System.out.println("原始字符："+myContent);
        int pos = myContent.lastIndexOf("=");
        String result = myContent.substring(0, pos);
        JSONObject jsonObject = JSONObject.fromObject(result);
        Car car= (Car) JSONObject.toBean(jsonObject,Car.class);
        System.out.println("JSON转换后的对象："+car.toString());
        Users user=new Users();
        user.setCid(car.getCid());
        //车辆审核通过额度赋值为20000元
        user.setSmalldai(new BigDecimal(20000));
        this.service.CarUpdateandAdd(car,user);
        return car;
    }
    //审核认证不通过
    @RequestMapping(value="updateCarfalse",method = RequestMethod.POST)
    public @ResponseBody
    Car updatefalse(@RequestBody String content) throws UnsupportedEncodingException {
        String myContent = URLDecoder.decode(content,"utf-8");
        System.out.println("原始字符："+myContent);
        int pos = myContent.lastIndexOf("=");
        String result = myContent.substring(0, pos);
        JSONObject jsonObject = JSONObject.fromObject(result);
        Car car= (Car) JSONObject.toBean(jsonObject,Car.class);
        System.out.println("JSON转换后的对象："+car.toString());
        this.service.CarUpdateandAdd(car,null);
        return car;
    }
}
