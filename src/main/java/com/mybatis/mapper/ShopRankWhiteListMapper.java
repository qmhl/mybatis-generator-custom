package com.mybatis.mapper;

import com.mybatis.pojo.ShopRankWhiteList;

public interface ShopRankWhiteListMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ShopRankWhiteList record);

    int insertSelective(ShopRankWhiteList record);

    ShopRankWhiteList selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ShopRankWhiteList record);

    int updateByPrimaryKey(ShopRankWhiteList record);
}