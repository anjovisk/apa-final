package com.apa.domain.disciplina;

import java.time.LocalDateTime;

import com.apa.domain.disciplina.inscricao.Inscricao;
import com.apa.domain.disciplina.inscricao.InscricaoBuilder;
import com.apa.domain.disciplina.inscricao.InscricaoFactory;
import com.apa.domain.matricula.Matricula;

public abstract class AbstractDisciplina implements Disciplina {
	public abstract InscricaoFactory getInscricaoFactory();
	
	@Override
	public Inscricao inscrever(Matricula matricula) {
		Inscricao inscricao = getInscricaoFactory()
				.criar(InscricaoBuilder.getInstance()
						.comMatricula(matricula)
						.comDisciplina(this)
						.comData(LocalDateTime.now()));
		getInscricoes().add(inscricao);
		return inscricao;
	}
}
