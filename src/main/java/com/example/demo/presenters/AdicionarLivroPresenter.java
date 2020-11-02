package com.example.demo.presenters;

import com.example.demo.dtos.AdicionarLivroResponse;
import com.example.demo.ports.AdicionarLivroResponder;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class AdicionarLivroPresenter implements AdicionarLivroResponder {
	
	AdicionarLivroResponse adicionarLivroResponse;

	@Override
	public AdicionarLivroResponse getResponse() {
		return adicionarLivroResponse;
	}

	@Override
	public void presentar(AdicionarLivroResponse adicionarLivroResponse) {
		this.adicionarLivroResponse = adicionarLivroResponse;
	}

}
