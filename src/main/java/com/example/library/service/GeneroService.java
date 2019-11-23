package com.example.library.service;

import java.util.List;

import com.example.library.domain.Genero;

public interface GeneroService {

	void salvar(Genero genero);
	
	void editar(Genero genero);
	
	void excluir(Long id);
	
	Genero buscarPorId(Long id);
	
	List<Genero> buscarTodos();
	
}
