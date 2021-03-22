package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

import com.example.demo.utils.TaxCalculator;

public class TaxCalculatorTests {

	@Test
	public void 税抜き金額が1000円で1100円を返す() {
		// given
		BigDecimal price = BigDecimal.valueOf(1000);
		BigDecimal expected = BigDecimal.valueOf(1100);
		
		// whenS
		BigDecimal actual = TaxCalculator.calcTaxIncluded(price);
		
		// then
		assertEquals(expected, actual);
	}
	
	@Test
	public void brew税抜き金額が999円でを1098円返す() {
		// given
		BigDecimal price = BigDecimal.valueOf(999);
		BigDecimal expected = BigDecimal.valueOf(1098);
		
		// when
		BigDecimal actual = TaxCalculator.calcTaxIncluded(price);
		
		// then
		assertEquals(expected, actual);
	}

}
