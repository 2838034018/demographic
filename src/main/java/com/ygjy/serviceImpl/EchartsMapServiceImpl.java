package com.ygjy.serviceImpl;

import com.ygjy.dao.EchartsMapMapper;
import com.ygjy.entity.User;
import com.ygjy.service.EchartsMapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EchartsMapServiceImpl implements EchartsMapService {
    @Autowired
    private EchartsMapMapper echartsMapMapper;

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public List<User> selectList() {
        return echartsMapMapper.selectList();
    }
}
