package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exc03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o genero M ou F");
		String gen = scan.nextLine();
		
		/*switch(gen){
		case "m": System.out.println("M - Masculino"); break;
		case "M": System.out.println("M - Masculino"); break;
		case "f": System.out.println("F - Feminino"); break;
		case "F": System.out.println("F - Feminino"); break;
		default: System.out.println("Invalido"); break;
		}*/
		
		
		if (gen.equals("m") || gen.equals("M")) {
			System.out.println("M - Masculino");
		} else if(gen.equals("F")|| gen.equals("f")){
			System.out.println("F - Feminino");
		}
		else {
			System.out.println("invalido");
		}

	}

}
