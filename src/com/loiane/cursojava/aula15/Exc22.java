package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exc22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Tabela de preços de frutas: \nMorango: \naté 5kg: R$ 2,50 // acima de 5kg: R$2,20");
		System.out.println("Tabela de preços de frutas: \nLaranja: \naté 5kg: R$ 1,80 // acima de 5kg: R$1,50");
		
		double precoMorango = 0;
		double precoLaranja = 0;
		double kgTotal = 0;
		
		System.out.println("Comprar morango? S / N");
		String cMorango = scan.next();
		if (cMorango.equals("s")||cMorango.equals("S")) {
			System.out.println("Quantos quilos?");
			double kgMorango = scan.nextDouble();
			kgTotal += kgMorango;
			if (kgMorango <= 5) {
				precoMorango = kgMorango * 2.5;
			} else {
				precoMorango = kgMorango * 2.2;
			}
		}
		System.out.println("Comprar laranja? S / N");
		String cLaranja = scan.next();
		if (cLaranja.equals("s")||cLaranja.equals("S")) {
			System.out.println("Quantos quilos?");
			double kgLaranja = scan.nextDouble();
			kgTotal += kgLaranja;
			if (kgLaranja <= 5) {
				precoLaranja = kgLaranja * 1.8;
			} else {
				precoLaranja = kgLaranja * 1.5;
			}
		}

		double precoTotal = precoLaranja + precoMorango;
		System.out.println("Total a pagar: R$"+precoTotal);
		
		if (precoTotal > 25 || kgTotal > 8) {
			System.out.println("Voce ganhou um desconto de 10%: R$"+(precoTotal*0.1)+"\nTotal a pagar: R$"+(precoTotal*0.9));
		}
	}

}
