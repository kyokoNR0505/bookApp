package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.domain.ShopStock;
import com.example.demo.domain.Stock;
import com.example.demo.mapper.StockMapper;

/**
 * 在庫サービス.
 * @author kyokokitagawa
 */
@Service
public class StockService {

	/** アイテムマッパー. */
	@Autowired
	private StockMapper stockMapper;
	
	/**
	 * 在庫検索.
	 * @param itemId アイテムID
	 * @return 在庫リスト
	 */
	@Transactional
	public List<ShopStock> findByItemId(Long itemId) {
		return stockMapper.findByItemId(itemId);
	}
	
	/**
	 * 在庫検索.
	 * @param itemId アイテムID
	 * @return 店舗在庫
	 */
	@Transactional
	public ShopStock findByItemIdAndShopId(Long itemId, Long shopId) {
		return stockMapper.findByItemIdAndShopId(itemId, shopId);
	}
	
	/**
	 * 在庫を保存する.
	 * @param stock 在庫
	 */
	@Transactional
	public void saveStock(Stock stock) {
		stockMapper.insert(stock);
	}
	
}
