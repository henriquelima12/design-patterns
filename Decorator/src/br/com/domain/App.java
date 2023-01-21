package br.com.domain;

import java.math.BigDecimal;

import br.com.domain.model.Product;
import br.com.domain.service.CommonPriceCalculation;
import br.com.domain.service.PriceCalculation;
import br.com.domain.service.PriceCalculationWithCoupon;
import br.com.domain.service.PriceCalculationWithShipping;

public class App {
	
	public static void main(String[] args) {
		Product product = new Product();
		
		product.setName("CD Legião Urbana");
		product.setQuantity(4);
		product.setUnitaryValue(new BigDecimal("20.00"));
		
		PriceCalculation calculation = new PriceCalculationWithCoupon(new PriceCalculationWithShipping(new CommonPriceCalculation()));
		
		BigDecimal price = calculation.finalValue(product);
		System.out.println("R$ " + price.doubleValue());	
	}
	
}
