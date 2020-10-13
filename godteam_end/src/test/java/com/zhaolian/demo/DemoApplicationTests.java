package com.zhaolian.demo;


import com.zhaolian.demo.data.dao.BigdaiMapper;
import com.zhaolian.demo.data.dao.BigdaiorderMapper;
import com.zhaolian.demo.data.entity.*;
import com.zhaolian.demo.service.end.li.Bigdaiservice;
import com.zhaolian.demo.web.util.BigdaiDTO;

import com.zhaolian.demo.web.util.BigdaiordeDTO;
import com.zhaolian.demo.web.util.PageBean;
import org.junit.jupiter.api.Test;


import com.zhaolian.demo.data.dao.BankMapper;
import com.zhaolian.demo.data.dao.IdcardMapper;
import com.zhaolian.demo.data.dao.UsersMapper;

import com.zhaolian.demo.data.entity.*;

import com.zhaolian.demo.service.front.jun.IUserService;

import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;



import javax.annotation.Resource;


import java.math.BigDecimal;
import java.util.Date;

import java.util.List;


@SpringBootTest
class DemoApplicationTests {


//    @Resource
//    UsersMapper Usersdao;
//    @Resource
//    IdcardMapper idcardMapper;
//    @Resource
//
//    Bigdaiservice ser;
    @Resource
    BigdaiMapper dao;
//    @Resource
//    BigdaiorderMapper dao1;
//
//    BankMapper bankMapper;
//
//
//
//
//    //已完成
    @Test
//
    void contextLoads() {
        Bigdai dai = new Bigdai();
        dai.setBdname("农行抵押贷");
        dai.setBdpath("5.jpg");
        dai.setInterest(new BigDecimal(16.00));
        dai.setBigdaiTitle("qw");
        dai.setBigdaiBody("er");
        dai.setBdtype("质押贷");
        dai.setBddate(new BigDecimal(6));
        dai.setSmallMoney(new BigDecimal(300000));
        dai.setBigMoney(new BigDecimal(3000000));
        int a = dao.insert(dai);
        System.out.println(a);
    }

////int a=dao.getBigdaiCount(dto);
////        System.out.println(a);
////        PageBean<Bigdai> pb=   ser.getByPage(dto,1,2);
////        System.out.println(pb.getRows());\
////        Bigdai dai=new Bigdai();
////        dai.setBdid(41);
////        dai.setBigdaiBody("还是他的阿斗");
////
////
////     int a= dao.updateByPrimaryKeySelective(dai);
////        dao.deleteByPrimaryKey(41);
////BigdaiordeDTO dto=new BigdaiordeDTO();
////     int a = dao1.getBigdaiorderCount(dto);
////        System.out.println(a);
//
//    void contextLoads(){
////查询（登录）
////        UsersExample es=new UsersExample();
////        es.createCriteria().andPetnameEqualTo("lisan");
////        es.createCriteria().andUspwsEqualTo(new BigDecimal(123));
////         List list =  Usersdao.selectByExample(es);
////        System.out.println(list.toString());
//
//
// //插入（注册）
//        //身份证
//        //插入
//        Idcard idcard=new Idcard();
////        idcard.setName("李三");
////        idcard.setIdcard("1233211233211233");
////        idcard.setFront("1233321313");
////        idcard.setFan("1233321313");
////
////        int i=idcardMapper.insertSelective(idcard);
////        System.out.println(i);
//        //查询
//        IdcardExample ides=new IdcardExample();
//        ides.createCriteria().andIdcardEqualTo("1233211233211233");
//        idcard=idcardMapper.selectByExample(ides).get(0);
//        System.out.println(idcard);
//
//        //银行卡
//        //插入
//        Bank bank=new Bank();
////        bank.setBid(new BigDecimal(1));
////        bank.setBankcard(new BigDecimal(12332112332112L));
////        bank.setBrankphone("12332112355");
////        int i =bankMapper.insertSelective(bank);
////        System.out.println(i);
//        //查询
//        BankExample bankExample=new BankExample();
//        bankExample.createCriteria().andBankcardEqualTo(new BigDecimal(12332112332112l));
//        bank=bankMapper.selectByExample(bankExample).get(0);
//        System.out.println(bank.toString());
////        //用户
//        //插入
//        Users user=new Users();
//        user.setUname("李三");
//        user.setPetname("lisan");
//        user.setUspws(new BigDecimal(123));
//        user.setSex("男");
//        user.setBirthday(new Date());
//
//        user.setCardid(idcard.getCardid());
//
//        user.setType(new BigDecimal(1));
//        user.setStatus(new BigDecimal(1));
//        user.setSmalldai(new BigDecimal(80000));
//        user.setZfpws(new BigDecimal(123456));
//       user.setPhone("12312312311");
//
//        int i=Usersdao.insertSelective(user);
//        System.out.println(i);
//
//        UsersExample usersExample=new UsersExample();
//        usersExample.createCriteria().andPetnameEqualTo("lisan");
//        usersExample.createCriteria().andUspwsEqualTo(new BigDecimal(123));
//        user=Usersdao.selectByExample(usersExample).get(0);
//
//        bank.setUsersid(user.getUsersid());
//        bankMapper.updateByPrimaryKeySelective(bank);
//
////删除
////        UsersExample us=new UsersExample();
////        us.createCriteria().andPetnameEqualTo("lisan");
////        int i=Usersdao.deleteByExample(us);
////        System.out.println(i);
//
//    }

//}
}
