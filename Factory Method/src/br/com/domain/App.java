package br.com.domain;

import javax.swing.JOptionPane;

import br.com.domain.message.Message;
import br.com.domain.message.MessageFactory;

public class App {

	public static void main(String[] args) {
		
		String text = JOptionPane.showInputDialog(null);
		
		Message message = MessageFactory.getMessage(1);
		message.send(text);

	}

}
