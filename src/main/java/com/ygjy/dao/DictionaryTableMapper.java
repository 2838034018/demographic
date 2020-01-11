package com.ygjy.dao;

import com.ygjy.entity.DictionaryTable;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DictionaryTableMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DictionaryTable record);

    int insertSelective(DictionaryTable record);

    DictionaryTable selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DictionaryTable record);

    int updateByPrimaryKey(DictionaryTable record);

    //查询行业类别
    List<DictionaryTable> findSectors();
}