package com.example.library.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/client")
public class ClientController {
	
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
}
