package com.ygjy.dao;

import com.ygjy.entity.NowAddress;

public interface NowAddressMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NowAddress record);

    int insertSelective(NowAddress record);

    NowAddress selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NowAddress record);

    int updateByPrimaryKey(NowAddress record);
    /**
     * @Author yuyang
     * @Description //根据personalid获取现居住住址信息
     * @Date 17:01 2020/1/14
     * @param personalId
     * @return com.ygjy.entity.NowAddress
     **/
    NowAddress getNowAddress(Integer personalId);
}