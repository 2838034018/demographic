package com.ygjy.controller;

import com.ygjy.entity.FamilyMembers;
import com.ygjy.entity.SpouseInformation;
import com.ygjy.service.PersonalInformationService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/persion")
public class PersonalInformationController {

    public static final Logger LOGGER = Logger.getLogger("PersonalInformationController.class");

    @Autowired
    private PersonalInformationService pinformation;

    /*插入配偶信息
     */
    @RequestMapping("/addSpouseinfomation")
    @ResponseBody
    public Boolean  addSpouseinfomation(SpouseInformation spouseInformation){

        try {
            pinformation.addSpouseinfomation(spouseInformation);

            LOGGER.info("PersonalInformationController----addSpouseinfomation 成功");

            return true;
        } catch (Exception e) {
            LOGGER.error("PersonalInformationController----addSpouseinfomation 失败");

            e.printStackTrace();
            return false;
        }
    }



    /*插入j家庭成员计生信息
     */
    @RequestMapping("/addFamilyMenory")
    @ResponseBody
    public Boolean  addFamilyMenory(FamilyMembers familyMembers){

        try {
            pinformation.addFamilyMenory(familyMembers);

            LOGGER.info("PersonalInformationController----addFamilyMenory 成功");

            return true;
        } catch (Exception e) {
            LOGGER.error("PersonalInformationController----addFamilyMenory 失败");

            e.printStackTrace();
            return false;
        }
    }
}
