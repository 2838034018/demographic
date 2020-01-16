package com.ygjy.entity;

/**
 * @ClassName: PersonalExt
 * @Description: 个人信息增强类
 * @Author: yuyang
 * @Data: 2020/1/15 18:18
 * @Version: 1.0
 **/
public class PersonalExt extends Personal{

    private String phone;

    private String password;

    private String companyName;

    private String identity;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }
}
