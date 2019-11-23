package com.example.library.dao;

import java.util.List;

import com.example.library.domain.Genero;

public interface GeneroDao {
	
	void save(Genero genero);
	
	void update(Genero genero);
	
	void delete(Long id);
	
	Genero findById(Long id);
	
	List<Genero> findAll();
}
