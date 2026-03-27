package com.loiane.cursojava.aula24excs;

public class TesteConta {

	public static void main(String[] args) {
		Conta contaBanco = new Conta();
		
		contaBanco.usuario = "Gustavo Carneiro";
		contaBanco.num = 1234;
		contaBanco.saldo = 39.47;
		contaBanco.especial = false;
		contaBanco.limite = 1000;
		
		System.out.println("Nome do usuario: "+contaBanco.usuario);
		System.out.println("numero da conta: "+contaBanco.num);
		System.out.println("saldo: R$"+contaBanco.saldo);
		System.out.println("especial? "+contaBanco.especial);
		System.out.println("limite: R$"+contaBanco.limite);

		

	}

}
