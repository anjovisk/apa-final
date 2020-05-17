package com.apa.domain.matricula;

import java.util.UUID;

public abstract class AbstractMatricula implements Matricula {
	public AbstractMatricula() {
		setStatus(StatusMatricula.PENDENTE);
	}
	
	@Override
	public void efetuarMatricula() {
		setStatus(StatusMatricula.CONFIRMADA);
		setNumero(UUID.randomUUID().toString());
	}
	
	@Override
	public void cancelarMatricula() {
		setStatus(StatusMatricula.CANCELADA);
	}
}
