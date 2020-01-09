package com.ygjy.dao;


import com.ygjy.entity.Birthcontrolinfo;

public interface BirthcontrolinfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Birthcontrolinfo record);

    int insertSelective(Birthcontrolinfo record);

    Birthcontrolinfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Birthcontrolinfo record);

    int updateByPrimaryKey(Birthcontrolinfo record);
}