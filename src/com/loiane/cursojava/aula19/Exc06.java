package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exc06 {

	public static void main(String[] args) {// Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um vetor C, onde cada elemento de C é a soma dos respectivos elementos em A e B
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe 10 valores para A e B: ");
		int[] vetA = new int[10], vetB = new int[10], vetC = new int[10];
		
		for(int i=0; i<10; i++) {
			System.out.println("insira um valor para A: ");
			vetA[i] = scan.nextInt();
			
			System.out.println("insira um valor para B: ");
			vetB[i] = scan.nextInt();
			
			vetC[i] = vetA[i] + vetB[i];
			System.out.println("Soma de A e B: "+vetC[i]);
			
		}
		
	}

}
