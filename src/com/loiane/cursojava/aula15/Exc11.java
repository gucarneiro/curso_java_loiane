package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exc11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe seu salario para saber o reajuste:");
		double salario = scan.nextDouble();
		
		if (salario <= 280) {
			System.out.println("Salario antes do ajuste: "+ salario);
			System.out.println("Aumento de 20%");
			System.out.println("Valor de aumento: "+(salario * 0.2));
			System.out.println("Novo salario: "+(salario*1.2));
		} else if (salario > 280 && salario <= 700) {
			System.out.println("Salario antes do ajuste: "+ salario);
			System.out.println("Aumento de 15%");
			System.out.println("Valor de aumento: "+(salario * 0.15));
			System.out.println("Novo salario: "+(salario*1.15));
		} else if (salario > 700 && salario <= 1500) {
			System.out.println("Salario antes do ajuste: "+ salario);
			System.out.println("Aumento de 10%");
			System.out.println("Valor de aumento: "+(salario * 0.1));
			System.out.println("Novo salario: "+(salario*1.1));
		} else {
			System.out.println("Salario antes do ajuste: "+ salario);
			System.out.println("Aumento de 5%");
			System.out.println("Valor de aumento: "+(salario * 0.05));
			System.out.println("Novo salario: "+(salario*1.05));
		}
	}

}
