package com.ygjy.entity;

import java.util.Date;

public class LivingInfomation {
    private Integer idInfomation;

    private Integer livingType;

    private Integer liveFor;

    private Integer houseType;

    private String area;

    private String jieBan;

    private String comMittee;

    private String streetRoadAlley;

    private Integer houseNumber;

    private String houseAddress;

    private Integer roomNumber;

    private Integer landLord;

    private Integer agent;

    private String lessorSituation;

    private Integer housingTypes;

    private Integer usageHouse;

    private String informationCollector;

    private Date createTime;

    private Date inputTime;

    private Integer personalId;

    public Integer getIdInfomation() {
        return idInfomation;
    }

    public void setIdInfomation(Integer idInfomation) {
        this.idInfomation = idInfomation;
    }

    public Integer getLivingType() {
        return livingType;
    }

    public void setLivingType(Integer livingType) {
        this.livingType = livingType;
    }

    public Integer getLiveFor() {
        return liveFor;
    }

    public void setLiveFor(Integer liveFor) {
        this.liveFor = liveFor;
    }

    public Integer getHouseType() {
        return houseType;
    }

    public void setHouseType(Integer houseType) {
        this.houseType = houseType;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getJieBan() {
        return jieBan;
    }

    public void setJieBan(String jieBan) {
        this.jieBan = jieBan == null ? null : jieBan.trim();
    }

    public String getComMittee() {
        return comMittee;
    }

    public void setComMittee(String comMittee) {
        this.comMittee = comMittee == null ? null : comMittee.trim();
    }

    public String getStreetRoadAlley() {
        return streetRoadAlley;
    }

    public void setStreetRoadAlley(String streetRoadAlley) {
        this.streetRoadAlley = streetRoadAlley == null ? null : streetRoadAlley.trim();
    }

    public Integer getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(Integer houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getHouseAddress() {
        return houseAddress;
    }

    public void setHouseAddress(String houseAddress) {
        this.houseAddress = houseAddress == null ? null : houseAddress.trim();
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Integer getLandLord() {
        return landLord;
    }

    public void setLandLord(Integer landLord) {
        this.landLord = landLord;
    }

    public Integer getAgent() {
        return agent;
    }

    public void setAgent(Integer agent) {
        this.agent = agent;
    }

    public String getLessorSituation() {
        return lessorSituation;
    }

    public void setLessorSituation(String lessorSituation) {
        this.lessorSituation = lessorSituation == null ? null : lessorSituation.trim();
    }

    public Integer getHousingTypes() {
        return housingTypes;
    }

    public void setHousingTypes(Integer housingTypes) {
        this.housingTypes = housingTypes;
    }

    public Integer getUsageHouse() {
        return usageHouse;
    }

    public void setUsageHouse(Integer usageHouse) {
        this.usageHouse = usageHouse;
    }

    public String getInformationCollector() {
        return informationCollector;
    }

    public void setInformationCollector(String informationCollector) {
        this.informationCollector = informationCollector == null ? null : informationCollector.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getInputTime() {
        return inputTime;
    }

    public void setInputTime(Date inputTime) {
        this.inputTime = inputTime;
    }

    public Integer getPersonalId() {
        return personalId;
    }

    public void setPersonalId(Integer personalId) {
        this.personalId = personalId;
    }
}