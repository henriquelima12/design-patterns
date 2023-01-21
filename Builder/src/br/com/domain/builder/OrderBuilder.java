package br.com.domain.builder;

import java.math.BigDecimal;
import java.util.ArrayList;

import br.com.domain.model.Client;
import br.com.domain.model.Order;
import br.com.domain.model.Product;
import br.com.domain.model.Seller;

public class OrderBuilder {
	
	private Order instance;
	
	public OrderBuilder() {
		this.instance = new Order();
	}
	
	public OrderBuilder setOrder(String orderNumber) {
		instance.setOrderNumber(orderNumber);
		return this;
	}
	
	public OrderBuilder setClient(int code, String name, String telephone) {
		Client client = new Client();
		client.setCode(code);
		client.setName(name);
		client.setTelephone(telephone);
		
		instance.setClient(client);
		
		return this;
	}
	
	public OrderBuilder setSeller(int code, String name) {
		Seller seller = new Seller();
		seller.setCode(code);
		seller.setName(name);
		
		instance.setSeller(seller);
		
		return this;
	}
	
	public OrderBuilder setProduct(String name, int quantity, BigDecimal value) {
		Product product = new Product();
		product.setName(name);
		product.setQuantity(quantity);
		product.setValue(value);
		
		if (instance.getProducts() == null) {
			instance.setProducts(new ArrayList<>());
		}
		
		instance.getProducts().add(product);
		
		return this;
	}
	
	public Order builder() {
		return instance;
	}
	

}
