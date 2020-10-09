package com.zhaolian.demo.service.front.jun.Impl;

import ch.qos.logback.core.joran.spi.InterpretationContext;
import com.zhaolian.demo.data.dao.BankMapper;
import com.zhaolian.demo.data.dao.IdcardMapper;
import com.zhaolian.demo.data.dao.UsersMapper;
import com.zhaolian.demo.data.entity.*;
import com.zhaolian.demo.service.front.jun.IUserService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.List;
@Service
public class UserServiceimpl implements IUserService {

    @Resource
    UsersMapper Usersdao;
    @Resource
    IdcardMapper idcardMapper;
    @Resource
    BankMapper bankMapper;
    private InterpretationContext EmptyUtil;

    @Override
    public Users UserLogin(String UName,Integer UPass) {
        UsersExample ex=new UsersExample();
        ex.createCriteria().andPetnameEqualTo(UName);
        ex.createCriteria().andUspwsEqualTo(new BigDecimal(UPass));
        Users user=Usersdao.selectByExample(ex).get(0);
        IdcardExample iex=new IdcardExample();
        iex.createCriteria().andCardidEqualTo(user.getCardid());
        user.setCardid(new BigDecimal( idcardMapper.selectByExample(iex).get(0).getIdcard()));
        return user;
    }
    //注册
    @Override
    public int UserRegister(Users users, Idcard card, Bank b) {
        int i=0;
        //身份证
        //插入
        Idcard idcard=new Idcard();
        idcard.setName(users.getUname());
        idcard.setIdcard(card.getIdcard());
        idcard.setFront(card.getFront());
        idcard.setFan(card.getFan());
        i=idcardMapper.insertSelective(idcard);
        if(i==0){
            return i;
        }
        //查询
        IdcardExample ides=new IdcardExample();
        ides.createCriteria().andIdcardEqualTo(card.getIdcard());
        //插入成功的身份证idcard
        idcard=idcardMapper.selectByExample(ides).get(0);
//        //用户
        //插入
        Users user=new Users();
        user.setUname(users.getUname());
        user.setPetname(users.getPetname());
        user.setUspws(users.getUspws());
        user.setSex(users.getSex());
        user.setBirthday(users.getBirthday());

        user.setCardid(idcard.getCardid());

        user.setType(new BigDecimal(1));
        user.setStatus(new BigDecimal(1));
        user.setSmalldai(new BigDecimal(5000));
        user.setZfpws(users.getZfpws());
        user.setPhone(users.getPhone());
        i=Usersdao.insertSelective(user);
        if(i==0){
            return i;
        }
        //查询
        UsersExample usersExample=new UsersExample();
        usersExample.createCriteria().andCardidEqualTo(idcard.getCardid());
        //插入完后的用户user
        user=Usersdao.selectByExample(usersExample).get(0);


        //银行卡
        //插入
        Bank bank=new Bank();
        bank.setBid(b.getBid());
        bank.setBankcard(b.getBankcard());
        bank.setBrankphone(b.getBrankphone());
        bank.setUsersid(user.getUsersid());
        i=bankMapper.insertSelective(bank);
        if(i==0){
            return i;
        }
        return i;
    }
    //修改登录密码
    @Override
    public int updateLoginpws(Users user){
        return Usersdao.updateByPrimaryKeySelective(user);
    }
    //修改支付
    @Override
    public int updatezfpws(Users user){
        return Usersdao.updateByPrimaryKeySelective(user);
    }
    //修改个人信息
    @Override
    public int updateuserinfo(Users user){
        return Usersdao.updateByPrimaryKeySelective(user);
    }

    //查询银行卡
    @Override
    public List<Bank> selectBank(Users user){
        BankExample ex=new BankExample();
//        ex.createCriteria().andUsersidEqualTo(user.getUsersid());
        ex.createCriteria().andUsersidEqualTo(new BigDecimal(33));
        List<Bank> list=bankMapper.selectByExample(ex);
        return list;
    }

}
