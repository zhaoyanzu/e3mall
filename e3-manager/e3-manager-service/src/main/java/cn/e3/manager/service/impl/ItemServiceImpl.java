package cn.e3.manager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.e3.mapper.TbItemMapper;
import com.e3.pojo.TbItem;

import cn.e3.manager.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {

	// 注入商品mapper接口代理对象
	@Autowired
	private TbItemMapper itemMapper;
	/**
	 * 需求:根据id查询商品信息
	 * 参数:Long itemid
	 * 返回值: TbItem
	 */
	@Override
	public TbItem findItemById(Long itemId) {

		TbItem item = itemMapper.selectByPrimaryKey(itemId);
		
		return item;
	}

}
