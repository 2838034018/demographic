package com.ygjy.service;

import com.ygjy.entity.Region;

import java.util.List;

public interface RegionService {
    List<Region> findByProvince();

    List<Region> findBy(String superiormumber);

    Region findByPr(String superiormumber);

    Region findByAl(String superiormumber);
}
