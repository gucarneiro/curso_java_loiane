package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exc05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe duas notas para calcular a média:");
		double n1 = scan.nextDouble();
		double n2 = scan.nextDouble();
		
		double media = (n1 +n2)/2;
		
		System.out.println("Sua média é: "+ media);
		
		if (media < 7) {
			System.out.println("Reprovado!");
		} else if (media < 10) {
			System.out.println("Aprovado!");
		} else {
			System.out.println("Aprovado com Distinção!");
		}
		
	}

}
