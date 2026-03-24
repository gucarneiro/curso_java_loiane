package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exc01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite dois numeros:");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		if(num1 > num2) {
			System.out.println(num1+" é maior que "+ num2);
		} else {
			System.out.println(num2+" é maior que "+ num1);
		}
	}
}
