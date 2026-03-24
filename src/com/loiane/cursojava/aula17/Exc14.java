package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exc14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe 10 numeros inteiros: ");
		
		int i, par=0, impar=0, num;
		
		for(i=0;i<10;i++) {
			num = scan.nextInt();
			if (num%2==0) {
				par++;
			} else {
				impar++;
			}
		}

		System.out.println("Quantidade de numeros par: "+par);
		System.out.println("Quantidade de numeros impar: "+impar);
	}

}
