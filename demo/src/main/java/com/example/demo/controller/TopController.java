package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.form.SearchForm;

@Controller
@RequestMapping("/top")
public class TopController {
	
	@GetMapping
	public String init(@ModelAttribute("searchForm")SearchForm searchForm, Model model) {
		return "top";
	}

}
