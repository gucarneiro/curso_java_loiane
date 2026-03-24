package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exc05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a população do país A:");
		double paisA = scan.nextDouble();
		System.out.println("Informe a taxa de crescimento do país A por ano: (em %)");
		double crescimentoA = scan.nextDouble();
		crescimentoA = (crescimentoA/100)+1;
		
		System.out.println("Informe a população do país B:");
		double paisB = scan.nextDouble();
		System.out.println("Informe a taxa de crescimento do país B por ano: (em %)");
		double crescimentoB = scan.nextDouble();
		crescimentoB = (crescimentoB/100)+1;
		
		int ano = 0;
		
		while(paisA <= paisB) {
			paisA = paisA * crescimentoA;
			paisB = paisB * crescimentoB;
			ano++;
		}
		
		System.out.println("Total de anos para pais A ultrapassar pais B: "+ ano);
		System.out.println("Total população pais A: "+paisA);
		System.out.println("Total população pais B: "+paisB);
	

	}

}
