package com.ygjy.entity;

import java.util.Date;

public class FamilyMembers {
    private Integer id;

    private String relation;

    private String idNumber;

    private String name;

    private Integer sex;

    private Date birthday;

    private Integer vaccinationCertificate;

    private Integer studyLocally;

    private Date gmtCreate;

    private Date gmtModified;

    private Integer personalId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation == null ? null : relation.trim();
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber == null ? null : idNumber.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getVaccinationCertificate() {
        return vaccinationCertificate;
    }

    public void setVaccinationCertificate(Integer vaccinationCertificate) {
        this.vaccinationCertificate = vaccinationCertificate;
    }

    public Integer getStudyLocally() {
        return studyLocally;
    }

    public void setStudyLocally(Integer studyLocally) {
        this.studyLocally = studyLocally;
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

    public Integer getPersonalId() {
        return personalId;
    }

    public void setPersonalId(Integer personalId) {
        this.personalId = personalId;
    }
}