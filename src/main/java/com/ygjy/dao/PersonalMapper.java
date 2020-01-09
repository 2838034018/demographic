package com.ygjy.dao;


import com.ygjy.entity.Personal;

public interface PersonalMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Personal record);

    int insertSelective(Personal record);

    Personal selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Personal record);

    int updateByPrimaryKey(Personal record);
}