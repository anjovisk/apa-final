package com.apa.controller.dto;

import java.util.ArrayList;
import java.util.List;

public class ResponseDTO<T> {
	public enum ResponseStatus {
		OK,
		FAIL;
	}
	private ResponseStatus status;
	private List<String> mensagens;
	private T resultado;
	
	public ResponseStatus getStatus() {
		return status;
	}
	public void setStatus(ResponseStatus status) {
		this.status = status;
	}
	public List<String> getMensagens() {
		return mensagens;
	}
	public void addMensagem(String mensagem) {
		if (mensagens == null) {
			mensagens = new ArrayList<String>();
		}
		mensagens.add(mensagem);
	}
	public T getResultado() {
		return resultado;
	}
	public void setResultado(T resultado) {
		this.resultado = resultado;
	}
}
