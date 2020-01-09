package com.ygjy.entity;

import java.util.Date;

public class Agent {
    private Integer id;

    private String agentName;

    private String agentPhone;

    private Integer isSecurity;

    private String agentIdCard;

    private Date gmtCreate;

    private Date gmtModified;

    private Integer livingInformationId;

    private Integer presonalId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName == null ? null : agentName.trim();
    }

    public String getAgentPhone() {
        return agentPhone;
    }

    public void setAgentPhone(String agentPhone) {
        this.agentPhone = agentPhone == null ? null : agentPhone.trim();
    }

    public Integer getIsSecurity() {
        return isSecurity;
    }

    public void setIsSecurity(Integer isSecurity) {
        this.isSecurity = isSecurity;
    }

    public String getAgentIdCard() {
        return agentIdCard;
    }

    public void setAgentIdCard(String agentIdCard) {
        this.agentIdCard = agentIdCard == null ? null : agentIdCard.trim();
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Integer getLivingInformationId() {
        return livingInformationId;
    }

    public void setLivingInformationId(Integer livingInformationId) {
        this.livingInformationId = livingInformationId;
    }

    public Integer getPresonalId() {
        return presonalId;
    }

    public void setPresonalId(Integer presonalId) {
        this.presonalId = presonalId;
    }
}