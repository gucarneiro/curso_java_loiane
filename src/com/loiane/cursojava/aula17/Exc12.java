package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exc12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um numero para saber a tabuada dele:");
		int num = scan.nextInt();
		int i;
		
		System.out.println("Tabuada do "+num+":");
		
		for(i=1; i<=10; i++) {
			System.out.println("----------------");
			System.out.println(num+" x "+i+" = "+(num*i));
		}

	}

}
