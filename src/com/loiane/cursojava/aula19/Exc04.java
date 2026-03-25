package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exc04 {

	public static void main(String[] args) {//crie um vetorA e um vetorB, onde vetorB recebe a raiz do valor do vetorA
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe 15 numeros inteiros:");
		
		int[] vetA = new int[15];
		double[] vetB = new double[15];
		
		for(int i=0; i<15; i++) {
			vetA[i] = scan.nextInt();
			vetB[i] = Math.sqrt(vetA[i]);
			System.out.println("Vetor A: "+vetA[i]+"\nVetor B: "+vetB[i]);
		}

	}

}
