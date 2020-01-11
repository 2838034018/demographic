package com.ygjy.controller;


import com.ygjy.entity.DictionaryTable;
import com.ygjy.entity.Employmentinfo;
import com.ygjy.service.EmploymentinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.logging.Logger;

@Controller
public class EmploymentinfoController {

    public static final Logger LOGGER = Logger.getLogger("EmploymentinfoController.class");
    //就业信息
    @Autowired
    private EmploymentinfoService employmentinfoService;

    //查询行业类别
    @RequestMapping("employmentinfo")
    public String  Employmentinfo(ModelMap map){

        try {
            List<DictionaryTable> sectors=employmentinfoService.findSectors();
            if(sectors.size() >0){
                LOGGER.info("Employmentinfo---查询行业成功");
                map.put("sectors",sectors);
            }else {
                LOGGER.info("Employmentinfo---查询行业失败");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return  "login/employmentinfo";
    }

    //添加就业信息
    @RequestMapping("addEmploymentinfo")
    public void addEmploymentinfo(Employmentinfo employmentinfo,ModelMap map){
        System.out.println(employmentinfo.toString());
        employmentinfoService.addEmploymentinfo(employmentinfo,map);
    }

    //回显怀孕避孕情况
    @RequestMapping("contraceptionPregnancy")
    public String contraceptionPregnancy(ModelMap map){
        List<DictionaryTable> contraceptionPregnancy=employmentinfoService.contraceptionPregnancy();
        return  "login/birthcontrolinfo";
    }

}
