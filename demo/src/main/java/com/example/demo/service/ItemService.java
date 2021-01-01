package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.domain.Item;
import com.example.demo.mapper.ItemMapper;

/**
 * アイテムサービス.
 * @author kyokokitagawa
 */
@Service
public class ItemService {

	/**
	 * アイテムマッパー
	 */
	@Autowired
	private ItemMapper itemMapper;
	
	/**
	 * 全検索.
	 * @return アイテムリスト
	 */
	@Transactional
	public List<Item> findAll() {
		return itemMapper.findAll();
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
	 * 保存.
	 * @param item アイテム
	 */
	@Transactional
	public void save(Item item) {
		itemMapper.save(item);
	}
	
	/**
	 * 更新.
	 * @param item アイテム
	 */
	@Transactional
	public void update(Item item) {
		itemMapper.update(item);
	}
	
	/**
	 * 削除.
	 * @param id ID
	 */
	@Transactional
	public void delete(Long id) {
		itemMapper.delete(id);
	}
}
