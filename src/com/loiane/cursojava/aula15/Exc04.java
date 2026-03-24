package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exc04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("informe uma letra");
		String letra = scan.nextLine();
		
		if(letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")){
			System.out.println("Vogal");
		} else {
			System.out.println("Consoante");
		}
	}

}
