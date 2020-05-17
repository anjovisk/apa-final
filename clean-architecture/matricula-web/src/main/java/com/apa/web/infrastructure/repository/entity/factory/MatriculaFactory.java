package com.apa.web.infrastructure.repository.entity.factory;

import com.apa.web.infrastructure.repository.entity.Matricula;

public class MatriculaFactory implements com.apa.domain.matricula.MatriculaFactory {
	private MatriculaFactory() { }
	public static MatriculaFactory getInstance() {
		return new MatriculaFactory();
	}
	@Override
	public Matricula criar() {
		com.apa.web.infrastructure.repository.entity.Matricula matricula = new com.apa.web.infrastructure.repository.entity.Matricula();
		return matricula;
	}
}
