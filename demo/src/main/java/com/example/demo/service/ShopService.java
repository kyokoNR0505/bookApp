package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.domain.Shop;
import com.example.demo.mapper.ShopMapper;

/**
 * 店舗サービス.
 * @author kyokokitagawa
 */
@Service
public class ShopService {

	/** アイテムマッパー. */
	@Autowired
	private ShopMapper shopMapper;
	
	/**
	 * 商品IDで検索.
	 * @param itemId アイテムID
	 * @return 在庫なしリスト
	 */
	@Transactional
	public List<Shop> findNoStockShopByItemId(Long itemId) {
		return shopMapper.findNoStockShopByItemId(itemId);
	}
}
