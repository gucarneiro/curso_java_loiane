package com.loiane.cursojava.aula20;

import java.util.Random;

public class Exc02 {

	public static void main(String[] args) {// Gere e imprima uma matriz M 10x10 com valores aleatórios entre 0-9. Após isso indique qual é o maior e o menor valor da linha 5 e qual é o maior e o menor valor da coluna 7
		
		Random numeroAleatorio = new Random();
		
		int[][] matriz = new int[10][10];
		int maior5 = 0, menor5 = 1000, maior7 = 0, menor7 = 1000;
		
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				matriz[i][j] = numeroAleatorio.nextInt(100);
			}
		}
		
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				System.out.print(matriz[i][j]+" | ");
			}
			System.out.println();
			System.out.println("-------------------------------------------------");
		}
		
		for(int i=5;i<6;i++) {
			for(int j=0;j<10;j++) {
				if(maior5 < matriz[5][j]) {
					maior5 = matriz[5][j];
				}
				if(menor5 > matriz[5][j]) {
					menor5 = matriz[5][j];
				}
			}
		}
		System.out.println("maior numero da linha 5: "+maior5);
		System.out.println("menor numero da linha 5: "+menor5);
		
		for(int i=7;i<8;i++) {
			for(int j=0;j<10;j++) {
				if(maior7 < matriz[7][j]) {
					maior7 = matriz[7][j];
				}
				if(menor7 > matriz[7][j]) {
					menor7 = matriz[7][j];
				}
			}
		}
		System.out.println("maior numero da linha 7: "+maior7);
		System.out.println("menor numero da linha 7: "+menor7);
		
	}

}
