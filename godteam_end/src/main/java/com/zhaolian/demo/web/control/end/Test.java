package com.zhaolian.demo.web.control.end;

import com.zhaolian.demo.data.entity.Bigdai;
import com.zhaolian.demo.data.entity.Users;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class Test {

    @RequestMapping("test")
    public @ResponseBody String test(@RequestBody Bigdai bigdai){
        System.out.println("进入控制器");

        System.err.println("前端传递的对象数据："+bigdai.getBdname());
        System.err.println("前端传递的对象数据标题："+bigdai.getBigdaiTitle());
        System.err.println("前端传递的对象数据身体："+bigdai.getBigdaiBody());
        int a=Integer.valueOf(bigdai.getBddate()).intValue();
        double b= Double.valueOf(bigdai.getInterest()).doubleValue();
        int c=Integer.valueOf(bigdai.getSmallMoney()).intValue();
        int d=Integer.valueOf(bigdai.getBigMoney()).intValue();
        System.err.println("前端传递的对象数据周期："+a);
        System.err.println("前端传递的对象数据as："+b);
        System.err.println("前端传递的对象数据e："+c);
        System.err.println("前端传递的对象数据c："+d);
       String name = "张三";
        return name;
    }
}
