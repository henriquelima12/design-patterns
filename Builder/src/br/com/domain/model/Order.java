package br.com.domain.model;

import java.math.BigDecimal;
import java.util.List;

public class Order {
	
	private String orderNumber;
	private List<Product> products;
	private Client client;
	private Seller seller;
	
	public BigDecimal getTotalValue() {
		BigDecimal total = BigDecimal.ZERO;
		
		for (Product product : products) {
			total = total.add(product.getValue().multiply(new BigDecimal(product.getQuantity())));
		}
		
		return total;	
	}

	public int getTotalProducts() {
		int total = 0;
		
		for (Product product : products) {
			total += product.getQuantity();
		}
		
		return total;
	}
	
	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Client getClient() {
		return client;
	}
	
	public String getClientName() {
		return client.getName();
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Seller getSeller() {
		return seller;
	}
	
	public String getSellerName() {
		return seller.getName();
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}
	
	public void information() {
		System.out.println("N° do pedido: " +this.getOrderNumber());
		System.out.println("Cliente: " +this.getClientName());
		System.out.println("Vendedor: " +this.getSellerName());
		System.out.println("Quantidade de produtos: " +this.getTotalProducts());
		System.out.println("Valor total: R$ " +this.getTotalValue());	
	}

}
