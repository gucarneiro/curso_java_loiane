package com.loiane.cursojava.aula20;

import java.util.Random;
import java.util.Scanner;

public class Exc01 {

	public static void main(String[] args) {// Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0- 9. Após isso determine o maior número da matriz e a sua posição (linha, coluna)
		Scanner scan = new Scanner(System.in);
		
		int[][] matriz = new int[4][4];
		int maior = matriz[0][0];
		int linha = 0, coluna = 0;
		
		Random numeroAle = new Random();
		
		for(int i=0; i<4; i++) {
			for(int j=0;j<4;j++) {
				matriz[i][j] = numeroAle.nextInt(100);
			}
		}
		
		for(int i=0; i<4; i++) {
			for(int j=0;j<4;j++) {
				if(maior<matriz[i][j]) {
					maior = matriz[i][j];
					linha = i;
					coluna = j;
				}
			}
		}
		
		System.out.println("o maior número é o: "+maior+"\nLinha: "+linha+"\nColuna: "+coluna);
		
	}

}
