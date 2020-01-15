package com.ygjy.entity;

import java.util.Date;

public class Birthcontrolinfo {
    private Integer id;

    private Integer spousePeer;

    private Integer maritalProve;

    private String maritalCardNumber;

    private Integer verification;

    private String childrenNumber;

    private Integer oneChildCertificate;

    private Integer socialSupportFee;

    private String contraceptionPregnancy;

    private String measureTime;

    private Integer theFertility;

    private String birthdate;

    private Integer policy;

    private Date gmtCreate;

    private Date gmtModified;

    private Integer userId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSpousePeer() {
        return spousePeer;
    }

    public void setSpousePeer(Integer spousePeer) {
        this.spousePeer = spousePeer;
    }

    public Integer getMaritalProve() {
        return maritalProve;
    }

    public void setMaritalProve(Integer maritalProve) {
        this.maritalProve = maritalProve;
    }

    public String getMaritalCardNumber() {
        return maritalCardNumber;
    }

    public void setMaritalCardNumber(String maritalCardNumber) {
        this.maritalCardNumber = maritalCardNumber == null ? null : maritalCardNumber.trim();
    }

    public Integer getVerification() {
        return verification;
    }

    public void setVerification(Integer verification) {
        this.verification = verification;
    }

    public String getChildrenNumber() {
        return childrenNumber;
    }

    public void setChildrenNumber(String childrenNumber) {
        this.childrenNumber = childrenNumber == null ? null : childrenNumber.trim();
    }

    public Integer getOneChildCertificate() {
        return oneChildCertificate;
    }

    public void setOneChildCertificate(Integer oneChildCertificate) {
        this.oneChildCertificate = oneChildCertificate;
    }

    public Integer getSocialSupportFee() {
        return socialSupportFee;
    }

    public void setSocialSupportFee(Integer socialSupportFee) {
        this.socialSupportFee = socialSupportFee;
    }

    public String getContraceptionPregnancy() {
        return contraceptionPregnancy;
    }

    public void setContraceptionPregnancy(String contraceptionPregnancy) {
        this.contraceptionPregnancy = contraceptionPregnancy == null ? null : contraceptionPregnancy.trim();
    }

    public String getMeasureTime() {
        return measureTime;
    }

    public void setMeasureTime(String measureTime) {
        this.measureTime = measureTime == null ? null : measureTime.trim();
    }

    public Integer getTheFertility() {
        return theFertility;
    }

    public void setTheFertility(Integer theFertility) {
        this.theFertility = theFertility;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate == null ? null : birthdate.trim();
    }

    public Integer getPolicy() {
        return policy;
    }

    public void setPolicy(Integer policy) {
        this.policy = policy;
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

    public Integer getuserId() {
        return userId;
    }

    public void setuserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Birthcontrolinfo{" +
                "id=" + id +
                ", spousePeer=" + spousePeer +
                ", maritalProve=" + maritalProve +
                ", maritalCardNumber='" + maritalCardNumber + '\'' +
                ", verification=" + verification +
                ", childrenNumber=" + childrenNumber +
                ", oneChildCertificate=" + oneChildCertificate +
                ", socialSupportFee=" + socialSupportFee +
                ", contraceptionPregnancy='" + contraceptionPregnancy + '\'' +
                ", measureTime='" + measureTime + '\'' +
                ", theFertility=" + theFertility +
                ", birthdate='" + birthdate + '\'' +
                ", policy=" + policy +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                ", userId=" + userId +
                '}';
    }
}