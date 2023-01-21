package br.com.domain.model;

public class Model {
	
	private int value;
	
	public void addNumbers(int num1, int num2) {
		this.value = num1 + num2;	
	}
	
	public int getValue() {
		return value;	
	}

}
