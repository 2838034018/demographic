package com.ygjy.controller;


import com.ygjy.entity.FamilyMembers;
import com.ygjy.entity.SpouseInformation;
import com.ygjy.entity.NowAddress;
import com.ygjy.entity.Personal;
import com.ygjy.entity.*;
import com.ygjy.service.LivingInfomationService;
import com.ygjy.service.PersonalInformationService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;



/**
 * @Author PersonalInformationController
 * @Description //个人信息controller
 * @Date 9:08 2020/1/11
 **/
@Controller
@RequestMapping("/personal")

public class PersonalInformationController {

    public static final Logger LOGGER = Logger.getLogger("PersonalInformationController.class");

    @Autowired
    private PersonalInformationService pinformation;
    @Autowired
    private LivingInfomationService livingInfomationService;

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
    /**
     * @Author yuyang
     * @Description //个人信息保存
     * @Date 17:18 2020/1/10
     * @param personal 接收personal。jsp页面数据封装成com.ygjy.entity.Personal
     * @param nowAddress 接收personal。jsp页面数据封装成com.ygjy.entity.NowAddress
     * @param multipartFile 接收personal。jsp页面file数据流
     * @return java.lang.String
     **/
    @RequestMapping("/personalDo")
    @ResponseBody
    public String personalDo(Personal personal, NowAddress nowAddress, @RequestParam("file") MultipartFile multipartFile){
        try {
            //验证姓名非空
            if(personal.getName() == null || "".equals(personal.getName().trim())){
                return "请填写姓名！";
            }
            //验证性别非空
            if(personal.getSex() == null){
                return "请选择性别！";
            }
            //验证头像文件非空
            if(multipartFile == null){
                return "请上传头像！";
            }
            //验证来本地时间非空
            if(personal.getComeDate() == null){
                return "请选择来本地时间！";
            }
            //验证公民身份证号非空
            if(personal.getIdCard() == null){
                return "请填写公民身份证号！";
            }
            //验证公民身份证号格式
            String pattn1 = "^\\d{15}$";
            String pattn2 = "^\\d{18}$";
            String pattn3 = "^\\d{17}+(\\d|X|x)$";
            if(!personal.getIdCard().matches(pattn1) && !personal.getIdCard().matches(pattn2) && !personal.getIdCard().matches(pattn3)){
                return "填写的公民身份证号格式错误！";
            }
            //验证民族非空
            if(personal.getNation() == null || "".equals(personal.getNation().trim())){
                return "请填写民族！";
            }
            //验证户籍所在地非空
            if(personal.getProvince() == null || "".equals(personal.getProvince().trim())
             || "".equals(personal.getCity().trim()) || "0".equals(personal.getCity().trim()) || personal.getCity() == null
             || "".equals(personal.getDistrict().trim()) || "0".equals(personal.getDistrict().trim()) || personal.getDistrict() == null
             || "".equals(personal.getTown().trim()) || "0".equals(personal.getTown().trim()) || personal.getTown() == null
             || "".equals(personal.getVillager().trim()) || personal.getVillager() == null){
                return "请填写户籍所在地信息！";
            }
            //验证现居住地址信息
            if("".equals(nowAddress.getNowAddressProvince().trim()) || nowAddress.getNowAddressProvince() == null
             || "".equals(nowAddress.getNowAddressCity().trim()) || "0".equals(nowAddress.getNowAddressCity().trim()) || nowAddress.getNowAddressCity() == null
             || "".equals(nowAddress.getNowAddressDistrict().trim()) || "0".equals(nowAddress.getNowAddressDistrict().trim()) || nowAddress.getNowAddressDistrict() == null
             || "".equals(nowAddress.getNowAddressTown().trim()) || "0".equals(nowAddress.getNowAddressTown().trim()) || nowAddress.getNowAddressTown() == null
             || "".equals(nowAddress.getNowAddressVillage().trim()) || nowAddress.getNowAddressVillage() == null
             || "".equals(nowAddress.getNowAddressHouseNumber().trim()) || nowAddress.getNowAddressHouseNumber() == null){
                return "请填写现居住地址信息！";
            }
            //验证个人联系方式非空
            if(("".equals(personal.getFixedPhone().trim()) || personal.getFixedPhone() == null)
             && ("".equals(personal.getMovePhone().trim()) || personal.getMovePhone() == null)){
                return "请填写本人联系方式！";
            }
            //手机号格式验证
            String pattn4 = "^1([38][0-9]|4[579]|5[0-3,5-9]|6[6]|7[0135678]|9[89])\\d{8}$";
            if(personal.getMovePhone() != null){
                if(!personal.getMovePhone().matches(pattn4)){
                    return "本人移动电话格式错误！";
                }
            }
            //验证紧急联系人姓名非空
            if(personal.getConcats() == null || "".equals(personal.getConcats().trim())){
                return "请填写紧急联系人！";
            }
            //验证紧急联系人联系方式
            if(("".equals(personal.getConcatsFixphone().trim()) || personal.getConcatsFixphone() == null)
             && (personal.getConcatsMovphone() == null || "".equals(personal.getConcatsMovphone().trim()))){
                return "请填写紧急联系人联系方式！";
            }
            //验证紧急联系人移动电话格式
            if(personal.getConcatsMovphone() != null){
                if(!personal.getConcatsMovphone().matches(pattn4)){
                    return "紧急联系人移动电话格式错误！";
                }
            }
            //验证文化程度度非空
            if(personal.getCultrue() == null){
                return "请选择文化程度！";
            }
            //验证政治面貌非空
            if(personal.getPoliticsStatus() == null){
                return "请选择政治面貌！";
            }
            //验证宗教信仰非空
            if(personal.getFaith() == null){
                return "请选择宗教信仰！";
            }
            //验证身高非空
            if(personal.getHeight() == null){
                return "请填写身高！";
            }
            //验证体重非空
            if(personal.getWeight() == null){
                return "请填写体重！";
            }
            //验证血型非空
            if(personal.getBlood() == null){
                return "请选择血型！";
            }
            //验证健康状况非空
            if(personal.getHealthType() == null){
                return "请选择健康状况！";
            }
            //验证残疾证号非空
            if("403".equals(personal.getHealthType())){
                if(personal.getDisability() == null || "".equals(personal.getDisability().trim())){
                    return "请填写残疾证号！";
                }
            }
            //验证从业情况非空
            if(personal.getBackgRound() == null){
                return "请选择从业情况！";
            }
            //验证婚姻情况非空
            if(personal.getMaritalStatus() == null){
                return "请选择婚姻状况！";
            }
            pinformation.personalDo(personal, nowAddress, multipartFile);
            LOGGER.info("PersonalInformationController.personalDo-个人信息添加成功");
            return "ok";
        }catch (Exception e){
            LOGGER.error("PersonalInformationController.personalDo-"+e);
            return "no";
        }

    }

    /**
     * @param livingInformation
     * @return java.util.List<com.ygjy.entity.LivingInfomation>
     * @Author lyh
     * @Description 插入居住信息
     */
    @RequestMapping("insertDwell")
    public String insertDwell(LivingInfomation livingInformation, Landlord landlord, Agent agent) {
        livingInfomationService.insertDwell(livingInformation, landlord, agent);
        return "login/living_information";
    }
}
