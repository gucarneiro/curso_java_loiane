package com.loiane.cursojava.aula24excs;

public class TesteLivro {

	public static void main(String[] args) {
		Livro livro1 = new Livro();
		
		livro1.titulo = "Olhai os lirios do campo";
		livro1.autor = "Erico Verissimo";
		livro1.categoria = "Romance";
		livro1.ano = 1920;
		livro1.numPags = 280;

		System.out.println("nome: "+livro1.titulo);
		System.out.println("autor: "+livro1.autor);
		System.out.println("categoria: "+livro1.categoria);
		System.out.println("ano: "+livro1.ano);
		System.out.println("paginas: "+livro1.numPags);


	}

}
