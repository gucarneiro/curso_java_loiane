package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class Exercicio11Aula13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite dois números inteiros");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		System.out.println("Digite um número real");
		double n3 = scan.nextDouble();
		
		System.out.println("dobro do primeiro + metade do segundo = "+((n1*2)+n2/2));
		System.out.println("triplo do primeiro + terceiro = "+((n1*3)+n3));
		System.out.println("triplo elevado ao cubo = "+n3*n3*n3);//Math.pow(n3, 3);
	}

}
