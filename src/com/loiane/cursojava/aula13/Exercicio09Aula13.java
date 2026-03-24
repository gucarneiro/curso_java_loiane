package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class Exercicio09Aula13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a temperatura em Farenheit:");
		double f = scan.nextDouble();
		
		double c = (5* (f-32) / 9);
		
		System.out.println("Temperatura em ºC: "+c);

	}

}
