package com.loiane.cursojava.aula24excs;

public class TesteLampada {

	public static void main(String[] args) {
		
		Lampada lampada1 = new Lampada();
		
		lampada1.cor = "Amarela";
		lampada1.anoFabricacao = 2026;
		lampada1.preco = 10.9;
		lampada1.potencia = 7;
		
		lampada1.tipos = new String[5];
		lampada1.tipos[0] = "Abajour";
		lampada1.tipos[1] = "Lampeões";
		
		
		System.out.println("Lampada - LUZ LIGHT PREMIUM");
		System.out.println("cor: "+lampada1.cor);
		System.out.println("ano de fab.: "+lampada1.anoFabricacao);
		System.out.println("preço: R$"+lampada1.preco);
		System.out.println("potencia: "+lampada1.potencia);
		System.out.println("Tipos: "+lampada1.tipos[0]+", "+lampada1.tipos[1]);
		
	}

}
