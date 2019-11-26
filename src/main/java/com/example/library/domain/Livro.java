package com.example.library.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;





@SuppressWarnings("serial")
@Entity
public class Livro extends AbstractEntity<Long> {
	
	@Column(name = "titulo")
	private String titulo;
	
	@Column(name = "ISBN")
	private String ISBN;
	
	@Column(name = "edicao")
	private int edicao;
	
	@Column(name = "imgsrc")
	private String imgsrc;
	
	@DateTimeFormat(iso = ISO.DATE)
	@Column(name = "dataLancamento", columnDefinition = "DATE")
	private LocalDate dataLancamento;
	
	@Column(name = "codBarras")
	private String codBarras;
	
	@ManyToOne
	private Editora editora;
	
	
	@ManyToMany
	@JoinTable(name = "autor_livro")
	private List<Autor> autor = new ArrayList<>();
	
	@ManyToMany
	@JoinTable(name = "genero_livro")
	private List<Genero> genero = new ArrayList<>();
	

	public List<Genero> getGenero() {
		return genero;
	}

	public void setGenero(List<Genero> genero) {
		this.genero = genero;
	}

	public List<Autor> getAutor() {
		return autor;
	}

	public void setAutor(List<Autor> autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
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
