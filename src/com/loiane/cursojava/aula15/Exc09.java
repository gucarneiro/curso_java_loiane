package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exc09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe 3 números: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		if (num1 < num2 && num1 < num3) {
			System.out.println(num1);
			if (num2 < num3) {
				System.out.println(num2);
				System.out.println(num3);
			} else {
				System.out.println(num3);
				System.out.println(num2);
			}
		}
		if (num2 < num1 && num2 < num3) {
			System.out.println(num2);
			if (num1 < num3) {
				System.out.println(num1);
				System.out.println(num3);
			} else {
				System.out.println(num3);
				System.out.println(num1);
			}
		}
		if (num3 < num2 && num3 < num1) {
			System.out.println(num3);
			if (num2 < num1) {
				System.out.println(num2);
				System.out.println(num1);
			} else {
				System.out.println(num1);
				System.out.println(num2);
			}
		}

	}

}
