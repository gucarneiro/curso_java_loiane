package com.loiane.cursojava.aula24excs;

import java.util.Date;

public class TesteLivroBiblioteca {

	public static void main(String[] args) {
		LivroBiblioteca livro1 = new LivroBiblioteca();
		
		livro1.titulo = "Olhai os lirios do campo";
		livro1.autor = "Erico Verissimo";
		livro1.categoria = "Romance";
		livro1.ano = 1920;
		livro1.numPags = 280;
		livro1.disponivel = true;
		livro1.dataEntrega = new Date();
		livro1.usuario = "Gustavo Carneiro";

	}

}
