package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exc15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe 3 lados para medida do triangulo");
		double lado1 = scan.nextDouble();
		double lado2 = scan.nextDouble();
		double lado3 = scan.nextDouble();
		
		if (lado1 + lado2 > lado3 && lado2 + lado3 > lado1 && lado3 + lado1 > lado2){
			if(lado1 == lado2 && lado1 == lado3) {
				System.out.println("Triangulo Equilatero");
			} else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
				System.out.println("Triangulo Isosceles");
			} else {
				System.out.println("Triangulo Escaleno");
			}
		} else {
			System.out.println("Não forma triangulo!");
		}

	}

}
