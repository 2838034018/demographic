package com.ygjy.dao;

import com.ygjy.entity.LivingInfomation;

public interface LivingInfomationMapper {
    int deleteByPrimaryKey(Integer idInfomation);

    int insert(LivingInfomation record);

    int insertSelective(LivingInfomation record);

    LivingInfomation selectByPrimaryKey(Integer idInfomation);

    int updateByPrimaryKeySelective(LivingInfomation record);

    int updateByPrimaryKey(LivingInfomation record);

    void insertDwell(LivingInfomation livingInformation);
}