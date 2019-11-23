package com.example.library.web.conversor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.example.library.domain.Exemplar;
import com.example.library.service.ExemplarService;

@Component
public class StringToExemplarConverter implements Converter<String, Exemplar> {

	@Autowired
	private ExemplarService service;
	
	@Override
	public Exemplar convert(String text) {
		if(text.isEmpty()) {
			return null;
		}
		
		Long id = Long.valueOf(text);
		return service.buscarPorId(id);
		
	}

}
