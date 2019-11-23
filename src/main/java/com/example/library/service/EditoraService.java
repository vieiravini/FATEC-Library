package com.example.library.service;

import java.util.List;

import com.example.library.domain.Editora;

public interface EditoraService {
	
	void salvar(Editora editora);
	
	void editar(Editora editora);
	
	void deletar(Long id);
	
	Editora buscarPorId(Long id);
	
	List<Editora> buscarTodos();
}
