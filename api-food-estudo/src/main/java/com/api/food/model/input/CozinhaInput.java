package com.api.food.model.input;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CozinhaInput {
	
	@NotNull
	private Long id;
	
	@NotBlank
	private String nome;
	
	@Valid
	@NotNull
	private RestauranteIdInput restaurante;
	

}
