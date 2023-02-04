package com.api.food.domain.service;

import java.util.List;

import com.api.food.api.model.dto.VendaDiaria;
import com.api.food.domain.filter.VendaDiariaFilter;

public interface VendaQueryService {

	List<VendaDiaria> consultarVendasDiarias(VendaDiariaFilter filtro, String timeOffset);
	
}
