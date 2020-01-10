package com.ygjy.serviceimpl;

import com.ygjy.dao.AgentMapper;
import com.ygjy.entity.Agent;
import com.ygjy.service.PersonalInformationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PersonalInformationServiceImpl implements PersonalInformationService {

    @Resource
    private AgentMapper agentMapper;

    @Override
    public Agent queryDb(Integer id) {
        Agent agent = agentMapper.selectByPrimaryKey(id);
        return agent;
    }
}
