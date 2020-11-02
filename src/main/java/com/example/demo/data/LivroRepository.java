package com.example.demo.data;

import java.util.List;

import com.example.demo.entities.Livro;

public interface LivroRepository {

	Livro save(Livro livro);

	List<Livro> findAll();

}
