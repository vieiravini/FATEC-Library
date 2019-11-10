package com.example.library.domain;

import java.time.LocalDate;

import javax.persistence.Entity;

@Entity
public class Pessoa_empresta {

	
	private int Pessoa_idPessoa;
	
	private int Livro_idLivro;
	
	private int codExemplar;
	
	private LocalDate Data_emprestimo;
	
	private LocalDate Data_devolucao;

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

	public int getCodExemplar() {
		return codExemplar;
	}

	public void setCodExemplar(int codExemplar) {
		this.codExemplar = codExemplar;
	}

	public LocalDate getData_emprestimo() {
		return Data_emprestimo;
	}

	public void setData_emprestimo(LocalDate data_emprestimo) {
		Data_emprestimo = data_emprestimo;
	}

	public LocalDate getData_devolucao() {
		return Data_devolucao;
	}

	public void setData_devolucao(LocalDate data_devolucao) {
		Data_devolucao = data_devolucao;
	}
	
	
	
}
