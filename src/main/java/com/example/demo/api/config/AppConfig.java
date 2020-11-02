package com.example.demo.api.config;

import java.util.LinkedList;

import com.example.demo.data.InMemoryDataBase;
import com.example.demo.data.LivroRepository;
import com.example.demo.ports.CadastrarLivroRequester;
import com.example.demo.ports.CadastrarLivroResponder;
import com.example.demo.ports.ListarLivrosRequester;
import com.example.demo.ports.ListarLivrosResponder;
import com.example.demo.presenters.CadastrarLivroPresenter;
import com.example.demo.presenters.ListarLivrosPresenter;
import com.example.demo.usecases.CadastrarLivroUseCase;
import com.example.demo.usecases.ListarLivrosUseCase;

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
