package com.loiane.cursojava.aula20;

import java.util.Scanner;

public class Exc04 {

	public static void main(String[] args) {		// Faça um programa para armazenar em uma matriz os compromissos de uma agenda pessoal. Cada dia do mês deve conter 24 horas, onde para cada uma destas 24 horas podemos 
		//associar um tarefa específica (compromisso agendado). O programa deve ter um menu onde o usuário indica o dia do mês que deseja alterar e a hora, entrando em seguida com o compromisso, ou então, o usuário pode também consultar a agenda, fornecendo o dia e a hora para obter o compromisso armazenado.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("AGENDA DO MES");
		
		String[][] mes = new String[30][24];
		
		System.out.println("Informe o dia do mes e a hora:");
		int dia = scan.nextInt();
		int hora = scan.nextInt();
		
		System.out.println("Consultar compromisso - 1 | Adicionar copromisso - 2");
		int menu = scan.nextInt();
		
		while(menu != 0) {
			if(menu == 2) {
				System.out.println("Informe o compromisso: ");
				mes[dia-1][hora-1] = scan.next();
			} else if(menu == 1) {
				System.out.println("Compromisso: ");
				System.out.println(mes[dia-1][hora-1]);
			} else {
				System.out.println("Valor invalido!");
			}
			
			System.out.println("voltar(1) ou sair(2)?");
			int fim = scan.nextInt();
			if (fim == 2) {
				System.out.println("Finalizando agenda...");
				menu = 0;
			}
			else if (fim == 1) {
				System.out.println("Consultar compromisso - 1 | Adicionar copromisso - 2");
				menu = scan.nextInt();
			}
		}
		
		
		/*System.out.println("Adicionar compromisso - 1 | Consultar compromisso - 2 | Sair - 0");
		int menu = scan.nextInt();*/
		
		//System.out.println("Encerrando agenda mensal...");
			

	}

}
