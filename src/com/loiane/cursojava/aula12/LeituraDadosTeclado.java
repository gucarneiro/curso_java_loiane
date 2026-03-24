package com.loiane.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*System.out.println("digite seu nome completo: ");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo é: " + nomeCompleto);
		
		System.out.println("digite seu primeiro nome: ");
		String primeiroNome = scan.next();
		System.out.println("Seu nome é: " + primeiroNome);
		
		
		System.out.println("Digite sua idade aqui: ");
		int idade = scan.nextInt();
		System.out.println("Sua idade é: "+ idade);*/
		
		
		System.out.println("digite seu primeiro nome, idade, quantidade de filhos, altura e se tem algum animal de estimação");
		String primeiroNome = scan.next();
		int idade = scan.nextInt();
		int filhos = scan.nextInt();
		double altura = scan.nextDouble();
		boolean estimacao = scan.nextBoolean();
		
		System.out.println("suas informações: ");
		System.out.println("Nome: "+primeiroNome);
		System.out.println("idade: "+idade);
		System.out.println("filhos: "+filhos);
		System.out.println("altura: "+altura);
		System.out.println("animal de estimação: "+estimacao);

	}

}
