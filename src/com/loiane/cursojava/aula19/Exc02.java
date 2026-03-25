package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exc02 {

	public static void main(String[] args) {//crie um vetorA e um vetorB, onde vetorB recebe o dobro do valor do vetorA
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe 8 números inteiros:");
		
		int[] vetA = new int[8], vetB = new int[8];
		int i;
		
		for(i=0;i<8;i++) {
			vetA[i] = scan.nextInt();
			vetB[i] = vetA[i] * 2;
			System.out.println("Vetor A: "+vetA[i]+"\nVetor B: "+vetB[i]);
		}
		
	}

}
