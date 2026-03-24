package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exc16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe 3 valores para realizar a equação de seg grau:");
		int a = scan.nextInt();
		if (a == 0) {
			System.out.println("Não é uma equação de segundo grau!");
		} else {
		double b = scan.nextInt();
		double c = scan.nextInt();
		
			double delta = Math.pow(b, 2) - (4*a*c);
			if (delta < 0) {
				System.out.println("Não existe raizes.");
			} else if(delta == 0) {
				double raiz1 = ((b*(-1)) + Math.sqrt(delta))/(2*a);
				System.out.println("Raiz unica: "+raiz1);
			} else {
				double raiz1 = ((b*(-1)) + Math.sqrt(delta))/(2*a);
				double raiz2 = ((b*(-1)) - Math.sqrt(delta))/(2*a);
				System.out.println("Raiz 1: "+raiz1+"\nRaiz 2: "+raiz2);
			}
		}
	}

}
