package com.ygjy.controller;

import com.ygjy.entity.User;
import com.ygjy.service.EchartsMapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("echarts")
public class FloatingPopulationController {
    @Autowired
    private EchartsMapService echartsMapService;

    @RequestMapping("selectList")
    @ResponseBody
    public List<User> selectList() {
        List<User> users = echartsMapService.selectList();
        return users;
    }

}
