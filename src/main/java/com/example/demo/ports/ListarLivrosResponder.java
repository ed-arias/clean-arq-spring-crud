package com.example.demo.ports;

import java.util.List;

import com.example.demo.dtos.ListarLivrosResponse;

public interface ListarLivrosResponder {

    List<ListarLivrosResponse> obterRespose();
	void presentar(List<ListarLivrosResponse> listarLivrosResponse);

}
