package com.example.demo.domain;

public class ShopStock {
	
	/** 商品ID. */
	private Long itemId;
	
	/** 店舗ID. */
	private Long shopId;
	
	/** 店舗名. */
	private String shopName;
	
	/** 在庫数. */
	private int amount;
	
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

}
