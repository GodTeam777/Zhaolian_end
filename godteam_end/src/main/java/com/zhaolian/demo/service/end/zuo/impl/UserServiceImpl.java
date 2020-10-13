package com.zhaolian.demo.service.end.zuo.impl;

import com.zhaolian.demo.data.dao.UsersMapper;
import com.zhaolian.demo.service.end.zuo.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    UsersMapper usersMapper;

    @Override
    public int UserCount() {
        return usersMapper.getUserCount();
    }
}
