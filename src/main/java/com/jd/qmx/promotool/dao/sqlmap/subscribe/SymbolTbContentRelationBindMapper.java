package com.jd.qmx.promotool.dao.sqlmap.subscribe;

import com.jd.qmx.promotool.model.subscribe.SymbolTbContentRelationBind;

public interface SymbolTbContentRelationBindMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SymbolTbContentRelationBind record);

    int insertSelective(SymbolTbContentRelationBind record);

    SymbolTbContentRelationBind selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SymbolTbContentRelationBind record);

    int updateByPrimaryKey(SymbolTbContentRelationBind record);
}