package com.ygjy.serviceImpl;

import com.ygjy.dao.DictionaryTableMapper;
import com.ygjy.dao.EmploymentinfoMapper;
import com.ygjy.entity.DictionaryTable;
import com.ygjy.entity.Employmentinfo;
import com.ygjy.service.EmploymentinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

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

    //查询行业类别
    @Override
    public List<DictionaryTable> findSectors() {
        return dictionaryTableMapper.findSectors();
    }

    //添加就业信息
    @Override
    public void addEmploymentinfo(Employmentinfo employmentinfo, ModelMap map) {
        try {
            int i=employmentinfoMapper.insert(employmentinfo);
            if(i==1){
                map.put("message","保存成功");
                LOGGER.info("addEmploymentinfo  --------保存成功");
            }else {
                map.put("message","保存失败");
                LOGGER.info("addEmploymentinfo  --------保存失败");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
