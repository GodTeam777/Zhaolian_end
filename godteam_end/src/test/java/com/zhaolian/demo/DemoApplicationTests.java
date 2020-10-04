package com.zhaolian.demo;

import com.zhaolian.demo.data.dao.BankMapper;
import com.zhaolian.demo.data.dao.UsersMapper;
import com.zhaolian.demo.data.entity.Bank;
import com.zhaolian.demo.data.entity.Users;
import com.zhaolian.demo.data.entity.UsersExample;
import com.zhaolian.demo.service.front.jun.IUserService;
import org.apache.ibatis.annotations.Mapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.multipart.MultipartFile;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class DemoApplicationTests {

    @Resource
    BankMapper dao;

    @Resource
    UsersMapper Usersdao;

    @Resource
    IUserService service;

    @Test
    void contextLoads(HttpServletRequest request) throws FileNotFoundException {
        Users user=service.UserLogin("wangwu",456);
        System.out.println(user.toString());
    }

}
