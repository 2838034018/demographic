package com.ygjy.controller;


import com.ygjy.entity.Birthcontrolinfo;
import com.ygjy.entity.ChildrenNumber;
import com.ygjy.entity.DictionaryTable;
import com.ygjy.entity.Employmentinfo;
import com.ygjy.service.EmploymentinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
    @ResponseBody
    public  List<DictionaryTable>  Employmentinfo(){

            List<DictionaryTable> sectors=employmentinfoService.findSectors();
            return  sectors;
    }

    //添加就业信息
    @RequestMapping(value = "addEmploymentinfo",method = RequestMethod.POST)
    @ResponseBody
    public Boolean addEmploymentinfo(Employmentinfo employmentinfo){
        int i=employmentinfoService.addEmploymentinfo(employmentinfo);
        if(i==1){
            return true;
        }else {
            return false;
        }
    }

    //怀孕避孕情况
    @RequestMapping("contraceptionPregnancy")
    @ResponseBody
    public List<DictionaryTable> contraceptionPregnancy(){
        List<DictionaryTable> contraceptionPregnancy=employmentinfoService.contraceptionPregnancy();
        return  contraceptionPregnancy;
    }

    //保存计生信息
    @RequestMapping("birthcontrolinfo")
    @ResponseBody
    public boolean  birthcontrolinfo (Birthcontrolinfo birthcontrolinfo, ChildrenNumber childrenNumber){
        //添加计生基本信息
        int i=employmentinfoService.birthcontrolinfo(birthcontrolinfo);
        //添加生育子女数信息
        childrenNumber.setBirthcontrolinfoId(birthcontrolinfo.getId());
        int j=employmentinfoService.childrenNumbers(childrenNumber);

        if(i==1 && j==1){
            return  true;
        }else{
            return  false;
        }
    }
}
