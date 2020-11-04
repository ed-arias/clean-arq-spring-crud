package com.example.demo.biblioteca.usecases;

import java.util.List;
import java.util.stream.Collectors;

import com.example.demo.biblioteca.data.LivroRepository;
import com.example.demo.biblioteca.dtos.ListarLivrosRequest;
import com.example.demo.biblioteca.dtos.ListarLivrosResponse;
import com.example.demo.biblioteca.entities.Livro;
import com.example.demo.biblioteca.ports.ListarLivrosRequester;
import com.example.demo.biblioteca.ports.ListarLivrosResponder;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ListarLivrosUseCase implements ListarLivrosRequester {

    private final LivroRepository livroRepository;
    private final ListarLivrosResponder listarLivrosResponder;

    @Override
    public void executar(ListarLivrosRequest listarLivrosRequest) {
        
        List<Livro> livros = livroRepository.findAll();

        List<ListarLivrosResponse> listarLivrosResponse = toListarLivrosResponseFrom(livros);

        listarLivrosResponder.obterResposta(listarLivrosResponse);

    }

    private List<ListarLivrosResponse> toListarLivrosResponseFrom(List<Livro> livros) {
        return livros
                .stream()
                .map(this::toListarLivroResponseFrom)
                .collect(Collectors.toList());
    }

    private ListarLivrosResponse toListarLivroResponseFrom(Livro livro){
        return ListarLivrosResponse.builder()
                .autor(livro.getAutor())
                .categoria(livro.getCategoria())
                .dataCreacao(livro.getDataCreacao())
                .id(livro.getId())
                .titulo(livro.getTitulo())
                .build();
    }
    
}
