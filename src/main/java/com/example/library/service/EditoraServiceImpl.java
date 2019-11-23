package com.example.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.library.dao.EditoraDao;
import com.example.library.domain.Editora;

@Service @Transactional
public class EditoraServiceImpl implements EditoraService {

	@Autowired
	private EditoraDao dao;

	@Override
	public void salvar(Editora editora) {
		dao.save(editora);
	}

	@Override
	public void editar(Editora editora) {
		dao.update(editora);
	}

	@Override
	public void deletar(Long id) {
		dao.delete(id);
	}

	@Transactional(readOnly = true)
	@Override
	public Editora buscarPorId(Long id) {
		return dao.findById(id);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Editora> buscarTodos() {
		return dao.findAll();
	}
	
	

}
