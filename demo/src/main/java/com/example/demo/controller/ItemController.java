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

import com.example.demo.form.SearchForm;
import com.example.demo.service.ItemService;
import com.example.demo.service.StockService;

/**
 * アイテムコントローラー.
 * @author kyokokitagawa
 *
 */
@Controller
@RequestMapping("/items")
public class ItemController {
	
	/** アイテムサービス. */
	@Autowired
	private ItemService itemService;
	
	/** 在庫サービス. */
	@Autowired
	private StockService stockService;
	
	/**
	 * アイテム検索.
	 * @param searchForm 検索フォーム
	 * @param result BindingResult
	 * @param model モデル
	 * @return テンプレート名
	 */
	@PostMapping("/search")
	public String itemSearch(@ModelAttribute("searchForm") @Validated SearchForm searchForm, BindingResult result, Model model) {
		if (result.hasErrors()) {
			model.addAttribute("searchForm", searchForm);
			return "top";
		} else {
			model.addAttribute("items", itemService.findByKeyword(searchForm.getItemName(), searchForm.getAuthor()));
			return "item-list";
		}
	}
	
	/**
	 * 商品詳細表示.
	 * @param itemId 商品ID
	 * @param model モデル
	 * @return テンプレート名
	 */
	@GetMapping("{itemId}")
	public String show(@PathVariable Long itemId, Model model) {
		model.addAttribute("item", itemService.findOne(itemId));
		model.addAttribute("stocks", stockService.findByItemId(itemId));
		return "item-detail";
	}

}
