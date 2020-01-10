package com.ygjy.dao;

import com.ygjy.entity.NowAddress;

public interface NowAddressMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NowAddress record);

    int insertSelective(NowAddress record);

    NowAddress selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NowAddress record);

    int updateByPrimaryKey(NowAddress record);
}