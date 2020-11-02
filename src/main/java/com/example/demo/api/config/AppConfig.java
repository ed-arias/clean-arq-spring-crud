package com.example.demo.api.config;

import java.util.LinkedList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.data.InMemoryDataBase;
import com.example.demo.data.LivroRepository;
import com.example.demo.ports.AdicionarLivroRequester;
import com.example.demo.ports.AdicionarLivroResponder;
import com.example.demo.presenters.AdicionarLivroPresenter;
import com.example.demo.usecases.AdicionarLivroUseCase;

@Configuration
public class AppConfig {
	
	@Bean
	public LivroRepository livroRepository() {
		return new InMemoryDataBase(new LinkedList<>());
	}
	
	@Bean
	public AdicionarLivroResponder adicionarlivroResponder() {
		return new AdicionarLivroPresenter();
	}
	
	@Bean
	public AdicionarLivroRequester adicionarLivroRequester(
			LivroRepository livroRepository, 
			AdicionarLivroResponder adicionarlivroResponder) {
		
		return new AdicionarLivroUseCase(livroRepository, adicionarlivroResponder);
	}

}
