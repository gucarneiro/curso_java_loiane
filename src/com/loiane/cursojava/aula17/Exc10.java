package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exc10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe 2 numeros para saber o intervalo entre eles: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		int i;
		
		for(i=num1; i<=num2; i++) {
			System.out.println(i);
		}

	}

}
