package org.ldw.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.ldw.mapper.TbItemMapper;
import org.ldw.pojo.TbItem;
import org.ldw.pojo.TbItemExample;
import org.ldw.service.TbItemService;
import org.ldw.utils.EasyUIDataGridResult;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class TbItemServiceImpl implements TbItemService {

	@Resource
	private TbItemMapper tbItemMapper;
	
	@Override
	public EasyUIDataGridResult getTbItemList(Integer page,Integer rows) {
		PageHelper.startPage(page,rows);
		// TODO Auto-generated method stub
		TbItemExample example = new TbItemExample();
		List<TbItem> list = tbItemMapper.selectByExample(example);
		for(int i = 0;i<list.size();i++) {
			System.out.println(list.get(i).toString());
		}
		PageInfo<TbItem> pageInfo = new PageInfo<>(list);
		long total = pageInfo.getTotal();
		EasyUIDataGridResult easyUIDataGridResult = new EasyUIDataGridResult(total,list);
		return easyUIDataGridResult;
	}

}
 