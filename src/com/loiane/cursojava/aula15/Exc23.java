package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exc23 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Tabela de preços de Carnes: \nFile Duplo: \naté 5kg: R$ 4,90 // acima de 5kg: R$5,80");
		System.out.println("--------------------------------------");
		System.out.println("Tabela de preços de Carnes: \nAlcatra: \naté 5kg: R$ 5,90 // acima de 5kg: R$6,80");
		System.out.println("--------------------------------------");
		System.out.println("Tabela de preços de Carnes: \nPicanha: \naté 5kg: R$ 6,90 // acima de 5kg: R$7,80");
		System.out.println("--------------------------------------");
		
		System.out.println("Qual carne deseja comprar? F - File Duplo // A - Alcatra // P - Picanha");
		String carne = scan.next();
		String tipoCarne = "";
		double kgTotal = 0;
		double precoTotal = 0;
		
		//definir tipo de carne
		if (carne.equals("F")||carne.equals("f")) {
			tipoCarne = "File Duplo";
		} else if (carne.equals("A")||carne.equals("a")) {
			tipoCarne = "Alcatra";
		} else if (carne.equals("P")||carne.equals("p")) {
			tipoCarne = "Picanha";
		}
		
		//quantos kg
		if(tipoCarne.equals("File Duplo")) {
			System.out.println("Quantos kg?");
			kgTotal = scan.nextDouble();
			
			if(kgTotal<=5) {
				precoTotal = kgTotal * 4.9;
			} else {
				precoTotal = kgTotal * 5.8;
			}
		}
		if(tipoCarne.equals("Alcatra")) {
			System.out.println("Quantos kg?");
			kgTotal = scan.nextDouble();
			
			if(kgTotal<=5) {
				precoTotal = kgTotal * 5.9;
			} else {
				precoTotal = kgTotal * 6.8;
			}
		}
		if(tipoCarne.equals("Picanha")) {
			System.out.println("Quantos kg?");
			kgTotal = scan.nextDouble();
			
			if(kgTotal<=5) {
				precoTotal = kgTotal * 6.9;
			} else {
				precoTotal = kgTotal * 7.8;
			}
		}
		
		//cartao tabajara
		System.out.println("Pagamento com cartão tabajara? S / N");
		String usaCartao = scan.next();
		String tipoCartao = "";
		
		double desconto = 0;
		
		if(usaCartao.equals("S")||usaCartao.equals("s")) {
			desconto = precoTotal * 0.05;
			tipoCartao = "Cartao Tabajara";
			System.out.println("Voce ganhou um desconto de 5%! R$"+desconto);
		} else {
			tipoCartao = "Cartao comum";
			System.out.println("Sem desconto.");
		}
		
		//nota fiscal
		System.out.println("------------------------------");
		System.out.println("---------CUPOM FISCAL---------");
		System.out.println("------------------------------");
		System.out.println("Tipo de carne: "+tipoCarne);
		System.out.println("Quantidade (kg): "+kgTotal);
		System.out.println("Preço total: R$"+precoTotal);
		System.out.println("------------------------------");
		System.out.println("Tipo de pagamento: "+tipoCartao);
		System.out.println("Desconto: "+desconto);
		System.out.println("Total a pagar: R$"+(precoTotal-desconto));
		System.out.println("------------------------------");
		
		
	}

}
