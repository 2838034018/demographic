package com.ygjy.controller;

import com.ygjy.entity.Agent;
import com.ygjy.service.PersonalInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hjl")
public class PersonalInformationController {



    @Autowired
    private PersonalInformationService pinformation;

    @RequestMapping("/queryxx")
    public void queryDb(){
      Agent age =  pinformation.queryDb(1);
      System.out.println(age.getAgentName());
    }

}
