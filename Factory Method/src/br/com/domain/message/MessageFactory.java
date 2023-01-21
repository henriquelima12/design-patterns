package br.com.domain.message;

public class MessageFactory {
	
	public static Message getMessage(int i) {
		if (i == 1) {
			return new SMSMessage();
		} else if (i == 2) {
			return new EmailMessage();
		} else {
			return new SMSMessage();
		}
	}
	
}
