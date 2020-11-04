package com.example.demo.biblioteca.ports;

import com.example.demo.biblioteca.dtos.ListarLivrosRequest;

public interface ListarLivrosRequester {

    void executar(ListarLivrosRequest listarLivrosRequest);

}
