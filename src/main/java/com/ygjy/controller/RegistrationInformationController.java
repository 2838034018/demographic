package com.ygjy.controller;

import com.ygjy.entity.PageSelect;
import com.ygjy.entity.PersonalExt;
import com.ygjy.entity.User;
import com.ygjy.service.RegistrationInformationService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @ClassName: RegistrationInformationController
 * @Description: 等记信息审核controller
 * @Author: yuyang
 * @Data: 2020/1/16 14:12
 * @Version: 1.0
 **/
@Controller
@RequestMapping("/registrationInformation")
public class RegistrationInformationController {
    @Resource
    private RegistrationInformationService registrationInformationService;

    /**
     * @Author yuyang
     * @Description //登记信息查询
     * @Date 17:04 2020/1/16
     * @param companyName 查询公司名称
     * @param identity 用户身份
     * @param pageNow 当前页数
     * @return com.ygjy.entity.PageSelect<com.ygjy.entity.PersonalExt>
     **/
    @RequestMapping("/selectList")
    @ResponseBody
    public PageSelect<PersonalExt> selectList(String companyName,String identity, Integer pageNow){
        System.out.println("---------------"+companyName);
        //将查询条件封装成user对象
        User user = new User();
        user.setCompanyName(companyName);
        //判断用户身份设查询信息的身份
        if("1702".equals(identity)){
            user.setIdentity("1701");
        }
        if("1703".equals(identity)){
            user.setIdentity("1702");
        }
        if("1704".equals(identity)){
            user.setIdentity("1703");
        }
        //查询登记信息
        PageSelect<PersonalExt> pageSelect = registrationInformationService.selectList(user,pageNow);
        return pageSelect;
    }
}
