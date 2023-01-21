package br.com.domain.service;

import java.math.BigDecimal;

import br.com.domain.model.Product;

public class PriceCalculationWithCoupon implements PriceCalculation{
	
	private PriceCalculation calculation;
	
	public PriceCalculationWithCoupon(PriceCalculation calculation) {
		this.calculation = calculation;	
	}

	@Override
	public BigDecimal finalValue(Product product) {
		BigDecimal finalValue = calculation.finalValue(product);
		BigDecimal coupon;
		
		if (product.getTotalValue().compareTo(new BigDecimal("70.00")) == 1) {
			coupon = new BigDecimal("20.00");	
		} else {
			coupon = new BigDecimal("10.00");
		}
		
		finalValue = finalValue.subtract(coupon);
		return finalValue;	
	}

}
