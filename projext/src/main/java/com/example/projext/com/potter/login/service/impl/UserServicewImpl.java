package com.example.projext.com.potter.login.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.projext.com.potter.login.entity.User;
import com.example.projext.com.potter.login.mapper.UserMapper;
import com.example.projext.com.potter.login.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServicewImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Resource
    private UserMapper userMapper;


    @Override
    public void add(String phone) {
        User user = new User();
        user.setEmail(phone);
        user.setUsername("tiny potter");
        user.setPhone(phone);
        userMapper.insert(user);

    }
}
