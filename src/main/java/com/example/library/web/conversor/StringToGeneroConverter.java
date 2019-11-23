package com.example.library.web.conversor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.example.library.domain.Genero;
import com.example.library.service.GeneroService;

@Component
public class StringToGeneroConverter implements Converter<String, Genero> {

	@Autowired
	private GeneroService service;
	
	@Override
	public Genero convert(String text) {
		if(text.isEmpty()) {
			return null;
		}
		Long id = Long.valueOf(text);
		return service.buscarPorId(id);
	}

}
