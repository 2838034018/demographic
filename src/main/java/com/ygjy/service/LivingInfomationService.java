package com.ygjy.service;

import com.ygjy.entity.Agent;
import com.ygjy.entity.Landlord;
import com.ygjy.entity.LivingInfomation;

public interface LivingInfomationService {
    //插入居住信息，房东信息,代理人信息
    void insertDwell(LivingInfomation livingInformation, Landlord record, Agent agent);
}
