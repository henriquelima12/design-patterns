package br.com.domain.mariostate;

import br.com.domain.state.State;

public class FireMario implements State{
	
	@Override
	public State catchMushroom() {
		System.out.println("Pegou um cogumelo: +1000 pontos!");
		return this;
	}

	@Override
	public State catchStar() {
		System.out.println("Pegou uma estrela: Fire Mário está invencível");
		return new InvencibleMario();
	}

	@Override
	public State catchFireFlower() {
		System.out.println("Pegou uma flor: Fire Mário mantém os poderes de fogo");
		return this;
	}

	@Override
	public State collideWithEnemy() {
		System.out.println("Colidiu com um inimigo: Fire Mário volta a ser Super Mário");
		return new SuperMario();
	}

	@Override
	public String returnType() {
		return "Fire Mário";
	}

}
