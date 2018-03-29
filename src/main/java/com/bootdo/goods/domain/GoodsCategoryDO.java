package com.bootdo.goods.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 商品种类表
 * 
 * @author tanping
 * @email 1992lcg@163.com
 * @date 2018-03-29 11:01:02
 */
public class GoodsCategoryDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//商品种类id
	public Integer categoryId;
	//父种类id 为零表示顶层种类
	private Integer parentId;
	//商品种类名称
	private String categoryName;
	//商品种类主图
	private String image;
	//状态 1.启用 2.未启用 3 已删除
	private Integer state;
	//简要描述
	private String simpleDescribe;
	//推荐标志 1是 2否
	private Integer recommend;
	//创建时间
	private Date createTime;
	//更新时间
	private Date updateTime;
	//创建者id
	private Integer adminId;

	/**
	 * 设置：商品种类id
	 */
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	/**
	 * 获取：商品种类id
	 */
	public Integer getCategoryId() {
		return categoryId;
	}
	/**
	 * 设置：父种类id 为零表示顶层种类
	 */
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	/**
	 * 获取：父种类id 为零表示顶层种类
	 */
	public Integer getParentId() {
		return parentId;
	}
	/**
	 * 设置：商品种类名称
	 */
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	/**
	 * 获取：商品种类名称
	 */
	public String getCategoryName() {
		return categoryName;
	}
	/**
	 * 设置：商品种类主图
	 */
	public void setImage(String image) {
		this.image = image;
	}
	/**
	 * 获取：商品种类主图
	 */
	public String getImage() {
		return image;
	}
	/**
	 * 设置：状态 1.启用 2.未启用 3 已删除
	 */
	public void setState(Integer state) {
		this.state = state;
	}
	/**
	 * 获取：状态 1.启用 2.未启用 3 已删除
	 */
	public Integer getState() {
		return state;
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
	 * 设置：推荐标志 1是 2否
	 */
	public void setRecommend(Integer recommend) {
		this.recommend = recommend;
	}
	/**
	 * 获取：推荐标志 1是 2否
	 */
	public Integer getRecommend() {
		return recommend;
	}
	/**
	 * 设置：创建时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：创建时间
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：更新时间
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * 获取：更新时间
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
