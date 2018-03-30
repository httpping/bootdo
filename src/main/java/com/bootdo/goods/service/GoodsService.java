package com.bootdo.goods.service;

import com.bootdo.goods.domain.GoodsDO;

import java.util.List;
import java.util.Map;

/**
 * 商品表
 * 
 * @author tanping
 * @email 1992lcg@163.com
 * @date 2018-03-29 17:36:18
 */
public interface GoodsService {
	
	GoodsDO get(Integer goodsId);
	
	List<GoodsDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(GoodsDO goods);
	
	int update(GoodsDO goods);
	
	int remove(Integer goodsId);
	
	int batchRemove(Integer[] goodsIds);
}
