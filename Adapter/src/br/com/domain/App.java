package br.com.domain;

import br.com.domain.adapter.PriceAdapter;

public class App {

	public static void main(String[] args) {
		
		PriceAdapter price = new PriceAdapter();
		
		price.setValue(30.00);
		
		System.out.println("R$: " +price.getValue());
		System.out.println("$: " +price.getDolarValue());
	}

}
