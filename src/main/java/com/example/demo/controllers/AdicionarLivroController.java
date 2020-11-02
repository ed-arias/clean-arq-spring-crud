package com.example.demo.controllers;

import com.example.demo.dtos.AdicionarLivroRequest;
import com.example.demo.ports.AdicionarLivroRequester;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AdicionarLivroController {
	
	private final AdicionarLivroRequest adicionarLivroRequest;
	private final AdicionarLivroRequester adicionarLivroRequester;
	
	public void executar() {
		adicionarLivroRequester.executar(adicionarLivroRequest);
	}
}
