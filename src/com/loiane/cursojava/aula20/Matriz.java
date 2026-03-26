package com.loiane.cursojava.aula20;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {//criação de matrizes
		Scanner scan = new Scanner(System.in);
		
		int[][] notas = new int [10][4];
		double soma = 0;
		
		for(int i=0;i<10;i++) {
			System.out.println("Aluno "+(i+1)+":");
			for(int c=0;c<4;c++) {
				System.out.println("Digite a nota do bimestre "+(c+1));
				notas[i][c] = scan.nextInt();
				soma += notas[i][c];
			}
			System.out.println("As notas do aluno "+(i+1)+" foram:");
			System.out.println("1bi: "+notas[i][0]+"\n2bi: "+notas[i][1]+"\n3bi: "+notas[i][2]+"\n4bi: "+notas[i][3]);
			System.out.println("Media do aluno "+(i+1)+": "+(soma/4));
			if((soma/4)<6) {
				System.out.println("REPROVADO!");
			} else {
				System.out.println("APROVADO!");
			}
			System.out.println("----------------------");
			soma = 0;
		}

	}

}
