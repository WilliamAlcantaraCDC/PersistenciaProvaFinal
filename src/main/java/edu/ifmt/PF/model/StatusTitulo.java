package edu.ifmt.PF.model;


public enum StatusTitulo {
	
	MASCULINO("masculino"),
	FEMININO("feminino");
	
	private String descricao;
	StatusTitulo(String descricao){
		this.descricao=descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}

}
