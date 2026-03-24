package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class Exercicio07Aula13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("informe o lado de um quadrado para saber sua área e o dobro de sua área:");
		double lado = scan.nextDouble();
		
		double area = lado * lado;
		
		//double area = Math.pow (lado, 2);
		
		System.out.println("área do quadrado: "+area);
		System.out.println("dobro da área: "+area*2);
	}

}
