package com.example.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.library.dao.LivroDao;
import com.example.library.domain.Livro;

@Service @Transactional
public class LivroServiceImpl implements LivroService {

	@Autowired
	private LivroDao dao;
	
	@Override
	public void salvar(Livro livro) {
		dao.save(livro);
	}

	@Override
	public void editar(Livro livro) {
		dao.update(livro);
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);
	}

	@Transactional(readOnly = true)
	@Override
	public Livro buscarPorId(Long id) {
		return dao.findById(id);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Livro> buscarTodos() {
		return dao.findAll();
	}

}
