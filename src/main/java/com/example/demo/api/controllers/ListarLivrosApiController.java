package com.example.demo.api.controllers;

import java.util.List;

import com.example.demo.biblioteca.dtos.ListarLivrosRequest;
import com.example.demo.biblioteca.dtos.ListarLivrosResponse;
import com.example.demo.biblioteca.ports.ListarLivrosRequester;
import com.example.demo.biblioteca.ports.ListarLivrosResponder;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/livros")
public class ListarLivrosApiController {

    private final ListarLivrosRequester listarLivrosRequester;
    private final ListarLivrosResponder listarLivrosResponder;

    @GetMapping
    public List<ListarLivrosResponse> listarLivros() {
        ListarLivrosRequest listarLivrosRequest =  new ListarLivrosRequest();

        listarLivrosRequester.executar(listarLivrosRequest);

        return listarLivrosResponder.presentar();
    }
    
}
