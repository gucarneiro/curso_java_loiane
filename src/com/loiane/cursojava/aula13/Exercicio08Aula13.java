package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class Exercicio08Aula13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Infome quanto voce ganha por hora: ");
		double porHora = scan.nextDouble();
		System.out.println("Infome quantas horas voce trabalha no mes: ");
		int horasMes = scan.nextInt();
		
		double salario = porHora * horasMes;
		
		System.out.println("Seu salario mensal é: R$"+salario);
	}

}
