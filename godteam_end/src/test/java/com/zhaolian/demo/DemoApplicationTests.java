package com.zhaolian.demo;

import com.zhaolian.demo.data.dao.BankMapper;
import com.zhaolian.demo.data.dao.UsersMapper;
import com.zhaolian.demo.data.entity.Bank;
import com.zhaolian.demo.data.entity.Bighuankuan;
import com.zhaolian.demo.data.entity.Users;
import com.zhaolian.demo.data.entity.UsersExample;
<<<<<<< HEAD
import com.zhaolian.demo.service.end.zuo.LoansService;
=======
import com.zhaolian.demo.service.front.jun.IUserService;
>>>>>>> fa6ec94ef662a75da0f56ed970089c10f7b3e2fc
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
    UsersMapper Usersdao;

    @Resource
<<<<<<< HEAD
    LoansService loansService;

    @Test
    void contextLoads() {
        List<Bighuankuan> all_huankuan = loansService.huankuan_chart();
        for (Bighuankuan huankuan : all_huankuan) {
            for (int j = 0; j < all_huankuan.size(); j++) {
                System.err.println(huankuan.getHuanDate());
            }
        }
=======
    IUserService service;

    @Test
    void contextLoads(HttpServletRequest request) throws FileNotFoundException {
        Users user=service.UserLogin("wangwu",456);
        System.out.println(user.toString());

>>>>>>> fa6ec94ef662a75da0f56ed970089c10f7b3e2fc
    }

}
