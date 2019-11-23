package com.example.library.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Entity
public class Exemplar extends AbstractEntity<Long> {
	
	@ManyToOne
	private Livro id_livro;

	private int NumeroExemplar;
	
	public Livro getId_livro() {
		return id_livro;
	}

	public void setId_livro(Livro id_livro) {
		this.id_livro = id_livro;
	}

	public int getNumeroExemplar() {
		return NumeroExemplar;
	}

	public void setNumeroExemplar(int numeroExemplar) {
		NumeroExemplar = numeroExemplar;
	}
	

	
}
