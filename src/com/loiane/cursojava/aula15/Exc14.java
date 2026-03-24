package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exc14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe duas notas para saber a media: ");
		double n1 = scan.nextDouble();
		double n2 = scan.nextDouble();
		//System.out.println("REPROVADO")
		double media = (n1 + n2)/2;
		
		if (media <= 4) {
			System.out.println("Nota 1: "+n1+" // Nota 2: "+n2+"\nMedia: "+media+" Conceito E");
			System.out.println("REPROVADO!");
		} else if (media <= 6) {
			System.out.println("Nota 1: "+n1+" // Nota 2: "+n2+"\nMedia: "+media+" Conceito D");
			System.out.println("REPROVADO!");
		} else if (media <= 7.5) {
			System.out.println("Nota 1: "+n1+" // Nota 2: "+n2+"\nMedia: "+media+" Conceito C");
			System.out.println("APROVADO!");
		} else if (media <= 9) {
			System.out.println("Nota 1: "+n1+" // Nota 2: "+n2+"\nMedia: "+media+" Conceito B");
			System.out.println("APROVADO!");
		} else {
			System.out.println("Nota 1: "+n1+" // Nota 2: "+n2+"\nMedia: "+media+" Conceito A");
			System.out.println("APROVADO!");
		}
	}

}
