package com.ygjy.entity;

import java.util.Date;

public class NowAddress {
    private Integer id;

    private String nowAddressProvince;

    private String nowAddressCity;

    private String nowAddressDistrict;

    private String nowAddressTown;

    private String nowAddressVillage;

    private Integer nowAddressHouseNumber;

    private Date nowAddressCreateTime;

    private Date nowAddressModifieTime;

    private Integer nowAddressPersonalId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNowAddressProvince() {
        return nowAddressProvince;
    }

    public void setNowAddressProvince(String nowAddressProvince) {
        this.nowAddressProvince = nowAddressProvince == null ? null : nowAddressProvince.trim();
    }

    public String getNowAddressCity() {
        return nowAddressCity;
    }

    public void setNowAddressCity(String nowAddressCity) {
        this.nowAddressCity = nowAddressCity == null ? null : nowAddressCity.trim();
    }

    public String getNowAddressDistrict() {
        return nowAddressDistrict;
    }

    public void setNowAddressDistrict(String nowAddressDistrict) {
        this.nowAddressDistrict = nowAddressDistrict == null ? null : nowAddressDistrict.trim();
    }

    public String getNowAddressTown() {
        return nowAddressTown;
    }

    public void setNowAddressTown(String nowAddressTown) {
        this.nowAddressTown = nowAddressTown == null ? null : nowAddressTown.trim();
    }

    public String getNowAddressVillage() {
        return nowAddressVillage;
    }

    public void setNowAddressVillage(String nowAddressVillage) {
        this.nowAddressVillage = nowAddressVillage == null ? null : nowAddressVillage.trim();
    }

    public Integer getNowAddressHouseNumber() {
        return nowAddressHouseNumber;
    }

    public void setNowAddressHouseNumber(Integer nowAddressHouseNumber) {
        this.nowAddressHouseNumber = nowAddressHouseNumber;
    }

    public Date getNowAddressCreateTime() {
        return nowAddressCreateTime;
    }

    public void setNowAddressCreateTime(Date nowAddressCreateTime) {
        this.nowAddressCreateTime = nowAddressCreateTime;
    }

    public Date getNowAddressModifieTime() {
        return nowAddressModifieTime;
    }

    public void setNowAddressModifieTime(Date nowAddressModifieTime) {
        this.nowAddressModifieTime = nowAddressModifieTime;
    }

    public Integer getNowAddressPersonalId() {
        return nowAddressPersonalId;
    }

    public void setNowAddressPersonalId(Integer nowAddressPersonalId) {
        this.nowAddressPersonalId = nowAddressPersonalId;
    }
}