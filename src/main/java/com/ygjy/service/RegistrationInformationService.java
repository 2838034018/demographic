package com.ygjy.service;

import com.ygjy.entity.PageSelect;
import com.ygjy.entity.PersonalExt;
import com.ygjy.entity.User;

/**
 * @InterfaceName: RegistrationInformationService
 * @Description: 登记信息审核service接口
 * @Author: yuyang
 * @Data: 2020/1/16 14:14
 * @Version: 1.0
 **/
public interface RegistrationInformationService {
    
    /**
     * @Author yuyang
     * @Description //查询登记信息列表数据
     * @Date 14:19 2020/1/16
     * @param user 查询信息用户公司、用户身份 com.ygjy.entity.User
     * @param pageNow 当前页码
     * @return com.ygjy.entity.PageSelect<com.ygjy.entity.PersonalExt>
     **/
    PageSelect<PersonalExt> selectList(User user, Integer pageNow);
}
