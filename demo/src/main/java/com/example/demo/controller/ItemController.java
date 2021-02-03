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

import com.example.demo.domain.Item;
import com.example.demo.form.NewItemForm;
import com.example.demo.form.SearchForm;
import com.example.demo.service.ItemService;
import com.example.demo.service.StockService;

/**
 * アイテムコントローラー.
 * @author kyokokitagawa/yumikoirisawa
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
	
	/**
	 * 新商品登録ページ表示.
	 * @param newItemForm 新商品登録フォーム
	 * @param model モデル
	 * @return テンプレート名
	 */
	@GetMapping("/new")
	public String newItem(@ModelAttribute("newItemForm")NewItemForm newItemForm, Model model) {
		return "new-item";
	}
	
	/**
	 * 新商品情報登録.
	 * @param newItemForm 新商品登録フォーム
	 * @param result BindingResult
	 * @param model モデル
	 * @return テンプレート名
	 */
	@PostMapping("/new/add")
	public String itemAdd(@ModelAttribute @Validated NewItemForm newItemForm, BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "new-item";
		}
		Item item = new Item();
		item.setName(newItemForm.getInputItemName());
		item.setPrice(newItemForm.getInputPrice());
		item.setAuthor(newItemForm.getInputAuthor());
		itemService.addNewItem(item);

		return "redirect:/items/"+ item.getId();
	}


}
