package com.example.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.library.dao.AutorDao;
import com.example.library.domain.Autor;

@Service @Transactional
public class AutorServiceImpl implements AutorService{

	@Autowired
	private AutorDao dao;
	
	
	@Override
	public void salvar(Autor autor) {
		dao.save(autor);
	}

	@Override
	public void editar(Autor autor) {
		dao.update(autor);
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);
	}

	@Transactional(readOnly = true)
	@Override
	public Autor buscarPorId(Long id) {
		return dao.findById(id);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Autor> buscarTodos() {
		return dao.findAll();
	}

}
