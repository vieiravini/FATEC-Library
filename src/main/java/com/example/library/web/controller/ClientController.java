package com.example.library.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.library.domain.Autor;
import com.example.library.domain.Livro;
import com.example.library.service.AutorService;
import com.example.library.service.LivroService;

@Controller
@RequestMapping("/client")
public class ClientController {
	
	@Autowired
	private LivroService livroService;
	
	@Autowired
	private AutorService autorService;
	
	@GetMapping("/pages/acervo")
	public String acervo() {
		return "/client/pages/acervo";
	}
	
	@GetMapping("/pages/historico")
	public String historico(){
		return "client/pages/historico";
	}
	
	@GetMapping("/pages/minhas-reservas")
	public String reservas() {
		return "client/pages/minhas-reservas";
	}
	
	@GetMapping("/pages/perfil")
	public String perfil() {
		return "client/pages/perfil";
	}
	
	@ModelAttribute("livros")
	public List<Livro> listaDeLivros(){
		return livroService.buscarTodos();
	}
	
	@GetMapping("/pages/livro/{id}")
	public String livro(@PathVariable("id") Long id, ModelMap model, ModelMap modelAutor) {
		String autor = livroService.buscarPorId(id).getAutor().toString().replaceAll("\\D+","");;
		
		Long autorLong = Long.parseLong(autor);
		
		model.addAttribute("livro", livroService.buscarPorId(id) );
		modelAutor.addAttribute("autor" , autorService.buscarPorId(autorLong));
		
		return "/client/pages/livro";
		
	}
}
