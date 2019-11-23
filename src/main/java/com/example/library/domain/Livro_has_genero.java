package com.example.library.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;


@SuppressWarnings("serial")
@Entity
public class Livro_has_genero extends AbstractEntity<Long> {
	

	@ManyToOne
	private Pessoa id_pessoa;
	
	@ManyToOne
	private Livro id_livro;

	public Pessoa getId_pessoa() {
		return id_pessoa;
	}

	public void setId_pessoa(Pessoa id_pessoa) {
		this.id_pessoa = id_pessoa;
	}

	public Livro getId_livro() {
		return id_livro;
	}

	public void setId_livro(Livro id_livro) {
		this.id_livro = id_livro;
	}
	
	
	
	
}
