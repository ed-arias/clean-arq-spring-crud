package com.example.demo.biblioteca.dtos;

import java.time.LocalDateTime;

import com.example.demo.biblioteca.entities.enums.Categoria;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CadastrarLivroResponse {

	private final Long id;
	private final String titulo;
	private final Categoria categoria;
	private final String autor;
	private final LocalDateTime dataCreacao;

}
