package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exc18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um número:");
		int num = scan.nextInt();
		
		if(num % 2 == 0) {
			System.out.println(num+" é Par!");
		} else {
			System.out.println(num+" é Impar!");
		}

	}

}
