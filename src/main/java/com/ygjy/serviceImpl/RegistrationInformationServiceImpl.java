package com.ygjy.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.ygjy.dao.PersonalMapper;
import com.ygjy.entity.PageSelect;
import com.ygjy.entity.PersonalExt;
import com.ygjy.entity.User;
import com.ygjy.service.RegistrationInformationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: RegistrationInformationServiceImpl
 * @Description: 登记信息审核service实现类
 * @Author: yuyang
 * @Data: 2020/1/16 14:15
 * @Version: 1.0
 **/
@Service
public class RegistrationInformationServiceImpl implements RegistrationInformationService {

    @Resource
    private PersonalMapper personalMapper;

    /**
     * @Author yuyang
     * @Description //查询登记信息列表数据
     * @Date 14:20 2020/1/16
     * @param user 查询信息用户公司、用户身份 com.ygjy.entity.User
     * @param pageNow 当前页码
     * @return com.ygjy.entity.PageSelect<com.ygjy.entity.PersonalExt>
     **/
    @Override
    public PageSelect<PersonalExt> selectList(User user, Integer pageNow) {
        //配置当前页和单页数据条数
        PageHelper.startPage(pageNow,5);
        //获取登记信息数据集合
        List<PersonalExt> personalExtList = personalMapper.getPersonalExt(user);
//        System.out.println("---------------"+personalExtList.get(0).getId());
        PageSelect<PersonalExt> pageSelect = new PageSelect(personalExtList,5);
        pageSelect.setSelCompanyName(user.getCompanyName());
        pageSelect.setPageNow(pageNow);
        return pageSelect;
    }
}
