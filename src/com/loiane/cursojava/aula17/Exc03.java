package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exc03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe seu nome:");
		String nome = scan.next();
		
		while(nome.length()<=3) {
			System.out.println("Nome invalido, tente novamente:");
			nome = scan.next();
		}
		
		System.out.println("Informe sua idade:");
		int idade = scan.nextInt();
		
		while(idade < 1 || idade > 150) {
			System.out.println("idade invalida, tente novamente:");
			idade = scan.nextInt();
		}
		
		System.out.println("Informe seu salario:");
		double salario = scan.nextDouble();
		
		while(salario <= 0) {
			System.out.println("Salario invalido, tente novamente:");
			salario = scan.nextDouble();
		}
		
		System.out.println("Informe seu sexo: (f / m)");
		String sexo = scan.next();
		
		while(!sexo.equals("f") && !sexo.equals("m")) {
			System.out.println("Sexo invalido, tente novamente:");
			sexo = scan.next();
		}
		
		System.out.println("Informe seu estado civil: (s / c / v / d)");
		String estado = scan.next();
		
		while(!estado.equals("s") && !estado.equals("c") && !estado.equals("v") && !estado.equals("d")) {
			System.out.println("Estado civil invalido, tente novamente:");
			estado = scan.next();
		}

		System.out.println("Informações salvas com sucesso!");
	}

}
