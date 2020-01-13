package com.ygjy.service;

import com.ygjy.entity.Birthcontrolinfo;
import com.ygjy.entity.DictionaryTable;
import com.ygjy.entity.Employmentinfo;

import java.util.List;

public interface EmploymentinfoService {

    //查询行业类别
    List<DictionaryTable> findSectors();

    //添加就业信息
    int addEmploymentinfo(Employmentinfo employmentinfo);

    //回显怀孕避孕情况
    List<DictionaryTable> contraceptionPregnancy();

    void birthcontrolinfo(Birthcontrolinfo birthcontrolinfo);
}
