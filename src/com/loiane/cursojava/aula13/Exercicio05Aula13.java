package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class Exercicio05Aula13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("informe o valor em Metros para converter em Centímetros: ");
		float metros = scan.nextFloat();
		
		float cm = metros * 100;
		
		System.out.println("o valor em centímetros é: "+cm);
	}

}
