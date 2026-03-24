package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exc08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o valor do produto A");
		double prodA = scan.nextDouble();
		System.out.println("Informe o valor do produto B");
		double prodB = scan.nextDouble();
		System.out.println("Informe o valor do produto C");
		double prodC = scan.nextDouble();
		
		if (prodA < prodB && prodA < prodC) {
			System.out.println("O produto A tem o melhor preço! R$" + prodA);
		 } else if (prodB < prodA && prodB < prodC) {
				System.out.println(" O produto B tem o melhor preço! R$" + prodB);
			 } else {
					System.out.println("O produto C tem o melhor preço! R$" + prodC);
			 }
	}

}
