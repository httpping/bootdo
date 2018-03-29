package com.bootdo.goods.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.goods.dao.GoodsCategoryDao;
import com.bootdo.goods.domain.GoodsCategoryDO;
import com.bootdo.goods.service.GoodsCategoryService;



@Service
public class GoodsCategoryServiceImpl implements GoodsCategoryService {
	@Autowired
	private GoodsCategoryDao goodsCategoryDao;
	
	@Override
	public GoodsCategoryDO get(Integer categoryId){
		return goodsCategoryDao.get(categoryId);
	}
	
	@Override
	public List<GoodsCategoryDO> list(Map<String, Object> map){
		return goodsCategoryDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return goodsCategoryDao.count(map);
	}
	
	@Override
	public int save(GoodsCategoryDO goodsCategory){
		return goodsCategoryDao.save(goodsCategory);
	}
	
	@Override
	public int update(GoodsCategoryDO goodsCategory){
		return goodsCategoryDao.update(goodsCategory);
	}
	
	@Override
	public int remove(Integer categoryId){
		return goodsCategoryDao.remove(categoryId);
	}
	
	@Override
	public int batchRemove(Integer[] categoryIds){
		return goodsCategoryDao.batchRemove(categoryIds);
	}
	
}
