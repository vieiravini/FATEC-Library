package com.example.library.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.example.library.domain.Livro;

public interface LivroService {
	
	void salvar(Livro livro);
	
	void editar(Livro livro);
	
	void excluir(Long id);
	
	Livro buscarPorId(Long id);
	
	List<Livro> buscarTodos();

	void saveImage(MultipartFile imageFile) throws Exception;
	

}
