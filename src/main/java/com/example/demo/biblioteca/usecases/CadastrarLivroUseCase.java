package com.example.demo.biblioteca.usecases;

import java.time.LocalDateTime;

import com.example.demo.biblioteca.data.LivroRepository;
import com.example.demo.biblioteca.dtos.CadastrarLivroRequest;
import com.example.demo.biblioteca.dtos.CadastrarLivroResponse;
import com.example.demo.biblioteca.entities.Livro;
import com.example.demo.biblioteca.ports.CadastrarLivroRequester;
import com.example.demo.biblioteca.ports.CadastrarLivroResponder;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CadastrarLivroUseCase implements CadastrarLivroRequester {
	
	private final LivroRepository livroRepository;
	private final CadastrarLivroResponder cadastrarlivroResponder;

	@Override
	public void executar(CadastrarLivroRequest cadastrarLivroRequest) {

		Livro livro = toLivroFrom(cadastrarLivroRequest);
		livro = livroRepository.save(livro);
		
		CadastrarLivroResponse cadastrarLivroResponse = toCadastrarLivroResponseFrom(livro);
		
		cadastrarlivroResponder.obterResposta(cadastrarLivroResponse);
		
	}
	
	private Livro toLivroFrom(CadastrarLivroRequest cadastrarLivroRequest) {
		return Livro.builder()
				.autor(cadastrarLivroRequest.getAutor())
				.categoria(cadastrarLivroRequest.getCategoria())
				.dataCreacao(LocalDateTime.now())
				.titulo(cadastrarLivroRequest.getTitulo())
				.build();
	}

	private CadastrarLivroResponse toCadastrarLivroResponseFrom(Livro livro) {
		return CadastrarLivroResponse.builder()
				.autor(livro.getAutor())
				.categoria(livro.getCategoria())
				.dataCreacao(livro.getDataCreacao())
				.id(livro.getId())
				.titulo(livro.getTitulo())
				.build();
	}
	
	
}
