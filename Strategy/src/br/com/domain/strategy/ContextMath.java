package br.com.domain.strategy;

public class ContextMath {
	
	private StrategyMath strategy;
	
	public ContextMath(StrategyMath strategy) {
		this.strategy = strategy;
	}
	
	public int calculate(int number1, int number2) {
		return strategy.operation(number1, number2);
	}

}
