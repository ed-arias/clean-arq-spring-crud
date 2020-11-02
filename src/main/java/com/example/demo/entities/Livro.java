package com.example.demo.entities;

import java.time.LocalDateTime;

import com.example.demo.entities.enums.Categoria;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Livro {

	private final Long id;
	private final String titulo;
	private final Categoria categoria;
	private final String autor;
	private final LocalDateTime dataCreacao;

}
