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

import com.bootdo.goods.domain.GoodsCategoryDO;
import com.bootdo.goods.service.GoodsCategoryService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 商品种类表
 * 
 * @author tanping
 * @email 1992lcg@163.com
 * @date 2018-03-29 11:01:02
 */
 
@Controller
@RequestMapping("/goods/goodsCategory")
public class GoodsCategoryController {
	@Autowired
	private GoodsCategoryService goodsCategoryService;
	
	@GetMapping()
	@RequiresPermissions("goods:goodsCategory:goodsCategory")
	String GoodsCategory(){
	    return "goods/goodsCategory/goodsCategory";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("goods:goodsCategory:goodsCategory")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<GoodsCategoryDO> goodsCategoryList = goodsCategoryService.list(query);
		int total = goodsCategoryService.count(query);
		PageUtils pageUtils = new PageUtils(goodsCategoryList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("goods:goodsCategory:add")
	String add(){
	    return "goods/goodsCategory/add";
	}

	@GetMapping("/edit/{categoryId}")
	@RequiresPermissions("goods:goodsCategory:edit")
	String edit(@PathVariable("categoryId") Integer categoryId,Model model){
		GoodsCategoryDO goodsCategory = goodsCategoryService.get(categoryId);
		model.addAttribute("goodsCategory", goodsCategory);
	    return "goods/goodsCategory/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("goods:goodsCategory:add")
	public R save( GoodsCategoryDO goodsCategory){
		if(goodsCategoryService.save(goodsCategory)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("goods:goodsCategory:edit")
	public R update( GoodsCategoryDO goodsCategory){
		goodsCategoryService.update(goodsCategory);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("goods:goodsCategory:remove")
	public R remove( Integer categoryId){
		if(goodsCategoryService.remove(categoryId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("goods:goodsCategory:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] categoryIds){
		goodsCategoryService.batchRemove(categoryIds);
		return R.ok();
	}
	
}
