package com.zhaolian.demo.web.control.end.zuo;

import com.zhaolian.demo.data.entity.Users;
import com.zhaolian.demo.service.end.zuo.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class LoginControl {

    @Resource
    LoginService loginService;
    
    @RequestMapping(value = "system_login", method = RequestMethod.POST)
    public @ResponseBody Integer SystemLogin(@RequestBody Users user, HttpSession session){
        Integer count = 0;
        List<Users> login = loginService.SystemLogin(user);
        if(login.size() > 0) {
            count = 1;
            session.setAttribute("login_message", "登录成功！");
        }else {
            count = 0;
            session.setAttribute("login_message", "登录失败！");
        }
        return count;
    }
}
