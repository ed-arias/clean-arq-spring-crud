package com.example.demo.ports;

import com.example.demo.dtos.CadastrarLivroResponse;

public interface CadastrarLivroResponder {

	CadastrarLivroResponse obterResposta();
	void presentar(CadastrarLivroResponse cadastrarLivroResponse);

}
