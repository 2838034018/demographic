package com.ygjy.dao;


import com.ygjy.entity.ChildrenNumber;

public interface ChildrenNumberMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ChildrenNumber record);

    int insertSelective(ChildrenNumber record);

    ChildrenNumber selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ChildrenNumber record);

    int updateByPrimaryKey(ChildrenNumber record);
}