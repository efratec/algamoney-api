package com.efratec.algamoney.api.util;


public class MensagemValidacao {
	
	private String mensagemValidacao;
	private String mensagemDesenvolvedor;
	
	
	public MensagemValidacao(String mensagemValidacao, String mensagemDesenvolvedor) {
		this.mensagemValidacao = mensagemValidacao;
		this.mensagemDesenvolvedor = mensagemDesenvolvedor;
	}
	

	public String getMensagemValidacao() {
		return mensagemValidacao;
	}


	public void setMensagemValidacao(String mensagemValidacao) {
		this.mensagemValidacao = mensagemValidacao;
	}


	public String getMensagemDesenvolvedor() {
		return mensagemDesenvolvedor;
	}


	public void setMensagemDesenvolvedor(String mensagemDesenvolvedor) {
		this.mensagemDesenvolvedor = mensagemDesenvolvedor;
	}
	
	

}
