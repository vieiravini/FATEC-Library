package com.example.library.dao;

import org.springframework.stereotype.Repository;

import com.example.library.domain.Pessoa;

@Repository
public class PessoaDaoImpl extends AbstractDao<Pessoa, Long> implements PessoaDao {

}
