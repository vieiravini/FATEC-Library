package com.example.library.dao;

import java.util.List;

import com.example.library.domain.Editora;

public interface EditoraDao {

	void save(Editora editora);
	
	void update(Editora editora);
	
	void delete(Long id);
	
	Editora findById(Long id);
	
	List<Editora> findAll();
}
