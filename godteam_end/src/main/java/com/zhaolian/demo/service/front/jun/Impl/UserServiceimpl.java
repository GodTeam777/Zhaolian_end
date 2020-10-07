package com.zhaolian.demo.service.front.jun.Impl;

import ch.qos.logback.core.joran.spi.InterpretationContext;
import com.zhaolian.demo.data.dao.UsersMapper;
import com.zhaolian.demo.data.entity.Users;
import com.zhaolian.demo.data.entity.UsersExample;
import com.zhaolian.demo.service.front.jun.IUserService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.math.BigDecimal;
import java.util.List;
@Service
public class UserServiceimpl implements IUserService {

    @Resource
    UsersMapper Usersdao;
    private InterpretationContext EmptyUtil;

    @Override
    public Users UserLogin(String UName,Integer UPass) {
        UsersExample ex=new UsersExample();
        ex.createCriteria().andPetnameEqualTo(UName);
        ex.createCriteria().andUspwsEqualTo(new BigDecimal(UPass));
        List<Users> users=Usersdao.selectByExample(ex);
        Users user=users.get(0);
        return user;
    }

    @Override
    public int UserRegister(Users user) {

        return 0;
    }


}
