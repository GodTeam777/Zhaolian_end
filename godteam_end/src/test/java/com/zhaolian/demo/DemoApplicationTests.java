package com.zhaolian.demo;


import com.zhaolian.demo.data.dao.BankMapper;
import com.zhaolian.demo.data.dao.IdcardMapper;
import com.zhaolian.demo.data.dao.UsersMapper;
import com.zhaolian.demo.data.entity.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


@SpringBootTest
class DemoApplicationTests {


    @Resource
    UsersMapper Usersdao;
    @Resource
    IdcardMapper idcardMapper;
    @Resource
    BankMapper bankMapper;



    //已完成
    @Test
    void contextLoads() throws ParseException {
        Users user=new Users();
        user.setUsersid(new BigDecimal(4));
        user.setUname("木兰兰");
        user.setSex("女");
        user.setPhone("12332112312");
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
        user.setBirthday(format.parse("2000-01-01"));
        System.out.println(user.toString());
        int i=Usersdao.updateByPrimaryKeySelective(user);
        System.out.println(i);







//查询（登录）
//        UsersExample es=new UsersExample();
//        es.createCriteria().andPetnameEqualTo("lisan");
//        es.createCriteria().andUspwsEqualTo(new BigDecimal(123));
//         List list =  Usersdao.selectByExample(es);
//        System.out.println(list.toString());





        //插入（注册）
        //身份证
        //插入
//        Idcard idcard=new Idcard();
//        idcard.setName("李三");
//        idcard.setIdcard("1233211233211233");
//        idcard.setFront("1233321313");
//        idcard.setFan("1233321313");
//
//        int a=idcardMapper.insertSelective(idcard);
//        System.out.println(a);
//        //查询
//        IdcardExample ides=new IdcardExample();
//        ides.createCriteria().andIdcardEqualTo("1233211233211233");
//        idcard=idcardMapper.selectByExample(ides).get(0);
//        System.out.println(idcard);



//        //用户
        //插入
//        Users user=new Users();
//        user.setUname("李信");
//        user.setPetname("lixin");
//        user.setUspws(new BigDecimal(123));
//        user.setSex("男");
//        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
//        String riqi="2020-01-01";
//
//        user.setBirthday(format.parse(riqi));
//
//        user.setCardid(idcard.getCardid());
//
//        user.setType(new BigDecimal(1));
//        user.setStatus(new BigDecimal(1));
//        user.setSmalldai(new BigDecimal(5000));
//        user.setZfpws(new BigDecimal(123456));
//       user.setPhone("12312312311");
//
//        int b=Usersdao.insertSelective(user);
//        System.out.println(b);
//
//        UsersExample usersExample=new UsersExample();
//        usersExample.createCriteria().andPetnameEqualTo("lixin");
//        usersExample.createCriteria().andUspwsEqualTo(new BigDecimal(123));
//        user=Usersdao.selectByExample(usersExample).get(0);


        //银行卡
        //插入
//        Bank bank=new Bank();
//        bank.setBid(new BigDecimal(1));
//        bank.setBankcard(new BigDecimal(12332112332112L));
//        bank.setBrankphone("12332112355");
//        int i =bankMapper.insertSelective(bank);
//        System.out.println(i);
//        //查询
//        BankExample bankExample=new BankExample();
//        bankExample.createCriteria().andBankcardEqualTo(new BigDecimal(12332112332112l));
//        bank=bankMapper.selectByExample(bankExample).get(0);
//        System.out.println(bank.toString());
//        bank.setUsersid(user.getUsersid());
//        bankMapper.updateByPrimaryKeySelective(bank);

//删除
//        UsersExample us=new UsersExample();
//        us.createCriteria().andPetnameEqualTo("lisan");
//        int i=Usersdao.deleteByExample(us);
//        System.out.println(i);
    }

}
