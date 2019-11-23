package com.example.library.service;

import java.util.List;

import com.example.library.domain.Autor;

public interface AutorService {
	void salvar(Autor autor);
	
	void editar(Autor autor);
	
	void excluir(Long id);
	
	Autor buscarPorId(Long id);
	
	List<Autor> buscarTodos();
}
