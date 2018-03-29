package com.bootdo.goods.dao;

import com.bootdo.goods.domain.GoodsCategoryDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 商品种类表
 * @author tanping
 * @email 1992lcg@163.com
 * @date 2018-03-29 11:01:02
 */
@Mapper
public interface GoodsCategoryDao {

	GoodsCategoryDO get(Integer categoryId);
	
	List<GoodsCategoryDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(GoodsCategoryDO goodsCategory);
	
	int update(GoodsCategoryDO goodsCategory);
	
	int remove(Integer category_id);
	
	int batchRemove(Integer[] categoryIds);
}
