package br.com.domain.message;

import javax.swing.JOptionPane;

public class SMSMessage implements Message {

	@Override
	public void send(String message) {
		JOptionPane.showMessageDialog(null, "SMS: " +message);
	}

}
