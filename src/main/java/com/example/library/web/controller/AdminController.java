package com.example.library.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.library.domain.Curso;
import com.example.library.domain.Pessoa;
import com.example.library.service.CursoService;
import com.example.library.service.PessoaService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private PessoaService pessoaService;
	
	@Autowired
	private CursoService cursoService;
	
	@GetMapping("/pages/cadastro-livros")
	public String cadastrolivros() {
		return "/admin/pages/cadastro-livros";
	}
	
	@GetMapping("/pages/cadastro-pessoa")
	public String cadastropessoa(Pessoa pessoa) {
		return "/admin/pages/cadastro-pessoa";
	}
	
	@GetMapping("/pages/emprestimo")
	public String emprestimo() {
		return "/admin/pages/emprestimo";
	}

	@PostMapping("/salvarPessoa")
	public String salvarPessoa(Pessoa pessoa) {
		pessoaService.salvar(pessoa);
		return "redirect:/admin/pages/cadastro-pessoa";
	}
	
	@ModelAttribute("curso")
	public List<Curso> listaDeCursos(){
		return cursoService.buscarTodos();
	}
	
}
