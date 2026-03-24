package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class Exercicio06Aula13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o raio de um cirulo para calcular a area dele: ");
		double raio = scan.nextDouble();
		
		double area = (raio*raio)*3.14;
		
		System.out.println("a area do circulo é: "+area);
		
		//double area = Math.PI * Math.pow (raio, 2);

	}

}
