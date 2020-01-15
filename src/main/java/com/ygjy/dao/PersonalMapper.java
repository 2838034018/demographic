package com.ygjy.dao;

import com.ygjy.entity.Personal;
import org.apache.ibatis.annotations.Mapper;

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
}