package com.apa.domain.aluno;

import com.apa.domain.matricula.Matricula;
import com.apa.domain.matricula.MatriculaFactory;

public abstract class AbstractAluno implements Aluno {
	public abstract MatriculaFactory getMatriculaFactory();
	
	@Override
	public Matricula iniciarMatricula() {
		Matricula matricula = getMatriculaFactory().criar();
		matricula.setAluno(this);
		getMatriculas().add(matricula);
		return matricula;
	}
}
