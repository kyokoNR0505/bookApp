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
	 * 全検索.
	 * @return アイテムリスト
	 */
	List<Item> findAll();
	
	/**
	 * 一件検索.
	 * @param id ID
	 * @return アイテム
	 */
	Item findOne(Long id);
	
	/**
	 * 保存.
	 * @param item アイテム
	 */
	void save(Item item);
	
	/**
	 * 更新.
	 * @param item アイテム
	 */
	void update(Item item);
	
	/**
	 * 削除.
	 * @param id ID
	 */
	void delete(Long id);
}
