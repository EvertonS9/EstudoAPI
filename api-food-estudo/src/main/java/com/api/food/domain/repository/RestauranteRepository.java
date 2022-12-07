package com.api.food.domain.repository;


import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.api.food.domain.model.Restaurante;


@Repository
public interface RestauranteRepository extends CustomJpaRepository<Restaurante, Long>,
		RestauranteRepositoryQueries, JpaSpecificationExecutor<Restaurante> {
	

	
	
}
