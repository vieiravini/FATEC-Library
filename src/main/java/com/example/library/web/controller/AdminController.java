package com.example.library.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@GetMapping("/pages/cadastro-livros")
	public String cadastrolivros() {
		return "/admin/pages/cadastro-livros";
	}
	
	@GetMapping("/pages/cadastro-pessoa")
	public String cadastropessoa() {
		return "/admin/pages/cadastro-pessoa";
	}
	
	@GetMapping("/pages/emprestimo")
	public String emprestimo() {
		return "/admin/pages/emprestimo";
	}

}
