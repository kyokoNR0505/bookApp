package com.example.demo.domain;

import java.math.BigDecimal;

/**
 * 商品.
 * @author kyokokitagawa
 *
 */
public class Item {
	
	/** ID. */
	private Long id;
	
	/** 商品名. */
	private String name;
	
	/** 金額. */
	private BigDecimal price;
	
	/** 著者名. */
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
	public BigDecimal getPrice() {
		return price;
	}
	
	/**
	 * price setter
	 * @param price
	 */
	public void setPrice(BigDecimal price) {
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
