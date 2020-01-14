package com.ygjy.service;

import com.ygjy.entity.Birthcontrolinfo;
import com.ygjy.entity.ChildrenNumber;
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

    //添加计生数信息
    int birthcontrolinfo(Birthcontrolinfo birthcontrolinfo);

    //添加生育子女数信息
    int childrenNumbers(ChildrenNumber childrenNumber);
}
