package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exc01 {

	public static void main(String[] args) { //criar um vetorA e um vetorB, onde o vetorB receba os valores do vetorA
		Scanner scan = new Scanner(System.in);
		
		int[] conjA = new int[5];
		int[] conjB = new int[5];
		int i;
		System.out.println("Infome 5 números inteiros:");
		
		
		for(i=0;i<5;i++) {
			conjA[i] = scan.nextInt();
			conjB[i] = conjA[i];
			System.out.println("Conjunto A: "+conjA[i]+"\nConjunto B: "+conjB[i]);
		}

	}

}
