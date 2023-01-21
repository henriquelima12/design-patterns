package br.com.domain.mariostate;

import br.com.domain.state.State;

public class Mario implements State{

	@Override
	public State catchMushroom() {
		System.out.println("Pegou um cogumelo: Mário tornou-se o Super Mário");
		return new SuperMario();
	}

	@Override
	public State catchStar() {
		System.out.println("Pegou uma estrela: Mário está invencível");
		return new InvencibleMario();
	}

	@Override
	public State catchFireFlower() {
		System.out.println("Pegou uma flor: Mário atira fogo");
		return new FireMario();
	}

	@Override
	public State collideWithEnemy() {
		System.out.println("Colidiu com um inimigo: Mário morre");
		return new DeadMario();
	}

	@Override
	public String returnType() {
		return "Common Mário";
	}

}
