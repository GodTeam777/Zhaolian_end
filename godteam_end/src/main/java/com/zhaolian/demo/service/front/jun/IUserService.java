package com.zhaolian.demo.service.front.jun;

<<<<<<< HEAD
import com.zhaolian.demo.data.entity.Users;

import com.zhaolian.demo.data.entity.Bank;
import com.zhaolian.demo.data.entity.Education;
import com.zhaolian.demo.data.entity.Idcard;
import com.zhaolian.demo.data.entity.Users;
=======
import com.zhaolian.demo.data.entity.*;
>>>>>>> 795cdf6023a11adcf3d4f441e3e7040ce0da4683

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
    public int att_education(HttpSession session,Education education);
    public Home select_att_house(BigDecimal hid);
    public int att_house(HttpSession session,Home home);
    public Car select_att_car(BigDecimal cid);
    public int att_car(HttpSession session,Car car);
}
