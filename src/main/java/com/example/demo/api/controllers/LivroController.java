package com.example.demo.api.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dtos.AdicionarLivroRequest;
import com.example.demo.dtos.AdicionarLivroResponse;
import com.example.demo.ports.AdicionarLivroRequester;
import com.example.demo.ports.AdicionarLivroResponder;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/livros")
public class LivroController {
	
	private final AdicionarLivroRequester adicionarLivroRequester;
	private final AdicionarLivroResponder adicionarLivroResponder; 
	
	@PostMapping
    public AdicionarLivroResponse salvar(@RequestBody AdicionarLivroRequest adicionarLivroRequest) {

        adicionarLivroRequester.executar(adicionarLivroRequest);

        return adicionarLivroResponder.getResponse();
    }

}



// AdicionarLivroRequest.builder()
// .autor(adicionarLivroRequest.getAutor())
// .categoria(adicionarLivroRequest.getCategoria())
// .titulo(adicionarLivroRequest.getTitulo())
// .build()
