package br.com.domain.view;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class View extends JFrame {
	
	private JTextField num1 = new JTextField(3);
	private JTextField num2 = new JTextField(3);
	private JTextField result = new JTextField(6);
	private JButton button = new JButton("Somar");
	
	public View() {
		JPanel panel = new JPanel();
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(400, 100);
		
		panel.add(num1);
		panel.add(num2);
		panel.add(button);
		panel.add(result);
		this.add(panel);	
	}
	
	public int getFirstNumber() {
		return Integer.parseInt(num1.getText());	
	}
	
	public int getSecondNumber() {	
		return Integer.parseInt(num2.getText());
	}
	
	public int getResult() {
		return Integer.parseInt(result.getText());
	}
	
	public void setResult(int value) {	
		result.setText(Integer.toString(value));	
	}
	
	public void addListener(ActionListener listener) {
		button.addActionListener(listener);
	}
	
	public void errorMessage(String message) {
		JOptionPane.showMessageDialog(null, message);	
	}

}
