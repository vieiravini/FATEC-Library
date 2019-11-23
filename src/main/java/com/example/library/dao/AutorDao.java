package com.example.library.dao;

import java.util.List;

import com.example.library.domain.Autor;

public interface AutorDao {
	void save(Autor autor);
	
	void update(Autor autor);
	
	void delete(Long id);
	
	Autor findById(Long id);
	
	List<Autor> findAll();
}
