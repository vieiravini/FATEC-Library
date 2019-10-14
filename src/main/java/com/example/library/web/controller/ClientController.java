package com.example.library.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/client")
public class ClientController {
	
	@GetMapping("/acervo")
	public String acervo() {
		return "/pages/acervo";
	}
	
	@GetMapping("/historico")
	public String historico(){
		return "/pages/historico";
	}
	
	@GetMapping("/minhas-reservas")
	public String reservas() {
		return "/pages/minhas-reservas";
	}
	
	@GetMapping("/perfil")
	public String perfil() {
		return "/pages/perfil";
	}
}
