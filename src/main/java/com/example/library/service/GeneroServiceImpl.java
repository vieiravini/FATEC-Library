package com.example.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.library.dao.GeneroDao;
import com.example.library.domain.Genero;

@Service @Transactional
public class GeneroServiceImpl implements GeneroService {
	
	@Autowired
	private GeneroDao dao;
	
	@Override
	public void salvar(Genero genero) {
		dao.save(genero);
		
	}

	@Override
	public void editar(Genero genero) {
		dao.update(genero);
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);
	}

	@Transactional(readOnly = true)
	@Override
	public Genero buscarPorId(Long id) {
		return dao.findById(id);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Genero> buscarTodos() {
		return dao.findAll();
	}

}
