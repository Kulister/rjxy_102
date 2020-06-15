package org.ldw.service;

import org.ldw.utils.EasyUIDataGridResult;

public interface TbItemService {
	public EasyUIDataGridResult getTbItemList(Integer page,Integer rows);
}