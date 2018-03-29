package com.bootdo.goods.service;

import com.bootdo.goods.domain.GoodsCategoryDO;

import java.util.List;
import java.util.Map;

/**
 * 商品种类表
 * 
 * @author tanping
 * @email 1992lcg@163.com
 * @date 2018-03-29 11:01:02
 */
public interface GoodsCategoryService {
	
	GoodsCategoryDO get(Integer categoryId);
	
	List<GoodsCategoryDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(GoodsCategoryDO goodsCategory);
	
	int update(GoodsCategoryDO goodsCategory);
	
	int remove(Integer categoryId);
	
	int batchRemove(Integer[] categoryIds);
}
