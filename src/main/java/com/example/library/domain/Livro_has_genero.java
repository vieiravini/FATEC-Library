package com.example.library.domain;

import javax.persistence.Entity;

@Entity
public class Livro_has_genero {

	
	private int Livro_idLivro;
	
	private int Genero_IdGenero;

	public int getLivro_idLivro() {
		return Livro_idLivro;
	}

	public void setLivro_idLivro(int livro_idLivro) {
		Livro_idLivro = livro_idLivro;
	}

	public int getGenero_IdGenero() {
		return Genero_IdGenero;
	}

	public void setGenero_IdGenero(int genero_IdGenero) {
		Genero_IdGenero = genero_IdGenero;
	}
	
	
	
}
