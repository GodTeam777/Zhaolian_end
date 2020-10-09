package com.zhaolian.demo.service.front.jun;

import com.zhaolian.demo.data.entity.Bank;
import com.zhaolian.demo.data.entity.Idcard;
import com.zhaolian.demo.data.entity.Users;

import java.util.List;

public interface IUserService {
    public Users UserLogin(String UName,Integer UPass);
    public int UserRegister(Users users, Idcard card, Bank b);
    public int updateLoginpws(Users user);
    public int updatezfpws(Users user);
    public int updateuserinfo(Users user);
    public List<Bank> selectBank(Users user);
}
