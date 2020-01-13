package com.ygjy.serviceImpl;

import com.ygjy.dao.AgentMapper;
import com.ygjy.dao.FamilyMembersMapper;
import com.ygjy.dao.RegionMapper;
import com.ygjy.dao.SpouseInformationMapper;
import com.ygjy.entity.Agent;
import com.ygjy.entity.FamilyMembers;
import com.ygjy.entity.Region;
import com.ygjy.entity.SpouseInformation;
import com.ygjy.service.PersonalInformationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PersonalInformationServiceImpl implements PersonalInformationService {

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
    public void addFamilyMenory(FamilyMembers familyMembers) {
        familyMembersMapper.addFamilyMenory(familyMembers);
    }


}
