package com.example.demo.api.controllers;

import com.example.demo.dtos.CadastrarLivroRequest;
import com.example.demo.dtos.CadastrarLivroResponse;
import com.example.demo.ports.CadastrarLivroRequester;
import com.example.demo.ports.CadastrarLivroResponder;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/livros")
public class LivroController {
	
    private final CadastrarLivroRequester cadastrarLivroRequester;
	private final CadastrarLivroResponder cadastrarLivroResponder; 
	
	@PostMapping
    public CadastrarLivroResponse salvar(@RequestBody CadastrarLivroRequest cadastrarLivroRequest) {

        cadastrarLivroRequester.executar(cadastrarLivroRequest);

        return cadastrarLivroResponder.getResponse();
    }

}