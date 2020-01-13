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

    List<Region> findByProvince();//查省

    List<Region> findByCity(String superiormumber);//查市县乡

    Region findByPr(String superiormumber);//根据id查省名

    Region findByAl(String superiormumber);//根据id查市县乡名
}