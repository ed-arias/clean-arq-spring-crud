package com.example.demo.usecases;

import java.util.List;
import java.util.stream.Collectors;

import com.example.demo.data.LivroRepository;
import com.example.demo.dtos.ListarLivrosRequest;
import com.example.demo.dtos.ListarLivrosResponse;
import com.example.demo.entities.Livro;
import com.example.demo.ports.ListarLivrosRequester;
import com.example.demo.ports.ListarLivrosResponder;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ListarLivrosUseCase implements ListarLivrosRequester {

    private final LivroRepository livroRepository;
    private final ListarLivrosResponder listarLivrosResponder;

    @Override
    public void executar(ListarLivrosRequest listarLivrosRequest) {
        
        List<Livro> livros = livroRepository.findAll();

        List<ListarLivrosResponse> listarLivrosResponse = toListarLivrosResponseFrom(livros);

        listarLivrosResponder.presentar(listarLivrosResponse);

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
