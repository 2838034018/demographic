package com.ygjy.service;

import com.ygjy.entity.Region;

import java.util.List;

public interface RegionService {
    List<Region> findByProvince();

    List<Region> findBy(String id);
}
