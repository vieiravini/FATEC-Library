CREATE TABLE Autor (
  idAutor INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  Nome VARCHAR NOT NULL,
  PRIMARY KEY(idAutor)
);

CREATE TABLE Exemplar (
  idExemplar INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  idExemplarLivro INTEGER UNSIGNED NOT NULL,
  PRIMARY KEY(idExemplar)
);

CREATE TABLE Genero (
  idGenero INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  Descricao VARCHAR NOT NULL,
  PRIMARY KEY(idGenero)
);

CREATE TABLE Livro (
  idLivro INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  Editora VARCHAR NOT NULL,
  Nome VARCHAR NOT NULL,
  ISBN INT NOT NULL,
  Autor VARCHAR NOT NULL,
  Genero VARCHAR NOT NULL,
  edicao INT NOT NULL,
  imgsrc VARCHAR NOT NULL,
  dataLancamento DATE NOT NULL,
  codBarras VARCHAR NOT NULL,
  PRIMARY KEY(idLivro)
);

CREATE TABLE Livro_has_Autor (
  Livro_idLivro INTEGER UNSIGNED NOT NULL,
  Autor_idAutor INTEGER UNSIGNED NOT NULL,
  PRIMARY KEY(Livro_idLivro, Autor_idAutor),
  INDEX Livro_has_Autor_FKIndex1(Livro_idLivro),
  INDEX Livro_has_Autor_FKIndex2(Autor_idAutor)
);

CREATE TABLE Livro_has_Exemplar (
  Livro_idLivro INTEGER UNSIGNED NOT NULL,
  Exemplar_idExemplar INTEGER UNSIGNED NOT NULL,
  PRIMARY KEY(Livro_idLivro, Exemplar_idExemplar),
  INDEX Livro_has_Exemplar_FKIndex1(Livro_idLivro),
  INDEX Livro_has_Exemplar_FKIndex2(Exemplar_idExemplar)
);

CREATE TABLE Livro_has_Genero (
  Livro_idLivro INTEGER UNSIGNED NOT NULL,
  Genero_idGenero INTEGER UNSIGNED NOT NULL,
  PRIMARY KEY(Livro_idLivro, Genero_idGenero),
  INDEX Livro_has_Genero_FKIndex1(Livro_idLivro),
  INDEX Livro_has_Genero_FKIndex2(Genero_idGenero)
);

CREATE TABLE Pessoa (
  idPessoa INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  Nome VARCHAR NOT NULL,
  CPF VARCHAR NOT NULL,
  RA VARCHAR NULL,
  Email VARCHAR NOT NULL,
  admin BOOL NOT NULL,
  PRIMARY KEY(idPessoa)
);

CREATE TABLE Pessoa_empresta (
  Pessoa_idPessoa INTEGER UNSIGNED NOT NULL,
  Livro_idLivro INTEGER UNSIGNED NOT NULL,
  PRIMARY KEY(Pessoa_idPessoa, Livro_idLivro),
  INDEX Pessoa_has_Livro_FKIndex1(Pessoa_idPessoa),
  INDEX Pessoa_has_Livro_FKIndex2(Livro_idLivro)
);

CREATE TABLE Pessoa_reserva (
  Pessoa_idPessoa INTEGER UNSIGNED NOT NULL,
  Livro_idLivro INTEGER UNSIGNED NOT NULL,
  PRIMARY KEY(Pessoa_idPessoa, Livro_idLivro),
  INDEX Pessoa_has_Livro_FKIndex1(Pessoa_idPessoa),
  INDEX Pessoa_has_Livro_FKIndex2(Livro_idLivro)
);


