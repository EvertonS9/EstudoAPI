package com.api.food.model.input;

import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class GrupoInput {

	@NotBlank
	private String nome;
	
}
