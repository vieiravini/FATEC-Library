package com.example.library.domain;

import javax.persistence.Column;
import javax.persistence.Entity;


@SuppressWarnings("serial")
@Entity
public class Livro_has_autor extends AbstractEntity<Long>{
	

	@Column(name = "id_livro")
	private Livro id_Livro;
	

	@Column(name = "id_autor")
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
