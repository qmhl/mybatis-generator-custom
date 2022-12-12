package com.mybatis.pojo;

import java.util.Date;

public class PersonalIndex {
    /**
     * id
     */
    private Long id;

    /**
     * 指标编号
     */
    private Long indexId;

    /**
     * 指标所属分类编号
     */
    private Long classificationId;

    /**
     * 操作（0删除、1添加）
     */
    private Boolean operation;

    /**
     * 账号类型（erp/pin）
     */
    private String accountType;

    /**
     * 创建人
     */
    private String creator;

    /**
     * 修改人
     */
    private String modifier;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date modifyTime;

    /**
     * 删除标识，0未删除，1已删除
     */
    private Boolean isDeleted;

    /**
     * id
     * @return id id
     */
    public Long getId() {
        return id;
    }

    /**
     * id
     * @param id id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 指标编号
     * @return index_id 指标编号
     */
    public Long getIndexId() {
        return indexId;
    }

    /**
     * 指标编号
     * @param indexId 指标编号
     */
    public void setIndexId(Long indexId) {
        this.indexId = indexId;
    }

    /**
     * 指标所属分类编号
     * @return classification_id 指标所属分类编号
     */
    public Long getClassificationId() {
        return classificationId;
    }

    /**
     * 指标所属分类编号
     * @param classificationId 指标所属分类编号
     */
    public void setClassificationId(Long classificationId) {
        this.classificationId = classificationId;
    }

    /**
     * 操作（0删除、1添加）
     * @return operation 操作（0删除、1添加）
     */
    public Boolean getOperation() {
        return operation;
    }

    /**
     * 操作（0删除、1添加）
     * @param operation 操作（0删除、1添加）
     */
    public void setOperation(Boolean operation) {
        this.operation = operation;
    }

    /**
     * 账号类型（erp/pin）
     * @return account_type 账号类型（erp/pin）
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * 账号类型（erp/pin）
     * @param accountType 账号类型（erp/pin）
     */
    public void setAccountType(String accountType) {
        this.accountType = accountType == null ? null : accountType.trim();
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
     * 修改人
     * @return modifier 修改人
     */
    public String getModifier() {
        return modifier;
    }

    /**
     * 修改人
     * @param modifier 修改人
     */
    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
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
     * 修改时间
     * @return modify_time 修改时间
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * 修改时间
     * @param modifyTime 修改时间
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * 删除标识，0未删除，1已删除
     * @return is_deleted 删除标识，0未删除，1已删除
     */
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    /**
     * 删除标识，0未删除，1已删除
     * @param isDeleted 删除标识，0未删除，1已删除
     */
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }
}