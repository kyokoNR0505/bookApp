package com.example.demo.form;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

/**
 * 新商品登録フォーム.
 * @author yumikoirisawa
 * 
 */
public class NewItemForm {
	
	/** 商品ID. */
	private Long itemId;

	/** 商品名（画面入力値）. */
	@NotNull(message="商品名を入力してください。")
	private String inputItemName;
		
	/** 金額（画面入力値）. */
	@NotNull(message="金額を入力してください。")
	@Positive(message="金額は0以上を入力してください。")
	private BigDecimal inputPrice;
	
	/** 著者名（画面入力値）. */
	@NotNull(message="著者名を入力してください。")
	private String inputAuthor;
	
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
	 * inputItemName getter.
	 * @return 商品名
	 */
	public String getInputItemName() {
		return this.inputItemName;
	}
	
	/**
	 * inputItemName setter.
	 * @param inputItemName 商品名
	 */
	public void setInputItemName(String inputItemName) {
		this.inputItemName = inputItemName;
	}
	
	/**
	 * inputPrice getter.
	 * @return 金額
	 */
	public BigDecimal getInputPrice() {
		return this.inputPrice;
	}

	/**
	 * inputPrice setter.
	 * @param inputPrice 金額
	 */
	public void setInputPrice(BigDecimal inputPrice) {
		this.inputPrice = inputPrice;
	}
	
	/**
	 * inputAuthor getter.
	 * @return 著者
	 */
	public String getInputAuthor() {
		return this.inputAuthor;
	}

	/**
	 * inputAuthor setter.
	 * @param inputAuthor 著者
	 */
	public void setInputAuthor(String inputAuthor) {
		this.inputAuthor = inputAuthor;
	}
	
}

