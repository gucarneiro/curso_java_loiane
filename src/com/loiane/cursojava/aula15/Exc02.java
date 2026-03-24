package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exc02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe um número:");
		int num1 = scan.nextInt();
		
		if (num1 > 0) {
			System.out.println("Positivo");
		} else {
			System.out.println("Negativo");
		}

	}

}
