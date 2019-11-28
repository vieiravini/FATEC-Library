package com.example.library.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.example.library.domain.Livro;

@Repository
public class LivroDaoImpl extends AbstractDao<Livro, Long> implements LivroDao {

	@Override
	public String findByCodbarras(String codBarras) {
		TypedQuery<Livro> query = getEntityManager().createQuery("select l from Livro l where l.codBarras = :codBarras", Livro.class);
		query.setParameter("codBarras", codBarras);
		return query.toString();
	}
	
	

}
