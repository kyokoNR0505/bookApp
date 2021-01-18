package com.example.demo.form;


/**
 * 検索フォーム.
 * @author kyokokitagawa
 *
 */
public class SearchForm {
	
	/** 商品名. */
	private String itemName;
	
	/** 著者名. */
	private String author;
	
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
	
	/**
	 * author getter.
	 * @return 著者名
	 */
	public String getAuthor() {
		return this.author;
	}
	
	/**
	 * author setter.
	 * @param author 著者名
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
}
