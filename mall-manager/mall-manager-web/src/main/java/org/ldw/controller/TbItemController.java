package org.ldw.controller;

import org.ldw.service.TbItemService;
import org.ldw.utils.EasyUIDataGridResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/item")
public class TbItemController { 
		
		@Autowired
		public TbItemService tbItemService;
		
		@RequestMapping("/getItem")
		@ResponseBody
		public EasyUIDataGridResult getTbItemList(@RequestParam(defaultValue="1")
		Integer page
				,@RequestParam(defaultValue="10")Integer rows) {
			System.out.println("getTbItemList");
			return tbItemService.getTbItemList(page,rows);
		}
	
}
