package com.example.library.web.controller;


import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.multipart.MultipartFile;

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
import com.google.gson.Gson;


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
	public String cadastrolivros(Livro livro, Autor autor, Genero genero, Editora editora) {

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
	
	@PostMapping("/salvarAutor")
	public String salvarAutor(Autor autor) {
		autorService.salvar(autor);
		return "redirect:/admin/pages/cadastro-livros";
	}
	
	@PostMapping("/salvarGenero")
	public String salvarGenero(Genero genero) {
		generoService.salvar(genero);
		return "redirect:/admin/pages/cadastro-livros";
	}
	
	@PostMapping("/salvarEditora")
	public String salvarEditora(Editora editora) {
		editoraService.salvar(editora);
		return "redirect:/admin/pages/cadastro-livros";
	}
	
	@GetMapping("/buscarLivro/nome")
	public String salvarEditora(@RequestParam("codBarras") String codBarras, ModelMap model) {
		model.addAttribute("livro", livroService.buscarPorCodbarras(codBarras));
		return "/admin/pages/emprestimo";
	}
	
	
	@PostMapping("/salvarLivro")
	public String salvarLivro(@RequestParam("imageFile") MultipartFile imageFile, Livro livro) {
		try {
			livroService.saveImage(imageFile);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Path currentPath = Paths.get("");
		Path absolutePath = currentPath.toAbsolutePath();
		livro.setImgsrc("/uploadedPhotos/" + imageFile.getOriginalFilename().toString());
		livroService.salvar(livro);

		
		return "redirect:/admin/pages/cadastro-livros";
	}
	
	@ModelAttribute("curso")
	public List<Curso> listaDeCursos(){
		return cursoService.buscarTodos();
	}
	
	@ModelAttribute("autores")
	public List<Autor> listaDeAutor(){
		return autorService.buscarTodos();
	}
	
	@ModelAttribute("generos")
	public List<Genero> listaDeGenero(){
		return generoService.buscarTodos();
	}
	
	@ModelAttribute("editoras")
	public List<Editora> listaDeEditora(){
		return editoraService.buscarTodos();
	}
	
	
		
	
	
}
