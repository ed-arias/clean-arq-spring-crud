package com.example.demo.controllers;

import com.example.demo.biblioteca.dtos.ListarLivrosRequest;
import com.example.demo.biblioteca.ports.ListarLivrosRequester;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ListarLivrosController {

    private final ListarLivrosRequester listarLivrosRequester;

    public void executar(ListarLivrosRequest listarLivrosRequest) {
        listarLivrosRequester.executar(listarLivrosRequest);
    }
    
}
