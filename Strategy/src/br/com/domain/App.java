package br.com.domain;

import br.com.domain.strategy.ContextMath;
import br.com.domain.strategy.operation.Subtraction;
import br.com.domain.strategy.operation.Sum;

public class App {

	public static void main(String[] args) {
		
		ContextMath math = new ContextMath(new Sum());
		System.out.println("Resultado da operação: " +math.calculate(9, 8));
		
		math = new ContextMath(new Subtraction());
		System.out.println("Resultado da operação: " +math.calculate(9, 8));

	}

}
