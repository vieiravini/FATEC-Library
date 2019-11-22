package com.example.library.dao;

import java.util.List;

import com.example.library.domain.Curso;

public interface CursoDao {
	
	void save(Curso curso);
	
	void update(Curso curso);
	
	void delete(Long id);
	
	Curso findById(Long id);
	
	List<Curso> findAll();
}
