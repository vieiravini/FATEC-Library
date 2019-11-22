package com.example.library.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@SuppressWarnings("serial")
@Entity
public class Pessoa extends AbstractEntity<Long> {

	@Column(name = "Nome")
	private String Nome;
	
	@Column(name = "CPF")
	private String CPF;
	
	@Column(name = "Senha")
	private String Senha;
	
	@Column(name = "RA")
	private String RA;
	
	@Column(name = "Email")
	private String Email;
	
	@Column(name = "Fingerprint")
	private String FingerPrint;
	
	@Column(name = "Admin")
	private boolean admin;
	
	@OneToOne
	@JoinColumn(name = "curso_id")
	private Curso curso;

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getSenha() {
		return Senha;
	}

	public void setSenha(String senha) {
		Senha = senha;
	}

	public String getRA() {
		return RA;
	}

	public void setRA(String rA) {
		RA = rA;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getFingerPrint() {
		return FingerPrint;
	}

	public void setFingerPrint(String fingerPrint) {
		FingerPrint = fingerPrint;
	}

	public boolean isAdmdin() {
		return admin;
	}

	public void setAdmdin(boolean admdin) {
		this.admin = admdin;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}


	
	
	
}
