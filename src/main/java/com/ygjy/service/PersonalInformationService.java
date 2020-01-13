package com.ygjy.service;

import com.ygjy.entity.FamilyMembers;
import com.ygjy.entity.Region;
import com.ygjy.entity.SpouseInformation;

import java.util.List;

public interface PersonalInformationService {


    void addSpouseinfomation(SpouseInformation spouseInformation);

    void addFamilyMenory(FamilyMembers familyMembers);
}
