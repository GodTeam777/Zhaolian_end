package com.zhaolian.demo.service.end.zuo;

import com.zhaolian.demo.data.entity.Users;

import java.util.List;

public interface LoginService {

    //系统登录
    List<Users> SystemLogin(Users user);
}
