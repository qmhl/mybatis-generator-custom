package com.mybatis.pojo;

import java.util.Date;

public class ShopRankWhiteList {
    /**
     * 
     */
    private Long id;

    /**
     * 店铺id
     */
    private Integer shopId;

    /**
     * 店铺名
     */
    private String shopName;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date modifyTime;

    /**
     * 
     * @return id 
     */
    public Long getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 店铺id
     * @return shop_id 店铺id
     */
    public Integer getShopId() {
        return shopId;
    }

    /**
     * 店铺id
     * @param shopId 店铺id
     */
    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    /**
     * 店铺名
     * @return shop_name 店铺名
     */
    public String getShopName() {
        return shopName;
    }

    /**
     * 店铺名
     * @param shopName 店铺名
     */
    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
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
}