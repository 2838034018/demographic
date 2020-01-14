package com.ygjy.serviceImpl;

import com.ygjy.dao.BirthcontrolinfoMapper;
import com.ygjy.dao.ChildrenNumberMapper;
import com.ygjy.dao.DictionaryTableMapper;
import com.ygjy.dao.EmploymentinfoMapper;
import com.ygjy.entity.Birthcontrolinfo;
import com.ygjy.entity.ChildrenNumber;
import com.ygjy.entity.DictionaryTable;
import com.ygjy.entity.Employmentinfo;
import com.ygjy.service.EmploymentinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;


@Service
public class EmploymentinfoServiceImpl implements EmploymentinfoService {
    public static final Logger LOGGER = Logger.getLogger("EmploymentinfoService.class");

    //添加就业信息  字典表
    @Autowired
    private DictionaryTableMapper dictionaryTableMapper;

    //就业表
    @Autowired
    private EmploymentinfoMapper employmentinfoMapper;

    //计生表
    @Autowired
    private BirthcontrolinfoMapper birthcontrolinfoMapper;

    //计生子女数
    @Autowired
    private ChildrenNumberMapper childrenNumberMapper;

    @Override
    public int childrenNumbers(ChildrenNumber childrenNumber) {
        int i=childrenNumberMapper.insert(childrenNumber);
        return i;
    }

    //查询行业类别
    @Override
    public List<DictionaryTable> findSectors() {
        return dictionaryTableMapper.findSectors();
    }

    //添加就业信息
    @Override
    public int addEmploymentinfo(Employmentinfo employmentinfo) {

        int i=employmentinfoMapper.insert(employmentinfo);

        return i;
    }


    @Override
    public List<DictionaryTable> contraceptionPregnancy() {
        return dictionaryTableMapper.contraceptionPregnancy();
    }

    //添加计生信息
    @Override
    public int birthcontrolinfo(Birthcontrolinfo birthcontrolinfo) {
        birthcontrolinfoMapper.insert(birthcontrolinfo);
        return 0;
    }
}
