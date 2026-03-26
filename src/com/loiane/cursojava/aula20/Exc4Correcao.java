package com.loiane.cursojava.aula20;

import java.util.Scanner;

public class Exc4Correcao {

	public static void main(String[] args) {// Faça um programa para armazenar em uma matriz os compromissos de uma agenda pessoal. Cada dia do mês deve conter 24 horas, onde para cada uma destas 24 horas podemos 
		//associar um tarefa específica (compromisso agendado). O programa deve ter um menu onde o usuário indica o dia do mês que deseja alterar e a hora, entrando em seguida com o compromisso, ou então, o usuário pode também consultar a agenda, fornecendo o dia e a hora para obter o compromisso armazenado.
		
		Scanner scan = new Scanner(System.in);
		
		boolean sair = false;
		
		String[][] mes = new String[30][24];
		
		System.out.println("AGENDA MENSAL");
		
		while(!sair) {
			
			System.out.println("Consulta - 1 | Agendar - 2 | Sair - 0");
			int opcao = scan.nextInt();
			
			if(opcao == 0) {
				sair = true;
			}
			
			else if(opcao == 1) { //consultar compromisso
				int dia = 0, hora = 0;
				
				boolean diaValido = false, horaValida =  false;
				
				while(!diaValido) {
					System.out.println("Dia:");
					dia = scan.nextInt();
					if (dia > 0 && dia < 31) {
						diaValido = true;
					} else {
						System.out.println("Digite um dia válido!");
					}
				}
				
				while(!horaValida) {
					System.out.println("hora:");
					hora = scan.nextInt();
					if (hora >= 0 && hora < 24) {
						horaValida = true;
					} else {
						System.out.println("Digite uma hora válida!");
					}
				}
				System.out.println("Compromisso agendado:");
				System.out.println(mes[--dia][--hora]);
			}
			
			else if(opcao == 2) { //adicionar compromisso
				int dia = 0, hora = 0;
				
				boolean diaValido = false, horaValida =  false;
				
				while(!diaValido) {
					System.out.println("Dia:");
					dia = scan.nextInt();
					if (dia > 0 && dia < 31) {
						diaValido = true;
					} else {
						System.out.println("Digite um dia válido!");
					}
				}
				
				while(!horaValida) {
					System.out.println("hora:");
					hora = scan.nextInt();
					if (hora >= 0 && hora < 24) {
						horaValida = true;
					} else {
						System.out.println("Digite uma hora válida!");
					}
				}
				
				System.out.println("Informe o compromisso:");
				mes[--dia][--hora] = scan.next();
			}
			
			else {
				System.out.println("opção invalide, tente novamente:");
			}
			
		}
		System.out.println("Finalizando agenda...");
	}

}
