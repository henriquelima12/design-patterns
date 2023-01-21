package br.com.domain.service;

import java.math.BigDecimal;

import br.com.domain.model.Product;

public class PriceCalculationWithShipping implements PriceCalculation{
	
	private PriceCalculation calculation;
	
	public PriceCalculationWithShipping(PriceCalculation calculation) {
		this.calculation = calculation;
	}

	@Override
	public BigDecimal finalValue(Product product) {
		BigDecimal finalValue = calculation.finalValue(product);
		BigDecimal shipping;
		
		if (product.getQuantity() > 3) {
			shipping = new BigDecimal("11.00");	
		} else {
			shipping = new BigDecimal("17.00");	
		}
		
		finalValue = finalValue.add(shipping);
		return finalValue;	
	}

}
