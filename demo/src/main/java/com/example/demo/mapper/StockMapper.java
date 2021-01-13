package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.domain.ShopStock;
import com.example.demo.domain.Stock;

/**
 * 在庫マッパーインターフェース.
 * @author kyokokitagawa
 */
@Mapper
public interface StockMapper {

	/**
	 * 商品IDで検索.
	 * @param itemId 商品ID
	 * @return 在庫リスト
	 */
	List<ShopStock> findByItemId(Long itemId);
	
	/**
	 * 商品IDと店舗IDで検索.
	 * @param itemId 商品ID
	 * @param shopId 店舗ID
	 * @return 店舗在庫
	 */
	ShopStock findByItemIdAndShopId(Long itemId, Long shopId);
	
	
	/**
	 * 在庫を登録する.
	 * @param stock 在庫
	 */
	void insert(Stock stock);

}
