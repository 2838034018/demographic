package com.ygjy.entity;

import java.util.Date;

public class ChildrenNumber {
    private Integer id;

    private Integer man;

    private Integer woman;

    private Integer policyWithin;

    private Integer policyBesides;

    private Date gmtCreate;

    private Date gmtModified;

    private Integer birthcontrolinfoId;

    private Integer personalId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMan() {
        return man;
    }

    public void setMan(Integer man) {
        this.man = man;
    }

    public Integer getWoman() {
        return woman;
    }

    public void setWoman(Integer woman) {
        this.woman = woman;
    }

    public Integer getPolicyWithin() {
        return policyWithin;
    }

    public void setPolicyWithin(Integer policyWithin) {
        this.policyWithin = policyWithin;
    }

    public Integer getPolicyBesides() {
        return policyBesides;
    }

    public void setPolicyBesides(Integer policyBesides) {
        this.policyBesides = policyBesides;
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

    public Integer getBirthcontrolinfoId() {
        return birthcontrolinfoId;
    }

    public void setBirthcontrolinfoId(Integer birthcontrolinfoId) {
        this.birthcontrolinfoId = birthcontrolinfoId;
    }

    public Integer getPersonalId() {
        return personalId;
    }

    public void setPersonalId(Integer personalId) {
        this.personalId = personalId;
    }
}