package com.ygjy.dao;

import com.ygjy.entity.Region;

import java.util.List;

public interface RegionMapper {
    int deleteByPrimaryKey(String id);

    int insert(Region record);

    int insertSelective(Region record);

    Region selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Region record);

    int updateByPrimaryKey(Region record);

    List<Region> findByProvince();

    List<Region> findByCity(String id);
}