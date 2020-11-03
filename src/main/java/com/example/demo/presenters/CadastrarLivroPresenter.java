package com.example.demo.presenters;

import com.example.demo.dtos.CadastrarLivroResponse;
import com.example.demo.ports.CadastrarLivroResponder;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class CadastrarLivroPresenter implements CadastrarLivroResponder {
	
	CadastrarLivroResponse cadastrarLivroResponse;

	@Override
	public CadastrarLivroResponse obterResposta() {
		return cadastrarLivroResponse;
	}

	@Override
	public void presentar(CadastrarLivroResponse cadastrarLivroResponse) {
		this.cadastrarLivroResponse = cadastrarLivroResponse;
	}

}
