package com.example.demo.ports;

import com.example.demo.dtos.AdicionarLivroResponse;

public interface AdicionarLivroResponder {

	AdicionarLivroResponse getResponse();
	void presentar(AdicionarLivroResponse adicionarLivroResponse);

}
