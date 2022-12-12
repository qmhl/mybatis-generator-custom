package com.mybatis.mapper;

import com.mybatis.pojo.PersonalIndex;

public interface PersonalIndexMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PersonalIndex record);

    int insertSelective(PersonalIndex record);

    PersonalIndex selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PersonalIndex record);

    int updateByPrimaryKey(PersonalIndex record);
}