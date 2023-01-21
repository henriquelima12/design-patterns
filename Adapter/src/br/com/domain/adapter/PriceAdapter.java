package br.com.domain.adapter;

public class PriceAdapter extends Price{
	
	@Override
	public void setValue(double value) {
		super.setValue(value / 5.00);
	}
	
	@Override
	public double getValue() {
		return (super.getValue() * 5.00);
	}
	
	public double getDolarValue() {
		return super.getValue();
	}
}
