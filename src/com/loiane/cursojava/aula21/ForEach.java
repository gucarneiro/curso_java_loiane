package com.loiane.cursojava.aula21;

import java.util.Random;

public class ForEach {

	public static void main(String[] args) {
		
		int[] notas = new int[10];
	
		Random random = new Random();
		
		for (int i=0; i<notas.length;i++) {
			notas[i] = random.nextInt(10);
			int nota = notas[i];
			System.out.println(nota);
		}
		
		System.out.println("Usando FOR EACH:");
		for(int nota : notas) {
			System.out.println(nota);
		}
		
		
		//exemplo com matriz
		
		System.out.println("for each com matrizes");
		
		int[][] alunos = new int[3][3];
		alunos[0][0] = 2;
		alunos[0][1] = 3;
		alunos[0][2] = 34;
		alunos[1][0] = 25;
		alunos[1][1] = 27;
		alunos[1][2] = 7;
		alunos[2][0] = 889;
		
		for (int[] aluno : alunos) {
			for (int alun : aluno) {
				System.out.print(alun+", ");
			}
			System.out.println();
		}
	}

}
