package br.com.domain.mariostate;

import br.com.domain.state.State;

public class SuperMario implements State{
	
	@Override
	public State catchMushroom() {
		System.out.println("Pegou um cogumelo: +1000 pontos!");
		return this;
	}

	@Override
	public State catchStar() {
		System.out.println("Pegou uma estrela: Super Mário está invencível");
		return new InvencibleMario();
	}

	@Override
	public State catchFireFlower() {
		System.out.println("Pegou uma flor: Super Mário atira fogo");
		return new FireMario();
	}

	@Override
	public State collideWithEnemy() {
		System.out.println("Colidiu com um inimigo: Super Mário volta a ser comum");
		return new Mario();
	}

	@Override
	public String returnType() {
		return "Super Mário";
	}
	
}
