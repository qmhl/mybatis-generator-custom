package com.jd.qmx.promotool.dao.sqlmap.subscribe;

import com.jd.qmx.promotool.model.subscribe.SymbolUploadRecord;

public interface SymbolUploadRecordMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SymbolUploadRecord record);

    int insertSelective(SymbolUploadRecord record);

    SymbolUploadRecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SymbolUploadRecord record);

    int updateByPrimaryKey(SymbolUploadRecord record);
}