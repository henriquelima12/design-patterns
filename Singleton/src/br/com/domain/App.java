package br.com.domain;

public class App {

	public static void main(String[] args) {
		
		PrintManager p1 = PrintManager.getInstance();
		PrintManager p2 = PrintManager.getInstance();
		PrintManager p3 = PrintManager.getInstance();
		PrintManager p4 = PrintManager.getInstance();
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);

	}

}
