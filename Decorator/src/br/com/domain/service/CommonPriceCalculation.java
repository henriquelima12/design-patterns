package br.com.domain.service;

import java.math.BigDecimal;

import br.com.domain.model.Product;

public class CommonPriceCalculation implements PriceCalculation{

	@Override
	public BigDecimal finalValue(Product product) {
		BigDecimal tax = new BigDecimal("0.10");
		BigDecimal finalValue = product.getTotalValue().add(product.getTotalValue().multiply(tax));
		return finalValue;	
	}

}
