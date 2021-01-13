package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.ShopStock;
import com.example.demo.domain.Stock;
import com.example.demo.form.StockArriveForm;
import com.example.demo.service.StockService;

@Controller
@RequestMapping("/stock")
public class StockController {
	
	@Autowired
	private StockService stockService;

	@GetMapping("arrive/{itemId}/{shopId}")
	public String arrive(@PathVariable Long itemId, @PathVariable Long shopId, Model model) {
		final ShopStock shopStock = stockService.findByItemIdAndShopId(itemId, shopId);
		StockArriveForm stockArriveForm = new StockArriveForm();
		stockArriveForm.setItemId(shopStock.getItemId());
		stockArriveForm.setShopId(shopStock.getShopId());
		stockArriveForm.setShopName(shopStock.getShopName());
		model.addAttribute("stockArriveForm", stockArriveForm);
		return "arrive";
	}
	
	@PostMapping("arrive/submit")
	public String arrivalSubmit(@ModelAttribute @Validated StockArriveForm stockArriveForm, BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "arrive";
		}
		Stock stock = new Stock();
		stock.setItemId(stockArriveForm.getItemId());
		stock.setShopId(stockArriveForm.getShopId());
		stock.setAmount(stockArriveForm.getInputAmount());
		stockService.saveStock(stock);
		
		return "redirect:/items/"+ stock.getItemId();
	}
	
	@GetMapping("move/{itemId}/{shopId}")
	public String move(@PathVariable Long itemId, @PathVariable Long shopId, Model model) {
		return "item-detail";
	}
	
	@GetMapping("sell/{itemId}/{shopId}")
	public String sell(@PathVariable Long itemId, @PathVariable Long shopId, Model model) {
		return "item-detail";
	}
	
	
}
