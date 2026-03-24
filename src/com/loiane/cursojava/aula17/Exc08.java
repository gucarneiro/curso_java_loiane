package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exc08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe 5 numeros");
		int i, soma=0, num;
		double media;
		
		for(i=0;i<5;i++) {
			num = scan.nextInt();
			soma += num;
		}

		media = soma / 5;
		
		System.out.println("Soma dos números: "+soma);
		System.out.println("Media dos números: "+media);
	}

}
