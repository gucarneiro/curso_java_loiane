package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exc20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int qntdResposta = 0;
		
		System.out.println("Telefonou para vitima?");
		String resposta1 = scan.nextLine();
		if (resposta1.equals("sim")) {
			qntdResposta++;
		}
		
		System.out.println("Esteve no local do crime?");
		String resposta2 = scan.nextLine();
		if (resposta2.equals("sim")) {
			qntdResposta++;
		}
		
		System.out.println("Mora perto da vítima?");
		String resposta3 = scan.nextLine();
		if (resposta3.equals("sim")) {
			qntdResposta++;
		}
		
		System.out.println("Devia para a vítima?");
		String resposta4 = scan.nextLine();
		if (resposta4.equals("sim")) {
			qntdResposta++;
		}

		System.out.println("Já trabalhou com a vítima?");
		String resposta5 = scan.nextLine();
		if (resposta5.equals("sim")) {
			qntdResposta++;
		}
		
		if(qntdResposta < 2) {
			System.out.println("Inocente");
		} else if(qntdResposta < 3) {
			System.out.println("Suspeita");
		} else if(qntdResposta < 5) {
			System.out.println("Cumplice");
		} else {
			System.out.println("Assassino!");
		}
		
	}

}
