package com.bootdo.goods.controller;

import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bootdo.goods.domain.GoodsDO;
import com.bootdo.goods.service.GoodsService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 商品表
 * 
 * @author tanping
 * @email 1992lcg@163.com
 * @date 2018-03-29 17:36:18
 */
 
@Controller
@RequestMapping("/goods/goods")
public class GoodsController {
	@Autowired
	private GoodsService goodsService;
	
	@GetMapping()
	@RequiresPermissions("goods:goods:goods")
	String Goods(){
	    return "goods/goods/goods";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("goods:goods:goods")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<GoodsDO> goodsList = goodsService.list(query);
		int total = goodsService.count(query);
		PageUtils pageUtils = new PageUtils(goodsList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("goods:goods:add")
	String add(){
	    return "goods/goods/add";
	}

	@GetMapping("/edit/{goodsId}")
	@RequiresPermissions("goods:goods:edit")
	String edit(@PathVariable("goodsId") Integer goodsId,Model model){
		GoodsDO goods = goodsService.get(goodsId);
		model.addAttribute("goods", goods);
	    return "goods/goods/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("goods:goods:add")
	public R save( GoodsDO goods){
		if(goodsService.save(goods)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("goods:goods:edit")
	public R update( GoodsDO goods){
		goodsService.update(goods);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("goods:goods:remove")
	public R remove( Integer goodsId){
		if(goodsService.remove(goodsId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("goods:goods:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] goodsIds){
		goodsService.batchRemove(goodsIds);
		return R.ok();
	}
	
}
