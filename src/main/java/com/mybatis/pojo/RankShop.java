package com.mybatis.pojo;

import java.util.Date;

public class RankShop {
    /**
     * 品类id
     */
    private Integer itemCateCd;

    /**
     * 品类name
     */
    private String itemCateName;

    /**
     * 品类级别
     */
    private Integer cateLevel;

    /**
     * 店铺id
     */
    private String shopId;

    /**
     * 店铺名称
     */
    private String shopName;

    /**
     * 周期,含周和月粒度
     */
    private String time;

    /**
     * 排名
     */
    private Integer rank;

    /**
     * 排名环比
     */
    private String rankRatio;

    /**
     * 指数环比
     */
    private String indexRatio;

    /**
     * 行业平均值
     */
    private String industryAvg;

    /**
     * 体验竞争力指数
     */
    private String expComp;

    /**
     * 考核质量分
     */
    private String qualityScore;

    /**
     * 指标集合
     */
    private String indexList;

    /**
     * 趋势信息集合
     */
    private String trendList;

    /**
     * 考核质量分、难易度评分集合
     */
    private String scoreList;

    /**
     * 
     */
    private Date dt;

    /**
     * 品类id
     * @return item_cate_cd 品类id
     */
    public Integer getItemCateCd() {
        return itemCateCd;
    }

    /**
     * 品类id
     * @param itemCateCd 品类id
     */
    public void setItemCateCd(Integer itemCateCd) {
        this.itemCateCd = itemCateCd;
    }

    /**
     * 品类name
     * @return item_cate_name 品类name
     */
    public String getItemCateName() {
        return itemCateName;
    }

    /**
     * 品类name
     * @param itemCateName 品类name
     */
    public void setItemCateName(String itemCateName) {
        this.itemCateName = itemCateName == null ? null : itemCateName.trim();
    }

    /**
     * 品类级别
     * @return cate_level 品类级别
     */
    public Integer getCateLevel() {
        return cateLevel;
    }

    /**
     * 品类级别
     * @param cateLevel 品类级别
     */
    public void setCateLevel(Integer cateLevel) {
        this.cateLevel = cateLevel;
    }

    /**
     * 店铺id
     * @return shop_id 店铺id
     */
    public String getShopId() {
        return shopId;
    }

    /**
     * 店铺id
     * @param shopId 店铺id
     */
    public void setShopId(String shopId) {
        this.shopId = shopId == null ? null : shopId.trim();
    }

    /**
     * 店铺名称
     * @return shop_name 店铺名称
     */
    public String getShopName() {
        return shopName;
    }

    /**
     * 店铺名称
     * @param shopName 店铺名称
     */
    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    /**
     * 周期,含周和月粒度
     * @return time 周期,含周和月粒度
     */
    public String getTime() {
        return time;
    }

    /**
     * 周期,含周和月粒度
     * @param time 周期,含周和月粒度
     */
    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    /**
     * 排名
     * @return rank 排名
     */
    public Integer getRank() {
        return rank;
    }

    /**
     * 排名
     * @param rank 排名
     */
    public void setRank(Integer rank) {
        this.rank = rank;
    }

    /**
     * 排名环比
     * @return rank_ratio 排名环比
     */
    public String getRankRatio() {
        return rankRatio;
    }

    /**
     * 排名环比
     * @param rankRatio 排名环比
     */
    public void setRankRatio(String rankRatio) {
        this.rankRatio = rankRatio == null ? null : rankRatio.trim();
    }

    /**
     * 指数环比
     * @return index_ratio 指数环比
     */
    public String getIndexRatio() {
        return indexRatio;
    }

    /**
     * 指数环比
     * @param indexRatio 指数环比
     */
    public void setIndexRatio(String indexRatio) {
        this.indexRatio = indexRatio == null ? null : indexRatio.trim();
    }

    /**
     * 行业平均值
     * @return industry_avg 行业平均值
     */
    public String getIndustryAvg() {
        return industryAvg;
    }

    /**
     * 行业平均值
     * @param industryAvg 行业平均值
     */
    public void setIndustryAvg(String industryAvg) {
        this.industryAvg = industryAvg == null ? null : industryAvg.trim();
    }

    /**
     * 体验竞争力指数
     * @return exp_comp 体验竞争力指数
     */
    public String getExpComp() {
        return expComp;
    }

    /**
     * 体验竞争力指数
     * @param expComp 体验竞争力指数
     */
    public void setExpComp(String expComp) {
        this.expComp = expComp == null ? null : expComp.trim();
    }

    /**
     * 考核质量分
     * @return quality_score 考核质量分
     */
    public String getQualityScore() {
        return qualityScore;
    }

    /**
     * 考核质量分
     * @param qualityScore 考核质量分
     */
    public void setQualityScore(String qualityScore) {
        this.qualityScore = qualityScore == null ? null : qualityScore.trim();
    }

    /**
     * 指标集合
     * @return index_list 指标集合
     */
    public String getIndexList() {
        return indexList;
    }

    /**
     * 指标集合
     * @param indexList 指标集合
     */
    public void setIndexList(String indexList) {
        this.indexList = indexList == null ? null : indexList.trim();
    }

    /**
     * 趋势信息集合
     * @return trend_list 趋势信息集合
     */
    public String getTrendList() {
        return trendList;
    }

    /**
     * 趋势信息集合
     * @param trendList 趋势信息集合
     */
    public void setTrendList(String trendList) {
        this.trendList = trendList == null ? null : trendList.trim();
    }

    /**
     * 考核质量分、难易度评分集合
     * @return score_list 考核质量分、难易度评分集合
     */
    public String getScoreList() {
        return scoreList;
    }

    /**
     * 考核质量分、难易度评分集合
     * @param scoreList 考核质量分、难易度评分集合
     */
    public void setScoreList(String scoreList) {
        this.scoreList = scoreList == null ? null : scoreList.trim();
    }

    /**
     * 
     * @return dt 
     */
    public Date getDt() {
        return dt;
    }

    /**
     * 
     * @param dt 
     */
    public void setDt(Date dt) {
        this.dt = dt;
    }
}