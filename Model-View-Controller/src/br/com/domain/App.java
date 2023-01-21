package br.com.domain;

import br.com.domain.controller.Controller;
import br.com.domain.model.Model;
import br.com.domain.view.View;

public class App {
	
	public static void main(String[] args) {
		View view = new View();	
		Model model = new Model();	
		
		Controller controller = new Controller(view, model);	
		
		view.setVisible(true);	
	}

}
