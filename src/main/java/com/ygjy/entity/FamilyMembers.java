package com.ygjy.entity;

import lombok.Data;

import java.util.Date;

@Data
public class FamilyMembers {
    private Integer id;

    private String relation;

    private String idNumber;

    private String name;

    private Integer sex;

    private String birthday;

    private Integer vaccinationCertificate;

    private Integer studyLocally;

    private Date gmtCreate;

    private Date gmtModified;

    private Integer userId;


}