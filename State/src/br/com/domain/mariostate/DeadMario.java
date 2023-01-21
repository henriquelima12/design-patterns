package br.com.domain.mariostate;

import br.com.domain.state.State;

public class DeadMario implements State{
	
	@Override
	public State catchMushroom() {
		return this;
	}

	@Override
	public State catchStar() {
		return this;
	}

	@Override
	public State catchFireFlower() {
		return this;
	}

	@Override
	public State collideWithEnemy() {
		return this;
	}

	@Override
	public String returnType() {
		return "Dead Mário";
	}

}
