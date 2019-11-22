package com.example.library.dao;

import java.util.List;

import com.example.library.domain.Pessoa;

public interface PessoaDao {

	void save(Pessoa pessoa);
	
	void update(Pessoa pessoa);
	
	void delete(Long id);
	
	Pessoa findById(Long id);
	
	List<Pessoa> findAll();
	
}
