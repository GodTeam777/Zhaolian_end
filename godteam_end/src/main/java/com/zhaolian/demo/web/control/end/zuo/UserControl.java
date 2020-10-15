package com.zhaolian.demo.web.control.end.zuo;

import com.zhaolian.demo.service.end.zuo.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class UserControl {

    @Resource
    UserService userService;

    @RequestMapping(value = "user_count", method = RequestMethod.POST)
    public @ResponseBody Integer UserCount(){
        System.err.println("用户总数："+userService.UserCount());
        return userService.UserCount();
    }
}
