package com.ygjy.serviceImpl;

import com.ygjy.dao.UserMapper;
import com.ygjy.entity.Region;
import com.ygjy.entity.User;
import com.ygjy.service.RegionService;
import com.ygjy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    public static final Logger LOGGER = Logger.getLogger("UserServiceImpl.class");

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private HttpSession session;
    @Autowired
    private RegionService regionService;

    //登录
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Map<String, Object> login(User user) {
        HashMap<String, Object> map = new HashMap<>();
        String password = user.getPassword();
        try {
            User login = userMapper.login(user);
            if (login != null) {
                Integer id = login.getId();
                session.setAttribute("userId", id);
                LOGGER.info("id=" + id);
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

    @Override
    public void insertRegister(User user) {
        Region province = regionService.findByPr(user.getProvince());
        user.setProvince(province.getName());//省
        Region city = regionService.findByAl(user.getCity());
        user.setCity(city.getName());//市
        Region district = regionService.findByAl(user.getDistrict());
        user.setDistrict(district.getName());//县区
        Region town = regionService.findByAl(user.getTown());
        user.setTown(town.getName());//镇
        user.setStatus("1");
        user.setGmtCreate(new Date());//插入创建时间
        user.setGmtModified(new Date());//插入更新时间
        userMapper.insertRegister(user);
    }
}
