package cn.genmer.service.impl;

import cn.genmer.dao.ItemsDao;
import cn.genmer.domain.Items;
import cn.genmer.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemsServiceImpl implements ItemsService {

	@Autowired
	private ItemsDao itemsDao;

	public Items findById(Integer id) {
		return itemsDao.findById ( id );
	}
}