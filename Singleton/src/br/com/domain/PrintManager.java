package br.com.domain;

public class PrintManager {
	
	private static PrintManager printManager; 
	
	private PrintManager() {
		
	}
	
	public static PrintManager getInstance() {
		if (printManager == null) {
			printManager = new PrintManager();
		}
		return printManager;
	}

}
