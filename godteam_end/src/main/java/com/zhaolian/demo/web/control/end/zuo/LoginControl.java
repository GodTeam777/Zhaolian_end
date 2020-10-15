package com.zhaolian.demo.web.control.end.zuo;

import com.zhaolian.demo.data.entity.Users;
import com.zhaolian.demo.service.end.zuo.LoginService;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class LoginControl {

    @Resource
    LoginService loginService;

    @RequestMapping(value = "system_login", method = RequestMethod.POST)
    public @ResponseBody List<Users> SystemLogin(HttpSession session, @RequestBody Users user){
        List<Users> users_one = loginService.SystemLogin(user);
        for (Users users : users_one) {
            session.setAttribute("login", users);
        }
        return users_one;
    }

    @RequestMapping(value = "session_login")
    public @ResponseBody Users SionLogin(HttpSession session) {
        Users login = (Users) session.getAttribute("login");
        return login;
    }
}
