package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exc13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe dois numero inteiros:");
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int i, potencia=1;
		
		for(i=0;i<num2;i++) {
			potencia *= num1;
		}
		
		System.out.println(num1+" elevado a "+num2+" = "+potencia);
	}

}
