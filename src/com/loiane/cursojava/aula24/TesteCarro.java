package com.loiane.cursojava.aula24;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro van = new Carro();
		
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		System.out.println("---------------");
		
		Carro sandero = new Carro();
		
		sandero.marca = "Renault";
		sandero.modelo = "Sandero";
		sandero.numPassageiros = 4;
		sandero.capCombustivel = 40;
		sandero.consumoCombustivel = 0.15;
		
		System.out.println(sandero.marca);
		System.out.println(sandero.modelo);
	}

}
