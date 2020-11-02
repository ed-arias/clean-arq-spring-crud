package com.example.demo.api.config;

import java.util.LinkedList;

import com.example.demo.data.InMemoryDataBase;
import com.example.demo.data.LivroRepository;
import com.example.demo.ports.CadastrarLivroRequester;
import com.example.demo.ports.CadastrarLivroResponder;
import com.example.demo.presenters.CadastrarLivroPresenter;
import com.example.demo.usecases.CadastrarLivroUseCase;

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

}
