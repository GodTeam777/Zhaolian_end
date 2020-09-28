package com.zhaolian.demo;

import com.zhaolian.demo.data.dao.BankMapper;
import com.zhaolian.demo.data.dao.UsersMapper;
import com.zhaolian.demo.data.entity.Bank;
import com.zhaolian.demo.data.entity.Users;
import com.zhaolian.demo.data.entity.UsersExample;
import org.apache.ibatis.annotations.Mapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;


import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

@SpringBootTest
class DemoApplicationTests {

    @Resource
    UsersMapper dao;

    @Test
    void contextLoads() {
        System.out.println("!111111111");
        List<Users> allUser = dao.selectByExample(new UsersExample());
        for (Users users : allUser) {
            System.out.println(users.toString());
        }

    }

}
