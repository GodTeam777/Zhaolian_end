package com.zhaolian.demo.service.front.jun;

import com.zhaolian.demo.data.entity.*;

import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public interface IUserService {
    public int geyproOrderTotal(Users users);
    public List<Map> selectproOrder(Users users,int pageno,int pagesize);
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
    public List<SamlldaiOrder>  selectSamllOrder(Users users,Integer pageno,Integer pagesize);
    public List<Map>  selectSamllOrderByid(BigDecimal id);
    public List<Smallhuankuan>  selectsmallhuankuan(HttpSession session,Integer pageno,Integer pagesize);
    public int addrepayment(Smallhuankuan smallhuankuan,SamlldaiOrder samlldaiOrder);
    public List<Map>  selectBigdaiorder(Users users);
    public List<Map>  selectBigdaiorderByid(BigDecimal id);
    public List<Bighuankuan>  selectbighuankuan(Users users,Integer pageno,Integer pagesize);
    public int addbigrepayment(Bighuankuan bighuankuan,Bigdaiorder bigdaiorder);
    public int geySamllOrderTotal(Users users);
}
