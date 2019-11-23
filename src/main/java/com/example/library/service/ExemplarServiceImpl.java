package com.example.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.library.dao.ExemplarDao;
import com.example.library.domain.Exemplar;

@Service @Transactional
public class ExemplarServiceImpl implements ExemplarService {

	@Autowired
	private ExemplarDao dao;

	@Override
	public void salvar(Exemplar exemplar) {
		dao.save(exemplar);
	}

	@Override
	public void editar(Exemplar exemplar) {
		dao.update(exemplar);
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);
	}

	@Transactional(readOnly = true)
	@Override
	public Exemplar buscarPorId(Long id) {
		return dao.findById(id);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Exemplar> buscarTodos() {
		return dao.findAll();
	}
	
	

}
