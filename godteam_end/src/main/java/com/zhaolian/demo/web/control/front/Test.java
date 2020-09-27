package com.zhaolian.demo.web.control.front;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Test {
    @RequestMapping("/goto_test")
    public @ResponseBody
    String test(){
        System.out.println("启动方法test实现跨域访问");
        return "welcome to newer";
    }
}
