package com.example.projext.com.potter.login.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.projext.com.potter.login.entity.User;

public interface IUserService extends IService<User> {
    void add(String phone);
}
