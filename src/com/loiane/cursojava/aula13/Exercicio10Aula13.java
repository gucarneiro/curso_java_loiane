package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class Exercicio10Aula13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a temperatura em ºC: ");
		double c = scan.nextDouble();
		
		double f = (c/5)*9+32;
		
		System.out.println("Temperatura em Farenheit: "+f);
		

	}

}
