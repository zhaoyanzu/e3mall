package cn.e3.manager.service;

import com.e3.pojo.TbItem;

public interface ItemService {

	/**
	 * 需求:根据id查询商品信息
	 * 参数:Long itemid
	 * 返回值: TbItem
	 */
	public TbItem findItemById(Long itemId);
}
