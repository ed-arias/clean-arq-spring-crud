package com.example.demo.ports;

import java.util.List;

import com.example.demo.dtos.ListarLivrosResponse;

public interface ListarLivrosResponder {

    List<ListarLivrosResponse> obterResposta();
	void presentar(List<ListarLivrosResponse> listarLivrosResponse);

}
