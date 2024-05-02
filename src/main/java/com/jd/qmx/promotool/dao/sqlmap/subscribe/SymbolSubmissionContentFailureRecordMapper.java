package com.jd.qmx.promotool.dao.sqlmap.subscribe;

import com.jd.qmx.promotool.model.subscribe.SymbolSubmissionContentFailureRecord;

public interface SymbolSubmissionContentFailureRecordMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SymbolSubmissionContentFailureRecord record);

    int insertSelective(SymbolSubmissionContentFailureRecord record);

    SymbolSubmissionContentFailureRecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SymbolSubmissionContentFailureRecord record);

    int updateByPrimaryKey(SymbolSubmissionContentFailureRecord record);
}