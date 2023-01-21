package br.com.domain.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.com.domain.model.Model;
import br.com.domain.view.View;

public class Controller {
	
	private View view;
	private Model model;
	
	public Controller(View view, Model model) {		
		this.view = view;		
		this.model = model;		
		this.view.addListener(new Listener());		
	}
	
	class Listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			int number1, number2 = 0;
			
			try {
				number1 = view.getFirstNumber();
				number2 = view.getSecondNumber();
				
				model.addNumbers(number1, number2);
				view.setResult(model.getValue());	
			} catch(Exception ex) {
				view.errorMessage("Verifique se os dados estão inseridos corretamente");
			}

		}
		
	}

}
