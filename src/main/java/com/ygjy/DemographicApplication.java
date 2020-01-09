package com.ygjy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@MapperScan(value = "com.ygjy.dao")
@ComponentScan(basePackages = {"com.ygjy.*"})
@SpringBootApplication
public class DemographicApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemographicApplication.class, args);
    }

}
