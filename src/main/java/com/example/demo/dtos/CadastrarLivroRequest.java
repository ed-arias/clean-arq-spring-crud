package com.example.demo.dtos;

import com.example.demo.entities.enums.Categoria;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CadastrarLivroRequest {
	
	private String titulo;
	private Categoria categoria;
	private String autor;

}
