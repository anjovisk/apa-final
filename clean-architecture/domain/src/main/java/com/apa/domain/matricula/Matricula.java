package com.apa.domain.matricula;

import java.util.List;

import com.apa.domain.aluno.Aluno;
import com.apa.domain.disciplina.inscricao.Inscricao;

public interface Matricula {
	Long getId();
	Aluno getAluno();
	void setAluno(Aluno aluno);
	<T extends Inscricao> List<T> getInscricoes();
	StatusMatricula getStatus();
	void setStatus(StatusMatricula status);
	String getNumero();
	void setNumero(String numero);
	void efetuarMatricula();
	void cancelarMatricula();
}
