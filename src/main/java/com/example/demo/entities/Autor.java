package com.example.demo.entities;

import java.util.List;

import lombok.Data;

@Data
public class Autor {

	private final Long id;
	private final String nombre;
	private final List<Livro> livros;
}
