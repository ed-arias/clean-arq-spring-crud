package com.example.demo.data;

import java.time.LocalDateTime;
import java.util.List;

import com.example.demo.entities.Livro;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class InMemoryDataBase implements LivroRepository {

	private final List<Livro> livros;

	@Override
	public Livro save(Livro livro) {

		livro = Livro.builder()
			.autor(livro.getAutor())
			.categoria(livro.getCategoria())
			.dataCreacao(LocalDateTime.now())
			.id(livros.size() + 1L)
			.titulo(livro.getTitulo())
			.build();

		livros.add(livro);

		return livro;
	}

	@Override
	public List<Livro> findAll() {
		return livros;
	}

}
