package com.ygjy.controller;
/**
 *  @author: wangyongxin
 *  @Date: 2020/1/11 15:46
 *  @Description:
 */ 

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

    /**
    * @Description  查询行业类别
    * @Author  wangyongxin
    * @Date   2020/1/11 15:46
    * @Param
    * @Return
    * @Exception
    */
    @RequestMapping("employmentinfo")
    @ResponseBody
    public  List<DictionaryTable>  Employmentinfo(){

            List<DictionaryTable> sectors=employmentinfoService.findSectors();
            return  sectors;
    }

    /**
    * @Description  添加就业信息
    * @Author  wangyongxin
    * @Date   2020/1/11 15:47
    * @Param
    * @Return
    * @Exception
    */
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

    /**
    * @Description  怀孕避孕情况
    * @Author  wangyongxin
    * @Date   2020/1/14 15:47
    * @Param
    * @Return
    * @Exception
    *
    */
    @RequestMapping("contraceptionPregnancy")
    @ResponseBody
    public List<DictionaryTable> contraceptionPregnancy(){
        List<DictionaryTable> contraceptionPregnancy=employmentinfoService.contraceptionPregnancy();
        return  contraceptionPregnancy;
    }

    /**
    * @Description  保存计生信息
    * @Author  wangyongxin
    * @Date   2020/1/14 15:47
    * @Param
    * @Return
    * @Exception
    *
    */
    @RequestMapping("birthcontrolinfo")
    @ResponseBody
    public boolean  birthcontrolinfo (Birthcontrolinfo birthcontrolinfo, ChildrenNumber childrenNumber){

        try {
            //添加计生基本信息
            int i=employmentinfoService.birthcontrolinfo(birthcontrolinfo);
            //添加生育子女数信息
            childrenNumber.setBirthcontrolinfoId(birthcontrolinfo.getId());
            int j=employmentinfoService.childrenNumbers(childrenNumber);

            if(i==1 && j==1){
                LOGGER.info("计生信息添加成功！");
                return  true;
            }else{
                LOGGER.info("计生信息添加失败~");
                return  false;
            }
        }catch (Exception e){
            e.printStackTrace();
            return  false;
        }

    }
}
