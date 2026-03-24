package com.loiane.cursojava.aula17;

public class For {

	public static void main(String[] args) {
		
		int i = 0;
		
		for(i=0;i<10;i++) {
			System.out.println("valor de i: "+i);
		}
		
		System.out.println("---------------");

		for(i=10;i>=0;i--) {
			System.out.println("valor de i: "+i);
		}
		
		System.out.println("---------------");

		//for com duas variaveis
		for (int x = 0, y = 10; x < y; x++, y--) {
			System.out.println("valor de x: "+x+"\nvalor de y: "+y);
		}
	}

}
