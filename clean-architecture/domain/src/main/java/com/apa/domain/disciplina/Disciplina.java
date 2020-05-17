package com.apa.domain.disciplina;

import java.util.List;

import com.apa.domain.disciplina.inscricao.Inscricao;
import com.apa.domain.matricula.Matricula;
import com.apa.domain.turma.Turma;

public interface Disciplina {
	Long getId();
	int getTotalVagas();
	void setTotalVagas(int totalVagas);
	String getNome();
	void setNome(String nome);
	Turma getTurma();
	void setTurma(Turma turma);
	<T extends Inscricao> List<Inscricao> getInscricoes();
	Inscricao inscrever(Matricula matricula);
}
