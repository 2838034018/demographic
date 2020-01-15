package com.ygjy.serviceImpl;

import com.ygjy.dao.AgentMapper;
import com.ygjy.dao.LandlordMapper;
import com.ygjy.dao.LivingInfomationMapper;
import com.ygjy.entity.Agent;
import com.ygjy.entity.Landlord;
import com.ygjy.entity.LivingInfomation;
import com.ygjy.service.LivingInfomationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.logging.Logger;


@Service
@Transactional
public class LivingInfomationServiceImpl implements LivingInfomationService {
    public static final Logger LOGGER = Logger.getLogger("LivingInfomationServiceImpl.class");
    @Autowired
    private LivingInfomationMapper livingInfomationMapper;
    @Autowired
    private LandlordMapper landlordMapper;
    @Autowired
    private AgentMapper agentMapper;
    @Autowired
    private HttpSession session;

    /**
     * @param livingInformation
     * @param landlord
     * @param agent
     * @return java.util.List<com.ygjy.entity.LivingInfomation>
     * @Author lyh
     * @Description //插入居住信息，房东信息，代理人信息
     **/
    @Override
    public void insertDwell(LivingInfomation livingInformation, Landlord landlord, Agent agent) {

        try {
            livingInformation.setCreateTime(new Date());//创建时间
            livingInformation.setInputTime(new Date());//更新时间
            //livingInformation.setLandLord(landlord.getId());//插入房东信息id

            //landlord.setLivingInformationId(livingInformation.getIdInfomation());//(房东)插入居住信息id
            landlord.setGmtCreate(new Date());//创建时间
            landlord.setGmtModified(new Date());//更新时间

            agent.setGmtCreate(new Date());//创建时间
            agent.setGmtModified(new Date());//更新时间
            livingInfomationMapper.insertDwell(livingInformation);

            LivingInfomation idInfomation = livingInfomationMapper.getIdInfomation(livingInformation);
            agent.setLivingInformationId(idInfomation.getIdInfomation());
            agentMapper.insterAgent(agent);
            landlord.setLivingInformationId(idInfomation.getIdInfomation());
            landlordMapper.insterLandlord(landlord);
            LOGGER.info("LivingInfomationServiceImpl-------insertDwell---成功");
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.info("LivingInfomationServiceImpl-------insertDwell---失败");
        }

    }
}
