package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.domain.Item;

/**
 * アイテムマッパーインターフェース.
 * @author kyokokitagawa
 */
@Mapper
public interface ItemMapper {

	/**
	 * キーワード検索.
	 * @param str キーワード
	 * @return アイテムリスト
	 */
	List<Item> findByKeyword(String itemName, String author);
	
	/**
	 * 一件検索.
	 * @param id ID
	 * @return アイテム
	 */
	Item findOne(Long id);

}
