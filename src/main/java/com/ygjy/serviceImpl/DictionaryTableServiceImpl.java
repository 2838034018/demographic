package com.ygjy.serviceImpl;

import com.ygjy.dao.DictionaryTableMapper;
import com.ygjy.entity.DictionaryTable;
import com.ygjy.service.DictionaryTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DictionaryTableServiceImpl implements DictionaryTableService {
    @Autowired
    private DictionaryTableMapper dictionaryTableMapper;

    @Override
    public List<DictionaryTable> livingType() {
        return dictionaryTableMapper.livingType();
    }

    @Override
    public List<DictionaryTable> liveFor() {
        return dictionaryTableMapper.liveFor();
    }
}
