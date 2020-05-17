package com.apa.domain.disciplina;

import com.apa.domain.disciplina.inscricao.Inscricao;
import com.apa.domain.disciplina.inscricao.InscricaoFactory;
import com.apa.domain.matricula.Matricula;

public abstract class AbstractDisciplina implements Disciplina {
	public abstract InscricaoFactory getInscricaoFactory();
	
	@Override
	public Inscricao inscrever(Matricula matricula) {
		Inscricao inscricao = getInscricaoFactory().criar();
		inscricao.preparar(matricula, this);
		getInscricoes().add(inscricao);
		return inscricao;
	}
}
