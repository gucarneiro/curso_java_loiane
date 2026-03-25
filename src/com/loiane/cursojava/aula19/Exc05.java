package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exc05 {

	public static void main(String[] args) {//crie um vetorA e um vetorB, onde vetorB recebe o valor do vetorA vezes sua posição
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe 10 numeros inteiros:");
		
		int[] vetA = new int[10], vetB = new int[10];
		
		for(int i=0; i<10; i++) {
			vetA[i] = scan.nextInt();
			vetB[i] = vetA[i] * i;
			System.out.println("Posição "+i+" - Vetor A: "+vetA[i]+" // Vetor B: "+vetB[i]);
		}
	}
}
