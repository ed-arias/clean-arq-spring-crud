package com.example.demo.ports;

import com.example.demo.dtos.CadastrarLivroRequest;

public interface CadastrarLivroRequester {
	
	public void executar(CadastrarLivroRequest adicionarLivroRequest);

}
