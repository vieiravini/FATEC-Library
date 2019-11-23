package com.example.library.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;


@SuppressWarnings("serial")
@Entity
public class Pessoa_reserva extends AbstractEntity<Long>{
	

	@ManyToOne
	private Livro id_livro;
	
	@ManyToOne
	private Pessoa id_pessoa;
	
	@Column(name = "data_reserva")
	private LocalDate Data_reserva;

	public Livro getId_livro() {
		return id_livro;
	}

	public void setId_livro(Livro id_livro) {
		this.id_livro = id_livro;
	}

	public Pessoa getId_pessoa() {
		return id_pessoa;
	}

	public void setId_pessoa(Pessoa id_pessoa) {
		this.id_pessoa = id_pessoa;
	}

	public LocalDate getData_reserva() {
		return Data_reserva;
	}

	public void setData_reserva(LocalDate data_reserva) {
		Data_reserva = data_reserva;
	}


	
	
}
