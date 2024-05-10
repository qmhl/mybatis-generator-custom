package com.jd.qmx.promotool.model.subscribe;

import java.util.Date;

public class SymbolUploadRecord {
    /**
     * 主键
     */
    private Long id;

    /**
     * 实体id
     */
    private String entityId;

    /**
     * 生产类型: 13:人工提报，14:标注生产
     */
    private Integer type;

    /**
     * 标签id
     */
    private Long symbolId;

    /**
     * url类型，1-oss, 2-hdfs
     */
    private Integer urlType;

    /**
     * 上传的url
     */
    private String url;

    /**
     * 上传url失效日期，yyyy-MM-dd
     */
    private Date endDate;

    /**
     * 上传数量
     */
    private Integer coverageCount;

    /**
     * 创建人
     */
    private String creator;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更改人
     */
    private String modifier;

    /**
     * 更新时间
     */
    private Date modifyTime;

    /**
     * 文件版本
     */
    private Integer versions;

    /**
     * 处理状态，0:未处理(未解析); 1:已处理(已解析) 2:处理中 3:处理失败
     */
    private Integer handleStatus;

    /**
     * 主键
     * @return id 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 主键
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 实体id
     * @return entity_id 实体id
     */
    public String getEntityId() {
        return entityId;
    }

    /**
     * 实体id
     * @param entityId 实体id
     */
    public void setEntityId(String entityId) {
        this.entityId = entityId == null ? null : entityId.trim();
    }

    /**
     * 生产类型: 13:人工提报，14:标注生产
     * @return type 生产类型: 13:人工提报，14:标注生产
     */
    public Integer getType() {
        return type;
    }

    /**
     * 生产类型: 13:人工提报，14:标注生产
     * @param type 生产类型: 13:人工提报，14:标注生产
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 标签id
     * @return symbol_id 标签id
     */
    public Long getSymbolId() {
        return symbolId;
    }

    /**
     * 标签id
     * @param symbolId 标签id
     */
    public void setSymbolId(Long symbolId) {
        this.symbolId = symbolId;
    }

    /**
     * url类型，1-oss, 2-hdfs
     * @return url_type url类型，1-oss, 2-hdfs
     */
    public Integer getUrlType() {
        return urlType;
    }

    /**
     * url类型，1-oss, 2-hdfs
     * @param urlType url类型，1-oss, 2-hdfs
     */
    public void setUrlType(Integer urlType) {
        this.urlType = urlType;
    }

    /**
     * 上传的url
     * @return url 上传的url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 上传的url
     * @param url 上传的url
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * 上传url失效日期，yyyy-MM-dd
     * @return end_date 上传url失效日期，yyyy-MM-dd
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * 上传url失效日期，yyyy-MM-dd
     * @param endDate 上传url失效日期，yyyy-MM-dd
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * 上传数量
     * @return coverage_count 上传数量
     */
    public Integer getCoverageCount() {
        return coverageCount;
    }

    /**
     * 上传数量
     * @param coverageCount 上传数量
     */
    public void setCoverageCount(Integer coverageCount) {
        this.coverageCount = coverageCount;
    }

    /**
     * 创建人
     * @return creator 创建人
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 创建人
     * @param creator 创建人
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * 创建时间
     * @return create_time 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 更改人
     * @return modifier 更改人
     */
    public String getModifier() {
        return modifier;
    }

    /**
     * 更改人
     * @param modifier 更改人
     */
    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    /**
     * 更新时间
     * @return modify_time 更新时间
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * 更新时间
     * @param modifyTime 更新时间
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * 文件版本
     * @return versions 文件版本
     */
    public Integer getVersions() {
        return versions;
    }

    /**
     * 文件版本
     * @param versions 文件版本
     */
    public void setVersions(Integer versions) {
        this.versions = versions;
    }

    /**
     * 处理状态，0:未处理(未解析); 1:已处理(已解析) 2:处理中 3:处理失败
     * @return handle_status 处理状态，0:未处理(未解析); 1:已处理(已解析) 2:处理中 3:处理失败
     */
    public Integer getHandleStatus() {
        return handleStatus;
    }

    /**
     * 处理状态，0:未处理(未解析); 1:已处理(已解析) 2:处理中 3:处理失败
     * @param handleStatus 处理状态，0:未处理(未解析); 1:已处理(已解析) 2:处理中 3:处理失败
     */
    public void setHandleStatus(Integer handleStatus) {
        this.handleStatus = handleStatus;
    }
}