package com.example.library.dao;

import java.util.List;

import com.example.library.domain.Livro;

public interface LivroDao {
	
	void save(Livro livro);
	
	void update(Livro livro);
	
	void delete(Long id);
	
	Livro findById(Long id);
	
	List<Livro> findAll();
	
}
