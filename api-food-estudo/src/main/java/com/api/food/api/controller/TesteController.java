package com.api.food.api.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.food.domain.model.Restaurante;
import com.api.food.domain.repository.CozinhaRepository;
import com.api.food.domain.repository.RestauranteRepository;

@RestController
@RequestMapping("/teste")
public class TesteController {
	
	@Autowired
	private CozinhaRepository cozinhaRepository;
	
	@Autowired
	private RestauranteRepository restauranteRepository;
	
	@GetMapping("/restaurantes/primeiro")
	public Optional<Restaurante> restaurantePrimeiro(){
		return restauranteRepository.buscarPrimeiro();
	}
	
}
