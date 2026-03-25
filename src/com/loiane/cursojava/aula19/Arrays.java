package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// armazenar a temp media durante o ano.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de dias deseja calcular a media de temperatura:");
		int dias = scan.nextInt();
		
		double[] temp = new double[dias]; 
		int i;
		double media, soma = 0;
		
		for(i=0;i<dias;i++) {
			
			System.out.println("Informe a temperatura do dia "+(i+1)+": ");
			temp[i] = scan.nextDouble();
			soma = soma + temp[i];
		}
		
		media = soma / dias;
		
		System.out.println("A media dos "+dias+" dias é de: "+media);
		
		for(i=0; i<dias; i++) {
			System.out.println("Temperatura dia "+(i+1)+": "+temp[i]);
		}
	}

}
