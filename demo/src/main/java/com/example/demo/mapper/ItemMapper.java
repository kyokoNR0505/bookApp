package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.domain.Item;

/**
 * アイテムマッパーインターフェース.
 * @author kyokokitagawa/yumikoirisawa
 */
@Mapper
public interface ItemMapper {

	/**
	 * キーワード検索.
	 * @param itemName キーワード
	 * @param author キーワード
	 * @return アイテムリスト
	 */
	List<Item> findByKeyword(String itemName, String author);
	
	/**
	 * 一件検索.
	 * @param id ID
	 * @return アイテム
	 */
	Item findOne(Long id);

	/**
	 * 新商品を登録する.
	 * @param item　アイテム
	 */
	void insert(Item item);
	
}
