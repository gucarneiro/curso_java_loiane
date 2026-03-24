package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exc07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i, num, maior = 0;
		
		System.out.println("Informe 5 numeros:");
		for(i=0; i<5; i++) {
			num = scan.nextInt();
			if(maior<num) {
				maior = num;
			}
		}
		
		System.out.println("O amior numero é o: "+maior);
	
	}

}
