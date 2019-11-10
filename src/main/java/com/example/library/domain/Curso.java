package com.example.library.domain;

import javax.persistence.Entity;

@Entity
public class Curso {
	
	private int idCurso;
	
	private String nome;

	public int getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
