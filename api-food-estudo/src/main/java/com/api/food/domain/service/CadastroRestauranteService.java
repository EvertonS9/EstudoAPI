package com.api.food.domain.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.food.domain.exception.EntidadeNaoEncontradaException;
import com.api.food.domain.model.Cozinha;
import com.api.food.domain.model.Restaurante;
import com.api.food.domain.repository.CozinhaRepository;
import com.api.food.domain.repository.RestauranteRepository;

@Service
public class CadastroRestauranteService {
	
	@Autowired
	private RestauranteRepository restauranteRepository;
	
	@Autowired
	private CozinhaRepository cozinhaRepository;
	
	public Restaurante salvar (Restaurante restaurante) {
		Long cozinhaId = restaurante.getCozinha().getId();
		
		Cozinha cozinha = cozinhaRepository.findById(cozinhaId)
				.orElseThrow(() -> new EntidadeNaoEncontradaException(String.format
						("cozinha não encontrada %d", cozinhaId)));
		
		
		restaurante.setCozinha(cozinha);
		
		return restauranteRepository.save(restaurante);
	}
	
}
