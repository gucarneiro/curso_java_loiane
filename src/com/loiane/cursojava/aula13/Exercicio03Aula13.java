package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class Exercicio03Aula13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teste = new Scanner(System.in);
		
		System.out.println("Informe dois número para soma: ");
		int var1 = teste.nextInt();
		int var2 = teste.nextInt();
		
		int soma = var1 + var2;
		
		System.out.println("a soma dos valores é: " + soma);
		
	}

}
