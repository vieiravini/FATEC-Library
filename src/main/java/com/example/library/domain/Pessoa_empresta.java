package com.example.library.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@SuppressWarnings("serial")
@Entity
public class Pessoa_empresta extends AbstractEntity<Long> {


	@ManyToOne
	@JoinColumn(name = "id_pessoa_fk")
	private Pessoa idPessoa;

	@ManyToOne
	@JoinColumn(name = "id_livro_fk")
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
