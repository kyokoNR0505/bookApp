package com.example.demo.domain;

/**
 * 在庫.
 * @author kyokokitagawa
 *
 */
public class Stock {
	
	/** 商品ID. */
	private Long id;
	
	/** 商品ID. */
	private Long itemId;
	
	/** 店舗ID. */
	private Long shopId;
	
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
	 * id setter.
	 * @param itemId
	 */
	public void seId(Long id) {
		this.id = id;
	}
	
	/**
	 * id getter.
	 * @return shop id
	 */
	public Long getId() {
		return id;
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
