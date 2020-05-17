package com.apa.web.infrastructure.repository.entity.factory;

import com.apa.domain.disciplina.inscricao.Inscricao;
import com.apa.domain.disciplina.inscricao.InscricaoBuilder;
import com.apa.web.infrastructure.repository.entity.Disciplina;
import com.apa.web.infrastructure.repository.entity.Matricula;

public class InscricaoFactory implements com.apa.domain.disciplina.inscricao.InscricaoFactory {
	private InscricaoFactory() { }
	public static InscricaoFactory getInstance() {
		return new InscricaoFactory();
	}
	@Override
	public Inscricao criar(InscricaoBuilder inscricaoBuilder) {
		com.apa.web.infrastructure.repository.entity.Inscricao inscricao = new com.apa.web.infrastructure.repository.entity.Inscricao();
		inscricao.setMatricula((Matricula)inscricaoBuilder.getMatricula());
		inscricao.setDisciplina((Disciplina)inscricaoBuilder.getDisciplina());
		inscricao.setData(inscricaoBuilder.getData());
		return inscricao;
	}
}
