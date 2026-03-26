package com.loiane.cursojava.aula20;

import java.util.Scanner;

public class Exc05 {

	public static void main(String[] args) {
		
Scanner scan = new Scanner(System.in);
		
		boolean sair = false;
		
		String[][][] ano = new String[12][30][8];
		
		System.out.println("AGENDA ANUAL");
		
		while(!sair) {
			
			System.out.println("Consulta - 1 | Agendar - 2 | Sair - 0");
			int opcao = scan.nextInt();
			
			if(opcao == 0) {
				sair = true;
			}
			
			else if(opcao == 1) { //consultar compromisso
				int mes = 0, dia = 0, hora = 0;
				
				boolean diaValido = false, horaValida =  false, mesValido = false;
				
				while(!mesValido) {
					System.out.println("Mes:");
					mes = scan.nextInt();
					if (mes > 0 && mes < 13) {
						mesValido = true;
					} else {
						System.out.println("Digite um mes válido!");
					}
				}
				
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
					if (hora >= 0 && hora < 8) {
						horaValida = true;
					} else {
						System.out.println("Digite uma hora válida!");
					}
				}
				System.out.println("Compromisso agendado:");
				System.out.println(ano[--mes][--dia][--hora]);
			}
			
			else if(opcao == 2) { //adicionar compromisso
				int mes = 0, dia = 0, hora = 0;
				
				boolean mesValido = false, diaValido = false, horaValida =  false;
				
				while(!mesValido) {
					System.out.println("Mes:");
					mes = scan.nextInt();
					if (mes > 0 && mes < 13) {
						mesValido = true;
					} else {
						System.out.println("Digite um mes válido!");
					}
				}
				
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
					if (hora >= 0 && hora < 8) {
						horaValida = true;
					} else {
						System.out.println("Digite uma hora válida!");
					}
				}
				
				System.out.println("Informe o compromisso:");
				ano[--mes][--dia][--hora] = scan.next();
			}
			
			else {
				System.out.println("opção invalida, tente novamente:");
			}
			
		}
		System.out.println("Finalizando agenda...");
	}

}
