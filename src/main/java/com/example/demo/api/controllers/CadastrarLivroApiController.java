package com.example.demo.api.controllers;

import com.example.demo.biblioteca.dtos.CadastrarLivroRequest;
import com.example.demo.biblioteca.dtos.CadastrarLivroResponse;
import com.example.demo.biblioteca.ports.CadastrarLivroRequester;
import com.example.demo.biblioteca.ports.CadastrarLivroResponder;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/livros")
public class CadastrarLivroApiController {
	
    private final CadastrarLivroRequester cadastrarLivroRequester;
	private final CadastrarLivroResponder cadastrarLivroResponder; 
	
	@PostMapping
    public CadastrarLivroResponse cadastrar(@RequestBody CadastrarLivroRequest cadastrarLivroRequest) {

        cadastrarLivroRequester.executar(cadastrarLivroRequest);

        return cadastrarLivroResponder.presentar();
    }

}