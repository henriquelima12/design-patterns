package br.com.domain.model;

import java.math.BigDecimal;

public class Product {
	
	private String name;
	private int quantity;
	private BigDecimal unitaryValue;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public BigDecimal getUnitaryValue() {
		return unitaryValue;
	}
	
	public void setUnitaryValue(BigDecimal unitaryValue) {
		this.unitaryValue = unitaryValue;
	}
	
	public BigDecimal getTotalValue() {
		BigDecimal totalValue = unitaryValue.multiply(new BigDecimal(quantity));
		return totalValue;	
	}

}
