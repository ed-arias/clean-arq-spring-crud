package com.example.demo.controllers;

import com.example.demo.biblioteca.dtos.CadastrarLivroRequest;
import com.example.demo.biblioteca.ports.CadastrarLivroRequester;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CadastrarLivroController {
	
	private final CadastrarLivroRequester cadastrarLivroRequester;
	
	public void executar(CadastrarLivroRequest cadastrarLivroRequest) {
		cadastrarLivroRequester.executar(cadastrarLivroRequest);
	}
}
