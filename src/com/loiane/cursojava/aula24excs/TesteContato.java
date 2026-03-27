package com.loiane.cursojava.aula24excs;

public class TesteContato {

	public static void main(String[] args) {
		Contato novocontato = new Contato();
		
		novocontato.nome = "Gustavo";
		novocontato.ddd = 11;
		novocontato.numero = 990169999;
		novocontato.celular = true;
		novocontato.whatsapp = true;
		novocontato.outrosNumeros = new int[3];
		novocontato.outrosNumeros[0] = 21092920;
		novocontato.outrosNumeros[1] = 15316557;
		novocontato.outrosNumeros[2] = 16585593;

		
		System.out.println("Nome do contato: "+novocontato.nome);
		System.out.println("ddd: "+novocontato.ddd);
		System.out.println("numero: "+novocontato.numero);
		System.out.println("celular? "+novocontato.celular);
		System.out.println("possui whatsapp? "+novocontato.whatsapp);
		System.out.println("outros numeros: "+novocontato.outrosNumeros[0]+", "+novocontato.outrosNumeros[1]+", "+novocontato.outrosNumeros[2]);

	}

}
