package com.zhaolian.demo.service.front.jun;

import com.zhaolian.demo.data.entity.Users;

public interface IUserService {
    public Users UserLogin(String UName,Integer UPass);
    public int UserRegister(Users user);
}
