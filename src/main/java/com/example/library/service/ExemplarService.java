package com.example.library.service;

import java.util.List;

import com.example.library.domain.Exemplar;

public interface ExemplarService {
	
	void salvar(Exemplar exemplar);
	
	void editar(Exemplar exemplar);
	
	void excluir(Long id);
	
	Exemplar buscarPorId(Long id);
	
	List<Exemplar> buscarTodos();
}
