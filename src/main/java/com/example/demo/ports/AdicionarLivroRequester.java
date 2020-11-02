package com.example.demo.ports;

import com.example.demo.dtos.AdicionarLivroRequest;

public interface AdicionarLivroRequester {
	
	public void executar(AdicionarLivroRequest adicionarLivroRequest);

}
