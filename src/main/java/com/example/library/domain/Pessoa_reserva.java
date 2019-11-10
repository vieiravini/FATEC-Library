package com.example.library.domain;

import java.time.LocalDate;

import javax.persistence.Entity;

@Entity
public class Pessoa_reserva {
	
	private int Pessoa_idPessoa;
	
	private int Livro_idLivro;
	
	private LocalDate Data_reserva;

	public int getPessoa_idPessoa() {
		return Pessoa_idPessoa;
	}

	public void setPessoa_idPessoa(int pessoa_idPessoa) {
		Pessoa_idPessoa = pessoa_idPessoa;
	}

	public int getLivro_idLivro() {
		return Livro_idLivro;
	}

	public void setLivro_idLivro(int livro_idLivro) {
		Livro_idLivro = livro_idLivro;
	}

	public LocalDate getData_reserva() {
		return Data_reserva;
	}

	public void setData_reserva(LocalDate data_reserva) {
		Data_reserva = data_reserva;
	}
	
	
	
}
