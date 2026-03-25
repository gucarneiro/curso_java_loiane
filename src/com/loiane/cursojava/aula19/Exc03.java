package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exc03 {

	public static void main(String[] args) {//crie um vetorA e um vetorB, onde o vetorB recebe o valor do vetorA ao quadrado
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe 15 numeros inteiros:");
		
		int[] vetA = new int[15], vetB = new int[15];
		
		for(int i=0;i<15;i++) {
			vetA[i] = scan.nextInt();
			vetB[i] = vetA[i] * vetA[i];
			System.out.println("Vetor A: "+vetA[i]+"\nVetor B: "+vetB[i]);
		}

	}

}
