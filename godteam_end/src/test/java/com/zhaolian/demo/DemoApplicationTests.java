package com.zhaolian.demo;

import com.zhaolian.demo.data.dao.BigdaiMapper;
import com.zhaolian.demo.data.dao.BigdaiorderMapper;
import com.zhaolian.demo.data.entity.*;
import com.zhaolian.demo.service.end.li.Bigdaiservice;
import com.zhaolian.demo.web.util.BigdaiDTO;

import com.zhaolian.demo.web.util.BigdaiordeDTO;
import com.zhaolian.demo.web.util.PageBean;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class DemoApplicationTests {

    @Resource
    Bigdaiservice ser;
    @Resource
    BigdaiMapper dao;
    @Resource
    BigdaiorderMapper dao1;

    @Test
    void contextLoads() {
//        Bigdai dai=new Bigdai();
//        dai.setBdname("农行抵押贷");
//        dai.setBdpath("5.jpg");
//        dai.setInterest(16.00);
//        dai.setBigdaiTitle("qw");
//        dai.setBigdaiBody("er");
//        dai.setBdtype("质押贷");
//        dai.setBddate(6);
//        dai.setSmallMoney(300000);
//        dai.setBigMoney(3000000);
// int a= dao.insert(dai);
//        System.out.println(a);
//        BigdaiDTO dto=new BigdaiDTO();
//        dto.setBdname("农行抵押贷");
//        dto.setBdtype("抵押贷");
//int a=dao.getBigdaiCount(dto);
//        System.out.println(a);
//        PageBean<Bigdai> pb=   ser.getByPage(dto,1,2);
//        System.out.println(pb.getRows());\
//        Bigdai dai=new Bigdai();
//        dai.setBdid(41);
//        dai.setBigdaiBody("还是他的阿斗");
//
//
//     int a= dao.updateByPrimaryKeySelective(dai);
//        dao.deleteByPrimaryKey(41);
//BigdaiordeDTO dto=new BigdaiordeDTO();
//     int a = dao1.getBigdaiorderCount(dto);
//        System.out.println(a);
    }

}
