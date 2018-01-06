package cn.e3.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.e3.pojo.TbItem;

import cn.e3.manager.service.ItemService;

@Controller
public class ItemController {

	// 注入service服务对象
	@Autowired
	private ItemService itemService;
	
	/**
	 * 需求:根据id查询商品信息
	 * 参数:Long itemid
	 * 返回值: TbItem
	 */
	@RequestMapping("item/{itemId}")
    @ResponseBody
	public TbItem findItemById(@PathVariable Long itemId){
		
		TbItem item = itemService.findItemById(itemId);
		
		return item;
	}
}
