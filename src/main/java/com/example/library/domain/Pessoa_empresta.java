package com.example.library.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;


@SuppressWarnings("serial")
@Entity
public class Pessoa_empresta extends AbstractEntity<Long> {


	@Column(name = "idPessoa")
	private Pessoa idPessoa;
	

	@Column(name = "idLivro")
	private Livro idLivro;
	
	@Column(name = "codExemplar")
	private Exemplar codExemplar;
	
	@Column(name = "data_emprestimo")
	private LocalDate Data_emprestimo;
	
	@Column(name = "data_devolucao")
	private LocalDate Data_devolucao;

	public Pessoa getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(Pessoa idPessoa) {
		this.idPessoa = idPessoa;
	}

	public Livro getIdLivro() {
		return idLivro;
	}

	public void setIdLivro(Livro idLivro) {
		this.idLivro = idLivro;
	}

	public Exemplar getCodExemplar() {
		return codExemplar;
	}

	public void setCodExemplar(Exemplar codExemplar) {
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
