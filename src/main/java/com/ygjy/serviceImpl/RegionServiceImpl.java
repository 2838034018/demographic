package com.ygjy.serviceImpl;

import com.ygjy.dao.RegionMapper;
import com.ygjy.entity.Region;
import com.ygjy.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class RegionServiceImpl implements RegionService {
    @Autowired
    private RegionMapper regionMapper;

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public List<Region> findByProvince() {
        return regionMapper.findByProvince();
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public List<Region> findBy(String id) {
        return regionMapper.findByCity(id);
    }
}
