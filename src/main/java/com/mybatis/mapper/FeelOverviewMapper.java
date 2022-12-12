package com.mybatis.mapper;

import com.mybatis.pojo.FeelOverview;

public interface FeelOverviewMapper {
    int insert(FeelOverview record);

    int insertSelective(FeelOverview record);
}