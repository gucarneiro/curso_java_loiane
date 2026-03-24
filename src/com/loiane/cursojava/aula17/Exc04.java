package com.loiane.cursojava.aula17;

public class Exc04 {

	public static void main(String[] args) {
		System.out.println("População país A: 80 000");
		System.out.println("População país B: 200 000");
		
		int ano = 0;
		double paisA = 80000;
		double paisB = 200000;
		
		while(paisA <= paisB) {
			paisA = paisA * 1.03;
			paisB = paisB * 1.015;
			ano++;
		}
		
		System.out.println("Total de anos para pais A ultrapassar pais B: "+ ano);
		System.out.println("Total população pais A: "+paisA);
		System.out.println("Total população pais B: "+paisB);

	}

}
