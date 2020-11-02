package com.example.demo.usecases;

import java.time.LocalDateTime;

import com.example.demo.data.LivroRepository;
import com.example.demo.dtos.AdicionarLivroRequest;
import com.example.demo.dtos.AdicionarLivroResponse;
import com.example.demo.entities.Livro;
import com.example.demo.ports.AdicionarLivroRequester;
import com.example.demo.ports.AdicionarLivroResponder;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AdicionarLivroUseCase implements AdicionarLivroRequester {
	
	private final LivroRepository livroRepository;
	private final AdicionarLivroResponder adicionarlivroResponder;

	@Override
	public void executar(AdicionarLivroRequest adicionarLivroRequest) {

		Livro livro = toLivroFrom(adicionarLivroRequest);
		livro = livroRepository.save(livro);
		
		AdicionarLivroResponse adicionarLivroResponse = toAdicionarLivroResponseFrom(livro);
		
		adicionarlivroResponder.presentar(adicionarLivroResponse);
		
	}
	
	private Livro toLivroFrom(AdicionarLivroRequest adicionarLivroRequest) {
		return Livro.builder()
				.autor(adicionarLivroRequest.getAutor())
				.categoria(adicionarLivroRequest.getCategoria())
				.dataCreacao(LocalDateTime.now())
				.titulo(adicionarLivroRequest.getTitulo())
				.build();
	}

	private AdicionarLivroResponse toAdicionarLivroResponseFrom(Livro livro) {
		return AdicionarLivroResponse.builder()
				.autor(livro.getAutor())
				.categoria(livro.getCategoria())
				.dataCreacao(livro.getDataCreacao())
				.id(livro.getId())
				.titulo(livro.getTitulo())
				.build();
	}
	
	
}
