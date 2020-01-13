package com.ygjy.dao;

import com.ygjy.entity.DictionaryTable;

import java.util.List;

public interface DictionaryTableMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DictionaryTable record);

    int insertSelective(DictionaryTable record);

    DictionaryTable selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DictionaryTable record);

    int updateByPrimaryKey(DictionaryTable record);

    //查询居住方式
    List<DictionaryTable> livingType();

    //查询居住事由
    List<DictionaryTable> liveFor();
}