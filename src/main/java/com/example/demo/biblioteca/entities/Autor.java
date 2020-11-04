package com.example.demo.biblioteca.entities;

import java.util.List;

import lombok.Data;

@Data
class Autor {

	private final Long id;
	private final String nombre;
	private final List<Livro> livros;
}
