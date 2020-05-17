package com.apa.domain.disciplina.inscricao;

import java.time.LocalDateTime;

import com.apa.domain.disciplina.Disciplina;
import com.apa.domain.matricula.Matricula;

public abstract class AbstractInscricao implements Inscricao {
	@Override
	public void preparar(Matricula matricula, Disciplina disciplina) {
		setMatricula(matricula);
		setDisciplina(disciplina);
		setData(LocalDateTime.now());
	}
}
