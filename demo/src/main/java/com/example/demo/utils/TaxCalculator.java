package com.example.demo.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TaxCalculator {
	
	/** 税率. */
	private static final BigDecimal TAX = BigDecimal.valueOf(0.1);
	
	
	/**
	 * 税込金額を返す（小数点以下切り捨て）.
	 * @param price 税抜き金額
	 * @return 税込金額
	 */
	public BigDecimal calcTaxIncluded(BigDecimal price) {
		BigDecimal result = TAX.multiply(price).setScale(0, RoundingMode.DOWN);
		return result;
	}
	
	/** インスタンス化禁止. */
	private TaxCalculator() {};

}
