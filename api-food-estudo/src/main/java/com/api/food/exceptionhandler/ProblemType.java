package com.api.food.exceptionhandler;

import lombok.Getter;

@Getter
public enum ProblemType {
	
	MENSAGEM_INCOMPREENSIVEL("/mensagem-incompreensivel","Mensagem incompreensível"),
	ENTIDADE_NAO_ENCONTRADA("/entidade-nao-encotrada" , "Entidade não encontrada"),
	ENTIDADE_EM_USO("/entidade-em-uso", "Entidade em uso"),
	RESQUEST_ERROR("/request-error", "Request error");
	
	private String title;
	private String uri;
	
	ProblemType(String path, String title){
		this.uri = "https://api.food.estudo" + path;
		this.title = title;
	}
	
}
