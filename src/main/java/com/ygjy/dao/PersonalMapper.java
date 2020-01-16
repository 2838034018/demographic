package com.ygjy.dao;

import com.ygjy.entity.Personal;
import com.ygjy.entity.PersonalExt;
import com.ygjy.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PersonalMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Personal record);

    int insertSelective(Personal record);

    Personal selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Personal record);

    int updateByPrimaryKey(Personal record);
    /**
     * @Author yuyang
     * @Description //根据个人信息获取个人信息id
     * @Date 9:09 2020/1/11
     * @param personal
     * @return java.lang.Integer
     **/
    Integer getPersonalId(Personal personal);
    /**
     * @Author yuyang
     * @Description //根据personalId获取个人信息
     * @Date 17:39 2020/1/14
     * @param personalId
     * @return com.ygjy.entity.Personal
     **/
    Personal getPersaonal(Integer personalId);
    /**
     * @Author yuyang
     * @Description //登记信息审核查询
     * @Date 18:33 2020/1/15
     * @param user 查询信息用户公司、用户身份 com.ygjy.entity.User
     * @return com.ygjy.entity.PersonalExt
     **/
    List<PersonalExt> getPersonalExt(User user);
}