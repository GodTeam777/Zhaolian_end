package com.zhaolian.demo.service.front.jun;

import com.zhaolian.demo.data.entity.Bank;
import com.zhaolian.demo.data.entity.Education;
import com.zhaolian.demo.data.entity.Idcard;
import com.zhaolian.demo.data.entity.Users;

import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.util.List;

public interface IUserService {
    public Users UserLogin(String UName,Integer UPass);
    public int UserRegister(Users users, Idcard card, Bank b);
    public int updateLoginpws(Users user);
    public int updatezfpws(Users user);
    public int updateuserinfo(HttpSession session, Users user, Idcard idcard);
    public List<Bank> selectBank(Users user);
    public Users UserSelectByid(Users users);
    public int AddBankCard(Bank bank);
    public Education select_att_education(BigDecimal eduid);
}
