package com.zhaolian.demo.web.control.end;

import com.zhaolian.demo.data.dao.UsersMapper;
import com.zhaolian.demo.data.entity.Users;
import com.zhaolian.demo.data.entity.UsersExample;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.math.BigDecimal;

@Controller
public class Test {

    @Resource
    UsersMapper dao;

    @RequestMapping(value = "select",method = RequestMethod.POST)
    public @ResponseBody Users Select(@RequestBody String name){
        System.err.println("启动Select方法！");
        Users users = dao.selectByPrimaryKey(new BigDecimal(6));
        return users;
    }
}
