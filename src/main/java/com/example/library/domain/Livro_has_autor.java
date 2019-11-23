package com.example.library.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;


@SuppressWarnings("serial")
@Entity
public class Livro_has_autor extends AbstractEntity<Long>{

	@ManyToOne
	private Livro id_Livro;

	@ManyToOne
	private Autor id_Autor;

	public Livro getId_Livro() {
		return id_Livro;
	}

	public void setId_Livro(Livro id_Livro) {
		this.id_Livro = id_Livro;
	}

	public Autor getId_Autor() {
		return id_Autor;
	}

	public void setId_Autor(Autor id_Autor) {
		this.id_Autor = id_Autor;
	}
	
	
	
}
