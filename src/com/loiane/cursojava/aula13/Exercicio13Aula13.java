package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class Exercicio13Aula13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("salário por hora: ");
		double salarioHora = scan.nextDouble();
		
		System.out.println("horas trabalhadas por mes: ");
		double horasMes = scan.nextDouble();
		
		double salarioB = salarioHora * horasMes;
		
		double salarioL = (salarioB * 0.76);
		
		System.out.println("Salario Bruto: "+salarioB);
		System.out.println("INSS: "+(salarioB*0.08));
		System.out.println("Sidicato: "+(salarioB*0.05));
		System.out.println("Imposto de Renda: "+(salarioB*0.11));
		System.out.println("Salario Liquido: "+salarioL);
	}

}
