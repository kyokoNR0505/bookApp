package com.example.demo.domain;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Item {
	
	/** ID. */
	private Long id;
	
	/** 商品名. */
	@NotBlank(message="商品名を入力してください。")
	private String name;
	
	/** 金額. */
	@Min(value=10, message="10以上の数値を入力してください。")
	@Max(value=10000, message="10000以下の数値を入力してください。")
	private float price;
	
	/** 著者名. */
	@Size(max=50, message="著者名は50文字を超えないでください。")
	private String author;
	
	/**
	 * id getter.
	 * @return id
	 */
	public Long getId() {
		return id;
	}
	
	/**
	 * id setter.
	 * @param id id
	 */
	public void setId(Long id) {
		this.id = id;
	}
	
	/**
	 * name getter.
	 * @return name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * name setter.
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * price getter.
	 * @return price
	 */
	public float getPrice() {
		return price;
	}
	
	/**
	 * price setter
	 * @param price
	 */
	public void setPrice(float price) {
		this.price = price;
	}
	
	/**
	 * author getter.
	 * @return author
	 */
	public String getAuthor() {
		return author;
	}
	
	/**
	 * author setter.
	 * @param author
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

}
