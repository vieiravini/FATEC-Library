package com.example.library.domain;

import javax.persistence.Entity;

@Entity
public class Livro_has_autor {
	
	private int Livro_idLivro;
	
	private int Autor_idAutor;

	public int getLivro_idLivro() {
		return Livro_idLivro;
	}

	public void setLivro_idLivro(int livro_idLivro) {
		Livro_idLivro = livro_idLivro;
	}

	public int getAutor_idAutor() {
		return Autor_idAutor;
	}

	public void setAutor_idAutor(int autor_idAutor) {
		Autor_idAutor = autor_idAutor;
	}
	
	
	
}
