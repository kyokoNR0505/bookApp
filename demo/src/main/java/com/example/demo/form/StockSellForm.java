package com.example.demo.form;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

/**
 * 在庫販売フォーム.
 *
 */
public class StockSellForm {
	
	/** 商品ID. */
	private Long itemId;
	
	/** 税抜き価格. */
	private BigDecimal price;
	
	/** 店舗ID. */
	private Long shopId;
	
	/** 店舗名. */
	private String shopName;
	
	/** 現在の在庫数. */
	private int currentAmount;

	/** 販売数（画面入力値）. */
	@NotNull(message="販売数を入力してください。")
	@Positive(message="販売数は0以上を入力してください。")
	private Integer inputAmount;
	
	/** 税込み価格. */
	private BigDecimal taxPrice;
	
	/** 商品名. */
	private String itemName;
	
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
	 * @return 販売数
	 */
	public Integer getInputAmount() {
		return this.inputAmount;
	}

	/**
	 * inputAmount setter.
	 * @param inputAmount 販売数
	 */
	public void setInputAmount(Integer inputAmount) {
		this.inputAmount = inputAmount;
	}
	
	/**
	 * taxPrice getter.
	 * @return 税込み価格
	 */
	public BigDecimal getTaxPrice() {
		return this.taxPrice;
	}
	/**
	 * taxPrice setter.
	 * @param taxPrice 税込み価格
	 */
	public void setTaxPrice(BigDecimal taxPrice) {
		this.taxPrice = taxPrice;
	}
	
	/**
	 * itemName getter.
	 * @return 商品名
	 */
	public String getItemName() {
		return this.itemName;
	}
	
	/**
	 * itemName setter.
	 * @param itemName 商品名
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	

}

