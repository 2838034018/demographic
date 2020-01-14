package com.ygjy.dao;

import com.ygjy.entity.DictionaryTable;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface    DictionaryTableMapper {
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

    //查询行业类别
    List<DictionaryTable> findSectors();

    //回显避孕情况
    List<DictionaryTable> contraceptionPregnancy();
    /**
     * @Author yuyang
     * @Description //根据 parentId获取字典表集合
     * @Date 11:13 2020/1/14
     * @param parentId
     * @return java.util.List<com.ygjy.entity.DictionaryTable>
     **/
    List<DictionaryTable> getDictionaryTableList(String parentId);
}