package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exc02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe seu nome:");
		String nome = scan.next();
		
		System.out.println("Informe sua senha:");
		String senha = scan.next();

		while(senha.equals(nome)) {
			System.out.println("Sua senha nao pode ser seu nome, digite outra senha:");
			senha = scan.next();
		}
		
		System.out.println("Nome: "+nome+"\nSenha: "+senha);
	}

}
