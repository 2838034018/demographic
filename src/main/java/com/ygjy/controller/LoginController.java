package com.ygjy.controller;

import com.ygjy.entity.User;
import com.ygjy.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class LoginController {
    public static final Logger LOGGER = Logger.getLogger("UserServiceImpl.class");
    @Autowired
    private UserService userService;

    //登录
    @RequestMapping("login")
    @ResponseBody
    public Map<String, Object> login(User user) {
        Map<String, Object> login = userService.login(user);
        return login;
    }

    //注册
    @RequestMapping("register")
    public String insertRegister(User user) {
        userService.insertRegister(user);
        return "login/login";
    }
}
