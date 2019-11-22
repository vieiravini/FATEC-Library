package com.example.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.library.dao.PessoaDao;
import com.example.library.domain.Pessoa;

@Service @Transactional
public class PessoaServiceImpl implements PessoaService {
	
	@Autowired
	private PessoaDao dao;

	@Override
	public void salvar(Pessoa pessoa) {
		dao.save(pessoa);
		
	}

	@Override
	public void editar(Pessoa pessoa) {
		dao.update(pessoa);
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);
	}

	@Transactional(readOnly = true)
	@Override
	public Pessoa buscarPorId(Long id) {
		return dao.findById(id);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Pessoa> buscarTodos() {
		return dao.findAll();
	}

}
