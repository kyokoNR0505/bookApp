package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.domain.Item;
import com.example.demo.mapper.ItemMapper;

/**
 * アイテムサービス.
 * @author kyokokitagawa/yumikoirisawa
 * 
 */
@Service
public class ItemService {

	/**
	 * アイテムマッパー
	 */
	@Autowired
	private ItemMapper itemMapper;
	
	/**
	 * キーワード検索.
	 * @param itemName キーワード
	 * @param author キーワード
	 * @return アイテム
	 */
	@Transactional
	public List<Item> findByKeyword(String itemName, String author) {
		return itemMapper.findByKeyword(itemName, author);
	}
	
	/**
	 * 一件検索.
	 * @param id ID
	 * @return アイテム
	 */
	@Transactional
	public Item findOne(Long id) {
		return itemMapper.findOne(id);
	}
	
	/**
	 * 新商品を登録する.
	 * @param item アイテム
	 */
	@Transactional
	public void insert(Item item) {
		itemMapper.insert(item);
	}

}
