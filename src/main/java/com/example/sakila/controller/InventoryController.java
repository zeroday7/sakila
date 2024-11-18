package com.example.sakila.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.sakila.service.InventoryService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class InventoryController {
	@Autowired InventoryService inventoryService;
	
	@GetMapping("/on/addInventory")
	public String addInventory(Model model
								, @RequestParam Integer storeId
								, @RequestParam(required = false) String searhTitle) {
		model.addAttribute("storeId", storeId);
		
		if(searhTitle != null && !searhTitle.equals("")) {
			// 영화 검색 목록 모델에 추가
		}
		
		return "on/addInventory";
	}
	
	@GetMapping("/on/inventoryList")
	public String inventoryList(Model model
								, @RequestParam Integer storeId
								, @RequestParam(defaultValue = "1") Integer currentPage
								, @RequestParam(defaultValue = "10") Integer rowPerPage) {
		List<Map<String, Object>> inventoryList = 
				inventoryService.getInventoryListByStore(storeId, currentPage, rowPerPage);
		model.addAttribute("inventoryList", inventoryList);
		model.addAttribute("storeId", storeId);
		return "on/inventoryList";
	}
}
