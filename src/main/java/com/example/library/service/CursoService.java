package com.example.library.service;

import java.util.List;

import com.example.library.domain.Curso;

public interface CursoService {
	
	void salvar(Curso curso);
	
	void editar(Curso curso);
	
	void excluir(Long id);
	
	Curso buscarPorId(Long id);
	
	List<Curso> buscarTodos();
}
