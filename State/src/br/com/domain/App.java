package br.com.domain;

import br.com.domain.mariostate.Mario;
import br.com.domain.state.State;

public class App {
	
	public static void main(String[] args) {
		
		State mario = new Mario();
		
		mario = mario.catchMushroom();
		mario = mario.catchFireFlower();
		mario = mario.catchMushroom();
		
		mario = mario.collideWithEnemy();
		mario = mario.collideWithEnemy();
		mario = mario.collideWithEnemy();
		
		System.out.println();
		System.out.println("Estado final: " +mario.returnType());
		
	}
	
}
