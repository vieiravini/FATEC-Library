package com.example.library.dao;

import org.springframework.stereotype.Repository;

import com.example.library.domain.Livro;

@Repository
public class LivroDaoImpl extends AbstractDao<Livro, Long> implements LivroDao {

}
