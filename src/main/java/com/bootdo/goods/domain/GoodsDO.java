package com.bootdo.goods.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 商品表
 * 
 * @author tanping
 * @email 1992lcg@163.com
 * @date 2018-03-29 17:36:18
 */
public class GoodsDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//商品id
	private Integer goodsId;
	//所属类别id
	private Integer categoryId;
	//商品名称
	private String goodsName;
	//别名
	private String nickname;
	//商品主图
	private String image;
	//删除 1是 2否
	private Integer delState;
	//简要描述
	private String simpleDescribe;
	//详细描述
	private String detailDescribe;
	//上架标志 1 已上架 0 未上架
	private Integer isMarketable;
	//推荐 1是 2否
	private Integer recommend;
	//
	private Date createTime;
	//
	private Date updateTime;
	//创建者id
	private Integer adminId;

	/**
	 * 设置：商品id
	 */
	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}
	/**
	 * 获取：商品id
	 */
	public Integer getGoodsId() {
		return goodsId;
	}
	/**
	 * 设置：所属类别id
	 */
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	/**
	 * 获取：所属类别id
	 */
	public Integer getCategoryId() {
		return categoryId;
	}
	/**
	 * 设置：商品名称
	 */
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	/**
	 * 获取：商品名称
	 */
	public String getGoodsName() {
		return goodsName;
	}
	/**
	 * 设置：别名
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	/**
	 * 获取：别名
	 */
	public String getNickname() {
		return nickname;
	}
	/**
	 * 设置：商品主图
	 */
	public void setImage(String image) {
		this.image = image;
	}
	/**
	 * 获取：商品主图
	 */
	public String getImage() {
		return image;
	}
	/**
	 * 设置：删除 1是 2否
	 */
	public void setDelState(Integer delState) {
		this.delState = delState;
	}
	/**
	 * 获取：删除 1是 2否
	 */
	public Integer getDelState() {
		return delState;
	}
	/**
	 * 设置：简要描述
	 */
	public void setSimpleDescribe(String simpleDescribe) {
		this.simpleDescribe = simpleDescribe;
	}
	/**
	 * 获取：简要描述
	 */
	public String getSimpleDescribe() {
		return simpleDescribe;
	}
	/**
	 * 设置：详细描述
	 */
	public void setDetailDescribe(String detailDescribe) {
		this.detailDescribe = detailDescribe;
	}
	/**
	 * 获取：详细描述
	 */
	public String getDetailDescribe() {
		return detailDescribe;
	}
	/**
	 * 设置：上架标志 1 已上架 0 未上架
	 */
	public void setIsMarketable(Integer isMarketable) {
		this.isMarketable = isMarketable;
	}
	/**
	 * 获取：上架标志 1 已上架 0 未上架
	 */
	public Integer getIsMarketable() {
		return isMarketable;
	}
	/**
	 * 设置：推荐 1是 2否
	 */
	public void setRecommend(Integer recommend) {
		this.recommend = recommend;
	}
	/**
	 * 获取：推荐 1是 2否
	 */
	public Integer getRecommend() {
		return recommend;
	}
	/**
	 * 设置：
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * 获取：
	 */
	public Date getUpdateTime() {
		return updateTime;
	}
	/**
	 * 设置：创建者id
	 */
	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}
	/**
	 * 获取：创建者id
	 */
	public Integer getAdminId() {
		return adminId;
	}
}
