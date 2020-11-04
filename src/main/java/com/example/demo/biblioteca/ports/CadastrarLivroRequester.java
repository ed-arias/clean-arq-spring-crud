package com.example.demo.biblioteca.ports;

import com.example.demo.biblioteca.dtos.CadastrarLivroRequest;

public interface CadastrarLivroRequester {
	
	void executar(CadastrarLivroRequest adicionarLivroRequest);

}
