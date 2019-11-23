package com.example.library.dao;

import java.util.List;

import com.example.library.domain.Exemplar;

public interface ExemplarDao {
	
	void save(Exemplar exemplar);
	
	void update(Exemplar exemplar);
	
	void delete(Long id);
	
	Exemplar findById(Long id);
	
	List<Exemplar> findAll();
}
