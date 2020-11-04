package com.example.demo.api.config;

import java.util.LinkedList;

import com.example.demo.biblioteca.data.InMemoryDataBase;
import com.example.demo.biblioteca.data.LivroRepository;
import com.example.demo.biblioteca.ports.CadastrarLivroRequester;
import com.example.demo.biblioteca.ports.CadastrarLivroResponder;
import com.example.demo.biblioteca.ports.ListarLivrosRequester;
import com.example.demo.biblioteca.ports.ListarLivrosResponder;
import com.example.demo.biblioteca.usecases.CadastrarLivroUseCase;
import com.example.demo.biblioteca.usecases.ListarLivrosUseCase;
import com.example.demo.presenters.CadastrarLivroPresenter;
import com.example.demo.presenters.ListarLivrosPresenter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public LivroRepository livroRepository() {
		return new InMemoryDataBase(new LinkedList<>());
	}
	
	@Bean
	public CadastrarLivroResponder cadastrarlivroResponder() {
		return new CadastrarLivroPresenter();
	}
	
	@Bean
	public CadastrarLivroRequester cadastrarLivroRequester(
			LivroRepository livroRepository, 
			CadastrarLivroResponder cadastrarlivroResponder) {
		
		return new CadastrarLivroUseCase(livroRepository, cadastrarlivroResponder);
	}

	@Bean
	public ListarLivrosResponder listarLivrosResponder() {
		return new ListarLivrosPresenter();
	}

	@Bean
	public ListarLivrosRequester listarLivrosPresenter(
			LivroRepository livroRepository, 
			ListarLivrosResponder listarLivrosResponder) {
		
		return new ListarLivrosUseCase(livroRepository, listarLivrosResponder);
	}

}
