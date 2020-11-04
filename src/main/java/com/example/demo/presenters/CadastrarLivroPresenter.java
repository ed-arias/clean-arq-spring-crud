package com.example.demo.presenters;

import com.example.demo.biblioteca.dtos.CadastrarLivroResponse;
import com.example.demo.biblioteca.ports.CadastrarLivroResponder;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class CadastrarLivroPresenter implements CadastrarLivroResponder {
	
	CadastrarLivroResponse cadastrarLivroResponse;

	@Override
	public void obterResposta(CadastrarLivroResponse cadastrarLivroResponse) {
		this.cadastrarLivroResponse = cadastrarLivroResponse;
	}

	@Override
	public CadastrarLivroResponse presentar() {
		return cadastrarLivroResponse;
	}

}
