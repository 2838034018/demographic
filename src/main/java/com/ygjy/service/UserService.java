package com.ygjy.service;

import com.ygjy.entity.User;

import java.util.Map;

public interface UserService {
    //登录
    Map<String, Object> login(User user);

    //用户注册
    void insertRegister(User user);
}
