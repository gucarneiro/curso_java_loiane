package com.loiane.cursojava.aula20;

import java.util.Scanner;

public class Exc03 {

	public static void main(String[] args) {// Capture do teclado valores para preenchimento de uma matriz M 3x3. Após a captura imprima a matriz criada e encontre a quantidade de números pares, a quantidade de números ímpares
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe valores inteiros para uma matriz 3x3:");
		
		int[][] matriz = new int[3][3];
		int par=0, impar=0;
		
		for(int i=0; i<3; i++) {
			System.out.println("linha "+i+":");
			for(int j=0; j<3; j++) {
				System.out.println("coluna "+j+":");
				matriz[i][j] = scan.nextInt();
			}
		}
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(matriz[i][j]%2==0) {
					par++;
				} else {
					impar++;
				}
			}
		}
		System.out.println("Matriz 3x3:");
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(matriz[i][j]+" | ");
			}
			System.out.println();
			System.out.println("---------------");
		}
		
		System.out.println("quantidade de pares: "+par);
		System.out.println("quantidade de impares: "+impar);
		
	}

}
