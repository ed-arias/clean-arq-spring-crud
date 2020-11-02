package com.example.demo.ports;

import com.example.demo.dtos.CadastrarLivroResponse;

public interface CadastrarLivroResponder {

	CadastrarLivroResponse getResponse();
	void presentar(CadastrarLivroResponse cadastrarLivroResponse);

}
