package com.example.demo.ports;

import com.example.demo.dtos.ListarLivrosRequest;

public interface ListarLivrosRequester {

    public void executar(ListarLivrosRequest listarLivrosRequest);

}
