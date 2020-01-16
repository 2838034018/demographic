package com.ygjy.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.ygjy.dao.*;
import com.ygjy.entity.*;
import com.ygjy.service.PersonalInformationService;
import com.ygjy.util.FileUploadUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.crypto.spec.PSource;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @Author PersonalInformationServiceImpl
 * @Description //个人信息service实现类
 * @Date 9:06 2020/1/11
 **/
@Service
public class PersonalInformationServiceImpl implements PersonalInformationService {
    //导入上传工具类
    @Resource
    private FileUploadUtil fileUploadUtil;

    @Resource
    private PersonalMapper personalMapper;

    @Resource
    private NowAddressMapper nowAddressMapper;

    @Resource
    private RegionMapper regionMapper;

    @Resource
    private SpouseInformationMapper spouseInformationMapper;
    @Resource
    private FamilyMembersMapper familyMembersMapper;

    @Override
    public void addSpouseinfomation(SpouseInformation spouseInformation) {
        spouseInformationMapper.insert(spouseInformation);
    }

    @Override
    public Agent queryDb(Integer id) {
        return null;
    }

    /**
     * @Author yuyang
     * @Description //个人信息保存
     * @Date 17:33 2020/1/10
     * @param personal 接收com.ygjy.entity.Personal
     * @param nowAddress 接收com.ygjy.entity.NowAddress
     * @param multipartFile 接收文件流
     * @return
     **/
    @Override
    @Transactional
    public void personalDo(Personal personal, NowAddress nowAddress, MultipartFile multipartFile) throws RuntimeException {
        //上传文件
        File file = null;
        try {
            file = fileUploadUtil.doUpload(multipartFile);
        } catch (IOException e) {
            throw new RuntimeException("图片上传失败");
        }
        //将图片存储路径添加进personal类
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        personal.setCreateTime(dateFormat.format(new Date()));
        personal.setHeadImg(file.getPath());
        personal.setStatus(0);
        //添加用户个人信息ileUploadUtil.getImgPa
        try {
            Integer num = personalMapper.insert(personal);
            if(num == 1){
                //根据个人信息获取个人信息id
                Integer personalId = personalMapper.getPersonalId(personal);
                nowAddress.setNowAddressPersonalId(personalId);
                nowAddress.setNowAddressCreateTime(new Date());
                try {
                    int nowAddressNum = nowAddressMapper.insert(nowAddress);
                    if(nowAddressNum != 1){
                        //失败回滚
                        personalMapper.deleteByPrimaryKey(personalId);
                        throw  new RuntimeException("个人信息现居住地址添加失败");
                    }
                }catch (Exception e){
                    //失败回滚
                    personalMapper.deleteByPrimaryKey(personalId);
                    throw  new RuntimeException("个人信息现居住地址添加失败");
                }
            }else {
                //个人信息添加失败回滚
                throw new RuntimeException("个人信息添加失败");
            }
        }catch (Exception e){
            //个人信息添加失败回滚
            fileUploadUtil.delFolder(file.getPath());
            throw new RuntimeException("个人信息添加失败");
        }

    }

    @Override
    public void addFamilyMenory(FamilyMembers familyMembers) {
        familyMembersMapper.addFamilyMenory(familyMembers);
    }

}
