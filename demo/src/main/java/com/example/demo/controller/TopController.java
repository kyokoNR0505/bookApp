package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.form.SearchForm;
import com.example.demo.service.ItemService;

@Controller
@RequestMapping("/top")
public class TopController {
	
	@Autowired
	private ItemService itemService;
	
	@GetMapping
	public String index(@ModelAttribute("searchForm")SearchForm searchForm, Model model) {
		return "top";
	}
	
	@PostMapping("/itemSearch")
	public String itemSearch(@ModelAttribute("searchForm") @Validated SearchForm searchForm, BindingResult result, Model model) {
		if (result.hasErrors()) {
			model.addAttribute("searchForm", searchForm);
			return "top";
		} else {
			model.addAttribute("items", itemService.findByKeyword(searchForm.getItemName()));
			return "item-list";
		}
	}

}
