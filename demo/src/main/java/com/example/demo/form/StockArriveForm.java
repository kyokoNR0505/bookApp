package com.example.demo.form;

import javax.validation.constraints.Positive;

public class StockArriveForm {
	
	/** 商品ID. */
	private Long itemId;
	
	/** 店舗ID. */
	private Long shopId;
	
	/** 店舗名. */
	private String shopName;
	
	/** 現在の在庫数. */
	private int currentAmount;

	/** 入荷数（画面入力値）. */
	@Positive(message="入荷数は0以上を入力してください。")
	private int inputAmount;
	
	/**
	 * itemId getter.
	 * @return 商品ID
	 */
	public Long getItemId() {
		return this.itemId;
	}

	/**
	 * itemId setter.
	 * @param itemId 商品ID
	 */
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}
	
	/**
	 * shopId getter.
	 * @return 店舗ID
	 */
	public Long getShopId() {
		return this.shopId;
	}

	/**
	 * shopId setter.
	 * @param shopId 店舗ID
	 */
	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}
	
	/**
	 * shopName getter.
	 * @return 店舗名
	 */
	public String getShopName() {
		return this.shopName;
	}

	/**
	 * shopName setter.
	 * @param shopName 店舗名
	 */
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	
	/**
	 * currentAmount getter.
	 * @return 現在の在庫数
	 */
	public int getCurrentAmount() {
		return this.currentAmount;
	}

	/**
	 * currentAmount setter.
	 * @param currentAmount 現在の在庫数
	 */
	public void setCurrentAmount(int currentAmount) {
		this.currentAmount = currentAmount;
	}

	/**
	 * inputAmount getter.
	 * @return 入荷数
	 */
	public int getInputAmount() {
		return this.inputAmount;
	}

	/**
	 * inputAmount setter.
	 * @param inputAmount 入荷数
	 */
	public void setInputAmount(int inputAmount) {
		this.inputAmount = inputAmount;
	}
}
