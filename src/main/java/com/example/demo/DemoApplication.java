package com.example.demo;

import java.util.LinkedList;
import java.util.List;

import com.example.demo.biblioteca.data.InMemoryDataBase;
import com.example.demo.biblioteca.data.LivroRepository;
import com.example.demo.biblioteca.dtos.CadastrarLivroRequest;
import com.example.demo.biblioteca.dtos.CadastrarLivroResponse;
import com.example.demo.biblioteca.entities.Livro;
import com.example.demo.biblioteca.entities.enums.Categoria;
import com.example.demo.biblioteca.ports.CadastrarLivroRequester;
import com.example.demo.biblioteca.ports.CadastrarLivroResponder;
import com.example.demo.biblioteca.usecases.CadastrarLivroUseCase;
import com.example.demo.controllers.CadastrarLivroController;
import com.example.demo.presenters.CadastrarLivroPresenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		List<Livro> livros = new LinkedList<>();
		LivroRepository livroRepository = new InMemoryDataBase(livros);
		CadastrarLivroResponder cadastrarlivroResponder = new CadastrarLivroPresenter();
		CadastrarLivroRequester cadastrarLivroRequester = new CadastrarLivroUseCase(livroRepository, cadastrarlivroResponder);
		CadastrarLivroController cadastrarLivroController = new CadastrarLivroController(cadastrarLivroRequester);
		CadastrarLivroRequest cadastrarLivroRequest = new CadastrarLivroRequest();

		cadastrarLivroRequest.setAutor("autor");
		cadastrarLivroRequest.setCategoria(Categoria.SUSPENSO);
		cadastrarLivroRequest.setTitulo("titulo");

		log.info(cadastrarLivroRequest.toString());

		cadastrarLivroController.executar(cadastrarLivroRequest);
		CadastrarLivroResponse cadastrarLivroResponse = cadastrarlivroResponder.presentar();

		log.info(cadastrarLivroResponse.toString());
		
	}

}
