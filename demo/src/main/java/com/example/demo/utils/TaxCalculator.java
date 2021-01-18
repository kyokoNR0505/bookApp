package com.example.demo.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * 税金計算ユーティリティ.
 * @author kyokokitagawa
 *
 */
public class TaxCalculator {
	
	/** 税率. */
	private static final BigDecimal TAX = BigDecimal.valueOf(0.1);
	
	/**
	 * 税込金額を返す（小数点以下切り捨て）.
	 * @param price 税抜き金額
	 * @return 税込金額
	 */
	public static BigDecimal calcTaxIncluded(BigDecimal price) {
		BigDecimal taxIncluded = price.add(TAX.multiply(price));
		return taxIncluded.setScale(0, RoundingMode.DOWN);
	}
	
	/** インスタンス化禁止. */
	private TaxCalculator() {};

}
