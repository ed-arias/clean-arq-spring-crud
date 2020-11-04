package com.example.demo.presenters;

import java.util.List;

import com.example.demo.biblioteca.dtos.ListarLivrosResponse;
import com.example.demo.biblioteca.ports.ListarLivrosResponder;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class ListarLivrosPresenter implements ListarLivrosResponder {

    private List<ListarLivrosResponse> listarLivrosResponse;

    @Override
    public void obterResposta(List<ListarLivrosResponse> listarLivrosResponse) {
        this.listarLivrosResponse = listarLivrosResponse;
    }

    @Override
    public List<ListarLivrosResponse> presentar() {
        return this.listarLivrosResponse;

    }

}
