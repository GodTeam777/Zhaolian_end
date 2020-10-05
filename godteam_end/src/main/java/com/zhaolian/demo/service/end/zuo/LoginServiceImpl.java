package com.zhaolian.demo.service.end.zuo;

import com.zhaolian.demo.data.dao.UsersMapper;
import com.zhaolian.demo.data.entity.Users;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("LoginService")
public class LoginServiceImpl implements LoginService {

    @Resource
    UsersMapper usersMapper;

    @Override
    public List<Users> SystemLogin(Users user) {
        return usersMapper.SystemLogin(user);
    }
}
