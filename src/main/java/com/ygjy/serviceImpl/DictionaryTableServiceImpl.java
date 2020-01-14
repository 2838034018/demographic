package com.ygjy.serviceImpl;

import com.ygjy.dao.DictionaryTableMapper;
import com.ygjy.entity.DictionaryTable;
import com.ygjy.service.DictionaryTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
/**
 * @Author yuyang
 * @Description //字典表service实现类
 * @Date 11:10 2020/1/14
 **/
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
    /**
     * @Author yuyang
     * @Description //根据 parentId获取字典表集合
     * @Date 11:11 2020/1/14
     * @param parentId
     * @return java.util.List<com.ygjy.entity.DictionaryTable>
     **/
    @Override
    public List<DictionaryTable> getDictionaryTableList(String parentId) {
        return dictionaryTableMapper.getDictionaryTableList(parentId);
    }
}
