package com.example.demo.domain;

import java.math.BigDecimal;

public class ShopStock {
	
	/** 商品ID. */
	private Long itemId;
	
	/** 価格. */
	private BigDecimal price;
	
	/** 店舗ID. */
	private Long shopId;
	
	/** 店舗名. */
	private String shopName;
	
	/** 在庫数. */
	private int amount;
	
	/** 商品名. */
	private String bookName;
	
	
	/**
	 * item id getter.
	 * @return itemId
	 */
	public Long getItemId() {
		return itemId;
	}
	
	/**
	 * item id setter.
	 * @param itemId
	 */
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}
	
	/**
	 * price getter.
	 * @return price
	 */
	public BigDecimal getPrice() {
		return price;
	}
	
	/**
	 * price setter.
	 * @param price
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	/**
	 * shop id getter.
	 * @return shop id
	 */
	public Long getShopId() {
		return shopId;
	}
	
	/**
	 * shop id setter
	 * @param shopId
	 */
	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}
	
	/**
	 * shop name getter.
	 * @return shop name
	 */
	public String getShopName() {
		return shopName;
	}
	
	/**
	 * shop name setter
	 * @param shopName
	 */
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	
	/**
	 * amount getter.
	 * @return amount
	 */
	public int getAmount() {
		return amount;
	}
	
	/**
	 * amount setter.
	 * @param amount
	 */
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	/**
	 * book name getter.
	 * @return book name
	 */
	public String getBookName() {
		return this.bookName;
	}
	
	/**
	 * book name setter
	 * @param bookName
	 */
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

}
