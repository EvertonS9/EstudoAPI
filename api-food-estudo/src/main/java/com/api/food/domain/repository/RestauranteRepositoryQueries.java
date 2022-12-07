package com.api.food.domain.repository;

import java.math.BigDecimal;
import java.util.List;

import com.api.food.domain.model.Restaurante;

public interface RestauranteRepositoryQueries {
	
	List<Restaurante> find(String nome,
			BigDecimal taxaFreteInicial, BigDecimal TaxaFreteFinal);
	
	List<Restaurante> findComFreteGratis(String nome);

}
