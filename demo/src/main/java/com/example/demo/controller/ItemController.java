package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.ItemService;
import com.example.demo.service.StockService;

@Controller
@RequestMapping("/items")
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	@Autowired
	private StockService stockService;

	@GetMapping("{id}")
	public String show(@PathVariable Long id, Model model) {
		model.addAttribute("item", itemService.findOne(id));
		model.addAttribute("stocks", stockService.findStocks(id));
		return "item-detail";
	}
}
