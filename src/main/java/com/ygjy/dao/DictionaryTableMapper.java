package com.ygjy.dao;

import com.ygjy.entity.DictionaryTable;

public interface DictionaryTableMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DictionaryTable record);

    int insertSelective(DictionaryTable record);

    DictionaryTable selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DictionaryTable record);

    int updateByPrimaryKey(DictionaryTable record);
}