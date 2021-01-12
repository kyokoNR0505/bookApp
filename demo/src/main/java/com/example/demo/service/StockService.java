package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.domain.Stock;
import com.example.demo.mapper.StockMapper;

/**
 * 在庫サービス.
 * @author kyokokitagawa
 */
@Service
public class StockService {

	/**
	 * アイテムマッパー
	 */
	@Autowired
	private StockMapper stockMapper;
	
	/**
	 * 在庫検索.
	 * @param itemId アイテムID
	 * @return 在庫リスト
	 */
	@Transactional
	public List<Stock> findStocks(Long itemId) {
		List<Stock> list = stockMapper.findByItemId(itemId);
		return list;
	}
	
}
