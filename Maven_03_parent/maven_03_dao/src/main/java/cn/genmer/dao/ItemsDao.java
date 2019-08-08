package cn.genmer.dao;

import cn.genmer.domain.Items;

public interface ItemsDao {
	/**
	 * 查询
	 * @param id
	 * @return
	 */
	public Items findById(Integer id);
}
