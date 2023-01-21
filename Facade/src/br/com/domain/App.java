package br.com.domain;

import br.com.domain.facade.ComputerFacade;

public class App {

	public static void main(String[] args) {
		
		ComputerFacade facade = new ComputerFacade();
		facade.assemblePC();

	}

}
