package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exc21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe qual combustivel quer abastecer: A - Alcool / G - Gasolina");
		String abastecer = scan.next();
		
		if (abastecer.equals("A") || abastecer.equals("a")) {
			System.out.println("Informe quantos litros deseja abastecer:");
			double litros = scan.nextDouble();
			double totalPagar = litros * 1.9;
			if (litros <= 20) {
				System.out.println("Valor por litro: R$ 1,9\nValor sem desconto: R$"+totalPagar+
						"\nValor com desconto: R$"+(totalPagar * 0.97)+" Desconto total de 3%");
			} else {
				System.out.println("Valor por litro: R$ 1,9\nValor sem desconto: R$"+totalPagar+
						"\nValor com desconto: R$"+(totalPagar * 0.95)+" Desconto total de 5%");
			}
		} else if(abastecer.equals("G") || abastecer.equals("g")) {
			System.out.println("Informe quantos litros deseja abastecer:");
			double litros = scan.nextDouble();
			double totalPagar = litros * 2.5;
			if (litros <= 20) {
				System.out.println("Valor por litro: R$ 1,9\nValor sem desconto: R$"+totalPagar+
						"\nValor com desconto: R$"+(totalPagar * 0.96)+" Desconto total de 4%");
			} else {
				System.out.println("Valor por litro: R$ 1,9\nValor sem desconto: R$"+totalPagar+
						"\nValor com desconto: R$"+(totalPagar * 0.94)+" Desconto total de 6%");
			}
		} else {
			System.out.println("Invalido!");
		}

	}

}
