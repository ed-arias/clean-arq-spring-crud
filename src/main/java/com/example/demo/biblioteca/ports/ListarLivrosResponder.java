package com.example.demo.biblioteca.ports;

import java.util.List;

import com.example.demo.biblioteca.dtos.ListarLivrosResponse;

public interface ListarLivrosResponder {

    void  obterResposta(List<ListarLivrosResponse> listarLivrosResponse);
	List<ListarLivrosResponse> presentar();

}
