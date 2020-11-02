package com.example.demo.controllers;

import com.example.demo.dtos.CadastrarLivroRequest;
import com.example.demo.ports.CadastrarLivroRequester;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CadastrarLivroController {
	
	private final CadastrarLivroRequest cadastrarLivroRequest;
	private final CadastrarLivroRequester cadastrarLivroRequester;
	
	public void executar() {
		cadastrarLivroRequester.executar(cadastrarLivroRequest);
	}
}