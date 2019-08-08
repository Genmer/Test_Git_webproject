package cn.genmer.service;

import cn.genmer.domain.Items;

public interface ItemsService {
	/**
	 * 查询
	 * @param id
	 * @return
	 */
	public Items findById(Integer id);
}
