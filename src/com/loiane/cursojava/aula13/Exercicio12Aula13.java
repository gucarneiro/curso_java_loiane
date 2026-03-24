package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class Exercicio12Aula13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("informe sua altura: ");
		double altura = scan.nextDouble();
		
		System.out.println("Seu peso ideal seria: "+((72.7*altura)-58));
	}

}
