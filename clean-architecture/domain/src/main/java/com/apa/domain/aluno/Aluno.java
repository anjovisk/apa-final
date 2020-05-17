package com.apa.domain.aluno;

import java.util.List;

import com.apa.domain.matricula.Matricula;

public interface Aluno {
	Long getId();
	String getNome();
	void setNome(String nome);
	<T extends Matricula> List<T> getMatriculas();
	Matricula iniciarMatricula();
}
