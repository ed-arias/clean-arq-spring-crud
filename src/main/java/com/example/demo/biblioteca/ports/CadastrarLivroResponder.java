package com.example.demo.biblioteca.ports;

import com.example.demo.biblioteca.dtos.CadastrarLivroResponse;

public interface CadastrarLivroResponder {

	void obterResposta(CadastrarLivroResponse cadastrarLivroResponse);
	CadastrarLivroResponse presentar();

}
