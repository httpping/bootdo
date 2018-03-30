package com.bootdo.goods.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.goods.dao.GoodsDao;
import com.bootdo.goods.domain.GoodsDO;
import com.bootdo.goods.service.GoodsService;



@Service
public class GoodsServiceImpl implements GoodsService {
	@Autowired
	private GoodsDao goodsDao;
	
	@Override
	public GoodsDO get(Integer goodsId){
		return goodsDao.get(goodsId);
	}
	
	@Override
	public List<GoodsDO> list(Map<String, Object> map){
		return goodsDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return goodsDao.count(map);
	}
	
	@Override
	public int save(GoodsDO goods){
		return goodsDao.save(goods);
	}
	
	@Override
	public int update(GoodsDO goods){
		return goodsDao.update(goods);
	}
	
	@Override
	public int remove(Integer goodsId){
		return goodsDao.remove(goodsId);
	}
	
	@Override
	public int batchRemove(Integer[] goodsIds){
		return goodsDao.batchRemove(goodsIds);
	}
	
}
