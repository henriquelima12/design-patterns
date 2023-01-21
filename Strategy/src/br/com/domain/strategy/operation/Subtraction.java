package br.com.domain.strategy.operation;

import br.com.domain.strategy.StrategyMath;

public class Subtraction implements StrategyMath{

	@Override
	public int operation(int number1, int number2) {
		return number1 - number2;
	}

}
