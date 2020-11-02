package com.example.demo.usecases;

import java.time.LocalDateTime;

import com.example.demo.data.LivroRepository;
import com.example.demo.dtos.CadastrarLivroRequest;
import com.example.demo.dtos.CadastrarLivroResponse;
import com.example.demo.entities.Livro;
import com.example.demo.ports.CadastrarLivroRequester;
import com.example.demo.ports.CadastrarLivroResponder;

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
		
		cadastrarlivroResponder.presentar(cadastrarLivroResponse);
		
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
