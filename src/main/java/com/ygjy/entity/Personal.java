package com.ygjy.entity;

import java.sql.Timestamp;
import java.util.Date;

public class Personal {
    private Integer id;

    private String name;

    private String oldName;

    private Integer sex;

    private Date comeDate;

    private String idCard;

    private String headImg;

    private String nation;

    private String province;

    private String city;

    private String district;

    private String town;

    private String villager;

    private String nowAddress;

    private String fixedPhone;

    private String movePhone;

    private String concats;

    private String concatsFixphone;

    private String concatsMovphone;

    private String cultrue;

    private String politicsStatus;

    private String faith;

    private Double height;

    private Double weight;

    private String blood;

    private String backgRound;

    private String healthType;

    private String disability;

    private String maritalStatus;

    private Integer status;

    private String explain;

    private Timestamp createTime;

    private Timestamp modifiedTime;

    private String auditor;

    private Integer userId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getOldName() {
        return oldName;
    }

    public void setOldName(String oldName) {
        this.oldName = oldName == null ? null : oldName.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getComeDate() {
        return comeDate;
    }

    public void setComeDate(Date comeDate) {
        this.comeDate = comeDate;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg == null ? null : headImg.trim();
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town == null ? null : town.trim();
    }

    public String getVillager() {
        return villager;
    }

    public void setVillager(String villager) {
        this.villager = villager == null ? null : villager.trim();
    }

    public String getNowAddress() {
        return nowAddress;
    }

    public void setNowAddress(String nowAddress) {
        this.nowAddress = nowAddress == null ? null : nowAddress.trim();
    }

    public String getFixedPhone() {
        return fixedPhone;
    }

    public void setFixedPhone(String fixedPhone) {
        this.fixedPhone = fixedPhone == null ? null : fixedPhone.trim();
    }

    public String getMovePhone() {
        return movePhone;
    }

    public void setMovePhone(String movePhone) {
        this.movePhone = movePhone == null ? null : movePhone.trim();
    }

    public String getConcats() {
        return concats;
    }

    public void setConcats(String concats) {
        this.concats = concats == null ? null : concats.trim();
    }

    public String getConcatsFixphone() {
        return concatsFixphone;
    }

    public void setConcatsFixphone(String concatsFixphone) {
        this.concatsFixphone = concatsFixphone == null ? null : concatsFixphone.trim();
    }

    public String getConcatsMovphone() {
        return concatsMovphone;
    }

    public void setConcatsMovphone(String concatsMovphone) {
        this.concatsMovphone = concatsMovphone == null ? null : concatsMovphone.trim();
    }

    public String getCultrue() {
        return cultrue;
    }

    public void setCultrue(String cultrue) {
        this.cultrue = cultrue == null ? null : cultrue.trim();
    }

    public String getPoliticsStatus() {
        return politicsStatus;
    }

    public void setPoliticsStatus(String politicsStatus) {
        this.politicsStatus = politicsStatus == null ? null : politicsStatus.trim();
    }

    public String getFaith() {
        return faith;
    }

    public void setFaith(String faith) {
        this.faith = faith == null ? null : faith.trim();
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood == null ? null : blood.trim();
    }

    public String getBackgRound() {
        return backgRound;
    }

    public void setBackgRound(String backgRound) {
        this.backgRound = backgRound == null ? null : backgRound.trim();
    }

    public String getHealthType() {
        return healthType;
    }

    public void setHealthType(String healthType) {
        this.healthType = healthType == null ? null : healthType.trim();
    }

    public String getDisability() {
        return disability;
    }

    public void setDisability(String disability) {
        this.disability = disability == null ? null : disability.trim();
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus == null ? null : maritalStatus.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status == null ? null : status;
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain == null ? null : explain.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = Timestamp.valueOf(createTime);
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(String modifiedTime) {
        this.modifiedTime = Timestamp.valueOf(modifiedTime);
    }

    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}