package com.example.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.library.dao.CursoDao;
import com.example.library.domain.Curso;

@Service @Transactional
public class CursoServiceImpl implements CursoService {

	@Autowired
	private CursoDao dao;
	
	@Override
	public void salvar(Curso curso) {
		dao.save(curso);
	}

	@Override
	public void editar(Curso curso) {
		dao.update(curso);
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);
	}
	
	@Transactional(readOnly = true)
	@Override
	public Curso buscarPorId(Long id) {
		return dao.findById(id);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Curso> buscarTodos() {
		return dao.findAll();
	}

}
