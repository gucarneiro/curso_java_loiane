package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exc17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um ano: ");
		
		int ano = scan.nextInt();
		
		if (ano % 4 == 0 || (ano % 400 == 0 && ano % 100 == 0)) {
			System.out.println("Ano bissexto: "+ ano);
		} else {
			System.out.println("Ano NÃO bissexto: "+ ano);
		}

	}

}
