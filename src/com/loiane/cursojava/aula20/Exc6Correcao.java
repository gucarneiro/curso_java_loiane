package com.loiane.cursojava.aula20;

import java.util.Scanner;

public class Exc6Correcao {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
				
		char[][] tabuleiro = new char[3][3];
		
		System.out.println("Jogador 1 = X");
		System.out.println("Jogador 2 = O");
		
		boolean ganhou = false;
		int jogada = 1, linha=0, coluna=0;
		char sinal = ' ';
		
		while(!ganhou) {
			
			if (jogada % 2==1) { //jogador 1
				System.out.println("Vez do jogador 1. Escolha linha e coluna: (1-3)");
				sinal = 'X';
			}
			else {
				System.out.println("Vez do jogador 2. Escolha linha e coluna: (1-3)");
				sinal = 'O';
			}
			
			boolean linhaValida = false;
			while(!linhaValida) {
				System.out.println("Informe uma linha:");
				linha = scan.nextInt();
				if(linha > 0 && linha < 4) {
					linhaValida = true;
				}
				else {
					System.out.println("Informe uma linha válida!");
					linha = scan.nextInt();
				}
			}
			
			boolean colunaValida = false;
			while(!colunaValida) {
				System.out.println("Informe uma coluna:");
				coluna = scan.nextInt();
				if(coluna > 0 && coluna < 4) {
					colunaValida = true;
				}
				else {
					System.out.println("Informe uma coluna válida!");
					coluna = scan.nextInt();
				}
			}
			linha--;
			coluna--;
			if (tabuleiro[linha][coluna] == 'X' || tabuleiro[linha][coluna] == 'O') {
				System.out.println("Posição ja usada, tente novamente!");
			}
			else { //jogada valida
				tabuleiro[linha][coluna] = sinal;
				jogada++;
			}
			
			//imprimir tabuleiro
			
			for(int i=0;i<3;i++) { //tabuleiro em branco
				for(int j=0;j<3;j++) {
					System.out.print(tabuleiro[i][j] + " | ");
				}
				System.out.println();
			}
			
			//veriicar ganhador
			//linha jogador 1
			if((tabuleiro[0][0] == 'X' && tabuleiro[0][1] == 'X' && tabuleiro[0][2] == 'X') || (tabuleiro[1][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[1][2] == 'X') || (tabuleiro[2][0] == 'X' && tabuleiro[2][1] == 'X' && tabuleiro[2][2] == 'X')) {
			System.out.println("Jogador 1 venceu! parabens!");
			ganhou = true;
			} 
			//coluna jogador 1
			else if((tabuleiro[0][0] == 'X' && tabuleiro[1][0] == 'X' && tabuleiro[2][0] == 'X') || (tabuleiro[0][1] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][1] == 'X') || (tabuleiro[0][2] == 'X' && tabuleiro[1][2] == 'X' && tabuleiro[2][2] == 'X')) {
			System.out.println("Jogador 1 venceu! parabens!");
			ganhou = true;
			}
			//diagonal jogador 1
			else if((tabuleiro[0][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][2] == 'X') || (tabuleiro[0][2] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][0] == 'X')) {
				System.out.println("Jogador 1 venceu! parabens!");
				ganhou = true;
			}
			//linha jogador 2
			else if((tabuleiro[0][0] == 'O' && tabuleiro[0][1] == 'O' && tabuleiro[0][2] == 'O') || (tabuleiro[1][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[1][2] == 'O') || (tabuleiro[2][0] == 'O' && tabuleiro[2][1] == 'O' && tabuleiro[2][2] == 'O')) {
			System.out.println("Jogador 2 venceu! parabens!");
			ganhou = true;
			} 
			//coluna jogador 2
			else if((tabuleiro[0][0] == 'O' && tabuleiro[1][0] == 'O' && tabuleiro[2][0] == 'O') || (tabuleiro[0][1] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][1] == 'O') || (tabuleiro[0][2] == 'O' && tabuleiro[1][2] == 'O' && tabuleiro[2][2] == 'O')) {
			System.out.println("Jogador 2 venceu! parabens!");
			ganhou = true;
			}
			//diagonal jogador 2
			else if((tabuleiro[0][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][2] == 'O') || (tabuleiro[0][2] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][0] == 'O')) {
				System.out.println("Jogador 2 venceu! parabens!");
				ganhou = true;
			}
		}//final while
		
	}
}
