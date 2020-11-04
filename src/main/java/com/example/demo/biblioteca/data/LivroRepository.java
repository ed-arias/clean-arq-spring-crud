package com.example.demo.biblioteca.data;

import java.util.List;

import com.example.demo.biblioteca.entities.Livro;

public interface LivroRepository {

	Livro save(Livro livro);
	List<Livro> findAll();

}
