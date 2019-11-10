package com.example.library.domain;

import javax.persistence.Entity;

@Entity
public class Pessoa {

	private int idPessoa;
	
	private String Nome;
	
	private String CPF;
	
	private String RA;
	
	private String email;
	
	private String FingerPrint;
	
	private boolean admdin;

	public int getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}

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

	public String getRA() {
		return RA;
	}

	public void setRA(String rA) {
		RA = rA;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFingerPrint() {
		return FingerPrint;
	}

	public void setFingerPrint(String fingerPrint) {
		FingerPrint = fingerPrint;
	}

	public boolean isAdmdin() {
		return admdin;
	}

	public void setAdmdin(boolean admdin) {
		this.admdin = admdin;
	}
	
	
	
}
