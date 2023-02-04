package com.api.food.api.assembler;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.food.domain.model.Estado;
import com.api.food.model.EstadoModel;

@Component
public class EstadoModelAssembler {

	@Autowired
	private ModelMapper modelMapper;
	
	public EstadoModel toModel(Estado estado) {
		return modelMapper.map(estado, EstadoModel.class);
	}
	
	public List<EstadoModel> toCollectionModel(List<Estado> estados) {
		return estados.stream()
				.map(estado -> toModel(estado))
				.collect(Collectors.toList());
	}
	
}
