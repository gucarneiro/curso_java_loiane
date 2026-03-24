package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class Exercicio04Aula13 {

	public static void main(String[] args) {
		// media de 4 notas
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe as 4 notas dos bimestres para realizar a média: ");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int n3 = scan.nextInt();
		int n4 = scan.nextInt();
		
		double media = (n1+n2+n3+n4)/4;
		
		System.out.print("A media das 4 notas é: " + media);
	}

}
