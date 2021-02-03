package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.domain.Shop;

/**
 * 店舗マッパーインターフェース.
 * @author kyokokitagawa
 */
@Mapper
public interface ShopMapper {
	
	/**
	 * アイテムの在庫のない店舗を検索.
	 * @param itemId 商品ID
	 * @return 店舗リスト
	 */
	List<Shop> findNoStockShopByItemId(Long itemId);
	
}
