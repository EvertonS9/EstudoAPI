package com.api.food.model.input;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RestauranteInput {
	
	private String nome;
	private BigDecimal taxaFrete;
	private CozinhaIdInput cozinha;

}
