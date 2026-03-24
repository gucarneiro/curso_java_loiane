package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exc10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe seu turno de estudos (M - V - N)");
		String turno = scan.nextLine();
		
		switch (turno) {
		case "M": System.out.println("Bom dia!"); break;
		case "V": System.out.println("Boa tarde!"); break;
		case "N": System.out.println("Boa noite!"); break;
		}
	}

}
