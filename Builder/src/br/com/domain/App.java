package br.com.domain;

import br.com.domain.builder.OrderBuilder;
import br.com.domain.model.Order;

import java.math.BigDecimal;

public class App {

	public static void main(String[] args) {
		Order order = new OrderBuilder()
							.setOrder("9999")
							.setClient(1, "João", "(88)99999-9999")
							.setSeller(1, "Luiz")
							.setProduct("Caderno", 1, new BigDecimal(12.00))
							.setProduct("Lápis", 2, new BigDecimal(1.00))
							.setProduct("Borracha", 3, new BigDecimal(0.50))
							.builder();
		
		order.information();

	}

}
