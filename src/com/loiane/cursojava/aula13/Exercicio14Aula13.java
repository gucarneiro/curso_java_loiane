package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class Exercicio14Aula13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("informe o tamanho do arquivo:");
		double arquivo = scan.nextDouble();
		
		System.out.println("informe a valocidade de da internet (Mbps:");
		double velocidade = scan.nextDouble();
		
		double tempo = (arquivo / velocidade)/ 60;
		
		System.out.println("A velocidade de download em minutos: " + tempo);

	}

}
