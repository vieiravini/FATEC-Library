package com.example.library.service;

import java.util.List;

import com.example.library.domain.Editora;

public interface EditoraService {
	
	void save(Editora editora);
	
	void update(Editora editora);
	
	void delete(Long id);
	
	Editora findById(Long id);
	
	List<Editora> findAll();
}
