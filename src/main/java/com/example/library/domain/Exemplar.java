package com.example.library.domain;

import javax.persistence.Entity;

@SuppressWarnings("serial")
@Entity
public class Exemplar extends AbstractEntity<Long> {
	
	private Livro id_livro;

	public Livro getId_livro() {
		return id_livro;
	}

	public void setId_livro(Livro id_livro) {
		this.id_livro = id_livro;
	}
	

	
}
