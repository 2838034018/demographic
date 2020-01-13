package com.ygjy.service;

import com.ygjy.entity.DictionaryTable;

import java.util.List;

public interface DictionaryTableService {
    //查询居住方式
    List<DictionaryTable> livingType();

    //查询居住事由
    List<DictionaryTable> liveFor();
}
