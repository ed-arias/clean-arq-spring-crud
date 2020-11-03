package com.example.demo.presenters;

import java.util.List;

import com.example.demo.dtos.ListarLivrosResponse;
import com.example.demo.ports.ListarLivrosResponder;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class ListarLivrosPresenter implements ListarLivrosResponder {

    private List<ListarLivrosResponse> listarLivrosResponse;

    @Override
    public List<ListarLivrosResponse> obterResposta() {
        return this.listarLivrosResponse;
    }

    @Override
    public void presentar(List<ListarLivrosResponse> listarLivrosResponse) {
        this.listarLivrosResponse = listarLivrosResponse;

    }

}
