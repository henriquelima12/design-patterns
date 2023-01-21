package br.com.domain.mariostate;

import br.com.domain.state.State;

public class InvencibleMario implements State{
	
	@Override
	public State catchMushroom() {
		System.out.println("Pegou um cogumelo: +1000 pontos!");
		return this;
	}

	@Override
	public State catchStar() {
		System.out.println("Pegou uma estrela: Invencible Mário continua invencível");
		return this;
	}

	@Override
	public State catchFireFlower() {
		System.out.println("Pegou uma flor: Invencible Mário continua invencível e atira fogo");
		return this;
	}

	@Override
	public State collideWithEnemy() {
		System.out.println("Colidiu com um inimigo: o inimigo morreu");
		return this;
	}

	@Override
	public String returnType() {
		return "Invencible Mário";
	}

}
