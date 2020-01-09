package com.ygjy.dao;

import cn.temptation.domain.Landlord;

public interface LandlordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Landlord record);

    int insertSelective(Landlord record);

    Landlord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Landlord record);

    int updateByPrimaryKey(Landlord record);
}