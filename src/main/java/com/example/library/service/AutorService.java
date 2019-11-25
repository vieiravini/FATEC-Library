package com.example.library.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.library.domain.Autor;

public interface AutorService {
	void salvar(Autor autor);
	
	void editar(Autor autor);
	
	void excluir(Long id);
	
	Autor buscarPorId(Long id);
	
	List<Autor> buscarTodos();
	
	
}
