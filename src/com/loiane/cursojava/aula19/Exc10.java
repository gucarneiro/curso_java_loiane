package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exc10 {

	public static void main(String[] args) {//Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá ser o resto da divisão do respectivo elemento de A por 2 (dois)
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe 10 valores para A:");
		
		int[] vetA = new int[10];
		double[] vetB = new double[10];
		
		for(int i=0; i<10; i++) {
			System.out.println("digite um numero inteiro para A:");
			vetA[i] = scan.nextInt();
			
			vetB[i] = vetA[i] % 2;
			
			if(vetB[i] == 1) {
				System.out.println(vetA[i]+" é impar!");
			} else {
				System.out.println(vetA[i]+" é par!");
			}
		}
		

	}

}
