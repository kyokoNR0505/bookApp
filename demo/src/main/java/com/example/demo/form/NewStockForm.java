package com.example.demo.form;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

/**
 * 新規在庫登録フォーム.
 * @author yumikoirisawa
 *
 */
public class NewStockForm {
	
	/** 商品ID. */
	private Long itemId;
	
	/** 店舗ID. */
	private Long shopId;
	
	/** 入荷数（画面入力値）. */
	@NotNull(message="入荷数を入力してください。")
	@Positive(message="入荷数は0以上を入力してください。")
	private Integer inputAmount;

	
	/**
	 * item id getter.
	 * @return itemId
	 */
	public Long getItemId() {
		return itemId;
	}

	/**
	 * item id setter.
	 * @param itemId アイテムID
	 */
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	/**
	 * shop id getter.
	 * @return shopId
	 */
	public Long getShopId() {
		return shopId;
	}

	/**
	 * shop id setter.
	 * @param shopId ショップID
	 */
	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}

	/**
	 * input amount getter.
	 * @return inputAmount
	 */
	public Integer getInputAmount() {
		return inputAmount;
	}

	/**
	 * input amount setter.
	 * @param inputAmount 入荷数（画面入力値）
	 */
	public void setInputAmount(Integer inputAmount) {
		this.inputAmount = inputAmount;
	}
	
}
