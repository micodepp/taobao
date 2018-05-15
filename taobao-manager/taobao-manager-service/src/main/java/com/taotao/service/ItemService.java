package com.taotao.service;

import java.util.List;

import com.taotao.dto.EUDataGridResult;
import com.taotao.pojo.TbItem;

public interface ItemService {
	TbItem getItemById(long itemId);
	EUDataGridResult getItemList(int page,int rows);

}
