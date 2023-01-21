package br.com.domain.service;

import java.math.BigDecimal;

import br.com.domain.model.Product;

public interface PriceCalculation {
	
	public BigDecimal finalValue(Product product);
	
}
