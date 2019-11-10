package com.example.library.domain;

import javax.persistence.Entity;

@Entity
public class Exemplar {
	
	private int idExemplar;
	
	private int livro_idLivro;

	public int getIdExemplar() {
		return idExemplar;
	}

	public void setIdExemplar(int idExemplar) {
		this.idExemplar = idExemplar;
	}

	public int getLivro_idLivro() {
		return livro_idLivro;
	}

	public void setLivro_idLivro(int livro_idLivro) {
		this.livro_idLivro = livro_idLivro;
	}
	
	
}
