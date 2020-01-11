package com.ygjy.serviceImpl;

import com.ygjy.dao.UserMapper;
import com.ygjy.entity.User;
import com.ygjy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    public static final Logger LOGGER = Logger.getLogger("UserServiceImpl.class");
    @Autowired
    private UserMapper userMapper;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Map<String, Object> login(User user) {
        HashMap<String, Object> map = new HashMap<>();
        String password = user.getPassword();
        try {
            User login = userMapper.login(user);
            if (login != null) {
                if (password.equals(login.getPassword())) {
                    map.put("message", "ok");
                    LOGGER.info("UserServiceImpl----login登录成功");
                    return map;
                } else {
                    map.put("message", "密码错误");
                    LOGGER.info("UserServiceImpl----login密码错误");
                    return map;
                }
            } else {
                map.put("message", "此用户不存在");
                LOGGER.info("UserServiceImpl----login此用户不存在");
                return map;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }
}
