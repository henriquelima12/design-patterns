package br.com.domain.state;

public interface State {
	
	public State catchMushroom();
	
	public State catchStar();
	
	public State catchFireFlower();
	
	public State collideWithEnemy();
	
	public String returnType();
	
}
