package com.apa.domain.matricula;

import com.apa.domain.aluno.Aluno;

public class MatriculaBuilder {
	private Aluno aluno;
	
	private MatriculaBuilder() {}
	
	public static MatriculaBuilder getInstance() {
		return new MatriculaBuilder();
	}

	public Aluno getAluno() {
		return aluno;
	}

	public MatriculaBuilder comAluno(Aluno aluno) {
		this.aluno = aluno;
		return this;
	}
}
