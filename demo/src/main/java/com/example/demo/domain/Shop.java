package com.example.demo.domain;

/**
 * 店舗.
 * @author kyokokitagawa
 *
 */
public class Shop {
	
	/** 店舗ID. */
	private Long id;
	
	/** 店舗名. */
	private String name;
	
	/** 都道府県ID. */
	private Long prefectureId;
	
	/** 住所. */
	private String address;
	
	/** 電話番号. */
	private String phone;
	
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
	 * name getter.
	 * @return name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * name setter
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * prefecture id setter.
	 * @param prefecture id
	 */
	public void setPrefectureId(Long prefectureId) {
		this.prefectureId = prefectureId;
	}
	
	/**
	 * prefecture id getter.
	 * @return prefecture id
	 */
	public Long getPrefectureId() {
		return prefectureId;
	}
	
	/**
	 * address getter.
	 * @return address
	 */
	public String getAddress() {
		return address;
	}
	
	/**
	 * address setter
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	/**
	 * phone getter.
	 * @return phone
	 */
	public String getPhone() {
		return phone;
	}
	
	/**
	 * phone setter
	 * @param phone
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

}
