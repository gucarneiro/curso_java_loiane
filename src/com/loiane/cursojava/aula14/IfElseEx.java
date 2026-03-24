package com.loiane.cursojava.aula14;

import java.util.Scanner;

public class IfElseEx {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("informe o preço do produto");
		double preco = scan.nextDouble();
		
		if (preco < 11) {
			System.out.println("Pode comprar, esta barato");
		} else if (preco > 10 && preco < 20) {
			System.out.println("pedir desconto");
		} else {
			System.out.println("não comprar");
		}
		
	}

}
