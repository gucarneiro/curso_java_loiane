package com.loiane.cursojava.aula18;

import java.util.Scanner;

public class BreakEContinue {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um numero:");
		int num = scan.nextInt();
		
		System.out.println("Informe um limite:");
		int max = scan.nextInt();
		
		int i;
		
		for(i=num;i<=max;i++) {
			if(i % 7 ==0) {
				System.out.println("O valor de i é: "+i);
				break; //encerra o looping ao encontrar o primeiro item do argumento
			}
		}
	}

}
