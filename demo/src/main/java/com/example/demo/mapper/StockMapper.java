package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.domain.Stock;

/**
 * 在庫マッパーインターフェース.
 * @author kyokokitagawa
 */
@Mapper
public interface StockMapper {

	/**
	 * キーワード検索検索.
	 * @param itemId 商品ID
	 * @return 在庫リスト
	 */
	List<Stock> findByItemId(Long itemId);

}
