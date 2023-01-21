package br.com.domain.message;

import javax.swing.JOptionPane;

public class EmailMessage implements Message {

	@Override
	public void send(String message) {
		JOptionPane.showMessageDialog(null, "Email: " +message);
	}

}
