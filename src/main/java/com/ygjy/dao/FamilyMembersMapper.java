package com.ygjy.dao;


import com.ygjy.entity.FamilyMembers;

public interface FamilyMembersMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FamilyMembers record);

    int insertSelective(FamilyMembers record);

    FamilyMembers selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FamilyMembers record);

    int updateByPrimaryKey(FamilyMembers record);
}