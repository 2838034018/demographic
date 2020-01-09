package com.ygjy.dao;

import cn.temptation.domain.Employmentinfo;

public interface EmploymentinfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Employmentinfo record);

    int insertSelective(Employmentinfo record);

    Employmentinfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Employmentinfo record);

    int updateByPrimaryKey(Employmentinfo record);
}