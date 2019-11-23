package com.example.library.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;


@SuppressWarnings("serial")
@Entity
public class Livro extends AbstractEntity<Long> {
	
	@Column(name = "titulo")
	private String titulo;
	
	@Column(name = "ISBN")
	private int ISBN;
	
	@Column(name = "edicao")
	private int edicao;
	
	@Column(name = "imgsrc")
	private String imgsrc;
	
	@Column(name = "dataLancamento")
	private LocalDate dataLancamento;
	
	@Column(name = "codBarras")
	private String codBarras;
	
	@ManyToOne
	private Editora editora;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public int getEdicao() {
		return edicao;
	}

	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}

	public String getImgsrc() {
		return imgsrc;
	}

	public void setImgsrc(String imgsrc) {
		this.imgsrc = imgsrc;
	}

	public LocalDate getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(LocalDate dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public String getCodBarras() {
		return codBarras;
	}

	public void setCodBarras(String codBarras) {
		this.codBarras = codBarras;
	}

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}
	

	
	
	
}
