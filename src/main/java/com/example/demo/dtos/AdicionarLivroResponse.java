package com.example.demo.dtos;

import java.time.LocalDateTime;

import com.example.demo.entities.enums.Categoria;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AdicionarLivroResponse {

	private final Long id;
	private final String titulo;
	private final Categoria categoria;
	private final String autor;
	private final LocalDateTime dataCreacao;

}
