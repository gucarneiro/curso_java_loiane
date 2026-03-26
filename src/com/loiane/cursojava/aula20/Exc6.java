package com.loiane.cursojava.aula20;

import java.util.Scanner;

public class Exc6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("JOGO DA VELHA X/O");
		
		String[][] tabuleiro = new String[3][3];
		int linha1, coluna1, linha2, coluna2;
		
		boolean jogoFinalizado = false;
		
		for(int i=0;i<3;i++) { //tabuleiro em branco
			for(int j=0;j<3;j++) {
				tabuleiro[i][j] = "";
				System.out.print(tabuleiro[i][j]);
			}
			System.out.println();
			System.out.println("-----------");
		}
		
		while(!jogoFinalizado) {
			
			System.out.println("Jogador1: (X - linha e coluna)");
			linha1 = scan.nextInt();
			coluna1 = scan.nextInt();
			
			tabuleiro[--linha1][--coluna1] = "X";
			
			System.out.println("Jogador2: (O - linha e coluna)");
			linha2 = scan.nextInt();
			coluna2 = scan.nextInt();
			
			tabuleiro[--linha2][--coluna2] = "O";
			
			for(int i=0;i<3;i++) { //visualizar tabuleiro
				for(int j=0;j<3;j++) {
					System.out.print(tabuleiro[i][j]+" | ");
				}
				System.out.println();
				System.out.println("-----------");
			}
			
		}
	}

}
