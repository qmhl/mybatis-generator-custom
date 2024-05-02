package com.jd.qmx.promotool.model.subscribe;

import java.util.Date;

public class SymbolTbContentRelationBind {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 分表路由字段：由NULL_NULL组成
     */
    private String hashKey;

    /**
     * 实体id
     */
    private String entityId;

    /**
     * 三级分类ID
     */
    private Integer thirdClassifyId;

    /**
     * 标签ID
     */
    private Long symbolId;

    /**
     * 标签名称
     */
    private String symbolName;

    /**
     * 内容ID
     */
    private String contentId;

    /**
     * 类型ID
     */
    private Integer styleId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建人
     */
    private String creator;

    /**
     * 更改人
     */
    private String modifier;

    /**
     * 更新时间
     */
    private Date modifyTime;

    /**
     * 0未删除，1已删除
     */
    private Boolean deleted;

    /**
     * 主键ID
     * @return id 主键ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 主键ID
     * @param id 主键ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 分表路由字段：由NULL_NULL组成
     * @return hash_key 分表路由字段：由NULL_NULL组成
     */
    public String getHashKey() {
        return hashKey;
    }

    /**
     * 分表路由字段：由NULL_NULL组成
     * @param hashKey 分表路由字段：由NULL_NULL组成
     */
    public void setHashKey(String hashKey) {
        this.hashKey = hashKey == null ? null : hashKey.trim();
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
     * 三级分类ID
     * @return third_classify_id 三级分类ID
     */
    public Integer getThirdClassifyId() {
        return thirdClassifyId;
    }

    /**
     * 三级分类ID
     * @param thirdClassifyId 三级分类ID
     */
    public void setThirdClassifyId(Integer thirdClassifyId) {
        this.thirdClassifyId = thirdClassifyId;
    }

    /**
     * 标签ID
     * @return symbol_id 标签ID
     */
    public Long getSymbolId() {
        return symbolId;
    }

    /**
     * 标签ID
     * @param symbolId 标签ID
     */
    public void setSymbolId(Long symbolId) {
        this.symbolId = symbolId;
    }

    /**
     * 标签名称
     * @return symbol_name 标签名称
     */
    public String getSymbolName() {
        return symbolName;
    }

    /**
     * 标签名称
     * @param symbolName 标签名称
     */
    public void setSymbolName(String symbolName) {
        this.symbolName = symbolName == null ? null : symbolName.trim();
    }

    /**
     * 内容ID
     * @return content_id 内容ID
     */
    public String getContentId() {
        return contentId;
    }

    /**
     * 内容ID
     * @param contentId 内容ID
     */
    public void setContentId(String contentId) {
        this.contentId = contentId == null ? null : contentId.trim();
    }

    /**
     * 类型ID
     * @return style_id 类型ID
     */
    public Integer getStyleId() {
        return styleId;
    }

    /**
     * 类型ID
     * @param styleId 类型ID
     */
    public void setStyleId(Integer styleId) {
        this.styleId = styleId;
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
     * 0未删除，1已删除
     * @return deleted 0未删除，1已删除
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * 0未删除，1已删除
     * @param deleted 0未删除，1已删除
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}