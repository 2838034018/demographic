package com.ygjy.service;

import com.ygjy.entity.DictionaryTable;

import java.util.List;
/**
 * @Author yuyang
 * @Description //字典表service接口
 * @Date 11:09 2020/1/14
 **/
public interface DictionaryTableService {
    //查询居住方式
    List<DictionaryTable> livingType();

    //查询居住事由
    List<DictionaryTable> liveFor();

    /**
     * @Author yuyang
     * @Description //根据parentId获取字典表集合
     * @Date 11:08 2020/1/14
     * @param parentId
     * @return java.util.List<com.ygjy.entity.DictionaryTable>
     **/
    List<DictionaryTable> getDictionaryTableList(String parentId);
}
