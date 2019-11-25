package com.example.library.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.library.domain.Autor;
import com.example.library.domain.Curso;
import com.example.library.domain.Editora;
import com.example.library.domain.Genero;
import com.example.library.domain.Livro;
import com.example.library.domain.Pessoa;
import com.example.library.service.AutorService;
import com.example.library.service.CursoService;
import com.example.library.service.EditoraService;
import com.example.library.service.GeneroService;
import com.example.library.service.LivroService;
import com.example.library.service.PessoaService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private PessoaService pessoaService;
	
	@Autowired
	private AutorService autorService;
	
	@Autowired
	private LivroService livroService;
	
	@Autowired
	private CursoService cursoService;
	
	@Autowired
	private GeneroService generoService;
	
	@Autowired
	private EditoraService editoraService;
	
	@GetMapping("/pages/cadastro-livros")
	public String cadastrolivros(Livro livro) {
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
	
	@PostMapping("/salvarLivro")
	public String salvarLivro(Livro livro) {
		livroService.salvar(livro);
		return "redirect:/admin/pages/cadastro-livros";
	}
	
	@ModelAttribute("curso")
	public List<Curso> listaDeCursos(){
		return cursoService.buscarTodos();
	}
	
	@ModelAttribute("autor")
	public List<Autor> listaDeAutor(){
		return autorService.buscarTodos();
	}
	
	@ModelAttribute("genero")
	public List<Genero> listaDeGenero(){
		return generoService.buscarTodos();
	}
	
	@ModelAttribute("editora")
	public List<Editora> listaDeEditora(){
		return editoraService.buscarTodos();
	}
	
		
	
	
}
