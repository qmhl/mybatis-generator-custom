package com.mybatis.mapper;

import com.mybatis.pojo.RankShop;

public interface RankShopMapper {
    int insert(RankShop record);

    int insertSelective(RankShop record);
}