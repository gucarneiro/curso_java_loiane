package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exc12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("informe quanto ganha por hora:");
		double porHora = scan.nextDouble();
		
		System.out.println("informe quantas horas trabalhadas no mes:");
		double horasTrab = scan.nextDouble();
		
		double salario = porHora * horasTrab;
		
		double descontoIR = 0;
		
		if (salario <= 900) {
			System.out.println("Isento de IR.");
		} else if (salario <= 1500) {
			descontoIR = 0.05;
		} else if (salario <= 2500) {
			descontoIR = 0.10;
		} else {
			descontoIR = 0.20;
		}
		
		double inss = 0.10;
		double fgts = 0.11;
		//double sindicato = 0.03;
		double descontos = descontoIR + inss; //+ sindicato;
		
		System.out.println("Salario bruto ("+ porHora + "*" + horasTrab + ") = R$ " + salario);
		System.out.println("- IR ("+ descontoIR + "%) = R$ " + (salario * descontoIR));
		System.out.println("- INSS (10%) = R$ " + (salario * inss));
		System.out.println("FGTS (11%) = R$ " + (salario * fgts));
		//System.out.println("Sindicato (3%) = R$ " + (salario * sindicato));
		System.out.println("Total de descontos = R$ " + (salario * descontos));
		System.out.println("Salario liquido = R$ " + (salario * (1-descontos)));

	}

}
