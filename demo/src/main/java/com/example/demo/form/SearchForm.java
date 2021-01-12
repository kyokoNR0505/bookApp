package com.example.demo.form;

import javax.validation.constraints.NotBlank;

public class SearchForm {
	
	/** 商品名. */
	@NotBlank(message="商品名を入力してください。")
	private String itemName;
	
	/**
	 * itemName getter.
	 * @return 商品名
	 */
	public String getItemName() {
		return this.itemName;
	}
	
	/**
	 * itemName setter.
	 * @param itemName 商品名r
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
}
