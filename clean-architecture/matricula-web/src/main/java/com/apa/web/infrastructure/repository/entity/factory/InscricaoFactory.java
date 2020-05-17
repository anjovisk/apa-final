package com.apa.web.infrastructure.repository.entity.factory;

import com.apa.domain.disciplina.inscricao.Inscricao;

public class InscricaoFactory implements com.apa.domain.disciplina.inscricao.InscricaoFactory {
	private InscricaoFactory() { }
	public static InscricaoFactory getInstance() {
		return new InscricaoFactory();
	}
	@Override
	public Inscricao criar() {
		com.apa.web.infrastructure.repository.entity.Inscricao inscricao = new com.apa.web.infrastructure.repository.entity.Inscricao();
		return inscricao;
	}
}
