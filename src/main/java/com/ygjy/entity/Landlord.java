package com.ygjy.entity;

import java.util.Date;

public class Landlord {
    private Integer id;

    private String landLord;

    private String landPhone;

    private Integer isSecurity;

    private String landIdCard;

    private Date gmtCreate;

    private Date gmtModified;

    private Integer livingInformationId;

    private Integer personalId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLandLord() {
        return landLord;
    }

    public void setLandLord(String landLord) {
        this.landLord = landLord == null ? null : landLord.trim();
    }

    public String getLandPhone() {
        return landPhone;
    }

    public void setLandPhone(String landPhone) {
        this.landPhone = landPhone == null ? null : landPhone.trim();
    }

    public Integer getIsSecurity() {
        return isSecurity;
    }

    public void setIsSecurity(Integer isSecurity) {
        this.isSecurity = isSecurity;
    }

    public String getLandIdCard() {
        return landIdCard;
    }

    public void setLandIdCard(String landIdCard) {
        this.landIdCard = landIdCard == null ? null : landIdCard.trim();
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

    public Integer getPersonalId() {
        return personalId;
    }

    public void setPersonalId(Integer personalId) {
        this.personalId = personalId;
    }
}