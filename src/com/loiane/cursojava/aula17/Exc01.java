package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exc01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("informe uma nota entre 0 e 10:");
		int nota = scan.nextInt();
		
		while(nota < 0 || nota > 10) {
			System.out.println("nota invalida, digite outro valor:");
			nota = scan.nextInt();
		}
		System.out.println("Nota valida, sua nota é: "+nota);
	}

}
