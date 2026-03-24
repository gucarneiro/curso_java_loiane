package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exc19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe dois numeros inteiros:");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		
		System.out.println("qual operação deseja realizar? (+; -; *; /)");
		String oper = scan.next();
		
		int resultado = 0;
		
		
		if (oper.equals("+")) {
			resultado = n1 + n2;
		} 
		else if (oper.equals("-")) {
			resultado = n1 - n2;
		}
		else if (oper.equals("*")) {
			 resultado = n1 * n2;
		}
		else if (oper.equals("/")) {
			 resultado = n1 / n2;
		}
		else {
			System.out.println("Invalido!");
		}
		
		if (resultado % 2 == 0) {
			System.out.println(resultado + " É par!");
		} else {
			System.out.println(resultado + " É impar!");
		}
		
		if (resultado >= 0) {
			System.out.println(resultado + " É positivo!");
		} else {
			System.out.println(resultado + " É negativo!");
		}
		
	}

}
