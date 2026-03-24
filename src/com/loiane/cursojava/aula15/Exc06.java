package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exc06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 System.out.println("Informe 3 numero inteiros");
		 
		 int n1 = scan.nextInt();
		 int n2 = scan.nextInt();
		 int n3 = scan.nextInt();
		 
		 if (n1 > n2 && n1 > n3) {
			System.out.println(n1 + " é o maior numero");
		 } else if (n2 > n1 && n2 > n3) {
				System.out.println(n2 + " é o maior numero");
			 } else {
					System.out.println(n3 + " é o maior numero");
			 }
	}

}
