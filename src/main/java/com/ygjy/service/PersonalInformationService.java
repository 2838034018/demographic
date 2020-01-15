package com.ygjy.service;

import com.ygjy.entity.Agent;
import com.ygjy.entity.NowAddress;
import com.ygjy.entity.Personal;
import org.springframework.web.multipart.MultipartFile;
/**
 * @Author PersonalInformationService
 * @Description //个人信息service接口
 * @Date 9:07 2020/1/11
 **/
import com.ygjy.entity.FamilyMembers;
import com.ygjy.entity.Region;
import com.ygjy.entity.SpouseInformation;

import java.util.List;

public interface PersonalInformationService {


    Agent queryDb(Integer id);

    /**
     * @Author yuyang
     * @Description //个人信息保存
     * @Date 17:33 2020/1/10
     * @param personal 接收com.ygjy.entity.Personal
     * @param nowAddress 接收com.ygjy.entity.NowAddress
     * @param multipartFile 接收文件流
     * @return
     **/
    void personalDo(Personal personal, NowAddress nowAddress, MultipartFile multipartFile);
    void addSpouseinfomation(SpouseInformation spouseInformation);

    void addFamilyMenory(FamilyMembers familyMembers);
}
